// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/record.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.recorder;

public interface CardListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.CardList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string card_type = 1 [json_name = "cardType"];</code>
   * @return The cardType.
   */
  java.lang.String getCardType();
  /**
   * <code>string card_type = 1 [json_name = "cardType"];</code>
   * @return The bytes for cardType.
   */
  com.google.protobuf.ByteString
      getCardTypeBytes();

  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .recorder.Card list = 2 [json_name = "list"];</code>
   */
  java.util.List<com.wecasino.proto.recorder.Card> 
      getListList();
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .recorder.Card list = 2 [json_name = "list"];</code>
   */
  com.wecasino.proto.recorder.Card getList(int index);
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .recorder.Card list = 2 [json_name = "list"];</code>
   */
  int getListCount();
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .recorder.Card list = 2 [json_name = "list"];</code>
   */
  java.util.List<? extends com.wecasino.proto.recorder.CardOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * 列表
   * </pre>
   *
   * <code>repeated .recorder.Card list = 2 [json_name = "list"];</code>
   */
  com.wecasino.proto.recorder.CardOrBuilder getListOrBuilder(
      int index);

  /**
   * <pre>
   * 牌型
   * </pre>
   *
   * <code>int32 pattern = 3 [json_name = "pattern"];</code>
   * @return The pattern.
   */
  int getPattern();
}
