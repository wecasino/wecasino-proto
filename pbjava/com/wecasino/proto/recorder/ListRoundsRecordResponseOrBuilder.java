// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface ListRoundsRecordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.ListRoundsRecordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  java.util.List<com.wecasino.proto.recorder.RoundRecord> 
      getRoundRecordList();
  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  com.wecasino.proto.recorder.RoundRecord getRoundRecord(int index);
  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  int getRoundRecordCount();
  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  java.util.List<? extends com.wecasino.proto.recorder.RoundRecordOrBuilder> 
      getRoundRecordOrBuilderList();
  /**
   * <pre>
   * rounds
   * </pre>
   *
   * <code>repeated .recorder.RoundRecord round_record = 1 [json_name = "roundRecord"];</code>
   */
  com.wecasino.proto.recorder.RoundRecordOrBuilder getRoundRecordOrBuilder(
      int index);
}
