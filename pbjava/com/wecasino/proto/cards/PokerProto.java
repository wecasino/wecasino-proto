// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cards/poker.proto
// Protobuf Java Version: 4.26.1

package com.wecasino.proto.cards;

public final class PokerProto {
  private PokerProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      PokerProto.class.getName());
  }
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
      "\n\021cards/poker.proto\022\005cards*\344\007\n\tPokerCard" +
      "\022\032\n\026POKER_CARD_UNSPECIFIED\020\000\022\t\n\005ANY_A\020\001\022" +
      "\t\n\005ANY_2\020\002\022\t\n\005ANY_3\020\003\022\t\n\005ANY_4\020\004\022\t\n\005ANY_" +
      "5\020\005\022\t\n\005ANY_6\020\006\022\t\n\005ANY_7\020\007\022\t\n\005ANY_8\020\010\022\t\n\005" +
      "ANY_9\020\t\022\n\n\006ANY_10\020\n\022\t\n\005ANY_J\020\013\022\t\n\005ANY_Q\020" +
      "\014\022\t\n\005ANY_K\020\r\022\010\n\004MASK\020\017\022\r\n\tSPADE_ANY\020\020\022\013\n" +
      "\007SPADE_A\020\021\022\013\n\007SPADE_2\020\022\022\013\n\007SPADE_3\020\023\022\013\n\007" +
      "SPADE_4\020\024\022\013\n\007SPADE_5\020\025\022\013\n\007SPADE_6\020\026\022\013\n\007S" +
      "PADE_7\020\027\022\013\n\007SPADE_8\020\030\022\013\n\007SPADE_9\020\031\022\014\n\010SP" +
      "ADE_10\020\032\022\013\n\007SPADE_J\020\033\022\013\n\007SPADE_Q\020\034\022\013\n\007SP" +
      "ADE_K\020\035\022\r\n\tHEART_ANY\020 \022\013\n\007HEART_A\020!\022\013\n\007H" +
      "EART_2\020\"\022\013\n\007HEART_3\020#\022\013\n\007HEART_4\020$\022\013\n\007HE" +
      "ART_5\020%\022\013\n\007HEART_6\020&\022\013\n\007HEART_7\020\'\022\013\n\007HEA" +
      "RT_8\020(\022\013\n\007HEART_9\020)\022\014\n\010HEART_10\020*\022\013\n\007HEA" +
      "RT_J\020+\022\013\n\007HEART_Q\020,\022\013\n\007HEART_K\020-\022\014\n\010CLUB" +
      "_ANY\0200\022\n\n\006CLUB_A\0201\022\n\n\006CLUB_2\0202\022\n\n\006CLUB_3" +
      "\0203\022\n\n\006CLUB_4\0204\022\n\n\006CLUB_5\0205\022\n\n\006CLUB_6\0206\022\n" +
      "\n\006CLUB_7\0207\022\n\n\006CLUB_8\0208\022\n\n\006CLUB_9\0209\022\013\n\007CL" +
      "UB_10\020:\022\n\n\006CLUB_J\020;\022\n\n\006CLUB_Q\020<\022\n\n\006CLUB_" +
      "K\020=\022\017\n\013DIAMOND_ANY\020@\022\r\n\tDIAMOND_A\020A\022\r\n\tD" +
      "IAMOND_2\020B\022\r\n\tDIAMOND_3\020C\022\r\n\tDIAMOND_4\020D" +
      "\022\r\n\tDIAMOND_5\020E\022\r\n\tDIAMOND_6\020F\022\r\n\tDIAMON" +
      "D_7\020G\022\r\n\tDIAMOND_8\020H\022\r\n\tDIAMOND_9\020I\022\016\n\nD" +
      "IAMOND_10\020J\022\r\n\tDIAMOND_J\020K\022\r\n\tDIAMOND_Q\020" +
      "L\022\r\n\tDIAMOND_K\020M\022\017\n\013JOKER_COLOR\020^\022\017\n\013JOK" +
      "ER_BLACK\020_\022\r\n\tSUIT_MASK\020pB\211\001\n\030com.wecasi" +
      "no.proto.cardsB\nPokerProtoP\001Z-github.com" +
      "/wecasino/wecasino-proto/pbgo/cards\242\002\003CX" +
      "X\252\002\005Cards\312\002\005Cards\342\002\021Cards\\GPBMetadata\352\002\005" +
      "Cardsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}