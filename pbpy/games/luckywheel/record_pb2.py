# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: games/luckywheel/record.proto
# Protobuf Python Version: 5.27.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    27,
    2,
    '',
    'games/luckywheel/record.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dgames/luckywheel/record.proto\x12\x10games.luckywheel*^\n\x0bGameSubtype\x12\x1f\n\x1bLUCKYWHEEL_TYPE_UNSPECIFIED\x10\x00\x12\x16\n\x12LUCKYWHEEL_MAHJONG\x10\x01\x12\x16\n\x12LUCKYWHEEL_RAINBOW\x10\x02*\x9e\x01\n\x04Step\x12\x14\n\x10STEP_UNSPECIFIED\x10\x00\x12\x0f\n\x0bROUND_START\x10\x01\x12\x12\n\x0eROUND_FINISHED\x10\x02\x12\x12\n\x0eROUND_CANCELED\x10\x03\x12\r\n\tROUND_BET\x10\x04\x12\x0f\n\x0bNO_MORE_BET\x10\x05\x12\x0e\n\nSPIN_WHEEL\x10\x08\x12\x17\n\x13PITBOSS_MODIFY_BOWL\x10\x10\x42\xcd\x01\n#com.wecasino.proto.games.luckywheelB\x0bRecordProtoP\x01Z8github.com/wecasino/wecasino-proto/pbgo/games/luckywheel\xa2\x02\x03GLX\xaa\x02\x10Games.Luckywheel\xca\x02\x10Games\\Luckywheel\xe2\x02\x1cGames\\Luckywheel\\GPBMetadata\xea\x02\x11Games::Luckywheelb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'games.luckywheel.record_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n#com.wecasino.proto.games.luckywheelB\013RecordProtoP\001Z8github.com/wecasino/wecasino-proto/pbgo/games/luckywheel\242\002\003GLX\252\002\020Games.Luckywheel\312\002\020Games\\Luckywheel\342\002\034Games\\Luckywheel\\GPBMetadata\352\002\021Games::Luckywheel'
  _globals['_GAMESUBTYPE']._serialized_start=51
  _globals['_GAMESUBTYPE']._serialized_end=145
  _globals['_STEP']._serialized_start=148
  _globals['_STEP']._serialized_end=306
# @@protoc_insertion_point(module_scope)
