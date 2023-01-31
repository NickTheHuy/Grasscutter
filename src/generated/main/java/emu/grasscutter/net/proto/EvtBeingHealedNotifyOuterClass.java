// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtBeingHealedNotify.proto

package emu.grasscutter.net.proto;

public final class EvtBeingHealedNotifyOuterClass {
  private EvtBeingHealedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtBeingHealedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtBeingHealedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 sourceId = 13;</code>
     * @return The sourceId.
     */
    int getSourceId();

    /**
     * <code>float realHealAmount = 12;</code>
     * @return The realHealAmount.
     */
    float getRealHealAmount();

    /**
     * <code>float healAmount = 11;</code>
     * @return The healAmount.
     */
    float getHealAmount();

    /**
     * <code>uint32 targetId = 8;</code>
     * @return The targetId.
     */
    int getTargetId();
  }
  /**
   * <pre>
   *enum AHFCMEGDDAA {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 391;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code EvtBeingHealedNotify}
   */
  public static final class EvtBeingHealedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtBeingHealedNotify)
      EvtBeingHealedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtBeingHealedNotify.newBuilder() to construct.
    private EvtBeingHealedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtBeingHealedNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtBeingHealedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtBeingHealedNotify(
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
            case 64: {

              targetId_ = input.readUInt32();
              break;
            }
            case 93: {

              healAmount_ = input.readFloat();
              break;
            }
            case 101: {

              realHealAmount_ = input.readFloat();
              break;
            }
            case 104: {

              sourceId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.class, emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.Builder.class);
    }

    public static final int SOURCEID_FIELD_NUMBER = 13;
    private int sourceId_;
    /**
     * <code>uint32 sourceId = 13;</code>
     * @return The sourceId.
     */
    @java.lang.Override
    public int getSourceId() {
      return sourceId_;
    }

    public static final int REALHEALAMOUNT_FIELD_NUMBER = 12;
    private float realHealAmount_;
    /**
     * <code>float realHealAmount = 12;</code>
     * @return The realHealAmount.
     */
    @java.lang.Override
    public float getRealHealAmount() {
      return realHealAmount_;
    }

    public static final int HEALAMOUNT_FIELD_NUMBER = 11;
    private float healAmount_;
    /**
     * <code>float healAmount = 11;</code>
     * @return The healAmount.
     */
    @java.lang.Override
    public float getHealAmount() {
      return healAmount_;
    }

    public static final int TARGETID_FIELD_NUMBER = 8;
    private int targetId_;
    /**
     * <code>uint32 targetId = 8;</code>
     * @return The targetId.
     */
    @java.lang.Override
    public int getTargetId() {
      return targetId_;
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
      if (targetId_ != 0) {
        output.writeUInt32(8, targetId_);
      }
      if (healAmount_ != 0F) {
        output.writeFloat(11, healAmount_);
      }
      if (realHealAmount_ != 0F) {
        output.writeFloat(12, realHealAmount_);
      }
      if (sourceId_ != 0) {
        output.writeUInt32(13, sourceId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, targetId_);
      }
      if (healAmount_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(11, healAmount_);
      }
      if (realHealAmount_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(12, realHealAmount_);
      }
      if (sourceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, sourceId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify other = (emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify) obj;

      if (getSourceId()
          != other.getSourceId()) return false;
      if (java.lang.Float.floatToIntBits(getRealHealAmount())
          != java.lang.Float.floatToIntBits(
              other.getRealHealAmount())) return false;
      if (java.lang.Float.floatToIntBits(getHealAmount())
          != java.lang.Float.floatToIntBits(
              other.getHealAmount())) return false;
      if (getTargetId()
          != other.getTargetId()) return false;
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
      hash = (37 * hash) + SOURCEID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceId();
      hash = (37 * hash) + REALHEALAMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRealHealAmount());
      hash = (37 * hash) + HEALAMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHealAmount());
      hash = (37 * hash) + TARGETID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify prototype) {
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
     *enum AHFCMEGDDAA {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 391;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code EvtBeingHealedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtBeingHealedNotify)
        emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.class, emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.newBuilder()
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
        sourceId_ = 0;

        realHealAmount_ = 0F;

        healAmount_ = 0F;

        targetId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify build() {
        emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify buildPartial() {
        emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify result = new emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify(this);
        result.sourceId_ = sourceId_;
        result.realHealAmount_ = realHealAmount_;
        result.healAmount_ = healAmount_;
        result.targetId_ = targetId_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify other) {
        if (other == emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.getDefaultInstance()) return this;
        if (other.getSourceId() != 0) {
          setSourceId(other.getSourceId());
        }
        if (other.getRealHealAmount() != 0F) {
          setRealHealAmount(other.getRealHealAmount());
        }
        if (other.getHealAmount() != 0F) {
          setHealAmount(other.getHealAmount());
        }
        if (other.getTargetId() != 0) {
          setTargetId(other.getTargetId());
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
        emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sourceId_ ;
      /**
       * <code>uint32 sourceId = 13;</code>
       * @return The sourceId.
       */
      @java.lang.Override
      public int getSourceId() {
        return sourceId_;
      }
      /**
       * <code>uint32 sourceId = 13;</code>
       * @param value The sourceId to set.
       * @return This builder for chaining.
       */
      public Builder setSourceId(int value) {
        
        sourceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sourceId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceId() {
        
        sourceId_ = 0;
        onChanged();
        return this;
      }

      private float realHealAmount_ ;
      /**
       * <code>float realHealAmount = 12;</code>
       * @return The realHealAmount.
       */
      @java.lang.Override
      public float getRealHealAmount() {
        return realHealAmount_;
      }
      /**
       * <code>float realHealAmount = 12;</code>
       * @param value The realHealAmount to set.
       * @return This builder for chaining.
       */
      public Builder setRealHealAmount(float value) {
        
        realHealAmount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float realHealAmount = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRealHealAmount() {
        
        realHealAmount_ = 0F;
        onChanged();
        return this;
      }

      private float healAmount_ ;
      /**
       * <code>float healAmount = 11;</code>
       * @return The healAmount.
       */
      @java.lang.Override
      public float getHealAmount() {
        return healAmount_;
      }
      /**
       * <code>float healAmount = 11;</code>
       * @param value The healAmount to set.
       * @return This builder for chaining.
       */
      public Builder setHealAmount(float value) {
        
        healAmount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float healAmount = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearHealAmount() {
        
        healAmount_ = 0F;
        onChanged();
        return this;
      }

      private int targetId_ ;
      /**
       * <code>uint32 targetId = 8;</code>
       * @return The targetId.
       */
      @java.lang.Override
      public int getTargetId() {
        return targetId_;
      }
      /**
       * <code>uint32 targetId = 8;</code>
       * @param value The targetId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetId(int value) {
        
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 targetId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetId() {
        
        targetId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtBeingHealedNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtBeingHealedNotify)
    private static final emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify();
    }

    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtBeingHealedNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtBeingHealedNotify>() {
      @java.lang.Override
      public EvtBeingHealedNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtBeingHealedNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtBeingHealedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtBeingHealedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtBeingHealedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtBeingHealedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EvtBeingHealedNotify.proto\"f\n\024EvtBeing" +
      "HealedNotify\022\020\n\010sourceId\030\r \001(\r\022\026\n\016realHe" +
      "alAmount\030\014 \001(\002\022\022\n\nhealAmount\030\013 \001(\002\022\020\n\010ta" +
      "rgetId\030\010 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EvtBeingHealedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtBeingHealedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtBeingHealedNotify_descriptor,
        new java.lang.String[] { "SourceId", "RealHealAmount", "HealAmount", "TargetId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}