// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

public interface GetRoundsByShoeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.GetRoundsByShoeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 資源代碼
   * </pre>
   *
   * <code>string shoe_code = 1 [json_name = "shoeCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The shoeCode.
   */
  java.lang.String getShoeCode();
  /**
   * <pre>
   * 資源代碼
   * </pre>
   *
   * <code>string shoe_code = 1 [json_name = "shoeCode", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for shoeCode.
   */
  com.google.protobuf.ByteString
      getShoeCodeBytes();

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
