// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recorder/recorder.proto
// Protobuf Java Version: 4.26.1

package com.wecasino.proto.recorder;

public final class RecorderProto {
  private RecorderProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      RecorderProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordIDResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordIDResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordShiftStartedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordShiftStartedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordShiftStartedRequest_TagsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordShiftStartedRequest_TagsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordShiftEndedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordShiftEndedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordShoeStartedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordShoeStartedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordShoeStartedRequest_DecksEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordShoeStartedRequest_DecksEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordShoeEndedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordShoeEndedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundStartedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundStartedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundStartedRequest_TagsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundStartedRequest_TagsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundStartedRequest_PlayersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundStartedRequest_PlayersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundStartedRequest_PlayersNameEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundStartedRequest_PlayersNameEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundStepsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundStepsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundBeCanceledRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundBeCanceledRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundFinishedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundFinishedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundMediaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundMediaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundMediaRequest_SetEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundMediaRequest_SetEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recorder_RecordRoundMediaRequest_AddEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_recorder_RecordRoundMediaRequest_AddEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027recorder/recorder.proto\022\010recorder\032\025rec" +
      "order/record.proto\032\037google/protobuf/time" +
      "stamp.proto\"/\n\020RecordIDResponse\022\033\n\trecor" +
      "d_id\030\001 \001(\014R\010recordId\"\250\003\n\031RecordShiftStar" +
      "tedRequest\022\032\n\010supplier\030\002 \001(\tR\010supplier\022\033" +
      "\n\tgame_type\030\003 \001(\tR\010gameType\022!\n\014game_subt" +
      "ype\030\004 \001(\tR\013gameSubtype\022!\n\014game_version\030\005" +
      " \001(\tR\013gameVersion\022\033\n\tgame_code\030\006 \001(\tR\010ga" +
      "meCode\022\035\n\ntable_code\030\007 \001(\tR\ttableCode\022\035\n" +
      "\nshift_code\030\010 \001(\tR\tshiftCode\0225\n\010ts_start" +
      "\030\020 \001(\0132\032.google.protobuf.TimestampR\007tsSt" +
      "art\022A\n\004tags\030\r \003(\0132-.recorder.RecordShift" +
      "StartedRequest.TagsEntryR\004tags\0327\n\tTagsEn" +
      "try\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005va" +
      "lue:\0028\001\"i\n\027RecordShiftEndedRequest\022\033\n\tre" +
      "cord_id\030\001 \001(\014R\010recordId\0221\n\006ts_end\030\023 \001(\0132" +
      "\032.google.protobuf.TimestampR\005tsEnd\"\327\003\n\030R" +
      "ecordShoeStartedRequest\022\032\n\010supplier\030\002 \001(" +
      "\tR\010supplier\022\033\n\tgame_type\030\003 \001(\tR\010gameType" +
      "\022!\n\014game_subtype\030\004 \001(\tR\013gameSubtype\022!\n\014g" +
      "ame_version\030\005 \001(\tR\013gameVersion\022\033\n\tgame_c" +
      "ode\030\006 \001(\tR\010gameCode\022\035\n\ntable_code\030\007 \001(\tR" +
      "\ttableCode\022\035\n\nshift_code\030\010 \001(\tR\tshiftCod" +
      "e\022\033\n\tshoe_code\030\n \001(\tR\010shoeCode\0225\n\010ts_sta" +
      "rt\030\020 \001(\0132\032.google.protobuf.TimestampR\007ts" +
      "Start\022C\n\005decks\030\030 \003(\0132-.recorder.RecordSh" +
      "oeStartedRequest.DecksEntryR\005decks\032H\n\nDe" +
      "cksEntry\022\020\n\003key\030\001 \001(\005R\003key\022$\n\005value\030\002 \001(" +
      "\0132\016.recorder.DeckR\005value:\0028\001\"h\n\026RecordSh" +
      "oeEndedRequest\022\033\n\trecord_id\030\001 \001(\014R\010recor" +
      "dId\0221\n\006ts_end\030\023 \001(\0132\032.google.protobuf.Ti" +
      "mestampR\005tsEnd\"\305\006\n\031RecordRoundStartedReq" +
      "uest\022\032\n\010supplier\030\002 \001(\tR\010supplier\022\033\n\tgame" +
      "_type\030\003 \001(\tR\010gameType\022!\n\014game_subtype\030\004 " +
      "\001(\tR\013gameSubtype\022!\n\014game_version\030\005 \001(\tR\013" +
      "gameVersion\022\033\n\tgame_code\030\006 \001(\tR\010gameCode" +
      "\022\035\n\ntable_code\030\007 \001(\tR\ttableCode\022\035\n\nshift" +
      "_code\030\010 \001(\tR\tshiftCode\022\037\n\013shift_round\030\t " +
      "\001(\003R\nshiftRound\022\033\n\tshoe_code\030\n \001(\tR\010shoe" +
      "Code\022\035\n\nshoe_round\030\013 \001(\003R\tshoeRound\022\035\n\nr" +
      "ound_code\030\014 \001(\tR\troundCode\022A\n\004tags\030\r \003(\013" +
      "2-.recorder.RecordRoundStartedRequest.Ta" +
      "gsEntryR\004tags\0225\n\010ts_start\030\020 \001(\0132\032.google" +
      ".protobuf.TimestampR\007tsStart\022J\n\007players\030" +
      "\031 \003(\01320.recorder.RecordRoundStartedReque" +
      "st.PlayersEntryR\007players\022W\n\014players_name" +
      "\030\036 \003(\01324.recorder.RecordRoundStartedRequ" +
      "est.PlayersNameEntryR\013playersName\0327\n\tTag" +
      "sEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR" +
      "\005value:\0028\001\032:\n\014PlayersEntry\022\020\n\003key\030\001 \001(\005R" +
      "\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001\032>\n\020Player" +
      "sNameEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 " +
      "\001(\tR\005value:\0028\001\"\\\n\027RecordRoundStepsReques" +
      "t\022\033\n\trecord_id\030\001 \001(\014R\010recordId\022$\n\005steps\030" +
      "\032 \003(\0132\016.recorder.StepR\005steps\"\266\001\n\034RecordR" +
      "oundBeCanceledRequest\022\033\n\trecord_id\030\001 \001(\014" +
      "R\010recordId\0221\n\006ts_end\030\023 \001(\0132\032.google.prot" +
      "obuf.TimestampR\005tsEnd\022\037\n\013cancel_code\030\025 \001" +
      "(\tR\ncancelCode\022%\n\016cancel_message\030\026 \001(\tR\r" +
      "cancelMessage\"l\n\032RecordRoundFinishedRequ" +
      "est\022\033\n\trecord_id\030\001 \001(\014R\010recordId\0221\n\006ts_e" +
      "nd\030\023 \001(\0132\032.google.protobuf.TimestampR\005ts" +
      "End\"\272\002\n\027RecordRoundMediaRequest\022\033\n\trecor" +
      "d_id\030\001 \001(\014R\010recordId\022<\n\003set\030\002 \003(\0132*.reco" +
      "rder.RecordRoundMediaRequest.SetEntryR\003s" +
      "et\022<\n\003add\030\003 \003(\0132*.recorder.RecordRoundMe" +
      "diaRequest.AddEntryR\003add\022\026\n\006remove\030\004 \003(\t" +
      "R\006remove\0326\n\010SetEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024" +
      "\n\005value\030\002 \001(\tR\005value:\0028\001\0326\n\010AddEntry\022\020\n\003" +
      "key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001" +
      "2\312\006\n\017RecorderService\022P\n\022RecordShiftStart" +
      "ed\022#.recorder.RecordShiftStartedRequest\032" +
      "\025.recorder.ShiftRecord\022L\n\020RecordShiftEnd" +
      "ed\022!.recorder.RecordShiftEndedRequest\032\025." +
      "recorder.ShiftRecord\022M\n\021RecordShoeStarte" +
      "d\022\".recorder.RecordShoeStartedRequest\032\024." +
      "recorder.ShoeRecord\022I\n\017RecordShoeEnded\022 " +
      ".recorder.RecordShoeEndedRequest\032\024.recor" +
      "der.ShoeRecord\022P\n\022RecordRoundStarted\022#.r" +
      "ecorder.RecordRoundStartedRequest\032\025.reco" +
      "rder.RoundRecord\022L\n\020RecordRoundSteps\022!.r" +
      "ecorder.RecordRoundStepsRequest\032\025.record" +
      "er.RoundRecord\022V\n\025RecordRoundBeCanceled\022" +
      "&.recorder.RecordRoundBeCanceledRequest\032" +
      "\025.recorder.RoundRecord\022R\n\023RecordRoundFin" +
      "ished\022$.recorder.RecordRoundFinishedRequ" +
      "est\032\025.recorder.RoundRecord\022c\n\"RecordRoun" +
      "dBeCanceledAfterFinished\022&.recorder.Reco" +
      "rdRoundBeCanceledRequest\032\025.recorder.Roun" +
      "dRecord\022L\n\020RecordRoundVideo\022!.recorder.R" +
      "ecordRoundMediaRequest\032\025.recorder.RoundR" +
      "ecordB\236\001\n\033com.wecasino.proto.recorderB\rR" +
      "ecorderProtoP\001Z0github.com/wecasino/weca" +
      "sino-proto/pbgo/recorder\242\002\003RXX\252\002\010Recorde" +
      "r\312\002\010Recorder\342\002\024Recorder\\GPBMetadata\352\002\010Re" +
      "corderb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wecasino.proto.recorder.RecordProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_recorder_RecordIDResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_recorder_RecordIDResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordIDResponse_descriptor,
        new java.lang.String[] { "RecordId", });
    internal_static_recorder_RecordShiftStartedRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_recorder_RecordShiftStartedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordShiftStartedRequest_descriptor,
        new java.lang.String[] { "Supplier", "GameType", "GameSubtype", "GameVersion", "GameCode", "TableCode", "ShiftCode", "TsStart", "Tags", });
    internal_static_recorder_RecordShiftStartedRequest_TagsEntry_descriptor =
      internal_static_recorder_RecordShiftStartedRequest_descriptor.getNestedTypes().get(0);
    internal_static_recorder_RecordShiftStartedRequest_TagsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordShiftStartedRequest_TagsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_recorder_RecordShiftEndedRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_recorder_RecordShiftEndedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordShiftEndedRequest_descriptor,
        new java.lang.String[] { "RecordId", "TsEnd", });
    internal_static_recorder_RecordShoeStartedRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_recorder_RecordShoeStartedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordShoeStartedRequest_descriptor,
        new java.lang.String[] { "Supplier", "GameType", "GameSubtype", "GameVersion", "GameCode", "TableCode", "ShiftCode", "ShoeCode", "TsStart", "Decks", });
    internal_static_recorder_RecordShoeStartedRequest_DecksEntry_descriptor =
      internal_static_recorder_RecordShoeStartedRequest_descriptor.getNestedTypes().get(0);
    internal_static_recorder_RecordShoeStartedRequest_DecksEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordShoeStartedRequest_DecksEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_recorder_RecordShoeEndedRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_recorder_RecordShoeEndedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordShoeEndedRequest_descriptor,
        new java.lang.String[] { "RecordId", "TsEnd", });
    internal_static_recorder_RecordRoundStartedRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_recorder_RecordRoundStartedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundStartedRequest_descriptor,
        new java.lang.String[] { "Supplier", "GameType", "GameSubtype", "GameVersion", "GameCode", "TableCode", "ShiftCode", "ShiftRound", "ShoeCode", "ShoeRound", "RoundCode", "Tags", "TsStart", "Players", "PlayersName", });
    internal_static_recorder_RecordRoundStartedRequest_TagsEntry_descriptor =
      internal_static_recorder_RecordRoundStartedRequest_descriptor.getNestedTypes().get(0);
    internal_static_recorder_RecordRoundStartedRequest_TagsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundStartedRequest_TagsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_recorder_RecordRoundStartedRequest_PlayersEntry_descriptor =
      internal_static_recorder_RecordRoundStartedRequest_descriptor.getNestedTypes().get(1);
    internal_static_recorder_RecordRoundStartedRequest_PlayersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundStartedRequest_PlayersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_recorder_RecordRoundStartedRequest_PlayersNameEntry_descriptor =
      internal_static_recorder_RecordRoundStartedRequest_descriptor.getNestedTypes().get(2);
    internal_static_recorder_RecordRoundStartedRequest_PlayersNameEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundStartedRequest_PlayersNameEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_recorder_RecordRoundStepsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_recorder_RecordRoundStepsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundStepsRequest_descriptor,
        new java.lang.String[] { "RecordId", "Steps", });
    internal_static_recorder_RecordRoundBeCanceledRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_recorder_RecordRoundBeCanceledRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundBeCanceledRequest_descriptor,
        new java.lang.String[] { "RecordId", "TsEnd", "CancelCode", "CancelMessage", });
    internal_static_recorder_RecordRoundFinishedRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_recorder_RecordRoundFinishedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundFinishedRequest_descriptor,
        new java.lang.String[] { "RecordId", "TsEnd", });
    internal_static_recorder_RecordRoundMediaRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_recorder_RecordRoundMediaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundMediaRequest_descriptor,
        new java.lang.String[] { "RecordId", "Set", "Add", "Remove", });
    internal_static_recorder_RecordRoundMediaRequest_SetEntry_descriptor =
      internal_static_recorder_RecordRoundMediaRequest_descriptor.getNestedTypes().get(0);
    internal_static_recorder_RecordRoundMediaRequest_SetEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundMediaRequest_SetEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_recorder_RecordRoundMediaRequest_AddEntry_descriptor =
      internal_static_recorder_RecordRoundMediaRequest_descriptor.getNestedTypes().get(1);
    internal_static_recorder_RecordRoundMediaRequest_AddEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_recorder_RecordRoundMediaRequest_AddEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    descriptor.resolveAllFeaturesImmutable();
    com.wecasino.proto.recorder.RecordProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
