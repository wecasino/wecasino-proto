// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

/**
 * Protobuf enum {@code recorder.GameNotifyType}
 */
public enum GameNotifyType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>GAME_NOTIFY_TYPE_UNSPECIFIED = 0;</code>
   */
  GAME_NOTIFY_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * 通知遊戲供應狀況改變
   * </pre>
   *
   * <code>NOTIFY_GAME_PROVIDE_STATE_CHANGE = 1;</code>
   */
  NOTIFY_GAME_PROVIDE_STATE_CHANGE(1),
  /**
   * <pre>
   * 通知遊戲流程荷官登入
   * </pre>
   *
   * <code>NOTIFY_GAME_DEALER_LOGIN = 6;</code>
   */
  NOTIFY_GAME_DEALER_LOGIN(6),
  /**
   * <pre>
   * 通知遊戲流程荷官登出
   * </pre>
   *
   * <code>NOTIFY_GAME_DEALER_LOGOUT = 7;</code>
   */
  NOTIFY_GAME_DEALER_LOGOUT(7),
  /**
   * <pre>
   * 通知遊戲流程開始換靴，更換結束呼叫 NOTIFY_SHOE_START
   * </pre>
   *
   * <code>NOTIFY_GAME_CHANGING_SHOE = 8;</code>
   */
  NOTIFY_GAME_CHANGING_SHOE(8),
  /**
   * <pre>
   * 通知遊戲班開始
   * </pre>
   *
   * <code>NOTIFY_SHIFT_START = 9;</code>
   */
  NOTIFY_SHIFT_START(9),
  /**
   * <pre>
   * 通知遊戲班結束
   * </pre>
   *
   * <code>NOTIFY_SHIFT_END = 10;</code>
   */
  NOTIFY_SHIFT_END(10),
  /**
   * <pre>
   * 通知新靴開始
   * </pre>
   *
   * <code>NOTIFY_SHOE_START = 11;</code>
   */
  NOTIFY_SHOE_START(11),
  /**
   * <pre>
   * 通知此靴結束
   * </pre>
   *
   * <code>NOTIFY_SHOE_END = 12;</code>
   */
  NOTIFY_SHOE_END(12),
  /**
   * <pre>
   * 新局開始
   * </pre>
   *
   * <code>NOTIFY_ROUND_START = 13;</code>
   */
  NOTIFY_ROUND_START(13),
  /**
   * <pre>
   * 通知遊戲局開始下注
   * </pre>
   *
   * <code>NOTIFY_ROUND_BET = 14;</code>
   */
  NOTIFY_ROUND_BET(14),
  /**
   * <pre>
   * 通知遊戲局結束下注
   * </pre>
   *
   * <code>NOTIFY_ROUND_NO_MORE_BET = 15;</code>
   */
  NOTIFY_ROUND_NO_MORE_BET(15),
  /**
   * <pre>
   * 通知遊戲局進行步驟
   * </pre>
   *
   * <code>NOTIFY_ROUND_STEP = 16;</code>
   */
  NOTIFY_ROUND_STEP(16),
  /**
   * <pre>
   * 遊戲局完成
   * </pre>
   *
   * <code>NOTIFY_ROUND_FINISH = 17;</code>
   */
  NOTIFY_ROUND_FINISH(17),
  /**
   * <pre>
   * 通知遊戲局取消
   * </pre>
   *
   * <code>NOTIFY_ROUND_CANCEL = 18;</code>
   */
  NOTIFY_ROUND_CANCEL(18),
  /**
   * <pre>
   * 通知遊戲局回放連結
   * </pre>
   *
   * <code>NOTIFY_ROUND_PLAYBACK = 19;</code>
   */
  NOTIFY_ROUND_PLAYBACK(19),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GameNotifyType.class.getName());
  }
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>GAME_NOTIFY_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int GAME_NOTIFY_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 通知遊戲供應狀況改變
   * </pre>
   *
   * <code>NOTIFY_GAME_PROVIDE_STATE_CHANGE = 1;</code>
   */
  public static final int NOTIFY_GAME_PROVIDE_STATE_CHANGE_VALUE = 1;
  /**
   * <pre>
   * 通知遊戲流程荷官登入
   * </pre>
   *
   * <code>NOTIFY_GAME_DEALER_LOGIN = 6;</code>
   */
  public static final int NOTIFY_GAME_DEALER_LOGIN_VALUE = 6;
  /**
   * <pre>
   * 通知遊戲流程荷官登出
   * </pre>
   *
   * <code>NOTIFY_GAME_DEALER_LOGOUT = 7;</code>
   */
  public static final int NOTIFY_GAME_DEALER_LOGOUT_VALUE = 7;
  /**
   * <pre>
   * 通知遊戲流程開始換靴，更換結束呼叫 NOTIFY_SHOE_START
   * </pre>
   *
   * <code>NOTIFY_GAME_CHANGING_SHOE = 8;</code>
   */
  public static final int NOTIFY_GAME_CHANGING_SHOE_VALUE = 8;
  /**
   * <pre>
   * 通知遊戲班開始
   * </pre>
   *
   * <code>NOTIFY_SHIFT_START = 9;</code>
   */
  public static final int NOTIFY_SHIFT_START_VALUE = 9;
  /**
   * <pre>
   * 通知遊戲班結束
   * </pre>
   *
   * <code>NOTIFY_SHIFT_END = 10;</code>
   */
  public static final int NOTIFY_SHIFT_END_VALUE = 10;
  /**
   * <pre>
   * 通知新靴開始
   * </pre>
   *
   * <code>NOTIFY_SHOE_START = 11;</code>
   */
  public static final int NOTIFY_SHOE_START_VALUE = 11;
  /**
   * <pre>
   * 通知此靴結束
   * </pre>
   *
   * <code>NOTIFY_SHOE_END = 12;</code>
   */
  public static final int NOTIFY_SHOE_END_VALUE = 12;
  /**
   * <pre>
   * 新局開始
   * </pre>
   *
   * <code>NOTIFY_ROUND_START = 13;</code>
   */
  public static final int NOTIFY_ROUND_START_VALUE = 13;
  /**
   * <pre>
   * 通知遊戲局開始下注
   * </pre>
   *
   * <code>NOTIFY_ROUND_BET = 14;</code>
   */
  public static final int NOTIFY_ROUND_BET_VALUE = 14;
  /**
   * <pre>
   * 通知遊戲局結束下注
   * </pre>
   *
   * <code>NOTIFY_ROUND_NO_MORE_BET = 15;</code>
   */
  public static final int NOTIFY_ROUND_NO_MORE_BET_VALUE = 15;
  /**
   * <pre>
   * 通知遊戲局進行步驟
   * </pre>
   *
   * <code>NOTIFY_ROUND_STEP = 16;</code>
   */
  public static final int NOTIFY_ROUND_STEP_VALUE = 16;
  /**
   * <pre>
   * 遊戲局完成
   * </pre>
   *
   * <code>NOTIFY_ROUND_FINISH = 17;</code>
   */
  public static final int NOTIFY_ROUND_FINISH_VALUE = 17;
  /**
   * <pre>
   * 通知遊戲局取消
   * </pre>
   *
   * <code>NOTIFY_ROUND_CANCEL = 18;</code>
   */
  public static final int NOTIFY_ROUND_CANCEL_VALUE = 18;
  /**
   * <pre>
   * 通知遊戲局回放連結
   * </pre>
   *
   * <code>NOTIFY_ROUND_PLAYBACK = 19;</code>
   */
  public static final int NOTIFY_ROUND_PLAYBACK_VALUE = 19;


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
  public static GameNotifyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameNotifyType forNumber(int value) {
    switch (value) {
      case 0: return GAME_NOTIFY_TYPE_UNSPECIFIED;
      case 1: return NOTIFY_GAME_PROVIDE_STATE_CHANGE;
      case 6: return NOTIFY_GAME_DEALER_LOGIN;
      case 7: return NOTIFY_GAME_DEALER_LOGOUT;
      case 8: return NOTIFY_GAME_CHANGING_SHOE;
      case 9: return NOTIFY_SHIFT_START;
      case 10: return NOTIFY_SHIFT_END;
      case 11: return NOTIFY_SHOE_START;
      case 12: return NOTIFY_SHOE_END;
      case 13: return NOTIFY_ROUND_START;
      case 14: return NOTIFY_ROUND_BET;
      case 15: return NOTIFY_ROUND_NO_MORE_BET;
      case 16: return NOTIFY_ROUND_STEP;
      case 17: return NOTIFY_ROUND_FINISH;
      case 18: return NOTIFY_ROUND_CANCEL;
      case 19: return NOTIFY_ROUND_PLAYBACK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameNotifyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameNotifyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameNotifyType>() {
          public GameNotifyType findValueByNumber(int number) {
            return GameNotifyType.forNumber(number);
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
    return com.wecasino.proto.recorder.ProviderProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final GameNotifyType[] VALUES = values();

  public static GameNotifyType valueOf(
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

  private GameNotifyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:recorder.GameNotifyType)
}
