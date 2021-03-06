// Generated by the protocol buffer compiler.  DO NOT EDIT!

package sizzle.types;

public final class P4Stat {
  private P4Stat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class P4ChangelistStats extends
      com.google.protobuf.GeneratedMessage {
    // Use P4ChangelistStats.newBuilder() to construct.
    private P4ChangelistStats() {}
    
    private static final P4ChangelistStats defaultInstance = new P4ChangelistStats();
    public static P4ChangelistStats getDefaultInstance() {
      return defaultInstance;
    }
    
    public P4ChangelistStats getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sizzle.types.P4Stat.internal_static_sizzle_types_P4ChangelistStats_descriptor;
    }
    
    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sizzle.types.P4Stat.internal_static_sizzle_types_P4ChangelistStats_fieldAccessorTable;
    }
    
    // required int64 time = 1;
    private boolean hasTime;
    private long time_ = 0L;
    public boolean hasTime() { return hasTime; }
    public long getTime() { return time_; }
    
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return new Builder(); }
    public Builder newBuilderForType() { return new Builder(); }
    public static Builder newBuilder(sizzle.types.P4Stat.P4ChangelistStats prototype) {
      return new Builder().mergeFrom(prototype);
    }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      // Construct using sizzle.types.P4Stat.P4ChangelistStats.newBuilder()
      private Builder() {}
      
      sizzle.types.P4Stat.P4ChangelistStats result = new sizzle.types.P4Stat.P4ChangelistStats();
      
      @Override
      protected sizzle.types.P4Stat.P4ChangelistStats internalGetResult() {
        return result;
      }
      
      @Override
      public Builder clear() {
        result = new sizzle.types.P4Stat.P4ChangelistStats();
        return this;
      }
      
      @Override
      public Builder clone() {
        return new Builder().mergeFrom(result);
      }
      
      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sizzle.types.P4Stat.P4ChangelistStats.getDescriptor();
      }
      
      public sizzle.types.P4Stat.P4ChangelistStats getDefaultInstanceForType() {
        return sizzle.types.P4Stat.P4ChangelistStats.getDefaultInstance();
      }
      
      public sizzle.types.P4Stat.P4ChangelistStats build() {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result);
        }
        return buildPartial();
      }
      
      private sizzle.types.P4Stat.P4ChangelistStats buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public sizzle.types.P4Stat.P4ChangelistStats buildPartial() {
        sizzle.types.P4Stat.P4ChangelistStats returnMe = result;
        result = null;
        return returnMe;
      }
      
      
      // required int64 time = 1;
      public boolean hasTime() {
        return result.hasTime();
      }
      public long getTime() {
        return result.getTime();
      }
      public Builder setTime(long value) {
        result.hasTime = true;
        result.time_ = value;
        return this;
      }
      public Builder clearTime() {
        result.hasTime = false;
        result.time_ = 0L;
        return this;
      }
    }
    
    static {
      sizzle.types.P4Stat.getDescriptor();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_sizzle_types_P4ChangelistStats_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_sizzle_types_P4ChangelistStats_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String descriptorData =
      "\n\014p4stat.proto\022\014sizzle.types\"!\n\021P4Change" +
      "listStats\022\014\n\004time\030\001 \002(\003";
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_sizzle_types_P4ChangelistStats_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_sizzle_types_P4ChangelistStats_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_sizzle_types_P4ChangelistStats_descriptor,
              new java.lang.String[] { "Time", },
              sizzle.types.P4Stat.P4ChangelistStats.class,
              sizzle.types.P4Stat.P4ChangelistStats.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
}
