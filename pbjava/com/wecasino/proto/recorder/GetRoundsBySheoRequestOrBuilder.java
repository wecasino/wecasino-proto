// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

public interface GetRoundsBySheoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.GetRoundsBySheoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 資源代碼
   * </pre>
   *
   * <code>string sheo_code = 1 [json_name = "sheoCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The sheoCode.
   */
  java.lang.String getSheoCode();
  /**
   * <pre>
   * 資源代碼
   * </pre>
   *
   * <code>string sheo_code = 1 [json_name = "sheoCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for sheoCode.
   */
  com.google.protobuf.ByteString
      getSheoCodeBytes();

  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 2 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The gameCode.
   */
  java.lang.String getGameCode();
  /**
   * <pre>
   * 遊戲代碼
   * </pre>
   *
   * <code>string game_code = 2 [json_name = "gameCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for gameCode.
   */
  com.google.protobuf.ByteString
      getGameCodeBytes();
}