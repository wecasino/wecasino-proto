// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/bullfight/record.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.games.bullfight;

public final class RecordProto {
  private RecordProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034games/bullfight/record.proto\022\017games.bu" +
      "llfight*^\n\013GameSubtype\022\036\n\032BULLFIGHT_TYPE" +
      "_UNSPECIFIED\020\000\022\025\n\021BULLFIGHT_CLASSIC\020\001\022\030\n" +
      "\024BULLFIGHT_BLOCKCHAIN\020\020*\315\006\n\004Step\022\024\n\020STEP" +
      "_UNSPECIFIED\020\000\022\017\n\013ROUND_START\020\001\022\022\n\016ROUND" +
      "_FINISHED\020\002\022\022\n\016ROUND_CANCELED\020\003\022\022\n\016DEAL_" +
      "FIRSTCARD\020\004\022\021\n\rDEAL_BANKER_1\020\005\022\021\n\rDEAL_P" +
      "LAYER_1\020\006\022\021\n\rDEAL_PLAYER_2\020\007\022\021\n\rDEAL_PLA" +
      "YER_3\020\010\022\r\n\tROUND_BET\020\t\022\017\n\013NO_MORE_BET\020\n\022" +
      "\021\n\rSHOW_BANKER_1\020\014\022\023\n\017SHOW_BANKER_1_1\020\r\022" +
      "\023\n\017SHOW_BANKER_1_2\020\016\022\023\n\017SHOW_BANKER_1_3\020" +
      "\017\022\023\n\017SHOW_BANKER_1_4\020\020\022\023\n\017SHOW_BANKER_1_" +
      "5\020\021\022\021\n\rSHOW_PLAYER_1\020\022\022\023\n\017SHOW_PLAYER_1_" +
      "1\020\023\022\023\n\017SHOW_PLAYER_1_2\020\024\022\023\n\017SHOW_PLAYER_" +
      "1_3\020\025\022\023\n\017SHOW_PLAYER_1_4\020\026\022\023\n\017SHOW_PLAYE" +
      "R_1_5\020\027\022\021\n\rSHOW_PLAYER_2\020\030\022\023\n\017SHOW_PLAYE" +
      "R_2_1\020\031\022\023\n\017SHOW_PLAYER_2_2\020\032\022\023\n\017SHOW_PLA" +
      "YER_2_3\020\033\022\023\n\017SHOW_PLAYER_2_4\020\034\022\023\n\017SHOW_P" +
      "LAYER_2_5\020\035\022\021\n\rSHOW_PLAYER_3\020\036\022\023\n\017SHOW_P" +
      "LAYER_3_1\020\037\022\023\n\017SHOW_PLAYER_3_2\020 \022\023\n\017SHOW" +
      "_PLAYER_3_3\020!\022\023\n\017SHOW_PLAYER_3_4\020\"\022\023\n\017SH" +
      "OW_PLAYER_3_5\020#\022\022\n\016DEALER_CONFIRM\020(\022\033\n\027P" +
      "ITBOSS_MODIFY_BANKER_1\020)\022\033\n\027PITBOSS_MODI" +
      "FY_PLAYER_1\020*\022\033\n\027PITBOSS_MODIFY_PLAYER_2" +
      "\020+\022\033\n\027PITBOSS_MODIFY_PLAYER_3\020,*S\n\010GameS" +
      "eat\022\024\n\020SEAT_UNSPECIFIED\020\000\022\013\n\007PLAYER1\020\001\022\013" +
      "\n\007PLAYER2\020\002\022\013\n\007PLAYER3\020\003\022\n\n\006BANKER\020\020*|\n\013" +
      "CardPattern\022\034\n\030CARD_PATTERN_UNSPECIFIED\020" +
      "\000\022\010\n\004HIGH\020\001\022\010\n\004BULL\020\002\022\r\n\tBULL_BULL\020\003\022\r\n\t" +
      "FOUR_FACE\020\004\022\r\n\tFULL_FACE\020\005\022\016\n\nFULL_SMALL" +
      "\020\006B\307\001\n\"com.wecasino.proto.games.bullfigh" +
      "tB\013RecordProtoP\001Z7github.com/wecasino/we" +
      "casino-proto/pbgo/games/bullfight\242\002\003GBX\252" +
      "\002\017Games.Bullfight\312\002\017Games\\Bullfight\342\002\033Ga" +
      "mes\\Bullfight\\GPBMetadata\352\002\020Games::Bullf" +
      "ightb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
