// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface ListDealersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.ListDealersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 荷官資料
   * </pre>
   *
   * <code>repeated .recorder.Dealer dealers = 1 [json_name = "dealers"];</code>
   */
  java.util.List<com.wecasino.proto.recorder.Dealer> 
      getDealersList();
  /**
   * <pre>
   * 荷官資料
   * </pre>
   *
   * <code>repeated .recorder.Dealer dealers = 1 [json_name = "dealers"];</code>
   */
  com.wecasino.proto.recorder.Dealer getDealers(int index);
  /**
   * <pre>
   * 荷官資料
   * </pre>
   *
   * <code>repeated .recorder.Dealer dealers = 1 [json_name = "dealers"];</code>
   */
  int getDealersCount();
  /**
   * <pre>
   * 荷官資料
   * </pre>
   *
   * <code>repeated .recorder.Dealer dealers = 1 [json_name = "dealers"];</code>
   */
  java.util.List<? extends com.wecasino.proto.recorder.DealerOrBuilder> 
      getDealersOrBuilderList();
  /**
   * <pre>
   * 荷官資料
   * </pre>
   *
   * <code>repeated .recorder.Dealer dealers = 1 [json_name = "dealers"];</code>
   */
  com.wecasino.proto.recorder.DealerOrBuilder getDealersOrBuilder(
      int index);
}
