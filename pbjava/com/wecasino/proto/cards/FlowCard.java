// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cards/flow.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.cards;

/**
 * Protobuf enum {@code cards.FlowCard}
 */
public enum FlowCard
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>FLOW_CARD_UNSPECIFIED = 0;</code>
   */
  FLOW_CARD_UNSPECIFIED(0),
  /**
   * <pre>
   * 新靴
   * </pre>
   *
   * <code>FLOW_NEW_SHOE = 1;</code>
   */
  FLOW_NEW_SHOE(1),
  /**
   * <pre>
   * 最後一局
   * </pre>
   *
   * <code>FLOW_SHOE_CUT = 2;</code>
   */
  FLOW_SHOE_CUT(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      FlowCard.class.getName());
  }
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>FLOW_CARD_UNSPECIFIED = 0;</code>
   */
  public static final int FLOW_CARD_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 新靴
   * </pre>
   *
   * <code>FLOW_NEW_SHOE = 1;</code>
   */
  public static final int FLOW_NEW_SHOE_VALUE = 1;
  /**
   * <pre>
   * 最後一局
   * </pre>
   *
   * <code>FLOW_SHOE_CUT = 2;</code>
   */
  public static final int FLOW_SHOE_CUT_VALUE = 2;


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
  public static FlowCard valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FlowCard forNumber(int value) {
    switch (value) {
      case 0: return FLOW_CARD_UNSPECIFIED;
      case 1: return FLOW_NEW_SHOE;
      case 2: return FLOW_SHOE_CUT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FlowCard>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FlowCard> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FlowCard>() {
          public FlowCard findValueByNumber(int number) {
            return FlowCard.forNumber(number);
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
    return com.wecasino.proto.cards.FlowProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final FlowCard[] VALUES = values();

  public static FlowCard valueOf(
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

  private FlowCard(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cards.FlowCard)
}

