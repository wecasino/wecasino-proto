// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/games.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.games;

/**
 * Protobuf enum {@code games.WinType}
 */
public enum WinType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>WIN_TYPE_UNSPECIFIED = 0;</code>
   */
  WIN_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * 輸
   * </pre>
   *
   * <code>LOSE = 1;</code>
   */
  LOSE(1),
  /**
   * <pre>
   * 贏
   * </pre>
   *
   * <code>WIN = 2;</code>
   */
  WIN(2),
  /**
   * <pre>
   * 和
   * </pre>
   *
   * <code>TIE = 3;</code>
   */
  TIE(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      WinType.class.getName());
  }
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>WIN_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int WIN_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 輸
   * </pre>
   *
   * <code>LOSE = 1;</code>
   */
  public static final int LOSE_VALUE = 1;
  /**
   * <pre>
   * 贏
   * </pre>
   *
   * <code>WIN = 2;</code>
   */
  public static final int WIN_VALUE = 2;
  /**
   * <pre>
   * 和
   * </pre>
   *
   * <code>TIE = 3;</code>
   */
  public static final int TIE_VALUE = 3;


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
  public static WinType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WinType forNumber(int value) {
    switch (value) {
      case 0: return WIN_TYPE_UNSPECIFIED;
      case 1: return LOSE;
      case 2: return WIN;
      case 3: return TIE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WinType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WinType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WinType>() {
          public WinType findValueByNumber(int number) {
            return WinType.forNumber(number);
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
    return com.wecasino.proto.games.GamesProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final WinType[] VALUES = values();

  public static WinType valueOf(
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

  private WinType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.WinType)
}
