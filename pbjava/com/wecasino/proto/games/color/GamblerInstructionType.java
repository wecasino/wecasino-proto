// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/color/record.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.games.color;

/**
 * Protobuf enum {@code games.color.GamblerInstructionType}
 */
public enum GamblerInstructionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>GAMBLER_INSTRUCTION_UNSPECIFIED = 0;</code>
   */
  GAMBLER_INSTRUCTION_UNSPECIFIED(0),
  /**
   * <pre>
   * 左側骰子
   * </pre>
   *
   * <code>LEFT_UP = 1;</code>
   */
  LEFT_UP(1),
  /**
   * <pre>
   * 中間骰子
   * </pre>
   *
   * <code>MIDDLE_UP = 2;</code>
   */
  MIDDLE_UP(2),
  /**
   * <pre>
   * 右邊骰子
   * </pre>
   *
   * <code>RIGHT_UP = 3;</code>
   */
  RIGHT_UP(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>GAMBLER_INSTRUCTION_UNSPECIFIED = 0;</code>
   */
  public static final int GAMBLER_INSTRUCTION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 左側骰子
   * </pre>
   *
   * <code>LEFT_UP = 1;</code>
   */
  public static final int LEFT_UP_VALUE = 1;
  /**
   * <pre>
   * 中間骰子
   * </pre>
   *
   * <code>MIDDLE_UP = 2;</code>
   */
  public static final int MIDDLE_UP_VALUE = 2;
  /**
   * <pre>
   * 右邊骰子
   * </pre>
   *
   * <code>RIGHT_UP = 3;</code>
   */
  public static final int RIGHT_UP_VALUE = 3;


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
  public static GamblerInstructionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GamblerInstructionType forNumber(int value) {
    switch (value) {
      case 0: return GAMBLER_INSTRUCTION_UNSPECIFIED;
      case 1: return LEFT_UP;
      case 2: return MIDDLE_UP;
      case 3: return RIGHT_UP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GamblerInstructionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GamblerInstructionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GamblerInstructionType>() {
          public GamblerInstructionType findValueByNumber(int number) {
            return GamblerInstructionType.forNumber(number);
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
    return com.wecasino.proto.games.color.RecordProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final GamblerInstructionType[] VALUES = values();

  public static GamblerInstructionType valueOf(
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

  private GamblerInstructionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.color.GamblerInstructionType)
}
