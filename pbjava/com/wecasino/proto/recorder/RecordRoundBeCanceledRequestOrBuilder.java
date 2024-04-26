// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/recorder.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

public interface RecordRoundBeCanceledRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.RecordRoundBeCanceledRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 紀錄ID
   * </pre>
   *
   * <code>bytes record_id = 1 [json_name = "recordId"];</code>
   * @return The recordId.
   */
  com.google.protobuf.ByteString getRecordId();

  /**
   * <pre>
   * 時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
   * @return Whether the tsEnd field is set.
   */
  boolean hasTsEnd();
  /**
   * <pre>
   * 時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
   * @return The tsEnd.
   */
  com.google.protobuf.Timestamp getTsEnd();
  /**
   * <pre>
   * 時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTsEndOrBuilder();

  /**
   * <pre>
   * 取消代碼
   * </pre>
   *
   * <code>string cancel_code = 21 [json_name = "cancelCode"];</code>
   * @return The cancelCode.
   */
  java.lang.String getCancelCode();
  /**
   * <pre>
   * 取消代碼
   * </pre>
   *
   * <code>string cancel_code = 21 [json_name = "cancelCode"];</code>
   * @return The bytes for cancelCode.
   */
  com.google.protobuf.ByteString
      getCancelCodeBytes();

  /**
   * <pre>
   * 取消備註
   * </pre>
   *
   * <code>string cancel_message = 22 [json_name = "cancelMessage"];</code>
   * @return The cancelMessage.
   */
  java.lang.String getCancelMessage();
  /**
   * <pre>
   * 取消備註
   * </pre>
   *
   * <code>string cancel_message = 22 [json_name = "cancelMessage"];</code>
   * @return The bytes for cancelMessage.
   */
  com.google.protobuf.ByteString
      getCancelMessageBytes();
}
