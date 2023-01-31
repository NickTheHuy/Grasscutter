// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ECLDFPKCOPE.proto

package emu.grasscutter.net.proto;

public final class ECLDFPKCOPEOuterClass {
  private ECLDFPKCOPEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ECLDFPKCOPEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ECLDFPKCOPE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AttackResult attackResult = 13;</code>
     * @return Whether the attackResult field is set.
     */
    boolean hasAttackResult();
    /**
     * <code>.AttackResult attackResult = 13;</code>
     * @return The attackResult.
     */
    emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult getAttackResult();
    /**
     * <code>.AttackResult attackResult = 13;</code>
     */
    emu.grasscutter.net.proto.AttackResultOuterClass.AttackResultOrBuilder getAttackResultOrBuilder();

    /**
     * <code>uint32 peerId = 3;</code>
     * @return The peerId.
     */
    int getPeerId();
  }
  /**
   * Protobuf type {@code ECLDFPKCOPE}
   */
  public static final class ECLDFPKCOPE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ECLDFPKCOPE)
      ECLDFPKCOPEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ECLDFPKCOPE.newBuilder() to construct.
    private ECLDFPKCOPE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ECLDFPKCOPE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ECLDFPKCOPE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ECLDFPKCOPE(
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
            case 24: {

              peerId_ = input.readUInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.Builder subBuilder = null;
              if (attackResult_ != null) {
                subBuilder = attackResult_.toBuilder();
              }
              attackResult_ = input.readMessage(emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(attackResult_);
                attackResult_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.internal_static_ECLDFPKCOPE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.internal_static_ECLDFPKCOPE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE.class, emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE.Builder.class);
    }

    public static final int ATTACKRESULT_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult attackResult_;
    /**
     * <code>.AttackResult attackResult = 13;</code>
     * @return Whether the attackResult field is set.
     */
    @java.lang.Override
    public boolean hasAttackResult() {
      return attackResult_ != null;
    }
    /**
     * <code>.AttackResult attackResult = 13;</code>
     * @return The attackResult.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult getAttackResult() {
      return attackResult_ == null ? emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.getDefaultInstance() : attackResult_;
    }
    /**
     * <code>.AttackResult attackResult = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AttackResultOuterClass.AttackResultOrBuilder getAttackResultOrBuilder() {
      return getAttackResult();
    }

    public static final int PEERID_FIELD_NUMBER = 3;
    private int peerId_;
    /**
     * <code>uint32 peerId = 3;</code>
     * @return The peerId.
     */
    @java.lang.Override
    public int getPeerId() {
      return peerId_;
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
      if (peerId_ != 0) {
        output.writeUInt32(3, peerId_);
      }
      if (attackResult_ != null) {
        output.writeMessage(13, getAttackResult());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (peerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, peerId_);
      }
      if (attackResult_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getAttackResult());
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
      if (!(obj instanceof emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE other = (emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE) obj;

      if (hasAttackResult() != other.hasAttackResult()) return false;
      if (hasAttackResult()) {
        if (!getAttackResult()
            .equals(other.getAttackResult())) return false;
      }
      if (getPeerId()
          != other.getPeerId()) return false;
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
      if (hasAttackResult()) {
        hash = (37 * hash) + ATTACKRESULT_FIELD_NUMBER;
        hash = (53 * hash) + getAttackResult().hashCode();
      }
      hash = (37 * hash) + PEERID_FIELD_NUMBER;
      hash = (53 * hash) + getPeerId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE prototype) {
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
     * Protobuf type {@code ECLDFPKCOPE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ECLDFPKCOPE)
        emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.internal_static_ECLDFPKCOPE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.internal_static_ECLDFPKCOPE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE.class, emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE.newBuilder()
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
        if (attackResultBuilder_ == null) {
          attackResult_ = null;
        } else {
          attackResult_ = null;
          attackResultBuilder_ = null;
        }
        peerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.internal_static_ECLDFPKCOPE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE build() {
        emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE buildPartial() {
        emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE result = new emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE(this);
        if (attackResultBuilder_ == null) {
          result.attackResult_ = attackResult_;
        } else {
          result.attackResult_ = attackResultBuilder_.build();
        }
        result.peerId_ = peerId_;
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
        if (other instanceof emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE) {
          return mergeFrom((emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE other) {
        if (other == emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE.getDefaultInstance()) return this;
        if (other.hasAttackResult()) {
          mergeAttackResult(other.getAttackResult());
        }
        if (other.getPeerId() != 0) {
          setPeerId(other.getPeerId());
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
        emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult attackResult_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult, emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.Builder, emu.grasscutter.net.proto.AttackResultOuterClass.AttackResultOrBuilder> attackResultBuilder_;
      /**
       * <code>.AttackResult attackResult = 13;</code>
       * @return Whether the attackResult field is set.
       */
      public boolean hasAttackResult() {
        return attackResultBuilder_ != null || attackResult_ != null;
      }
      /**
       * <code>.AttackResult attackResult = 13;</code>
       * @return The attackResult.
       */
      public emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult getAttackResult() {
        if (attackResultBuilder_ == null) {
          return attackResult_ == null ? emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.getDefaultInstance() : attackResult_;
        } else {
          return attackResultBuilder_.getMessage();
        }
      }
      /**
       * <code>.AttackResult attackResult = 13;</code>
       */
      public Builder setAttackResult(emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult value) {
        if (attackResultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          attackResult_ = value;
          onChanged();
        } else {
          attackResultBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AttackResult attackResult = 13;</code>
       */
      public Builder setAttackResult(
          emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.Builder builderForValue) {
        if (attackResultBuilder_ == null) {
          attackResult_ = builderForValue.build();
          onChanged();
        } else {
          attackResultBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AttackResult attackResult = 13;</code>
       */
      public Builder mergeAttackResult(emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult value) {
        if (attackResultBuilder_ == null) {
          if (attackResult_ != null) {
            attackResult_ =
              emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.newBuilder(attackResult_).mergeFrom(value).buildPartial();
          } else {
            attackResult_ = value;
          }
          onChanged();
        } else {
          attackResultBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AttackResult attackResult = 13;</code>
       */
      public Builder clearAttackResult() {
        if (attackResultBuilder_ == null) {
          attackResult_ = null;
          onChanged();
        } else {
          attackResult_ = null;
          attackResultBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AttackResult attackResult = 13;</code>
       */
      public emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.Builder getAttackResultBuilder() {
        
        onChanged();
        return getAttackResultFieldBuilder().getBuilder();
      }
      /**
       * <code>.AttackResult attackResult = 13;</code>
       */
      public emu.grasscutter.net.proto.AttackResultOuterClass.AttackResultOrBuilder getAttackResultOrBuilder() {
        if (attackResultBuilder_ != null) {
          return attackResultBuilder_.getMessageOrBuilder();
        } else {
          return attackResult_ == null ?
              emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.getDefaultInstance() : attackResult_;
        }
      }
      /**
       * <code>.AttackResult attackResult = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult, emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.Builder, emu.grasscutter.net.proto.AttackResultOuterClass.AttackResultOrBuilder> 
          getAttackResultFieldBuilder() {
        if (attackResultBuilder_ == null) {
          attackResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult, emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult.Builder, emu.grasscutter.net.proto.AttackResultOuterClass.AttackResultOrBuilder>(
                  getAttackResult(),
                  getParentForChildren(),
                  isClean());
          attackResult_ = null;
        }
        return attackResultBuilder_;
      }

      private int peerId_ ;
      /**
       * <code>uint32 peerId = 3;</code>
       * @return The peerId.
       */
      @java.lang.Override
      public int getPeerId() {
        return peerId_;
      }
      /**
       * <code>uint32 peerId = 3;</code>
       * @param value The peerId to set.
       * @return This builder for chaining.
       */
      public Builder setPeerId(int value) {
        
        peerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 peerId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPeerId() {
        
        peerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ECLDFPKCOPE)
    }

    // @@protoc_insertion_point(class_scope:ECLDFPKCOPE)
    private static final emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE();
    }

    public static emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ECLDFPKCOPE>
        PARSER = new com.google.protobuf.AbstractParser<ECLDFPKCOPE>() {
      @java.lang.Override
      public ECLDFPKCOPE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ECLDFPKCOPE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ECLDFPKCOPE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ECLDFPKCOPE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ECLDFPKCOPEOuterClass.ECLDFPKCOPE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ECLDFPKCOPE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ECLDFPKCOPE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ECLDFPKCOPE.proto\032\022AttackResult.proto\"" +
      "B\n\013ECLDFPKCOPE\022#\n\014attackResult\030\r \001(\0132\r.A" +
      "ttackResult\022\016\n\006peerId\030\003 \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AttackResultOuterClass.getDescriptor(),
        });
    internal_static_ECLDFPKCOPE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ECLDFPKCOPE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ECLDFPKCOPE_descriptor,
        new java.lang.String[] { "AttackResult", "PeerId", });
    emu.grasscutter.net.proto.AttackResultOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}