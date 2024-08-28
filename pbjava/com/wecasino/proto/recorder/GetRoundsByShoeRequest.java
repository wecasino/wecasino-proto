// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

/**
 * Protobuf type {@code recorder.GetRoundsByShoeRequest}
 */
public final class GetRoundsByShoeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:recorder.GetRoundsByShoeRequest)
    GetRoundsByShoeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRoundsByShoeRequest.newBuilder() to construct.
  private GetRoundsByShoeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRoundsByShoeRequest() {
    shoeCode_ = "";
    gameCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRoundsByShoeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsByShoeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsByShoeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wecasino.proto.recorder.GetRoundsByShoeRequest.class, com.wecasino.proto.recorder.GetRoundsByShoeRequest.Builder.class);
  }

  public static final int SHOE_CODE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object shoeCode_ = "";
  /**
   * <pre>
   * 資源代碼
   * </pre>
   *
   * <code>string shoe_code = 1 [json_name = "shoeCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The shoeCode.
   */
  @java.lang.Override
  public java.lang.String getShoeCode() {
    java.lang.Object ref = shoeCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shoeCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 資源代碼
   * </pre>
   *
   * <code>string shoe_code = 1 [json_name = "shoeCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for shoeCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShoeCodeBytes() {
    java.lang.Object ref = shoeCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shoeCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GAME_CODE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object gameCode_ = "";
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 2 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The gameCode.
   */
  @java.lang.Override
  public java.lang.String getGameCode() {
    java.lang.Object ref = gameCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gameCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 2 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for gameCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGameCodeBytes() {
    java.lang.Object ref = gameCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gameCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shoeCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, shoeCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gameCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shoeCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, shoeCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gameCode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wecasino.proto.recorder.GetRoundsByShoeRequest)) {
      return super.equals(obj);
    }
    com.wecasino.proto.recorder.GetRoundsByShoeRequest other = (com.wecasino.proto.recorder.GetRoundsByShoeRequest) obj;

    if (!getShoeCode()
        .equals(other.getShoeCode())) return false;
    if (!getGameCode()
        .equals(other.getGameCode())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SHOE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getShoeCode().hashCode();
    hash = (37 * hash) + GAME_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getGameCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wecasino.proto.recorder.GetRoundsByShoeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code recorder.GetRoundsByShoeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:recorder.GetRoundsByShoeRequest)
      com.wecasino.proto.recorder.GetRoundsByShoeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsByShoeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsByShoeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wecasino.proto.recorder.GetRoundsByShoeRequest.class, com.wecasino.proto.recorder.GetRoundsByShoeRequest.Builder.class);
    }

    // Construct using com.wecasino.proto.recorder.GetRoundsByShoeRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      shoeCode_ = "";
      gameCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsByShoeRequest_descriptor;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.GetRoundsByShoeRequest getDefaultInstanceForType() {
      return com.wecasino.proto.recorder.GetRoundsByShoeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.GetRoundsByShoeRequest build() {
      com.wecasino.proto.recorder.GetRoundsByShoeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.GetRoundsByShoeRequest buildPartial() {
      com.wecasino.proto.recorder.GetRoundsByShoeRequest result = new com.wecasino.proto.recorder.GetRoundsByShoeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.wecasino.proto.recorder.GetRoundsByShoeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shoeCode_ = shoeCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gameCode_ = gameCode_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wecasino.proto.recorder.GetRoundsByShoeRequest) {
        return mergeFrom((com.wecasino.proto.recorder.GetRoundsByShoeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wecasino.proto.recorder.GetRoundsByShoeRequest other) {
      if (other == com.wecasino.proto.recorder.GetRoundsByShoeRequest.getDefaultInstance()) return this;
      if (!other.getShoeCode().isEmpty()) {
        shoeCode_ = other.shoeCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getGameCode().isEmpty()) {
        gameCode_ = other.gameCode_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              shoeCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              gameCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object shoeCode_ = "";
    /**
     * <pre>
     * 資源代碼
     * </pre>
     *
     * <code>string shoe_code = 1 [json_name = "shoeCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The shoeCode.
     */
    public java.lang.String getShoeCode() {
      java.lang.Object ref = shoeCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shoeCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 資源代碼
     * </pre>
     *
     * <code>string shoe_code = 1 [json_name = "shoeCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for shoeCode.
     */
    public com.google.protobuf.ByteString
        getShoeCodeBytes() {
      java.lang.Object ref = shoeCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shoeCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 資源代碼
     * </pre>
     *
     * <code>string shoe_code = 1 [json_name = "shoeCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The shoeCode to set.
     * @return This builder for chaining.
     */
    public Builder setShoeCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      shoeCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 資源代碼
     * </pre>
     *
     * <code>string shoe_code = 1 [json_name = "shoeCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearShoeCode() {
      shoeCode_ = getDefaultInstance().getShoeCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 資源代碼
     * </pre>
     *
     * <code>string shoe_code = 1 [json_name = "shoeCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for shoeCode to set.
     * @return This builder for chaining.
     */
    public Builder setShoeCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      shoeCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object gameCode_ = "";
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 2 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The gameCode.
     */
    public java.lang.String getGameCode() {
      java.lang.Object ref = gameCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gameCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 2 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for gameCode.
     */
    public com.google.protobuf.ByteString
        getGameCodeBytes() {
      java.lang.Object ref = gameCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 2 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The gameCode to set.
     * @return This builder for chaining.
     */
    public Builder setGameCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      gameCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 2 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearGameCode() {
      gameCode_ = getDefaultInstance().getGameCode();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 遊戲代碼
     * </pre>
     *
     * <code>string game_code = 2 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for gameCode to set.
     * @return This builder for chaining.
     */
    public Builder setGameCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      gameCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:recorder.GetRoundsByShoeRequest)
  }

  // @@protoc_insertion_point(class_scope:recorder.GetRoundsByShoeRequest)
  private static final com.wecasino.proto.recorder.GetRoundsByShoeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wecasino.proto.recorder.GetRoundsByShoeRequest();
  }

  public static com.wecasino.proto.recorder.GetRoundsByShoeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRoundsByShoeRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetRoundsByShoeRequest>() {
    @java.lang.Override
    public GetRoundsByShoeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetRoundsByShoeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRoundsByShoeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wecasino.proto.recorder.GetRoundsByShoeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

