// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/threecards/record.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.games.threecards;

/**
 * <pre>
 * 豹子 &gt; 同花順 &gt; 同花 &gt; 順子 &gt; 對子 &gt; 散牌
 * </pre>
 *
 * Protobuf enum {@code games.threecards.CardPattern}
 */
public enum CardPattern
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>CARD_PATTERN_UNSPECIFIED = 0;</code>
   */
  CARD_PATTERN_UNSPECIFIED(0),
  /**
   * <pre>
   * 高牌
   * </pre>
   *
   * <code>HIGH = 1;</code>
   */
  HIGH(1),
  /**
   * <pre>
   * 對子
   * </pre>
   *
   * <code>PAIR = 2;</code>
   */
  PAIR(2),
  /**
   * <pre>
   * 順子
   * </pre>
   *
   * <code>STRAIGHT = 3;</code>
   */
  STRAIGHT(3),
  /**
   * <pre>
   * 金花
   * </pre>
   *
   * <code>FLUSH = 4;</code>
   */
  FLUSH(4),
  /**
   * <pre>
   * 順金
   * </pre>
   *
   * <code>STRAIGHT_FLUSH = 5;</code>
   */
  STRAIGHT_FLUSH(5),
  /**
   * <pre>
   * 豹子
   * </pre>
   *
   * <code>LEOPARD = 6;</code>
   */
  LEOPARD(6),
  /**
   * <pre>
   * 豹子殺手
   * </pre>
   *
   * <code>LEOPARD_KILLER = 7;</code>
   */
  LEOPARD_KILLER(7),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      CardPattern.class.getName());
  }
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>CARD_PATTERN_UNSPECIFIED = 0;</code>
   */
  public static final int CARD_PATTERN_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 高牌
   * </pre>
   *
   * <code>HIGH = 1;</code>
   */
  public static final int HIGH_VALUE = 1;
  /**
   * <pre>
   * 對子
   * </pre>
   *
   * <code>PAIR = 2;</code>
   */
  public static final int PAIR_VALUE = 2;
  /**
   * <pre>
   * 順子
   * </pre>
   *
   * <code>STRAIGHT = 3;</code>
   */
  public static final int STRAIGHT_VALUE = 3;
  /**
   * <pre>
   * 金花
   * </pre>
   *
   * <code>FLUSH = 4;</code>
   */
  public static final int FLUSH_VALUE = 4;
  /**
   * <pre>
   * 順金
   * </pre>
   *
   * <code>STRAIGHT_FLUSH = 5;</code>
   */
  public static final int STRAIGHT_FLUSH_VALUE = 5;
  /**
   * <pre>
   * 豹子
   * </pre>
   *
   * <code>LEOPARD = 6;</code>
   */
  public static final int LEOPARD_VALUE = 6;
  /**
   * <pre>
   * 豹子殺手
   * </pre>
   *
   * <code>LEOPARD_KILLER = 7;</code>
   */
  public static final int LEOPARD_KILLER_VALUE = 7;


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
  public static CardPattern valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CardPattern forNumber(int value) {
    switch (value) {
      case 0: return CARD_PATTERN_UNSPECIFIED;
      case 1: return HIGH;
      case 2: return PAIR;
      case 3: return STRAIGHT;
      case 4: return FLUSH;
      case 5: return STRAIGHT_FLUSH;
      case 6: return LEOPARD;
      case 7: return LEOPARD_KILLER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CardPattern>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CardPattern> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CardPattern>() {
          public CardPattern findValueByNumber(int number) {
            return CardPattern.forNumber(number);
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
    return com.wecasino.proto.games.threecards.RecordProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final CardPattern[] VALUES = values();

  public static CardPattern valueOf(
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

  private CardPattern(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.threecards.CardPattern)
}
