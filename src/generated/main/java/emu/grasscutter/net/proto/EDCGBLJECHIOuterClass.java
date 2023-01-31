// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EDCGBLJECHI.proto

package emu.grasscutter.net.proto;

public final class EDCGBLJECHIOuterClass {
  private EDCGBLJECHIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EDCGBLJECHIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EDCGBLJECHI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entityId = 12;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 aemmidgkohc = 7;</code>
     * @return The aemmidgkohc.
     */
    int getAemmidgkohc();

    /**
     * <code>.Vector pos = 2;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 2;</code>
     * @return The pos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 2;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>int32 faceAngleCompact = 3;</code>
     * @return The faceAngleCompact.
     */
    int getFaceAngleCompact();

    /**
     * <code>uint32 normalizedTimeCompact = 1;</code>
     * @return The normalizedTimeCompact.
     */
    int getNormalizedTimeCompact();
  }
  /**
   * Protobuf type {@code EDCGBLJECHI}
   */
  public static final class EDCGBLJECHI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EDCGBLJECHI)
      EDCGBLJECHIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EDCGBLJECHI.newBuilder() to construct.
    private EDCGBLJECHI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EDCGBLJECHI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EDCGBLJECHI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EDCGBLJECHI(
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

              normalizedTimeCompact_ = input.readUInt32();
              break;
            }
            case 18: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (pos_ != null) {
                subBuilder = pos_.toBuilder();
              }
              pos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pos_);
                pos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 24: {

              faceAngleCompact_ = input.readInt32();
              break;
            }
            case 56: {

              aemmidgkohc_ = input.readUInt32();
              break;
            }
            case 96: {

              entityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.internal_static_EDCGBLJECHI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.internal_static_EDCGBLJECHI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI.class, emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI.Builder.class);
    }

    public static final int ENTITYID_FIELD_NUMBER = 12;
    private int entityId_;
    /**
     * <code>uint32 entityId = 12;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int AEMMIDGKOHC_FIELD_NUMBER = 7;
    private int aemmidgkohc_;
    /**
     * <code>uint32 aemmidgkohc = 7;</code>
     * @return The aemmidgkohc.
     */
    @java.lang.Override
    public int getAemmidgkohc() {
      return aemmidgkohc_;
    }

    public static final int POS_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 2;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 2;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
    }

    public static final int FACEANGLECOMPACT_FIELD_NUMBER = 3;
    private int faceAngleCompact_;
    /**
     * <code>int32 faceAngleCompact = 3;</code>
     * @return The faceAngleCompact.
     */
    @java.lang.Override
    public int getFaceAngleCompact() {
      return faceAngleCompact_;
    }

    public static final int NORMALIZEDTIMECOMPACT_FIELD_NUMBER = 1;
    private int normalizedTimeCompact_;
    /**
     * <code>uint32 normalizedTimeCompact = 1;</code>
     * @return The normalizedTimeCompact.
     */
    @java.lang.Override
    public int getNormalizedTimeCompact() {
      return normalizedTimeCompact_;
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
      if (normalizedTimeCompact_ != 0) {
        output.writeUInt32(1, normalizedTimeCompact_);
      }
      if (pos_ != null) {
        output.writeMessage(2, getPos());
      }
      if (faceAngleCompact_ != 0) {
        output.writeInt32(3, faceAngleCompact_);
      }
      if (aemmidgkohc_ != 0) {
        output.writeUInt32(7, aemmidgkohc_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(12, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (normalizedTimeCompact_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, normalizedTimeCompact_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPos());
      }
      if (faceAngleCompact_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, faceAngleCompact_);
      }
      if (aemmidgkohc_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, aemmidgkohc_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI other = (emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getAemmidgkohc()
          != other.getAemmidgkohc()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (getFaceAngleCompact()
          != other.getFaceAngleCompact()) return false;
      if (getNormalizedTimeCompact()
          != other.getNormalizedTimeCompact()) return false;
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
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + AEMMIDGKOHC_FIELD_NUMBER;
      hash = (53 * hash) + getAemmidgkohc();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (37 * hash) + FACEANGLECOMPACT_FIELD_NUMBER;
      hash = (53 * hash) + getFaceAngleCompact();
      hash = (37 * hash) + NORMALIZEDTIMECOMPACT_FIELD_NUMBER;
      hash = (53 * hash) + getNormalizedTimeCompact();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI prototype) {
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
     * Protobuf type {@code EDCGBLJECHI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EDCGBLJECHI)
        emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.internal_static_EDCGBLJECHI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.internal_static_EDCGBLJECHI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI.class, emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI.newBuilder()
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
        entityId_ = 0;

        aemmidgkohc_ = 0;

        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        faceAngleCompact_ = 0;

        normalizedTimeCompact_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.internal_static_EDCGBLJECHI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI build() {
        emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI buildPartial() {
        emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI result = new emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI(this);
        result.entityId_ = entityId_;
        result.aemmidgkohc_ = aemmidgkohc_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
        }
        result.faceAngleCompact_ = faceAngleCompact_;
        result.normalizedTimeCompact_ = normalizedTimeCompact_;
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
        if (other instanceof emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI) {
          return mergeFrom((emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI other) {
        if (other == emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getAemmidgkohc() != 0) {
          setAemmidgkohc(other.getAemmidgkohc());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.getFaceAngleCompact() != 0) {
          setFaceAngleCompact(other.getFaceAngleCompact());
        }
        if (other.getNormalizedTimeCompact() != 0) {
          setNormalizedTimeCompact(other.getNormalizedTimeCompact());
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
        emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 12;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 12;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int aemmidgkohc_ ;
      /**
       * <code>uint32 aemmidgkohc = 7;</code>
       * @return The aemmidgkohc.
       */
      @java.lang.Override
      public int getAemmidgkohc() {
        return aemmidgkohc_;
      }
      /**
       * <code>uint32 aemmidgkohc = 7;</code>
       * @param value The aemmidgkohc to set.
       * @return This builder for chaining.
       */
      public Builder setAemmidgkohc(int value) {
        
        aemmidgkohc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 aemmidgkohc = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAemmidgkohc() {
        
        aemmidgkohc_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 2;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 2;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private int faceAngleCompact_ ;
      /**
       * <code>int32 faceAngleCompact = 3;</code>
       * @return The faceAngleCompact.
       */
      @java.lang.Override
      public int getFaceAngleCompact() {
        return faceAngleCompact_;
      }
      /**
       * <code>int32 faceAngleCompact = 3;</code>
       * @param value The faceAngleCompact to set.
       * @return This builder for chaining.
       */
      public Builder setFaceAngleCompact(int value) {
        
        faceAngleCompact_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 faceAngleCompact = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaceAngleCompact() {
        
        faceAngleCompact_ = 0;
        onChanged();
        return this;
      }

      private int normalizedTimeCompact_ ;
      /**
       * <code>uint32 normalizedTimeCompact = 1;</code>
       * @return The normalizedTimeCompact.
       */
      @java.lang.Override
      public int getNormalizedTimeCompact() {
        return normalizedTimeCompact_;
      }
      /**
       * <code>uint32 normalizedTimeCompact = 1;</code>
       * @param value The normalizedTimeCompact to set.
       * @return This builder for chaining.
       */
      public Builder setNormalizedTimeCompact(int value) {
        
        normalizedTimeCompact_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 normalizedTimeCompact = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNormalizedTimeCompact() {
        
        normalizedTimeCompact_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EDCGBLJECHI)
    }

    // @@protoc_insertion_point(class_scope:EDCGBLJECHI)
    private static final emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI();
    }

    public static emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EDCGBLJECHI>
        PARSER = new com.google.protobuf.AbstractParser<EDCGBLJECHI>() {
      @java.lang.Override
      public EDCGBLJECHI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EDCGBLJECHI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EDCGBLJECHI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EDCGBLJECHI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EDCGBLJECHIOuterClass.EDCGBLJECHI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EDCGBLJECHI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EDCGBLJECHI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021EDCGBLJECHI.proto\032\014Vector.proto\"\203\001\n\013ED" +
      "CGBLJECHI\022\020\n\010entityId\030\014 \001(\r\022\023\n\013aemmidgko" +
      "hc\030\007 \001(\r\022\024\n\003pos\030\002 \001(\0132\007.Vector\022\030\n\020faceAn" +
      "gleCompact\030\003 \001(\005\022\035\n\025normalizedTimeCompac" +
      "t\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EDCGBLJECHI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EDCGBLJECHI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EDCGBLJECHI_descriptor,
        new java.lang.String[] { "EntityId", "Aemmidgkohc", "Pos", "FaceAngleCompact", "NormalizedTimeCompact", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}