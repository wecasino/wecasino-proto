// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/dropball/record.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.games.dropball;

/**
 * Protobuf enum {@code games.dropball.GameSubtype}
 */
public enum GameSubtype
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>DROPBALL_TYPE_UNSPECIFIED = 0;</code>
   */
  DROPBALL_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * DROPBALL
   * </pre>
   *
   * <code>DROPBALL_CLASSIC = 1;</code>
   */
  DROPBALL_CLASSIC(1),
  /**
   * <pre>
   * Coconut Ball
   * </pre>
   *
   * <code>DROPBALL_COCONUT_BALL = 3;</code>
   */
  DROPBALL_COCONUT_BALL(3),
  /**
   * <pre>
   * 區塊鏈color
   * </pre>
   *
   * <code>DROPBALL_BLOCKCHAIN = 16;</code>
   */
  DROPBALL_BLOCKCHAIN(16),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>DROPBALL_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DROPBALL_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * DROPBALL
   * </pre>
   *
   * <code>DROPBALL_CLASSIC = 1;</code>
   */
  public static final int DROPBALL_CLASSIC_VALUE = 1;
  /**
   * <pre>
   * Coconut Ball
   * </pre>
   *
   * <code>DROPBALL_COCONUT_BALL = 3;</code>
   */
  public static final int DROPBALL_COCONUT_BALL_VALUE = 3;
  /**
   * <pre>
   * 區塊鏈color
   * </pre>
   *
   * <code>DROPBALL_BLOCKCHAIN = 16;</code>
   */
  public static final int DROPBALL_BLOCKCHAIN_VALUE = 16;


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
  public static GameSubtype valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameSubtype forNumber(int value) {
    switch (value) {
      case 0: return DROPBALL_TYPE_UNSPECIFIED;
      case 1: return DROPBALL_CLASSIC;
      case 3: return DROPBALL_COCONUT_BALL;
      case 16: return DROPBALL_BLOCKCHAIN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameSubtype>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameSubtype> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameSubtype>() {
          public GameSubtype findValueByNumber(int number) {
            return GameSubtype.forNumber(number);
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
    return com.wecasino.proto.games.dropball.RecordProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final GameSubtype[] VALUES = values();

  public static GameSubtype valueOf(
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

  private GameSubtype(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.dropball.GameSubtype)
}

