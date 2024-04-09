// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/record.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface StepOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.Step)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 步驟代碼：StepCode
   * </pre>
   *
   * <code>int32 code = 2 [json_name = "code"];</code>
   * @return The code.
   */
  int getCode();

  /**
   * <pre>
   * 玩家、執行者：SeatCode
   * </pre>
   *
   * <code>optional int32 seat = 3 [json_name = "seat", (.tagger.tags) = "bson:&#92;"seat,omitempty&#92;""];</code>
   * @return Whether the seat field is set.
   */
  boolean hasSeat();
  /**
   * <pre>
   * 玩家、執行者：SeatCode
   * </pre>
   *
   * <code>optional int32 seat = 3 [json_name = "seat", (.tagger.tags) = "bson:&#92;"seat,omitempty&#92;""];</code>
   * @return The seat.
   */
  int getSeat();

  /**
   * <pre>
   * 時間戳
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * 時間戳
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * 時間戳
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * 執行動作
   * </pre>
   *
   * <code>repeated .recorder.StepAction actions = 6 [json_name = "actions", (.tagger.tags) = "bson:&#92;"action,omitempty&#92;""];</code>
   */
  java.util.List<com.wecasino.proto.recorder.StepAction> 
      getActionsList();
  /**
   * <pre>
   * 執行動作
   * </pre>
   *
   * <code>repeated .recorder.StepAction actions = 6 [json_name = "actions", (.tagger.tags) = "bson:&#92;"action,omitempty&#92;""];</code>
   */
  com.wecasino.proto.recorder.StepAction getActions(int index);
  /**
   * <pre>
   * 執行動作
   * </pre>
   *
   * <code>repeated .recorder.StepAction actions = 6 [json_name = "actions", (.tagger.tags) = "bson:&#92;"action,omitempty&#92;""];</code>
   */
  int getActionsCount();
  /**
   * <pre>
   * 執行動作
   * </pre>
   *
   * <code>repeated .recorder.StepAction actions = 6 [json_name = "actions", (.tagger.tags) = "bson:&#92;"action,omitempty&#92;""];</code>
   */
  java.util.List<? extends com.wecasino.proto.recorder.StepActionOrBuilder> 
      getActionsOrBuilderList();
  /**
   * <pre>
   * 執行動作
   * </pre>
   *
   * <code>repeated .recorder.StepAction actions = 6 [json_name = "actions", (.tagger.tags) = "bson:&#92;"action,omitempty&#92;""];</code>
   */
  com.wecasino.proto.recorder.StepActionOrBuilder getActionsOrBuilder(
      int index);

  /**
   * <pre>
   * 執行錯誤
   * </pre>
   *
   * <code>optional string error = 8 [json_name = "error", (.tagger.tags) = "bson:&#92;"error,omitempty&#92;""];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * 執行錯誤
   * </pre>
   *
   * <code>optional string error = 8 [json_name = "error", (.tagger.tags) = "bson:&#92;"error,omitempty&#92;""];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <pre>
   * 執行錯誤
   * </pre>
   *
   * <code>optional string error = 8 [json_name = "error", (.tagger.tags) = "bson:&#92;"error,omitempty&#92;""];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <pre>
   * 取消
   * </pre>
   *
   * <code>optional bool cancel = 9 [json_name = "cancel", (.tagger.tags) = "bson:&#92;"cancel,omitempty&#92;""];</code>
   * @return Whether the cancel field is set.
   */
  boolean hasCancel();
  /**
   * <pre>
   * 取消
   * </pre>
   *
   * <code>optional bool cancel = 9 [json_name = "cancel", (.tagger.tags) = "bson:&#92;"cancel,omitempty&#92;""];</code>
   * @return The cancel.
   */
  boolean getCancel();

  /**
   * <pre>
   * 分配毫秒數
   * </pre>
   *
   * <code>optional int64 duration = 10 [json_name = "duration", (.tagger.tags) = "bson:&#92;"duration,omitempty&#92;""];</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <pre>
   * 分配毫秒數
   * </pre>
   *
   * <code>optional int64 duration = 10 [json_name = "duration", (.tagger.tags) = "bson:&#92;"duration,omitempty&#92;""];</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * 下注動作
   * </pre>
   *
   * <code>.recorder.BetStep bet_step = 11 [json_name = "betStep"];</code>
   * @return The enum numeric value on the wire for betStep.
   */
  int getBetStepValue();
  /**
   * <pre>
   * 下注動作
   * </pre>
   *
   * <code>.recorder.BetStep bet_step = 11 [json_name = "betStep"];</code>
   * @return The betStep.
   */
  com.wecasino.proto.recorder.BetStep getBetStep();
}
