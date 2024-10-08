// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

/**
 * Protobuf type {@code recorder.GetRoundsBySheoResponse}
 */
public final class GetRoundsBySheoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:recorder.GetRoundsBySheoResponse)
    GetRoundsBySheoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRoundsBySheoResponse.newBuilder() to construct.
  private GetRoundsBySheoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRoundsBySheoResponse() {
    roundRecords_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRoundsBySheoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsBySheoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsBySheoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wecasino.proto.recorder.GetRoundsBySheoResponse.class, com.wecasino.proto.recorder.GetRoundsBySheoResponse.Builder.class);
  }

  public static final int ROUND_RECORDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.wecasino.proto.recorder.RoundResult> roundRecords_;
  /**
   * <pre>
   * roundResults
   * </pre>
   *
   * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
   */
  @java.lang.Override
  public java.util.List<com.wecasino.proto.recorder.RoundResult> getRoundRecordsList() {
    return roundRecords_;
  }
  /**
   * <pre>
   * roundResults
   * </pre>
   *
   * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wecasino.proto.recorder.RoundResultOrBuilder> 
      getRoundRecordsOrBuilderList() {
    return roundRecords_;
  }
  /**
   * <pre>
   * roundResults
   * </pre>
   *
   * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
   */
  @java.lang.Override
  public int getRoundRecordsCount() {
    return roundRecords_.size();
  }
  /**
   * <pre>
   * roundResults
   * </pre>
   *
   * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.RoundResult getRoundRecords(int index) {
    return roundRecords_.get(index);
  }
  /**
   * <pre>
   * roundResults
   * </pre>
   *
   * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.RoundResultOrBuilder getRoundRecordsOrBuilder(
      int index) {
    return roundRecords_.get(index);
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
    for (int i = 0; i < roundRecords_.size(); i++) {
      output.writeMessage(1, roundRecords_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < roundRecords_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, roundRecords_.get(i));
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
    if (!(obj instanceof com.wecasino.proto.recorder.GetRoundsBySheoResponse)) {
      return super.equals(obj);
    }
    com.wecasino.proto.recorder.GetRoundsBySheoResponse other = (com.wecasino.proto.recorder.GetRoundsBySheoResponse) obj;

    if (!getRoundRecordsList()
        .equals(other.getRoundRecordsList())) return false;
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
    if (getRoundRecordsCount() > 0) {
      hash = (37 * hash) + ROUND_RECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getRoundRecordsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse parseFrom(
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
  public static Builder newBuilder(com.wecasino.proto.recorder.GetRoundsBySheoResponse prototype) {
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
   * Protobuf type {@code recorder.GetRoundsBySheoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:recorder.GetRoundsBySheoResponse)
      com.wecasino.proto.recorder.GetRoundsBySheoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsBySheoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsBySheoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wecasino.proto.recorder.GetRoundsBySheoResponse.class, com.wecasino.proto.recorder.GetRoundsBySheoResponse.Builder.class);
    }

    // Construct using com.wecasino.proto.recorder.GetRoundsBySheoResponse.newBuilder()
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
      if (roundRecordsBuilder_ == null) {
        roundRecords_ = java.util.Collections.emptyList();
      } else {
        roundRecords_ = null;
        roundRecordsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_GetRoundsBySheoResponse_descriptor;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.GetRoundsBySheoResponse getDefaultInstanceForType() {
      return com.wecasino.proto.recorder.GetRoundsBySheoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.GetRoundsBySheoResponse build() {
      com.wecasino.proto.recorder.GetRoundsBySheoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.GetRoundsBySheoResponse buildPartial() {
      com.wecasino.proto.recorder.GetRoundsBySheoResponse result = new com.wecasino.proto.recorder.GetRoundsBySheoResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.wecasino.proto.recorder.GetRoundsBySheoResponse result) {
      if (roundRecordsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          roundRecords_ = java.util.Collections.unmodifiableList(roundRecords_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.roundRecords_ = roundRecords_;
      } else {
        result.roundRecords_ = roundRecordsBuilder_.build();
      }
    }

    private void buildPartial0(com.wecasino.proto.recorder.GetRoundsBySheoResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.wecasino.proto.recorder.GetRoundsBySheoResponse) {
        return mergeFrom((com.wecasino.proto.recorder.GetRoundsBySheoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wecasino.proto.recorder.GetRoundsBySheoResponse other) {
      if (other == com.wecasino.proto.recorder.GetRoundsBySheoResponse.getDefaultInstance()) return this;
      if (roundRecordsBuilder_ == null) {
        if (!other.roundRecords_.isEmpty()) {
          if (roundRecords_.isEmpty()) {
            roundRecords_ = other.roundRecords_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRoundRecordsIsMutable();
            roundRecords_.addAll(other.roundRecords_);
          }
          onChanged();
        }
      } else {
        if (!other.roundRecords_.isEmpty()) {
          if (roundRecordsBuilder_.isEmpty()) {
            roundRecordsBuilder_.dispose();
            roundRecordsBuilder_ = null;
            roundRecords_ = other.roundRecords_;
            bitField0_ = (bitField0_ & ~0x00000001);
            roundRecordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRoundRecordsFieldBuilder() : null;
          } else {
            roundRecordsBuilder_.addAllMessages(other.roundRecords_);
          }
        }
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
              com.wecasino.proto.recorder.RoundResult m =
                  input.readMessage(
                      com.wecasino.proto.recorder.RoundResult.parser(),
                      extensionRegistry);
              if (roundRecordsBuilder_ == null) {
                ensureRoundRecordsIsMutable();
                roundRecords_.add(m);
              } else {
                roundRecordsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.wecasino.proto.recorder.RoundResult> roundRecords_ =
      java.util.Collections.emptyList();
    private void ensureRoundRecordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        roundRecords_ = new java.util.ArrayList<com.wecasino.proto.recorder.RoundResult>(roundRecords_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wecasino.proto.recorder.RoundResult, com.wecasino.proto.recorder.RoundResult.Builder, com.wecasino.proto.recorder.RoundResultOrBuilder> roundRecordsBuilder_;

    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public java.util.List<com.wecasino.proto.recorder.RoundResult> getRoundRecordsList() {
      if (roundRecordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(roundRecords_);
      } else {
        return roundRecordsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public int getRoundRecordsCount() {
      if (roundRecordsBuilder_ == null) {
        return roundRecords_.size();
      } else {
        return roundRecordsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public com.wecasino.proto.recorder.RoundResult getRoundRecords(int index) {
      if (roundRecordsBuilder_ == null) {
        return roundRecords_.get(index);
      } else {
        return roundRecordsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public Builder setRoundRecords(
        int index, com.wecasino.proto.recorder.RoundResult value) {
      if (roundRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoundRecordsIsMutable();
        roundRecords_.set(index, value);
        onChanged();
      } else {
        roundRecordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public Builder setRoundRecords(
        int index, com.wecasino.proto.recorder.RoundResult.Builder builderForValue) {
      if (roundRecordsBuilder_ == null) {
        ensureRoundRecordsIsMutable();
        roundRecords_.set(index, builderForValue.build());
        onChanged();
      } else {
        roundRecordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public Builder addRoundRecords(com.wecasino.proto.recorder.RoundResult value) {
      if (roundRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoundRecordsIsMutable();
        roundRecords_.add(value);
        onChanged();
      } else {
        roundRecordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public Builder addRoundRecords(
        int index, com.wecasino.proto.recorder.RoundResult value) {
      if (roundRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoundRecordsIsMutable();
        roundRecords_.add(index, value);
        onChanged();
      } else {
        roundRecordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public Builder addRoundRecords(
        com.wecasino.proto.recorder.RoundResult.Builder builderForValue) {
      if (roundRecordsBuilder_ == null) {
        ensureRoundRecordsIsMutable();
        roundRecords_.add(builderForValue.build());
        onChanged();
      } else {
        roundRecordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public Builder addRoundRecords(
        int index, com.wecasino.proto.recorder.RoundResult.Builder builderForValue) {
      if (roundRecordsBuilder_ == null) {
        ensureRoundRecordsIsMutable();
        roundRecords_.add(index, builderForValue.build());
        onChanged();
      } else {
        roundRecordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public Builder addAllRoundRecords(
        java.lang.Iterable<? extends com.wecasino.proto.recorder.RoundResult> values) {
      if (roundRecordsBuilder_ == null) {
        ensureRoundRecordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, roundRecords_);
        onChanged();
      } else {
        roundRecordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public Builder clearRoundRecords() {
      if (roundRecordsBuilder_ == null) {
        roundRecords_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        roundRecordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public Builder removeRoundRecords(int index) {
      if (roundRecordsBuilder_ == null) {
        ensureRoundRecordsIsMutable();
        roundRecords_.remove(index);
        onChanged();
      } else {
        roundRecordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public com.wecasino.proto.recorder.RoundResult.Builder getRoundRecordsBuilder(
        int index) {
      return getRoundRecordsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public com.wecasino.proto.recorder.RoundResultOrBuilder getRoundRecordsOrBuilder(
        int index) {
      if (roundRecordsBuilder_ == null) {
        return roundRecords_.get(index);  } else {
        return roundRecordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public java.util.List<? extends com.wecasino.proto.recorder.RoundResultOrBuilder> 
         getRoundRecordsOrBuilderList() {
      if (roundRecordsBuilder_ != null) {
        return roundRecordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(roundRecords_);
      }
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public com.wecasino.proto.recorder.RoundResult.Builder addRoundRecordsBuilder() {
      return getRoundRecordsFieldBuilder().addBuilder(
          com.wecasino.proto.recorder.RoundResult.getDefaultInstance());
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public com.wecasino.proto.recorder.RoundResult.Builder addRoundRecordsBuilder(
        int index) {
      return getRoundRecordsFieldBuilder().addBuilder(
          index, com.wecasino.proto.recorder.RoundResult.getDefaultInstance());
    }
    /**
     * <pre>
     * roundResults
     * </pre>
     *
     * <code>repeated .recorder.RoundResult round_records = 1 [json_name = "roundRecords"];</code>
     */
    public java.util.List<com.wecasino.proto.recorder.RoundResult.Builder> 
         getRoundRecordsBuilderList() {
      return getRoundRecordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wecasino.proto.recorder.RoundResult, com.wecasino.proto.recorder.RoundResult.Builder, com.wecasino.proto.recorder.RoundResultOrBuilder> 
        getRoundRecordsFieldBuilder() {
      if (roundRecordsBuilder_ == null) {
        roundRecordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wecasino.proto.recorder.RoundResult, com.wecasino.proto.recorder.RoundResult.Builder, com.wecasino.proto.recorder.RoundResultOrBuilder>(
                roundRecords_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        roundRecords_ = null;
      }
      return roundRecordsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:recorder.GetRoundsBySheoResponse)
  }

  // @@protoc_insertion_point(class_scope:recorder.GetRoundsBySheoResponse)
  private static final com.wecasino.proto.recorder.GetRoundsBySheoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wecasino.proto.recorder.GetRoundsBySheoResponse();
  }

  public static com.wecasino.proto.recorder.GetRoundsBySheoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRoundsBySheoResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetRoundsBySheoResponse>() {
    @java.lang.Override
    public GetRoundsBySheoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetRoundsBySheoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRoundsBySheoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wecasino.proto.recorder.GetRoundsBySheoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

