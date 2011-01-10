package sizzle.runtime;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.log4j.Logger;

import sizzle.aggregators.Table;
import sizzle.aggregators.FinishedException;
import sizzle.io.EmitKey;
import sizzle.io.EmitValue;

/**
 * A {@link Reducer} that pre-reduces the outputs from a single mapper node in
 * order to save I/O.
 * 
 * @author anthonyu
 * 
 */
public abstract class SizzleCombiner extends Reducer<EmitKey, EmitValue, EmitKey, EmitValue> implements Configurable {
	/**
	 * A {@link Logger} that log entries can be written to.
	 * 
	 */
	protected static final Logger LOG = Logger.getLogger(SizzleCombiner.class);

	/**
	 * A {@link Map} from {@link String} to {@link Table} indexing instantiated
	 * tables to their Sizzle identifiers.
	 */
	protected Map<String, Table> tables;

	private Configuration conf;
	private boolean robust;

	/**
	 * Construct a SizzleCombiner.
	 */
	protected SizzleCombiner() {
		this.tables = new HashMap<String, Table>();
	}

	/** {@inheritDoc} */
	@Override
	public Configuration getConf() {
		return this.conf;
	}

	/** {@inheritDoc} */
	@Override
	public void setConf(final Configuration conf) {
		this.conf = conf;
		this.robust = conf.getBoolean("sizzle.runtime.robust", false);
	}

	/** {@inheritDoc} */
	@Override
	protected void reduce(final EmitKey key, final Iterable<EmitValue> values, final Context context) throws IOException, InterruptedException {
		// get the table named by the emit key
		final Table t = this.tables.get(key.getName());

		// if we are non-associative, just pass the output through
		// TODO: find away to avoid combiner entirely when non-associative
		if (!t.isAssociative()) {
			for (final EmitValue value : values)
				context.write(key, value);

			return;
		}

		// tell it we will be combining
		t.setCombining(true);

		// Counter counter = context.getCounter("Values Emitted",
		// key.toString());
		// LOG.fatal("counter for \"Values Output\"" + key.toString() + " " +
		// Long.toString(counter.getValue()));

		// initialize the table
		t.start(key);
		// set the reducer context
		t.setContext(context);

		for (final EmitValue value : values)
			try {
				t.aggregate(value.getData(), value.getMetadata());
			} catch (final FinishedException e) {
				// we are done
				return;
			} catch (final IOException e) {
				// won't be robust to IOExceptions
				throw e;
			} catch (final InterruptedException e) {
				// won't be robust to InterruptedExceptions
				throw e;
			} catch (final RuntimeException e) {
				if (this.robust)
					SizzleCombiner.LOG.error(e.getClass().getName() + " caught", e);
				else
					throw e;
			} catch (final Exception e) {
				if (this.robust)
					SizzleCombiner.LOG.error(e.getClass().getName() + " caught", e);
				else
					throw new RuntimeException(e.getClass().getName() + " caught", e);
			}

		// finish it!
		t.finish();
	}
}
