// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSChangeDeckNameRsp.proto

package emu.grasscutter.net.proto;

public final class GCGDSChangeDeckNameRspOuterClass {
  private GCGDSChangeDeckNameRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSChangeDeckNameRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSChangeDeckNameRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ccdlgbcdpbp = 12;</code>
     * @return The ccdlgbcdpbp.
     */
    int getCcdlgbcdpbp();

    /**
     * <code>uint32 rewardIndex = 1;</code>
     * @return The rewardIndex.
     */
    int getRewardIndex();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   *enum IHFJEPEMDGL {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 7818;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code GCGDSChangeDeckNameRsp}
   */
  public static final class GCGDSChangeDeckNameRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSChangeDeckNameRsp)
      GCGDSChangeDeckNameRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSChangeDeckNameRsp.newBuilder() to construct.
    private GCGDSChangeDeckNameRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSChangeDeckNameRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSChangeDeckNameRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSChangeDeckNameRsp(
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
            case 8: {

              rewardIndex_ = input.readUInt32();
              break;
            }
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 96: {

              ccdlgbcdpbp_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.internal_static_GCGDSChangeDeckNameRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.internal_static_GCGDSChangeDeckNameRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp.class, emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp.Builder.class);
    }

    public static final int CCDLGBCDPBP_FIELD_NUMBER = 12;
    private int ccdlgbcdpbp_;
    /**
     * <code>uint32 ccdlgbcdpbp = 12;</code>
     * @return The ccdlgbcdpbp.
     */
    @java.lang.Override
    public int getCcdlgbcdpbp() {
      return ccdlgbcdpbp_;
    }

    public static final int REWARDINDEX_FIELD_NUMBER = 1;
    private int rewardIndex_;
    /**
     * <code>uint32 rewardIndex = 1;</code>
     * @return The rewardIndex.
     */
    @java.lang.Override
    public int getRewardIndex() {
      return rewardIndex_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (rewardIndex_ != 0) {
        output.writeUInt32(1, rewardIndex_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (ccdlgbcdpbp_ != 0) {
        output.writeUInt32(12, ccdlgbcdpbp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rewardIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, rewardIndex_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (ccdlgbcdpbp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, ccdlgbcdpbp_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp other = (emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp) obj;

      if (getCcdlgbcdpbp()
          != other.getCcdlgbcdpbp()) return false;
      if (getRewardIndex()
          != other.getRewardIndex()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + CCDLGBCDPBP_FIELD_NUMBER;
      hash = (53 * hash) + getCcdlgbcdpbp();
      hash = (37 * hash) + REWARDINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getRewardIndex();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp prototype) {
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
     * <pre>
     *enum IHFJEPEMDGL {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 7818;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code GCGDSChangeDeckNameRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSChangeDeckNameRsp)
        emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.internal_static_GCGDSChangeDeckNameRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.internal_static_GCGDSChangeDeckNameRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp.class, emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp.newBuilder()
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
        ccdlgbcdpbp_ = 0;

        rewardIndex_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.internal_static_GCGDSChangeDeckNameRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp build() {
        emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp buildPartial() {
        emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp result = new emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp(this);
        result.ccdlgbcdpbp_ = ccdlgbcdpbp_;
        result.rewardIndex_ = rewardIndex_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp other) {
        if (other == emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp.getDefaultInstance()) return this;
        if (other.getCcdlgbcdpbp() != 0) {
          setCcdlgbcdpbp(other.getCcdlgbcdpbp());
        }
        if (other.getRewardIndex() != 0) {
          setRewardIndex(other.getRewardIndex());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int ccdlgbcdpbp_ ;
      /**
       * <code>uint32 ccdlgbcdpbp = 12;</code>
       * @return The ccdlgbcdpbp.
       */
      @java.lang.Override
      public int getCcdlgbcdpbp() {
        return ccdlgbcdpbp_;
      }
      /**
       * <code>uint32 ccdlgbcdpbp = 12;</code>
       * @param value The ccdlgbcdpbp to set.
       * @return This builder for chaining.
       */
      public Builder setCcdlgbcdpbp(int value) {
        
        ccdlgbcdpbp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ccdlgbcdpbp = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCcdlgbcdpbp() {
        
        ccdlgbcdpbp_ = 0;
        onChanged();
        return this;
      }

      private int rewardIndex_ ;
      /**
       * <code>uint32 rewardIndex = 1;</code>
       * @return The rewardIndex.
       */
      @java.lang.Override
      public int getRewardIndex() {
        return rewardIndex_;
      }
      /**
       * <code>uint32 rewardIndex = 1;</code>
       * @param value The rewardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setRewardIndex(int value) {
        
        rewardIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rewardIndex = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardIndex() {
        
        rewardIndex_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSChangeDeckNameRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGDSChangeDeckNameRsp)
    private static final emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp();
    }

    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSChangeDeckNameRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSChangeDeckNameRsp>() {
      @java.lang.Override
      public GCGDSChangeDeckNameRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSChangeDeckNameRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSChangeDeckNameRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSChangeDeckNameRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSChangeDeckNameRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSChangeDeckNameRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GCGDSChangeDeckNameRsp.proto\"S\n\026GCGDSC" +
      "hangeDeckNameRsp\022\023\n\013ccdlgbcdpbp\030\014 \001(\r\022\023\n" +
      "\013rewardIndex\030\001 \001(\r\022\017\n\007retcode\030\006 \001(\005B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSChangeDeckNameRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSChangeDeckNameRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSChangeDeckNameRsp_descriptor,
        new java.lang.String[] { "Ccdlgbcdpbp", "RewardIndex", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}