// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/games.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.games;

/**
 * Protobuf enum {@code games.ResourceType}
 */
public enum ResourceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  RESOURCE_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * 牌靴
   * </pre>
   *
   * <code>SHOE = 64;</code>
   */
  SHOE(64),
  /**
   * <pre>
   * 手牌
   * </pre>
   *
   * <code>HAND = 65;</code>
   */
  HAND(65),
  /**
   * <pre>
   * 場上
   * </pre>
   *
   * <code>FIELD = 66;</code>
   */
  FIELD(66),
  /**
   * <pre>
   * 第一張牌
   * </pre>
   *
   * <code>FIRST_CARD = 67;</code>
   */
  FIRST_CARD(67),
  /**
   * <pre>
   * 切牌
   * </pre>
   *
   * <code>SHOE_CUT = 68;</code>
   */
  SHOE_CUT(68),
  /**
   * <pre>
   * 棄牌
   * </pre>
   *
   * <code>DISCARD = 69;</code>
   */
  DISCARD(69),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int RESOURCE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 牌靴
   * </pre>
   *
   * <code>SHOE = 64;</code>
   */
  public static final int SHOE_VALUE = 64;
  /**
   * <pre>
   * 手牌
   * </pre>
   *
   * <code>HAND = 65;</code>
   */
  public static final int HAND_VALUE = 65;
  /**
   * <pre>
   * 場上
   * </pre>
   *
   * <code>FIELD = 66;</code>
   */
  public static final int FIELD_VALUE = 66;
  /**
   * <pre>
   * 第一張牌
   * </pre>
   *
   * <code>FIRST_CARD = 67;</code>
   */
  public static final int FIRST_CARD_VALUE = 67;
  /**
   * <pre>
   * 切牌
   * </pre>
   *
   * <code>SHOE_CUT = 68;</code>
   */
  public static final int SHOE_CUT_VALUE = 68;
  /**
   * <pre>
   * 棄牌
   * </pre>
   *
   * <code>DISCARD = 69;</code>
   */
  public static final int DISCARD_VALUE = 69;


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
  public static ResourceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResourceType forNumber(int value) {
    switch (value) {
      case 0: return RESOURCE_TYPE_UNSPECIFIED;
      case 64: return SHOE;
      case 65: return HAND;
      case 66: return FIELD;
      case 67: return FIRST_CARD;
      case 68: return SHOE_CUT;
      case 69: return DISCARD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResourceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResourceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResourceType>() {
          public ResourceType findValueByNumber(int number) {
            return ResourceType.forNumber(number);
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
    return com.wecasino.proto.games.GamesProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final ResourceType[] VALUES = values();

  public static ResourceType valueOf(
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

  private ResourceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.ResourceType)
}

