// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

/**
 * Protobuf type {@code recorder.ListShiftsResponse}
 */
public final class ListShiftsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:recorder.ListShiftsResponse)
    ListShiftsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ListShiftsResponse.class.getName());
  }
  // Use ListShiftsResponse.newBuilder() to construct.
  private ListShiftsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListShiftsResponse() {
    shiftRecord_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListShiftsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListShiftsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wecasino.proto.recorder.ListShiftsResponse.class, com.wecasino.proto.recorder.ListShiftsResponse.Builder.class);
  }

  public static final int SHIFT_RECORD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.wecasino.proto.recorder.ShiftRecord> shiftRecord_;
  /**
   * <pre>
   * shifts
   * </pre>
   *
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  @java.lang.Override
  public java.util.List<com.wecasino.proto.recorder.ShiftRecord> getShiftRecordList() {
    return shiftRecord_;
  }
  /**
   * <pre>
   * shifts
   * </pre>
   *
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wecasino.proto.recorder.ShiftRecordOrBuilder> 
      getShiftRecordOrBuilderList() {
    return shiftRecord_;
  }
  /**
   * <pre>
   * shifts
   * </pre>
   *
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  @java.lang.Override
  public int getShiftRecordCount() {
    return shiftRecord_.size();
  }
  /**
   * <pre>
   * shifts
   * </pre>
   *
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.ShiftRecord getShiftRecord(int index) {
    return shiftRecord_.get(index);
  }
  /**
   * <pre>
   * shifts
   * </pre>
   *
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  @java.lang.Override
  public com.wecasino.proto.recorder.ShiftRecordOrBuilder getShiftRecordOrBuilder(
      int index) {
    return shiftRecord_.get(index);
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
    for (int i = 0; i < shiftRecord_.size(); i++) {
      output.writeMessage(1, shiftRecord_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < shiftRecord_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, shiftRecord_.get(i));
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
    if (!(obj instanceof com.wecasino.proto.recorder.ListShiftsResponse)) {
      return super.equals(obj);
    }
    com.wecasino.proto.recorder.ListShiftsResponse other = (com.wecasino.proto.recorder.ListShiftsResponse) obj;

    if (!getShiftRecordList()
        .equals(other.getShiftRecordList())) return false;
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
    if (getShiftRecordCount() > 0) {
      hash = (37 * hash) + SHIFT_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + getShiftRecordList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.wecasino.proto.recorder.ListShiftsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.wecasino.proto.recorder.ListShiftsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.wecasino.proto.recorder.ListShiftsResponse parseFrom(
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
  public static Builder newBuilder(com.wecasino.proto.recorder.ListShiftsResponse prototype) {
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
   * Protobuf type {@code recorder.ListShiftsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:recorder.ListShiftsResponse)
      com.wecasino.proto.recorder.ListShiftsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListShiftsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListShiftsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wecasino.proto.recorder.ListShiftsResponse.class, com.wecasino.proto.recorder.ListShiftsResponse.Builder.class);
    }

    // Construct using com.wecasino.proto.recorder.ListShiftsResponse.newBuilder()
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
      if (shiftRecordBuilder_ == null) {
        shiftRecord_ = java.util.Collections.emptyList();
      } else {
        shiftRecord_ = null;
        shiftRecordBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wecasino.proto.recorder.ProviderProto.internal_static_recorder_ListShiftsResponse_descriptor;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.ListShiftsResponse getDefaultInstanceForType() {
      return com.wecasino.proto.recorder.ListShiftsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.ListShiftsResponse build() {
      com.wecasino.proto.recorder.ListShiftsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wecasino.proto.recorder.ListShiftsResponse buildPartial() {
      com.wecasino.proto.recorder.ListShiftsResponse result = new com.wecasino.proto.recorder.ListShiftsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.wecasino.proto.recorder.ListShiftsResponse result) {
      if (shiftRecordBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          shiftRecord_ = java.util.Collections.unmodifiableList(shiftRecord_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.shiftRecord_ = shiftRecord_;
      } else {
        result.shiftRecord_ = shiftRecordBuilder_.build();
      }
    }

    private void buildPartial0(com.wecasino.proto.recorder.ListShiftsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wecasino.proto.recorder.ListShiftsResponse) {
        return mergeFrom((com.wecasino.proto.recorder.ListShiftsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wecasino.proto.recorder.ListShiftsResponse other) {
      if (other == com.wecasino.proto.recorder.ListShiftsResponse.getDefaultInstance()) return this;
      if (shiftRecordBuilder_ == null) {
        if (!other.shiftRecord_.isEmpty()) {
          if (shiftRecord_.isEmpty()) {
            shiftRecord_ = other.shiftRecord_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShiftRecordIsMutable();
            shiftRecord_.addAll(other.shiftRecord_);
          }
          onChanged();
        }
      } else {
        if (!other.shiftRecord_.isEmpty()) {
          if (shiftRecordBuilder_.isEmpty()) {
            shiftRecordBuilder_.dispose();
            shiftRecordBuilder_ = null;
            shiftRecord_ = other.shiftRecord_;
            bitField0_ = (bitField0_ & ~0x00000001);
            shiftRecordBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getShiftRecordFieldBuilder() : null;
          } else {
            shiftRecordBuilder_.addAllMessages(other.shiftRecord_);
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
              com.wecasino.proto.recorder.ShiftRecord m =
                  input.readMessage(
                      com.wecasino.proto.recorder.ShiftRecord.parser(),
                      extensionRegistry);
              if (shiftRecordBuilder_ == null) {
                ensureShiftRecordIsMutable();
                shiftRecord_.add(m);
              } else {
                shiftRecordBuilder_.addMessage(m);
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

    private java.util.List<com.wecasino.proto.recorder.ShiftRecord> shiftRecord_ =
      java.util.Collections.emptyList();
    private void ensureShiftRecordIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        shiftRecord_ = new java.util.ArrayList<com.wecasino.proto.recorder.ShiftRecord>(shiftRecord_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.wecasino.proto.recorder.ShiftRecord, com.wecasino.proto.recorder.ShiftRecord.Builder, com.wecasino.proto.recorder.ShiftRecordOrBuilder> shiftRecordBuilder_;

    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public java.util.List<com.wecasino.proto.recorder.ShiftRecord> getShiftRecordList() {
      if (shiftRecordBuilder_ == null) {
        return java.util.Collections.unmodifiableList(shiftRecord_);
      } else {
        return shiftRecordBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public int getShiftRecordCount() {
      if (shiftRecordBuilder_ == null) {
        return shiftRecord_.size();
      } else {
        return shiftRecordBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public com.wecasino.proto.recorder.ShiftRecord getShiftRecord(int index) {
      if (shiftRecordBuilder_ == null) {
        return shiftRecord_.get(index);
      } else {
        return shiftRecordBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public Builder setShiftRecord(
        int index, com.wecasino.proto.recorder.ShiftRecord value) {
      if (shiftRecordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShiftRecordIsMutable();
        shiftRecord_.set(index, value);
        onChanged();
      } else {
        shiftRecordBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public Builder setShiftRecord(
        int index, com.wecasino.proto.recorder.ShiftRecord.Builder builderForValue) {
      if (shiftRecordBuilder_ == null) {
        ensureShiftRecordIsMutable();
        shiftRecord_.set(index, builderForValue.build());
        onChanged();
      } else {
        shiftRecordBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public Builder addShiftRecord(com.wecasino.proto.recorder.ShiftRecord value) {
      if (shiftRecordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShiftRecordIsMutable();
        shiftRecord_.add(value);
        onChanged();
      } else {
        shiftRecordBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public Builder addShiftRecord(
        int index, com.wecasino.proto.recorder.ShiftRecord value) {
      if (shiftRecordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShiftRecordIsMutable();
        shiftRecord_.add(index, value);
        onChanged();
      } else {
        shiftRecordBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public Builder addShiftRecord(
        com.wecasino.proto.recorder.ShiftRecord.Builder builderForValue) {
      if (shiftRecordBuilder_ == null) {
        ensureShiftRecordIsMutable();
        shiftRecord_.add(builderForValue.build());
        onChanged();
      } else {
        shiftRecordBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public Builder addShiftRecord(
        int index, com.wecasino.proto.recorder.ShiftRecord.Builder builderForValue) {
      if (shiftRecordBuilder_ == null) {
        ensureShiftRecordIsMutable();
        shiftRecord_.add(index, builderForValue.build());
        onChanged();
      } else {
        shiftRecordBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public Builder addAllShiftRecord(
        java.lang.Iterable<? extends com.wecasino.proto.recorder.ShiftRecord> values) {
      if (shiftRecordBuilder_ == null) {
        ensureShiftRecordIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, shiftRecord_);
        onChanged();
      } else {
        shiftRecordBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public Builder clearShiftRecord() {
      if (shiftRecordBuilder_ == null) {
        shiftRecord_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        shiftRecordBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public Builder removeShiftRecord(int index) {
      if (shiftRecordBuilder_ == null) {
        ensureShiftRecordIsMutable();
        shiftRecord_.remove(index);
        onChanged();
      } else {
        shiftRecordBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public com.wecasino.proto.recorder.ShiftRecord.Builder getShiftRecordBuilder(
        int index) {
      return getShiftRecordFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public com.wecasino.proto.recorder.ShiftRecordOrBuilder getShiftRecordOrBuilder(
        int index) {
      if (shiftRecordBuilder_ == null) {
        return shiftRecord_.get(index);  } else {
        return shiftRecordBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public java.util.List<? extends com.wecasino.proto.recorder.ShiftRecordOrBuilder> 
         getShiftRecordOrBuilderList() {
      if (shiftRecordBuilder_ != null) {
        return shiftRecordBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(shiftRecord_);
      }
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public com.wecasino.proto.recorder.ShiftRecord.Builder addShiftRecordBuilder() {
      return getShiftRecordFieldBuilder().addBuilder(
          com.wecasino.proto.recorder.ShiftRecord.getDefaultInstance());
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public com.wecasino.proto.recorder.ShiftRecord.Builder addShiftRecordBuilder(
        int index) {
      return getShiftRecordFieldBuilder().addBuilder(
          index, com.wecasino.proto.recorder.ShiftRecord.getDefaultInstance());
    }
    /**
     * <pre>
     * shifts
     * </pre>
     *
     * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
     */
    public java.util.List<com.wecasino.proto.recorder.ShiftRecord.Builder> 
         getShiftRecordBuilderList() {
      return getShiftRecordFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.wecasino.proto.recorder.ShiftRecord, com.wecasino.proto.recorder.ShiftRecord.Builder, com.wecasino.proto.recorder.ShiftRecordOrBuilder> 
        getShiftRecordFieldBuilder() {
      if (shiftRecordBuilder_ == null) {
        shiftRecordBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.wecasino.proto.recorder.ShiftRecord, com.wecasino.proto.recorder.ShiftRecord.Builder, com.wecasino.proto.recorder.ShiftRecordOrBuilder>(
                shiftRecord_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        shiftRecord_ = null;
      }
      return shiftRecordBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:recorder.ListShiftsResponse)
  }

  // @@protoc_insertion_point(class_scope:recorder.ListShiftsResponse)
  private static final com.wecasino.proto.recorder.ListShiftsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wecasino.proto.recorder.ListShiftsResponse();
  }

  public static com.wecasino.proto.recorder.ListShiftsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListShiftsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListShiftsResponse>() {
    @java.lang.Override
    public ListShiftsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListShiftsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListShiftsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wecasino.proto.recorder.ListShiftsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

