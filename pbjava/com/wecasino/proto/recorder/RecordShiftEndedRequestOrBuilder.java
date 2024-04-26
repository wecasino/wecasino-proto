// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/recorder.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

public interface RecordShiftEndedRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.RecordShiftEndedRequest)
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
   * 結束時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
   * @return Whether the tsEnd field is set.
   */
  boolean hasTsEnd();
  /**
   * <pre>
   * 結束時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
   * @return The tsEnd.
   */
  com.google.protobuf.Timestamp getTsEnd();
  /**
   * <pre>
   * 結束時間
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ts_end = 19 [json_name = "tsEnd"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTsEndOrBuilder();
}
