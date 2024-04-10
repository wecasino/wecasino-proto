// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/record.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface SeatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.Seat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 座位功能代碼：SeatCode
   * </pre>
   *
   * <code>int32 code = 2 [json_name = "code"];</code>
   * @return The code.
   */
  int getCode();

  /**
   * <pre>
   * 各類手牌
   * key: ResourceTypeCode, value: 卡牌陣列
   * </pre>
   *
   * <code>map&lt;int32, .recorder.CardList&gt; cards = 3 [json_name = "cards", (.tagger.tags) = "bson:&#92;"cards,omitempty&#92;""];</code>
   */
  int getCardsCount();
  /**
   * <pre>
   * 各類手牌
   * key: ResourceTypeCode, value: 卡牌陣列
   * </pre>
   *
   * <code>map&lt;int32, .recorder.CardList&gt; cards = 3 [json_name = "cards", (.tagger.tags) = "bson:&#92;"cards,omitempty&#92;""];</code>
   */
  boolean containsCards(
      int key);
  /**
   * Use {@link #getCardsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.wecasino.proto.recorder.CardList>
  getCards();
  /**
   * <pre>
   * 各類手牌
   * key: ResourceTypeCode, value: 卡牌陣列
   * </pre>
   *
   * <code>map&lt;int32, .recorder.CardList&gt; cards = 3 [json_name = "cards", (.tagger.tags) = "bson:&#92;"cards,omitempty&#92;""];</code>
   */
  java.util.Map<java.lang.Integer, com.wecasino.proto.recorder.CardList>
  getCardsMap();
  /**
   * <pre>
   * 各類手牌
   * key: ResourceTypeCode, value: 卡牌陣列
   * </pre>
   *
   * <code>map&lt;int32, .recorder.CardList&gt; cards = 3 [json_name = "cards", (.tagger.tags) = "bson:&#92;"cards,omitempty&#92;""];</code>
   */
  /* nullable */
com.wecasino.proto.recorder.CardList getCardsOrDefault(
      int key,
      /* nullable */
com.wecasino.proto.recorder.CardList defaultValue);
  /**
   * <pre>
   * 各類手牌
   * key: ResourceTypeCode, value: 卡牌陣列
   * </pre>
   *
   * <code>map&lt;int32, .recorder.CardList&gt; cards = 3 [json_name = "cards", (.tagger.tags) = "bson:&#92;"cards,omitempty&#92;""];</code>
   */
  com.wecasino.proto.recorder.CardList getCardsOrThrow(
      int key);

  /**
   * <pre>
   * 各類分數
   * key: ResourceTypeCode, value: 分數值。
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; scores = 4 [json_name = "scores", (.tagger.tags) = "bson:&#92;"scores,omitempty&#92;""];</code>
   */
  int getScoresCount();
  /**
   * <pre>
   * 各類分數
   * key: ResourceTypeCode, value: 分數值。
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; scores = 4 [json_name = "scores", (.tagger.tags) = "bson:&#92;"scores,omitempty&#92;""];</code>
   */
  boolean containsScores(
      int key);
  /**
   * Use {@link #getScoresMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Long>
  getScores();
  /**
   * <pre>
   * 各類分數
   * key: ResourceTypeCode, value: 分數值。
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; scores = 4 [json_name = "scores", (.tagger.tags) = "bson:&#92;"scores,omitempty&#92;""];</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Long>
  getScoresMap();
  /**
   * <pre>
   * 各類分數
   * key: ResourceTypeCode, value: 分數值。
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; scores = 4 [json_name = "scores", (.tagger.tags) = "bson:&#92;"scores,omitempty&#92;""];</code>
   */
  long getScoresOrDefault(
      int key,
      long defaultValue);
  /**
   * <pre>
   * 各類分數
   * key: ResourceTypeCode, value: 分數值。
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; scores = 4 [json_name = "scores", (.tagger.tags) = "bson:&#92;"scores,omitempty&#92;""];</code>
   */
  long getScoresOrThrow(
      int key);
}
