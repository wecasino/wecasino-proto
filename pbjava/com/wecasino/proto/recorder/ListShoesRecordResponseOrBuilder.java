// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/provider.proto

// Protobuf Java Version: 4.26.1
package com.wecasino.proto.recorder;

public interface ListShoesRecordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recorder.ListShoesRecordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * shoes
   * </pre>
   *
   * <code>repeated .recorder.ShoeRecord shoe_record = 1 [json_name = "shoeRecord"];</code>
   */
  java.util.List<com.wecasino.proto.recorder.ShoeRecord> 
      getShoeRecordList();
  /**
   * <pre>
   * shoes
   * </pre>
   *
   * <code>repeated .recorder.ShoeRecord shoe_record = 1 [json_name = "shoeRecord"];</code>
   */
  com.wecasino.proto.recorder.ShoeRecord getShoeRecord(int index);
  /**
   * <pre>
   * shoes
   * </pre>
   *
   * <code>repeated .recorder.ShoeRecord shoe_record = 1 [json_name = "shoeRecord"];</code>
   */
  int getShoeRecordCount();
  /**
   * <pre>
   * shoes
   * </pre>
   *
   * <code>repeated .recorder.ShoeRecord shoe_record = 1 [json_name = "shoeRecord"];</code>
   */
  java.util.List<? extends com.wecasino.proto.recorder.ShoeRecordOrBuilder> 
      getShoeRecordOrBuilderList();
  /**
   * <pre>
   * shoes
   * </pre>
   *
   * <code>repeated .recorder.ShoeRecord shoe_record = 1 [json_name = "shoeRecord"];</code>
   */
  com.wecasino.proto.recorder.ShoeRecordOrBuilder getShoeRecordOrBuilder(
      int index);
}
