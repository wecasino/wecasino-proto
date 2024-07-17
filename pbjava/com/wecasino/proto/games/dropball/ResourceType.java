// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/dropball/record.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.games.dropball;

/**
 * Protobuf enum {@code games.dropball.ResourceType}
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
   * 一般
   * </pre>
   *
   * <code>NORMAL = 1;</code>
   */
  NORMAL(1),
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
   * 一般
   * </pre>
   *
   * <code>NORMAL = 1;</code>
   */
  public static final int NORMAL_VALUE = 1;


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
      case 1: return NORMAL;
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
    return com.wecasino.proto.games.dropball.RecordProto.getDescriptor().getEnumTypes().get(2);
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

  // @@protoc_insertion_point(enum_scope:games.dropball.ResourceType)
}

