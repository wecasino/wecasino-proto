// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

/**
 * Protobuf type {@code recorder.ListRoundsRecordResponse}
 */
public final class ListRoundsRecordResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:recorder.ListRoundsRecordResponse)
    ListRoundsRecordResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ListRoundsRecordResponse.class.getName());
  }
  // Use ListRoundsRecordResponse.newBuilder() to construct.
  private ListRoundsRecordResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListRoundsRecordResponse() {
    roundRecord_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListRoundsRecordResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListRoundsRecordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wecasino.proto.recorder.ListRoundsRecordResponse.class, com.wecasino.proto.recorder.ListRoundsRecordResponse.Builder.class);
  }

  public static final int ROUND_RECORD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.wecasino.proto.recorder.RoundRecord> roundRecord_;
  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  @java.lang.Override
  public java.util.List<com.wecasino.proto.recorder.RoundRecord> getRoundRecordList() {
    return roundRecord_;
  }
  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wecasino.proto.recorder.RoundRecordOrBuilder> 
      getRoundRecordOrBuilderList() {
    return roundRecord_;
  }
  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  @java.lang.Override
  public int getRoundRecordCount() {
    return roundRecord_.size();
  }
  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.RoundRecord getRoundRecord(int index) {
    return roundRecord_.get(index);
  }
  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.RoundRecordOrBuilder getRoundRecordOrBuilder(
      int index) {
    return roundRecord_.get(index);
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
    for (int i = 0; i < roundRecord_.size(); i++) {
      output.writeMessage(1, roundRecord_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < roundRecord_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, roundRecord_.get(i));
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
    if (!(obj instanceof com.wecasino.proto.recorder.ListRoundsRecordResponse)) {
      return super.equals(obj);
    }
    com.wecasino.proto.recorder.ListRoundsRecordResponse other = (com.wecasino.proto.recorder.ListRoundsRecordResponse) obj;

    if (!getRoundRecordList()
        .equals(other.getRoundRecordList())) return false;
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
    if (getRoundRecordCount() > 0) {
      hash = (37 * hash) + ROUND_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + getRoundRecordList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.ListRoundsRecordResponse parseFrom(
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
  public static Builder newBuilder(com.wecasino.proto.recorder.ListRoundsRecordResponse prototype) {
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
   * Protobuf type {@code recorder.ListRoundsRecordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:recorder.ListRoundsRecordResponse)
      com.wecasino.proto.recorder.ListRoundsRecordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListRoundsRecordResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListRoundsRecordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wecasino.proto.recorder.ListRoundsRecordResponse.class, com.wecasino.proto.recorder.ListRoundsRecordResponse.Builder.class);
    }

    // Construct using com.wecasino.proto.recorder.ListRoundsRecordResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (roundRecordBuilder_ == null) {
        roundRecord_ = java.util.Collections.emptyList();
      } else {
        roundRecord_ = null;
        roundRecordBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListRoundsRecordResponse_descriptor;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.ListRoundsRecordResponse getDefaultInstanceForType() {
      return com.wecasino.proto.recorder.ListRoundsRecordResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.ListRoundsRecordResponse build() {
      com.wecasino.proto.recorder.ListRoundsRecordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.ListRoundsRecordResponse buildPartial() {
      com.wecasino.proto.recorder.ListRoundsRecordResponse result = new com.wecasino.proto.recorder.ListRoundsRecordResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.wecasino.proto.recorder.ListRoundsRecordResponse result) {
      if (roundRecordBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          roundRecord_ = java.util.Collections.unmodifiableList(roundRecord_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.roundRecord_ = roundRecord_;
      } else {
        result.roundRecord_ = roundRecordBuilder_.build();
      }
    }

    private void buildPartial0(com.wecasino.proto.recorder.ListRoundsRecordResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wecasino.proto.recorder.ListRoundsRecordResponse) {
        return mergeFrom((com.wecasino.proto.recorder.ListRoundsRecordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wecasino.proto.recorder.ListRoundsRecordResponse other) {
      if (other == com.wecasino.proto.recorder.ListRoundsRecordResponse.getDefaultInstance()) return this;
      if (roundRecordBuilder_ == null) {
        if (!other.roundRecord_.isEmpty()) {
          if (roundRecord_.isEmpty()) {
            roundRecord_ = other.roundRecord_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRoundRecordIsMutable();
            roundRecord_.addAll(other.roundRecord_);
          }
          onChanged();
        }
      } else {
        if (!other.roundRecord_.isEmpty()) {
          if (roundRecordBuilder_.isEmpty()) {
            roundRecordBuilder_.dispose();
            roundRecordBuilder_ = null;
            roundRecord_ = other.roundRecord_;
            bitField0_ = (bitField0_ & ~0x00000001);
            roundRecordBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRoundRecordFieldBuilder() : null;
          } else {
            roundRecordBuilder_.addAllMessages(other.roundRecord_);
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
              com.wecasino.proto.recorder.RoundRecord m =
                  input.readMessage(
                      com.wecasino.proto.recorder.RoundRecord.parser(),
                      extensionRegistry);
              if (roundRecordBuilder_ == null) {
                ensureRoundRecordIsMutable();
                roundRecord_.add(m);
              } else {
                roundRecordBuilder_.addMessage(m);
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

    private java.util.List<com.wecasino.proto.recorder.RoundRecord> roundRecord_ =
      java.util.Collections.emptyList();
    private void ensureRoundRecordIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        roundRecord_ = new java.util.ArrayList<com.wecasino.proto.recorder.RoundRecord>(roundRecord_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.wecasino.proto.recorder.RoundRecord, com.wecasino.proto.recorder.RoundRecord.Builder, com.wecasino.proto.recorder.RoundRecordOrBuilder> roundRecordBuilder_;

    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public java.util.List<com.wecasino.proto.recorder.RoundRecord> getRoundRecordList() {
      if (roundRecordBuilder_ == null) {
        return java.util.Collections.unmodifiableList(roundRecord_);
      } else {
        return roundRecordBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public int getRoundRecordCount() {
      if (roundRecordBuilder_ == null) {
        return roundRecord_.size();
      } else {
        return roundRecordBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public com.wecasino.proto.recorder.RoundRecord getRoundRecord(int index) {
      if (roundRecordBuilder_ == null) {
        return roundRecord_.get(index);
      } else {
        return roundRecordBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public Builder setRoundRecord(
        int index, com.wecasino.proto.recorder.RoundRecord value) {
      if (roundRecordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoundRecordIsMutable();
        roundRecord_.set(index, value);
        onChanged();
      } else {
        roundRecordBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public Builder setRoundRecord(
        int index, com.wecasino.proto.recorder.RoundRecord.Builder builderForValue) {
      if (roundRecordBuilder_ == null) {
        ensureRoundRecordIsMutable();
        roundRecord_.set(index, builderForValue.build());
        onChanged();
      } else {
        roundRecordBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public Builder addRoundRecord(com.wecasino.proto.recorder.RoundRecord value) {
      if (roundRecordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoundRecordIsMutable();
        roundRecord_.add(value);
        onChanged();
      } else {
        roundRecordBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public Builder addRoundRecord(
        int index, com.wecasino.proto.recorder.RoundRecord value) {
      if (roundRecordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoundRecordIsMutable();
        roundRecord_.add(index, value);
        onChanged();
      } else {
        roundRecordBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public Builder addRoundRecord(
        com.wecasino.proto.recorder.RoundRecord.Builder builderForValue) {
      if (roundRecordBuilder_ == null) {
        ensureRoundRecordIsMutable();
        roundRecord_.add(builderForValue.build());
        onChanged();
      } else {
        roundRecordBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public Builder addRoundRecord(
        int index, com.wecasino.proto.recorder.RoundRecord.Builder builderForValue) {
      if (roundRecordBuilder_ == null) {
        ensureRoundRecordIsMutable();
        roundRecord_.add(index, builderForValue.build());
        onChanged();
      } else {
        roundRecordBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public Builder addAllRoundRecord(
        java.lang.Iterable<? extends com.wecasino.proto.recorder.RoundRecord> values) {
      if (roundRecordBuilder_ == null) {
        ensureRoundRecordIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, roundRecord_);
        onChanged();
      } else {
        roundRecordBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public Builder clearRoundRecord() {
      if (roundRecordBuilder_ == null) {
        roundRecord_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        roundRecordBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public Builder removeRoundRecord(int index) {
      if (roundRecordBuilder_ == null) {
        ensureRoundRecordIsMutable();
        roundRecord_.remove(index);
        onChanged();
      } else {
        roundRecordBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public com.wecasino.proto.recorder.RoundRecord.Builder getRoundRecordBuilder(
        int index) {
      return getRoundRecordFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public com.wecasino.proto.recorder.RoundRecordOrBuilder getRoundRecordOrBuilder(
        int index) {
      if (roundRecordBuilder_ == null) {
        return roundRecord_.get(index);  } else {
        return roundRecordBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public java.util.List<? extends com.wecasino.proto.recorder.RoundRecordOrBuilder> 
         getRoundRecordOrBuilderList() {
      if (roundRecordBuilder_ != null) {
        return roundRecordBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(roundRecord_);
      }
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public com.wecasino.proto.recorder.RoundRecord.Builder addRoundRecordBuilder() {
      return getRoundRecordFieldBuilder().addBuilder(
          com.wecasino.proto.recorder.RoundRecord.getDefaultInstance());
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public com.wecasino.proto.recorder.RoundRecord.Builder addRoundRecordBuilder(
        int index) {
      return getRoundRecordFieldBuilder().addBuilder(
          index, com.wecasino.proto.recorder.RoundRecord.getDefaultInstance());
    }
    /**
     * <pre>
     * rounds
     * </pre>
     *
     * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
     */
    public java.util.List<com.wecasino.proto.recorder.RoundRecord.Builder> 
         getRoundRecordBuilderList() {
      return getRoundRecordFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.wecasino.proto.recorder.RoundRecord, com.wecasino.proto.recorder.RoundRecord.Builder, com.wecasino.proto.recorder.RoundRecordOrBuilder> 
        getRoundRecordFieldBuilder() {
      if (roundRecordBuilder_ == null) {
        roundRecordBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.wecasino.proto.recorder.RoundRecord, com.wecasino.proto.recorder.RoundRecord.Builder, com.wecasino.proto.recorder.RoundRecordOrBuilder>(
                roundRecord_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        roundRecord_ = null;
      }
      return roundRecordBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:recorder.ListRoundsRecordResponse)
  }

  // @@protoc_insertion_point(class_scope:recorder.ListRoundsRecordResponse)
  private static final com.wecasino.proto.recorder.ListRoundsRecordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wecasino.proto.recorder.ListRoundsRecordResponse();
  }

  public static com.wecasino.proto.recorder.ListRoundsRecordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRoundsRecordResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListRoundsRecordResponse>() {
    @java.lang.Override
    public ListRoundsRecordResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRoundsRecordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRoundsRecordResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wecasino.proto.recorder.ListRoundsRecordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
