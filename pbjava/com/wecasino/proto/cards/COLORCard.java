// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cards/color.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.cards;

/**
 * Protobuf enum {@code cards.COLORCard}
 */
public enum COLORCard
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>COLOR_CARD_UNSPECIFIED = 0;</code>
   */
  COLOR_CARD_UNSPECIFIED(0),
  /**
   * <pre>
   * 綠、紅、藍、粉、白、黃
   *黃
   * </pre>
   *
   * <code>COLOR_1 = 1;</code>
   */
  COLOR_1(1),
  /**
   * <pre>
   *藍
   * </pre>
   *
   * <code>COLOR_2 = 2;</code>
   */
  COLOR_2(2),
  /**
   * <pre>
   *粉
   * </pre>
   *
   * <code>COLOR_3 = 3;</code>
   */
  COLOR_3(3),
  /**
   * <pre>
   *綠
   * </pre>
   *
   * <code>COLOR_4 = 4;</code>
   */
  COLOR_4(4),
  /**
   * <pre>
   *紅
   * </pre>
   *
   * <code>COLOR_5 = 5;</code>
   */
  COLOR_5(5),
  /**
   * <pre>
   *白
   * </pre>
   *
   * <code>COLOR_6 = 6;</code>
   */
  COLOR_6(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>COLOR_CARD_UNSPECIFIED = 0;</code>
   */
  public static final int COLOR_CARD_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 綠、紅、藍、粉、白、黃
   *黃
   * </pre>
   *
   * <code>COLOR_1 = 1;</code>
   */
  public static final int COLOR_1_VALUE = 1;
  /**
   * <pre>
   *藍
   * </pre>
   *
   * <code>COLOR_2 = 2;</code>
   */
  public static final int COLOR_2_VALUE = 2;
  /**
   * <pre>
   *粉
   * </pre>
   *
   * <code>COLOR_3 = 3;</code>
   */
  public static final int COLOR_3_VALUE = 3;
  /**
   * <pre>
   *綠
   * </pre>
   *
   * <code>COLOR_4 = 4;</code>
   */
  public static final int COLOR_4_VALUE = 4;
  /**
   * <pre>
   *紅
   * </pre>
   *
   * <code>COLOR_5 = 5;</code>
   */
  public static final int COLOR_5_VALUE = 5;
  /**
   * <pre>
   *白
   * </pre>
   *
   * <code>COLOR_6 = 6;</code>
   */
  public static final int COLOR_6_VALUE = 6;


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
  public static COLORCard valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static COLORCard forNumber(int value) {
    switch (value) {
      case 0: return COLOR_CARD_UNSPECIFIED;
      case 1: return COLOR_1;
      case 2: return COLOR_2;
      case 3: return COLOR_3;
      case 4: return COLOR_4;
      case 5: return COLOR_5;
      case 6: return COLOR_6;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<COLORCard>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      COLORCard> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<COLORCard>() {
          public COLORCard findValueByNumber(int number) {
            return COLORCard.forNumber(number);
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
    return com.wecasino.proto.cards.ColorProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final COLORCard[] VALUES = values();

  public static COLORCard valueOf(
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

  private COLORCard(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cards.COLORCard)
}

