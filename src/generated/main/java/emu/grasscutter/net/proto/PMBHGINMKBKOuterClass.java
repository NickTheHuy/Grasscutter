// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PMBHGINMKBK.proto

package emu.grasscutter.net.proto;

public final class PMBHGINMKBKOuterClass {
  private PMBHGINMKBKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PMBHGINMKBKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PMBHGINMKBK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float lahjfbdcfko = 1;</code>
     * @return The lahjfbdcfko.
     */
    float getLahjfbdcfko();
  }
  /**
   * Protobuf type {@code PMBHGINMKBK}
   */
  public static final class PMBHGINMKBK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PMBHGINMKBK)
      PMBHGINMKBKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PMBHGINMKBK.newBuilder() to construct.
    private PMBHGINMKBK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PMBHGINMKBK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PMBHGINMKBK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PMBHGINMKBK(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 13: {

              lahjfbdcfko_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.internal_static_PMBHGINMKBK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.internal_static_PMBHGINMKBK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK.class, emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK.Builder.class);
    }

    public static final int LAHJFBDCFKO_FIELD_NUMBER = 1;
    private float lahjfbdcfko_;
    /**
     * <code>float lahjfbdcfko = 1;</code>
     * @return The lahjfbdcfko.
     */
    @java.lang.Override
    public float getLahjfbdcfko() {
      return lahjfbdcfko_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (lahjfbdcfko_ != 0F) {
        output.writeFloat(1, lahjfbdcfko_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lahjfbdcfko_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, lahjfbdcfko_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK other = (emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK) obj;

      if (java.lang.Float.floatToIntBits(getLahjfbdcfko())
          != java.lang.Float.floatToIntBits(
              other.getLahjfbdcfko())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LAHJFBDCFKO_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getLahjfbdcfko());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PMBHGINMKBK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PMBHGINMKBK)
        emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.internal_static_PMBHGINMKBK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.internal_static_PMBHGINMKBK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK.class, emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lahjfbdcfko_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.internal_static_PMBHGINMKBK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK build() {
        emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK buildPartial() {
        emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK result = new emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK(this);
        result.lahjfbdcfko_ = lahjfbdcfko_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK) {
          return mergeFrom((emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK other) {
        if (other == emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK.getDefaultInstance()) return this;
        if (other.getLahjfbdcfko() != 0F) {
          setLahjfbdcfko(other.getLahjfbdcfko());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float lahjfbdcfko_ ;
      /**
       * <code>float lahjfbdcfko = 1;</code>
       * @return The lahjfbdcfko.
       */
      @java.lang.Override
      public float getLahjfbdcfko() {
        return lahjfbdcfko_;
      }
      /**
       * <code>float lahjfbdcfko = 1;</code>
       * @param value The lahjfbdcfko to set.
       * @return This builder for chaining.
       */
      public Builder setLahjfbdcfko(float value) {
        
        lahjfbdcfko_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float lahjfbdcfko = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLahjfbdcfko() {
        
        lahjfbdcfko_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PMBHGINMKBK)
    }

    // @@protoc_insertion_point(class_scope:PMBHGINMKBK)
    private static final emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK();
    }

    public static emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PMBHGINMKBK>
        PARSER = new com.google.protobuf.AbstractParser<PMBHGINMKBK>() {
      @java.lang.Override
      public PMBHGINMKBK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PMBHGINMKBK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PMBHGINMKBK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PMBHGINMKBK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PMBHGINMKBKOuterClass.PMBHGINMKBK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PMBHGINMKBK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PMBHGINMKBK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PMBHGINMKBK.proto\"\"\n\013PMBHGINMKBK\022\023\n\013la" +
      "hjfbdcfko\030\001 \001(\002B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PMBHGINMKBK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PMBHGINMKBK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PMBHGINMKBK_descriptor,
        new java.lang.String[] { "Lahjfbdcfko", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}