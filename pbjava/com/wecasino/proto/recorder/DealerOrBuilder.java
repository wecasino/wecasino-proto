// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface DealerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.Dealer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 代碼
   * </pre>
   *
   * <code>string code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <pre>
   * 代碼
   * </pre>
   *
   * <code>string code = 1 [json_name = "code"];</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <pre>
   * 名稱
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 名稱
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 年齡
   * </pre>
   *
   * <code>string age = 3 [json_name = "age"];</code>
   * @return The age.
   */
  java.lang.String getAge();
  /**
   * <pre>
   * 年齡
   * </pre>
   *
   * <code>string age = 3 [json_name = "age"];</code>
   * @return The bytes for age.
   */
  com.google.protobuf.ByteString
      getAgeBytes();

  /**
   * <pre>
   * Tags
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4 [json_name = "tags"];</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * Tags
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4 [json_name = "tags"];</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <pre>
   * Tags
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4 [json_name = "tags"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <pre>
   * Tags
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4 [json_name = "tags"];</code>
   */
  /* nullable */
java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Tags
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4 [json_name = "tags"];</code>
   */
  java.lang.String getTagsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * 介紹
   * </pre>
   *
   * <code>.recorder.Article intro = 5 [json_name = "intro"];</code>
   * @return Whether the intro field is set.
   */
  boolean hasIntro();
  /**
   * <pre>
   * 介紹
   * </pre>
   *
   * <code>.recorder.Article intro = 5 [json_name = "intro"];</code>
   * @return The intro.
   */
  com.wecasino.proto.recorder.Article getIntro();
  /**
   * <pre>
   * 介紹
   * </pre>
   *
   * <code>.recorder.Article intro = 5 [json_name = "intro"];</code>
   */
  com.wecasino.proto.recorder.ArticleOrBuilder getIntroOrBuilder();

  /**
   * <pre>
   * 貼文
   * </pre>
   *
   * <code>repeated .recorder.Article posts = 6 [json_name = "posts"];</code>
   */
  java.util.List<com.wecasino.proto.recorder.Article> 
      getPostsList();
  /**
   * <pre>
   * 貼文
   * </pre>
   *
   * <code>repeated .recorder.Article posts = 6 [json_name = "posts"];</code>
   */
  com.wecasino.proto.recorder.Article getPosts(int index);
  /**
   * <pre>
   * 貼文
   * </pre>
   *
   * <code>repeated .recorder.Article posts = 6 [json_name = "posts"];</code>
   */
  int getPostsCount();
  /**
   * <pre>
   * 貼文
   * </pre>
   *
   * <code>repeated .recorder.Article posts = 6 [json_name = "posts"];</code>
   */
  java.util.List<? extends com.wecasino.proto.recorder.ArticleOrBuilder> 
      getPostsOrBuilderList();
  /**
   * <pre>
   * 貼文
   * </pre>
   *
   * <code>repeated .recorder.Article posts = 6 [json_name = "posts"];</code>
   */
  com.wecasino.proto.recorder.ArticleOrBuilder getPostsOrBuilder(
      int index);
}