// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LuaOptionType.proto

package emu.grasscutter.net.proto;

public final class LuaOptionTypeOuterClass {
  private LuaOptionTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code LuaOptionType}
   */
  public enum LuaOptionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>LUA_OPTION_TYPE_NONE = 0;</code>
     */
    LUA_OPTION_TYPE_NONE(0),
    /**
     * <code>LUA_OPTION_TYPE_PLAYER_INPUT = 1;</code>
     */
    LUA_OPTION_TYPE_PLAYER_INPUT(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>LUA_OPTION_TYPE_NONE = 0;</code>
     */
    public static final int LUA_OPTION_TYPE_NONE_VALUE = 0;
    /**
     * <code>LUA_OPTION_TYPE_PLAYER_INPUT = 1;</code>
     */
    public static final int LUA_OPTION_TYPE_PLAYER_INPUT_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LuaOptionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LuaOptionType forNumber(int value) {
      switch (value) {
        case 0: return LUA_OPTION_TYPE_NONE;
        case 1: return LUA_OPTION_TYPE_PLAYER_INPUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LuaOptionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LuaOptionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LuaOptionType>() {
            public LuaOptionType findValueByNumber(int number) {
              return LuaOptionType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LuaOptionTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final LuaOptionType[] VALUES = values();

    public static LuaOptionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LuaOptionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:LuaOptionType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023LuaOptionType.proto*K\n\rLuaOptionType\022\030" +
      "\n\024LUA_OPTION_TYPE_NONE\020\000\022 \n\034LUA_OPTION_T" +
      "YPE_PLAYER_INPUT\020\001B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}