// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

public interface GetRoundPlayBackResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.GetRoundPlayBackResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * round code
   * </pre>
   *
   * <code>string round_code = 1 [json_name = "roundCode"];</code>
   * @return The roundCode.
   */
  java.lang.String getRoundCode();
  /**
   * <pre>
   * round code
   * </pre>
   *
   * <code>string round_code = 1 [json_name = "roundCode"];</code>
   * @return The bytes for roundCode.
   */
  com.google.protobuf.ByteString
      getRoundCodeBytes();

  /**
   * <pre>
   * 回放url
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 28 [json_name = "medias"];</code>
   */
  int getMediasCount();
  /**
   * <pre>
   * 回放url
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 28 [json_name = "medias"];</code>
   */
  boolean containsMedias(
      java.lang.String key);
  /**
   * Use {@link #getMediasMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMedias();
  /**
   * <pre>
   * 回放url
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 28 [json_name = "medias"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMediasMap();
  /**
   * <pre>
   * 回放url
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 28 [json_name = "medias"];</code>
   */
  /* nullable */
java.lang.String getMediasOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * 回放url
   * </pre>
   *
   * <code>map&lt;string, string&gt; medias = 28 [json_name = "medias"];</code>
   */
  java.lang.String getMediasOrThrow(
      java.lang.String key);
}
