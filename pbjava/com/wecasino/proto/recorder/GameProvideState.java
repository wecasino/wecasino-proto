// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

/**
 * <pre>
 * GameProvideState
 * 遊戲供應狀態類型
 * </pre>
 *
 * Protobuf enum {@code recorder.GameProvideState}
 */
public enum GameProvideState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>GAME_PROVIDE_STATE_UNSPECIFIED = 0;</code>
   */
  GAME_PROVIDE_STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * 提供
   * </pre>
   *
   * <code>GAME_PROVIDE_AVAILABLE = 1;</code>
   */
  GAME_PROVIDE_AVAILABLE(1),
  /**
   * <pre>
   * 此局結束後維護
   * </pre>
   *
   * <code>GAME_PROVIDE_MAINTEN_AFTER_ROUND = 2;</code>
   */
  GAME_PROVIDE_MAINTEN_AFTER_ROUND(2),
  /**
   * <pre>
   * 維護
   * </pre>
   *
   * <code>GAME_PROVIDE_IN_MAINTENANCE = 3;</code>
   */
  GAME_PROVIDE_IN_MAINTENANCE(3),
  /**
   * <pre>
   * 此局結束後關閉
   * </pre>
   *
   * <code>GAME_PROVIDE_CLOSE_AFTER_ROUND = 4;</code>
   */
  GAME_PROVIDE_CLOSE_AFTER_ROUND(4),
  /**
   * <pre>
   * 此局結束後關閉
   * </pre>
   *
   * <code>GAME_PROVIDE_CLOSE = 5;</code>
   */
  GAME_PROVIDE_CLOSE(5),
  /**
   * <pre>
   * 此局結束後關閉
   * </pre>
   *
   * <code>GAME_PROVIDE_AVAILABLE_AFTER_ROUND = 6;</code>
   */
  GAME_PROVIDE_AVAILABLE_AFTER_ROUND(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>GAME_PROVIDE_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int GAME_PROVIDE_STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 提供
   * </pre>
   *
   * <code>GAME_PROVIDE_AVAILABLE = 1;</code>
   */
  public static final int GAME_PROVIDE_AVAILABLE_VALUE = 1;
  /**
   * <pre>
   * 此局結束後維護
   * </pre>
   *
   * <code>GAME_PROVIDE_MAINTEN_AFTER_ROUND = 2;</code>
   */
  public static final int GAME_PROVIDE_MAINTEN_AFTER_ROUND_VALUE = 2;
  /**
   * <pre>
   * 維護
   * </pre>
   *
   * <code>GAME_PROVIDE_IN_MAINTENANCE = 3;</code>
   */
  public static final int GAME_PROVIDE_IN_MAINTENANCE_VALUE = 3;
  /**
   * <pre>
   * 此局結束後關閉
   * </pre>
   *
   * <code>GAME_PROVIDE_CLOSE_AFTER_ROUND = 4;</code>
   */
  public static final int GAME_PROVIDE_CLOSE_AFTER_ROUND_VALUE = 4;
  /**
   * <pre>
   * 此局結束後關閉
   * </pre>
   *
   * <code>GAME_PROVIDE_CLOSE = 5;</code>
   */
  public static final int GAME_PROVIDE_CLOSE_VALUE = 5;
  /**
   * <pre>
   * 此局結束後關閉
   * </pre>
   *
   * <code>GAME_PROVIDE_AVAILABLE_AFTER_ROUND = 6;</code>
   */
  public static final int GAME_PROVIDE_AVAILABLE_AFTER_ROUND_VALUE = 6;


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
  public static GameProvideState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameProvideState forNumber(int value) {
    switch (value) {
      case 0: return GAME_PROVIDE_STATE_UNSPECIFIED;
      case 1: return GAME_PROVIDE_AVAILABLE;
      case 2: return GAME_PROVIDE_MAINTEN_AFTER_ROUND;
      case 3: return GAME_PROVIDE_IN_MAINTENANCE;
      case 4: return GAME_PROVIDE_CLOSE_AFTER_ROUND;
      case 5: return GAME_PROVIDE_CLOSE;
      case 6: return GAME_PROVIDE_AVAILABLE_AFTER_ROUND;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameProvideState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameProvideState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameProvideState>() {
          public GameProvideState findValueByNumber(int number) {
            return GameProvideState.forNumber(number);
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
    return com.wecasino.proto.recorder.ProviderProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final GameProvideState[] VALUES = values();

  public static GameProvideState valueOf(
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

  private GameProvideState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:recorder.GameProvideState)
}

