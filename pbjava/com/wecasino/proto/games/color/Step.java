// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/color/record.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.games.color;

/**
 * <pre>
 * 步驟，依據遊戲供應商邏輯，不是每個步驟都會走到
 * </pre>
 *
 * Protobuf enum {@code games.color.Step}
 */
public enum Step
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>STEP_UNSPECIFIED = 0;</code>
   */
  STEP_UNSPECIFIED(0),
  /**
   * <pre>
   * 本局開始
   * </pre>
   *
   * <code>ROUND_START = 1;</code>
   */
  ROUND_START(1),
  /**
   * <pre>
   * 本局完成
   * </pre>
   *
   * <code>ROUND_FINISHED = 2;</code>
   */
  ROUND_FINISHED(2),
  /**
   * <pre>
   * 本局取消
   * </pre>
   *
   * <code>ROUND_CANCELED = 3;</code>
   */
  ROUND_CANCELED(3),
  /**
   * <pre>
   * 開放下注
   * </pre>
   *
   * <code>ROUND_BET = 4;</code>
   */
  ROUND_BET(4),
  /**
   * <pre>
   * 停止下注
   * </pre>
   *
   * <code>NO_MORE_BET = 5;</code>
   */
  NO_MORE_BET(5),
  /**
   * <pre>
   * 擲骰
   * </pre>
   *
   * <code>THROW_COLOR = 8;</code>
   */
  THROW_COLOR(8),
  /**
   * <pre>
   * SUPER_GAME
   * </pre>
   *
   * <code>SUPER_GAME_ROUND_READY = 9;</code>
   */
  SUPER_GAME_ROUND_READY(9),
  /**
   * <pre>
   * 開始
   * </pre>
   *
   * <code>SUPER_GAME_ROUND_START = 10;</code>
   */
  SUPER_GAME_ROUND_START(10),
  /**
   * <pre>
   * 開放下注
   * </pre>
   *
   * <code>SUPER_GAME_ROUND_BET = 11;</code>
   */
  SUPER_GAME_ROUND_BET(11),
  /**
   * <pre>
   * 停止下注
   * </pre>
   *
   * <code>SUPER_GAME_NO_MORE_BET = 12;</code>
   */
  SUPER_GAME_NO_MORE_BET(12),
  /**
   * <code>SUPER_GAME_THROW_COLOR = 13;</code>
   */
  SUPER_GAME_THROW_COLOR(13),
  /**
   * <pre>
   * PITBOSS 修改骰點
   * </pre>
   *
   * <code>PITBOSS_MODIFY_BOWL = 16;</code>
   */
  PITBOSS_MODIFY_BOWL(16),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>STEP_UNSPECIFIED = 0;</code>
   */
  public static final int STEP_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 本局開始
   * </pre>
   *
   * <code>ROUND_START = 1;</code>
   */
  public static final int ROUND_START_VALUE = 1;
  /**
   * <pre>
   * 本局完成
   * </pre>
   *
   * <code>ROUND_FINISHED = 2;</code>
   */
  public static final int ROUND_FINISHED_VALUE = 2;
  /**
   * <pre>
   * 本局取消
   * </pre>
   *
   * <code>ROUND_CANCELED = 3;</code>
   */
  public static final int ROUND_CANCELED_VALUE = 3;
  /**
   * <pre>
   * 開放下注
   * </pre>
   *
   * <code>ROUND_BET = 4;</code>
   */
  public static final int ROUND_BET_VALUE = 4;
  /**
   * <pre>
   * 停止下注
   * </pre>
   *
   * <code>NO_MORE_BET = 5;</code>
   */
  public static final int NO_MORE_BET_VALUE = 5;
  /**
   * <pre>
   * 擲骰
   * </pre>
   *
   * <code>THROW_COLOR = 8;</code>
   */
  public static final int THROW_COLOR_VALUE = 8;
  /**
   * <pre>
   * SUPER_GAME
   * </pre>
   *
   * <code>SUPER_GAME_ROUND_READY = 9;</code>
   */
  public static final int SUPER_GAME_ROUND_READY_VALUE = 9;
  /**
   * <pre>
   * 開始
   * </pre>
   *
   * <code>SUPER_GAME_ROUND_START = 10;</code>
   */
  public static final int SUPER_GAME_ROUND_START_VALUE = 10;
  /**
   * <pre>
   * 開放下注
   * </pre>
   *
   * <code>SUPER_GAME_ROUND_BET = 11;</code>
   */
  public static final int SUPER_GAME_ROUND_BET_VALUE = 11;
  /**
   * <pre>
   * 停止下注
   * </pre>
   *
   * <code>SUPER_GAME_NO_MORE_BET = 12;</code>
   */
  public static final int SUPER_GAME_NO_MORE_BET_VALUE = 12;
  /**
   * <code>SUPER_GAME_THROW_COLOR = 13;</code>
   */
  public static final int SUPER_GAME_THROW_COLOR_VALUE = 13;
  /**
   * <pre>
   * PITBOSS 修改骰點
   * </pre>
   *
   * <code>PITBOSS_MODIFY_BOWL = 16;</code>
   */
  public static final int PITBOSS_MODIFY_BOWL_VALUE = 16;


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
  public static Step valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Step forNumber(int value) {
    switch (value) {
      case 0: return STEP_UNSPECIFIED;
      case 1: return ROUND_START;
      case 2: return ROUND_FINISHED;
      case 3: return ROUND_CANCELED;
      case 4: return ROUND_BET;
      case 5: return NO_MORE_BET;
      case 8: return THROW_COLOR;
      case 9: return SUPER_GAME_ROUND_READY;
      case 10: return SUPER_GAME_ROUND_START;
      case 11: return SUPER_GAME_ROUND_BET;
      case 12: return SUPER_GAME_NO_MORE_BET;
      case 13: return SUPER_GAME_THROW_COLOR;
      case 16: return PITBOSS_MODIFY_BOWL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Step>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Step> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Step>() {
          public Step findValueByNumber(int number) {
            return Step.forNumber(number);
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
    return com.wecasino.proto.games.color.RecordProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final Step[] VALUES = values();

  public static Step valueOf(
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

  private Step(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.color.Step)
}

