// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface FetchShiftRecordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.FetchShiftRecordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  java.util.List<com.wecasino.proto.recorder.ShiftRecord> 
      getShiftRecordList();
  /**
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  com.wecasino.proto.recorder.ShiftRecord getShiftRecord(int index);
  /**
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  int getShiftRecordCount();
  /**
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  java.util.List<? extends com.wecasino.proto.recorder.ShiftRecordOrBuilder> 
      getShiftRecordOrBuilderList();
  /**
   * <code>repeated .recorder.ShiftRecord shift_record = 1 [json_name = "shiftRecord"];</code>
   */
  com.wecasino.proto.recorder.ShiftRecordOrBuilder getShiftRecordOrBuilder(
      int index);
}