// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/color/record.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.games.color;

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
      "\n\030games/color/record.proto\022\013games.color*" +
      "g\n\026GamblerInstructionType\022#\n\037GAMBLER_INS" +
      "TRUCTION_UNSPECIFIED\020\000\022\013\n\007LEFT_UP\020\001\022\r\n\tM" +
      "IDDLE_UP\020\002\022\014\n\010RIGHT_UP\020\003*R\n\013GameSubtype\022" +
      "\032\n\026COLOR_TYPE_UNSPECIFIED\020\000\022\021\n\rCOLOR_CLA" +
      "SSIC\020\001\022\024\n\020COLOR_BLOCKCHAIN\020\020*\251\002\n\004Step\022\024\n" +
      "\020STEP_UNSPECIFIED\020\000\022\017\n\013ROUND_START\020\001\022\022\n\016" +
      "ROUND_FINISHED\020\002\022\022\n\016ROUND_CANCELED\020\003\022\r\n\t" +
      "ROUND_BET\020\004\022\017\n\013NO_MORE_BET\020\005\022\017\n\013THROW_CO" +
      "LOR\020\010\022\032\n\026SUPER_GAME_ROUND_READY\020\t\022\032\n\026SUP" +
      "ER_GAME_ROUND_START\020\n\022\030\n\024SUPER_GAME_ROUN" +
      "D_BET\020\013\022\032\n\026SUPER_GAME_NO_MORE_BET\020\014\022\032\n\026S" +
      "UPER_GAME_THROW_COLOR\020\r\022\027\n\023PITBOSS_MODIF" +
      "Y_BOWL\020\020*I\n\014ResourceType\022\035\n\031RESOURCE_TYP" +
      "E_UNSPECIFIED\020\000\022\n\n\006NORMAL\020\001\022\016\n\nSUPER_GAM" +
      "E\020\002B\257\001\n\036com.wecasino.proto.games.colorB\013" +
      "RecordProtoP\001Z3github.com/wecasino/wecas" +
      "ino-proto/pbgo/games/color\242\002\003GCX\252\002\013Games" +
      ".Color\312\002\013Games\\Color\342\002\027Games\\Color\\GPBMe" +
      "tadata\352\002\014Games::Colorb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
