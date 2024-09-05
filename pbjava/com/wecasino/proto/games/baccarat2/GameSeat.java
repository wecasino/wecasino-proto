// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/baccarat2/record.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.games.baccarat2;

/**
 * <pre>
 * 座位功能代碼
 * </pre>
 *
 * Protobuf enum {@code games.baccarat2.GameSeat}
 */
public enum GameSeat
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>SEAT_UNSPECIFIED = 0;</code>
   */
  SEAT_UNSPECIFIED(0),
  /**
   * <pre>
   * 閒家
   * </pre>
   *
   * <code>PLAYER = 2;</code>
   */
  PLAYER(2),
  /**
   * <pre>
   * 莊家
   * </pre>
   *
   * <code>BANKER = 3;</code>
   */
  BANKER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>SEAT_UNSPECIFIED = 0;</code>
   */
  public static final int SEAT_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 閒家
   * </pre>
   *
   * <code>PLAYER = 2;</code>
   */
  public static final int PLAYER_VALUE = 2;
  /**
   * <pre>
   * 莊家
   * </pre>
   *
   * <code>BANKER = 3;</code>
   */
  public static final int BANKER_VALUE = 3;


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
  public static GameSeat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameSeat forNumber(int value) {
    switch (value) {
      case 0: return SEAT_UNSPECIFIED;
      case 2: return PLAYER;
      case 3: return BANKER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameSeat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameSeat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameSeat>() {
          public GameSeat findValueByNumber(int number) {
            return GameSeat.forNumber(number);
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
    return com.wecasino.proto.games.baccarat2.RecordProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final GameSeat[] VALUES = values();

  public static GameSeat valueOf(
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

  private GameSeat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.baccarat2.GameSeat)
}

