// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/thebigbattle/record.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.games.thebigbattle;

/**
 * <pre>
 * 步驟，依據遊戲供應商邏輯，不是每個步驟都會走到
 * </pre>
 *
 * Protobuf enum {@code games.thebigbattle.Step}
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
   * 展示第一張牌
   * </pre>
   *
   * <code>SHOW_FIRST_CARD = 3;</code>
   */
  SHOW_FIRST_CARD(3),
  /**
   * <pre>
   * 捨牌1
   * </pre>
   *
   * <code>DEAL_DISCARD_1 = 4;</code>
   */
  DEAL_DISCARD_1(4),
  /**
   * <pre>
   * 派發左側玩家手牌
   * </pre>
   *
   * <code>DEAL_LEFT = 8;</code>
   */
  DEAL_LEFT(8),
  /**
   * <pre>
   * 派發右側玩家手牌
   * </pre>
   *
   * <code>DEAL_RIGHT = 9;</code>
   */
  DEAL_RIGHT(9),
  /**
   * <pre>
   * 開放下注
   * </pre>
   *
   * <code>ROUND_BET = 12;</code>
   */
  ROUND_BET(12),
  /**
   * <pre>
   * 停止下注
   * </pre>
   *
   * <code>NO_MORE_BET = 13;</code>
   */
  NO_MORE_BET(13),
  /**
   * <pre>
   * 開玩家手牌
   * </pre>
   *
   * <code>SHOW_HAND = 16;</code>
   */
  SHOW_HAND(16),
  /**
   * <pre>
   * 開左側玩家手牌
   * </pre>
   *
   * <code>SHOW_LEFT = 17;</code>
   */
  SHOW_LEFT(17),
  /**
   * <pre>
   * 開右側玩家手牌
   * </pre>
   *
   * <code>SHOW_RIGHT = 18;</code>
   */
  SHOW_RIGHT(18),
  /**
   * <code>DEALER_CONFIRM = 20;</code>
   */
  DEALER_CONFIRM(20),
  /**
   * <pre>
   * PITBOSS 修改派發手牌
   * </pre>
   *
   * <code>PITBOSS_MODIFY_NORMAL = 24;</code>
   */
  PITBOSS_MODIFY_NORMAL(24),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Step.class.getName());
  }
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
   * 展示第一張牌
   * </pre>
   *
   * <code>SHOW_FIRST_CARD = 3;</code>
   */
  public static final int SHOW_FIRST_CARD_VALUE = 3;
  /**
   * <pre>
   * 捨牌1
   * </pre>
   *
   * <code>DEAL_DISCARD_1 = 4;</code>
   */
  public static final int DEAL_DISCARD_1_VALUE = 4;
  /**
   * <pre>
   * 派發左側玩家手牌
   * </pre>
   *
   * <code>DEAL_LEFT = 8;</code>
   */
  public static final int DEAL_LEFT_VALUE = 8;
  /**
   * <pre>
   * 派發右側玩家手牌
   * </pre>
   *
   * <code>DEAL_RIGHT = 9;</code>
   */
  public static final int DEAL_RIGHT_VALUE = 9;
  /**
   * <pre>
   * 開放下注
   * </pre>
   *
   * <code>ROUND_BET = 12;</code>
   */
  public static final int ROUND_BET_VALUE = 12;
  /**
   * <pre>
   * 停止下注
   * </pre>
   *
   * <code>NO_MORE_BET = 13;</code>
   */
  public static final int NO_MORE_BET_VALUE = 13;
  /**
   * <pre>
   * 開玩家手牌
   * </pre>
   *
   * <code>SHOW_HAND = 16;</code>
   */
  public static final int SHOW_HAND_VALUE = 16;
  /**
   * <pre>
   * 開左側玩家手牌
   * </pre>
   *
   * <code>SHOW_LEFT = 17;</code>
   */
  public static final int SHOW_LEFT_VALUE = 17;
  /**
   * <pre>
   * 開右側玩家手牌
   * </pre>
   *
   * <code>SHOW_RIGHT = 18;</code>
   */
  public static final int SHOW_RIGHT_VALUE = 18;
  /**
   * <code>DEALER_CONFIRM = 20;</code>
   */
  public static final int DEALER_CONFIRM_VALUE = 20;
  /**
   * <pre>
   * PITBOSS 修改派發手牌
   * </pre>
   *
   * <code>PITBOSS_MODIFY_NORMAL = 24;</code>
   */
  public static final int PITBOSS_MODIFY_NORMAL_VALUE = 24;


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
      case 3: return SHOW_FIRST_CARD;
      case 4: return DEAL_DISCARD_1;
      case 8: return DEAL_LEFT;
      case 9: return DEAL_RIGHT;
      case 12: return ROUND_BET;
      case 13: return NO_MORE_BET;
      case 16: return SHOW_HAND;
      case 17: return SHOW_LEFT;
      case 18: return SHOW_RIGHT;
      case 20: return DEALER_CONFIRM;
      case 24: return PITBOSS_MODIFY_NORMAL;
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
    return com.wecasino.proto.games.thebigbattle.RecordProto.getDescriptor().getEnumTypes().get(1);
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

  // @@protoc_insertion_point(enum_scope:games.thebigbattle.Step)
}
