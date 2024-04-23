// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/recorder.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

/**
 * Protobuf type {@code recorder.RecordShoeEndedRequest}
 */
public final class RecordShoeEndedRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:recorder.RecordShoeEndedRequest)
    RecordShoeEndedRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      RecordShoeEndedRequest.class.getName());
  }
  // Use RecordShoeEndedRequest.newBuilder() to construct.
  private RecordShoeEndedRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RecordShoeEndedRequest() {
    recordId_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordShoeEndedRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordShoeEndedRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wecasino.proto.recorder.RecordShoeEndedRequest.class, com.wecasino.proto.recorder.RecordShoeEndedRequest.Builder.class);
  }

  private int bitField0_;
  public static final int RECORD_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString recordId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * 紀錄ID
   * </pre>
   *
   * <code>bytes record_id = 1 [json_name = "recordId"];</code>
   * @return The recordId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecordId() {
    return recordId_;
  }

  public static final int TS_END_FIELD_NUMBER = 19;
  private com.google.protobuf.Timestamp tsEnd_;
  /**
   * <pre>
   * 牌靴使用完畢時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
   * @return Whether the tsEnd field is set.
   */
  @java.lang.Override
  public boolean hasTsEnd() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * 牌靴使用完畢時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
   * @return The tsEnd.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTsEnd() {
    return tsEnd_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : tsEnd_;
  }
  /**
   * <pre>
   * 牌靴使用完畢時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTsEndOrBuilder() {
    return tsEnd_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : tsEnd_;
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
    if (!recordId_.isEmpty()) {
      output.writeBytes(1, recordId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(19, getTsEnd());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!recordId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, recordId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(19, getTsEnd());
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
    if (!(obj instanceof com.wecasino.proto.recorder.RecordShoeEndedRequest)) {
      return super.equals(obj);
    }
    com.wecasino.proto.recorder.RecordShoeEndedRequest other = (com.wecasino.proto.recorder.RecordShoeEndedRequest) obj;

    if (!getRecordId()
        .equals(other.getRecordId())) return false;
    if (hasTsEnd() != other.hasTsEnd()) return false;
    if (hasTsEnd()) {
      if (!getTsEnd()
          .equals(other.getTsEnd())) return false;
    }
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
    hash = (37 * hash) + RECORD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRecordId().hashCode();
    if (hasTsEnd()) {
      hash = (37 * hash) + TS_END_FIELD_NUMBER;
      hash = (53 * hash) + getTsEnd().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.RecordShoeEndedRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wecasino.proto.recorder.RecordShoeEndedRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code recorder.RecordShoeEndedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:recorder.RecordShoeEndedRequest)
      com.wecasino.proto.recorder.RecordShoeEndedRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordShoeEndedRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordShoeEndedRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wecasino.proto.recorder.RecordShoeEndedRequest.class, com.wecasino.proto.recorder.RecordShoeEndedRequest.Builder.class);
    }

    // Construct using com.wecasino.proto.recorder.RecordShoeEndedRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getTsEndFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      recordId_ = com.google.protobuf.ByteString.EMPTY;
      tsEnd_ = null;
      if (tsEndBuilder_ != null) {
        tsEndBuilder_.dispose();
        tsEndBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wecasino.proto.recorder.RecorderProto.internal_static_recorder_RecordShoeEndedRequest_descriptor;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.RecordShoeEndedRequest getDefaultInstanceForType() {
      return com.wecasino.proto.recorder.RecordShoeEndedRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.RecordShoeEndedRequest build() {
      com.wecasino.proto.recorder.RecordShoeEndedRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.RecordShoeEndedRequest buildPartial() {
      com.wecasino.proto.recorder.RecordShoeEndedRequest result = new com.wecasino.proto.recorder.RecordShoeEndedRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.wecasino.proto.recorder.RecordShoeEndedRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recordId_ = recordId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tsEnd_ = tsEndBuilder_ == null
            ? tsEnd_
            : tsEndBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wecasino.proto.recorder.RecordShoeEndedRequest) {
        return mergeFrom((com.wecasino.proto.recorder.RecordShoeEndedRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wecasino.proto.recorder.RecordShoeEndedRequest other) {
      if (other == com.wecasino.proto.recorder.RecordShoeEndedRequest.getDefaultInstance()) return this;
      if (other.getRecordId() != com.google.protobuf.ByteString.EMPTY) {
        setRecordId(other.getRecordId());
      }
      if (other.hasTsEnd()) {
        mergeTsEnd(other.getTsEnd());
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
              recordId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 154: {
              input.readMessage(
                  getTsEndFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 154
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

    private com.google.protobuf.ByteString recordId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 紀錄ID
     * </pre>
     *
     * <code>bytes record_id = 1 [json_name = "recordId"];</code>
     * @return The recordId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRecordId() {
      return recordId_;
    }
    /**
     * <pre>
     * 紀錄ID
     * </pre>
     *
     * <code>bytes record_id = 1 [json_name = "recordId"];</code>
     * @param value The recordId to set.
     * @return This builder for chaining.
     */
    public Builder setRecordId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      recordId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 紀錄ID
     * </pre>
     *
     * <code>bytes record_id = 1 [json_name = "recordId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recordId_ = getDefaultInstance().getRecordId();
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp tsEnd_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> tsEndBuilder_;
    /**
     * <pre>
     * 牌靴使用完畢時間
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
     * @return Whether the tsEnd field is set.
     */
    public boolean hasTsEnd() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 牌靴使用完畢時間
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
     * @return The tsEnd.
     */
    public com.google.protobuf.Timestamp getTsEnd() {
      if (tsEndBuilder_ == null) {
        return tsEnd_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : tsEnd_;
      } else {
        return tsEndBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 牌靴使用完畢時間
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
     */
    public Builder setTsEnd(com.google.protobuf.Timestamp value) {
      if (tsEndBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tsEnd_ = value;
      } else {
        tsEndBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 牌靴使用完畢時間
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
     */
    public Builder setTsEnd(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (tsEndBuilder_ == null) {
        tsEnd_ = builderForValue.build();
      } else {
        tsEndBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 牌靴使用完畢時間
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
     */
    public Builder mergeTsEnd(com.google.protobuf.Timestamp value) {
      if (tsEndBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          tsEnd_ != null &&
          tsEnd_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTsEndBuilder().mergeFrom(value);
        } else {
          tsEnd_ = value;
        }
      } else {
        tsEndBuilder_.mergeFrom(value);
      }
      if (tsEnd_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * 牌靴使用完畢時間
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
     */
    public Builder clearTsEnd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tsEnd_ = null;
      if (tsEndBuilder_ != null) {
        tsEndBuilder_.dispose();
        tsEndBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 牌靴使用完畢時間
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTsEndBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTsEndFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 牌靴使用完畢時間
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTsEndOrBuilder() {
      if (tsEndBuilder_ != null) {
        return tsEndBuilder_.getMessageOrBuilder();
      } else {
        return tsEnd_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : tsEnd_;
      }
    }
    /**
     * <pre>
     * 牌靴使用完畢時間
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTsEndFieldBuilder() {
      if (tsEndBuilder_ == null) {
        tsEndBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTsEnd(),
                getParentForChildren(),
                isClean());
        tsEnd_ = null;
      }
      return tsEndBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:recorder.RecordShoeEndedRequest)
  }

  // @@protoc_insertion_point(class_scope:recorder.RecordShoeEndedRequest)
  private static final com.wecasino.proto.recorder.RecordShoeEndedRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wecasino.proto.recorder.RecordShoeEndedRequest();
  }

  public static com.wecasino.proto.recorder.RecordShoeEndedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordShoeEndedRequest>
      PARSER = new com.google.protobuf.AbstractParser<RecordShoeEndedRequest>() {
    @java.lang.Override
    public RecordShoeEndedRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecordShoeEndedRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordShoeEndedRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wecasino.proto.recorder.RecordShoeEndedRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

