// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: games/fantan/record.proto

package fantan

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type GameSubtype int32

const (
	// 未指定
	GameSubtype_FANTAN_TYPE_UNSPECIFIED GameSubtype = 0
	// 番攤
	GameSubtype_FANTAN_CLASSIC GameSubtype = 1
	// 區塊鏈番攤
	GameSubtype_FANTAN_BLOCKCHAIN GameSubtype = 16
)

// Enum value maps for GameSubtype.
var (
	GameSubtype_name = map[int32]string{
		0:  "FANTAN_TYPE_UNSPECIFIED",
		1:  "FANTAN_CLASSIC",
		16: "FANTAN_BLOCKCHAIN",
	}
	GameSubtype_value = map[string]int32{
		"FANTAN_TYPE_UNSPECIFIED": 0,
		"FANTAN_CLASSIC":          1,
		"FANTAN_BLOCKCHAIN":       16,
	}
)

func (x GameSubtype) Enum() *GameSubtype {
	p := new(GameSubtype)
	*p = x
	return p
}

func (x GameSubtype) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (GameSubtype) Descriptor() protoreflect.EnumDescriptor {
	return file_games_fantan_record_proto_enumTypes[0].Descriptor()
}

func (GameSubtype) Type() protoreflect.EnumType {
	return &file_games_fantan_record_proto_enumTypes[0]
}

func (x GameSubtype) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use GameSubtype.Descriptor instead.
func (GameSubtype) EnumDescriptor() ([]byte, []int) {
	return file_games_fantan_record_proto_rawDescGZIP(), []int{0}
}

// 步驟，依據遊戲供應商邏輯，不是每個步驟都會走到
type Step int32

const (
	// 未指定
	Step_STEP_UNSPECIFIED Step = 0
	// 本局開始
	Step_ROUND_START Step = 1
	// 本局完成
	Step_ROUND_FINISHED Step = 2
	// 本局取消
	Step_ROUND_CANCELED Step = 3
	// 開放下注
	Step_ROUND_BET Step = 4
	// 停止下注
	Step_NO_MORE_BET Step = 5
	// 抓籽
	Step_GRAB_DICE_AMOUNT Step = 8
	// PITBOSS 修改骰點
	Step_PITBOSS_MODIFY_BOWL Step = 16
)

// Enum value maps for Step.
var (
	Step_name = map[int32]string{
		0:  "STEP_UNSPECIFIED",
		1:  "ROUND_START",
		2:  "ROUND_FINISHED",
		3:  "ROUND_CANCELED",
		4:  "ROUND_BET",
		5:  "NO_MORE_BET",
		8:  "GRAB_DICE_AMOUNT",
		16: "PITBOSS_MODIFY_BOWL",
	}
	Step_value = map[string]int32{
		"STEP_UNSPECIFIED":    0,
		"ROUND_START":         1,
		"ROUND_FINISHED":      2,
		"ROUND_CANCELED":      3,
		"ROUND_BET":           4,
		"NO_MORE_BET":         5,
		"GRAB_DICE_AMOUNT":    8,
		"PITBOSS_MODIFY_BOWL": 16,
	}
)

func (x Step) Enum() *Step {
	p := new(Step)
	*p = x
	return p
}

func (x Step) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Step) Descriptor() protoreflect.EnumDescriptor {
	return file_games_fantan_record_proto_enumTypes[1].Descriptor()
}

func (Step) Type() protoreflect.EnumType {
	return &file_games_fantan_record_proto_enumTypes[1]
}

func (x Step) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Step.Descriptor instead.
func (Step) EnumDescriptor() ([]byte, []int) {
	return file_games_fantan_record_proto_rawDescGZIP(), []int{1}
}

var File_games_fantan_record_proto protoreflect.FileDescriptor

var file_games_fantan_record_proto_rawDesc = []byte{
	0x0a, 0x19, 0x67, 0x61, 0x6d, 0x65, 0x73, 0x2f, 0x66, 0x61, 0x6e, 0x74, 0x61, 0x6e, 0x2f, 0x72,
	0x65, 0x63, 0x6f, 0x72, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x67, 0x61, 0x6d,
	0x65, 0x73, 0x2e, 0x66, 0x61, 0x6e, 0x74, 0x61, 0x6e, 0x2a, 0x55, 0x0a, 0x0b, 0x47, 0x61, 0x6d,
	0x65, 0x53, 0x75, 0x62, 0x74, 0x79, 0x70, 0x65, 0x12, 0x1b, 0x0a, 0x17, 0x46, 0x41, 0x4e, 0x54,
	0x41, 0x4e, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46,
	0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x12, 0x0a, 0x0e, 0x46, 0x41, 0x4e, 0x54, 0x41, 0x4e, 0x5f,
	0x43, 0x4c, 0x41, 0x53, 0x53, 0x49, 0x43, 0x10, 0x01, 0x12, 0x15, 0x0a, 0x11, 0x46, 0x41, 0x4e,
	0x54, 0x41, 0x4e, 0x5f, 0x42, 0x4c, 0x4f, 0x43, 0x4b, 0x43, 0x48, 0x41, 0x49, 0x4e, 0x10, 0x10,
	0x2a, 0xa4, 0x01, 0x0a, 0x04, 0x53, 0x74, 0x65, 0x70, 0x12, 0x14, 0x0a, 0x10, 0x53, 0x54, 0x45,
	0x50, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12,
	0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4e, 0x44, 0x5f, 0x53, 0x54, 0x41, 0x52, 0x54, 0x10, 0x01,
	0x12, 0x12, 0x0a, 0x0e, 0x52, 0x4f, 0x55, 0x4e, 0x44, 0x5f, 0x46, 0x49, 0x4e, 0x49, 0x53, 0x48,
	0x45, 0x44, 0x10, 0x02, 0x12, 0x12, 0x0a, 0x0e, 0x52, 0x4f, 0x55, 0x4e, 0x44, 0x5f, 0x43, 0x41,
	0x4e, 0x43, 0x45, 0x4c, 0x45, 0x44, 0x10, 0x03, 0x12, 0x0d, 0x0a, 0x09, 0x52, 0x4f, 0x55, 0x4e,
	0x44, 0x5f, 0x42, 0x45, 0x54, 0x10, 0x04, 0x12, 0x0f, 0x0a, 0x0b, 0x4e, 0x4f, 0x5f, 0x4d, 0x4f,
	0x52, 0x45, 0x5f, 0x42, 0x45, 0x54, 0x10, 0x05, 0x12, 0x14, 0x0a, 0x10, 0x47, 0x52, 0x41, 0x42,
	0x5f, 0x44, 0x49, 0x43, 0x45, 0x5f, 0x41, 0x4d, 0x4f, 0x55, 0x4e, 0x54, 0x10, 0x08, 0x12, 0x17,
	0x0a, 0x13, 0x50, 0x49, 0x54, 0x42, 0x4f, 0x53, 0x53, 0x5f, 0x4d, 0x4f, 0x44, 0x49, 0x46, 0x59,
	0x5f, 0x42, 0x4f, 0x57, 0x4c, 0x10, 0x10, 0x42, 0xa6, 0x01, 0x0a, 0x10, 0x63, 0x6f, 0x6d, 0x2e,
	0x67, 0x61, 0x6d, 0x65, 0x73, 0x2e, 0x66, 0x61, 0x6e, 0x74, 0x61, 0x6e, 0x42, 0x0b, 0x52, 0x65,
	0x63, 0x6f, 0x72, 0x64, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x34, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f,
	0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x70, 0x62, 0x67, 0x6f, 0x2f, 0x67, 0x61, 0x6d, 0x65, 0x73, 0x2f, 0x66, 0x61, 0x6e, 0x74, 0x61,
	0x6e, 0xa2, 0x02, 0x03, 0x47, 0x46, 0x58, 0xaa, 0x02, 0x0c, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x2e,
	0x46, 0x61, 0x6e, 0x74, 0x61, 0x6e, 0xca, 0x02, 0x0c, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x5c, 0x46,
	0x61, 0x6e, 0x74, 0x61, 0x6e, 0xe2, 0x02, 0x18, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x5c, 0x46, 0x61,
	0x6e, 0x74, 0x61, 0x6e, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61,
	0xea, 0x02, 0x0d, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x3a, 0x3a, 0x46, 0x61, 0x6e, 0x74, 0x61, 0x6e,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_games_fantan_record_proto_rawDescOnce sync.Once
	file_games_fantan_record_proto_rawDescData = file_games_fantan_record_proto_rawDesc
)

func file_games_fantan_record_proto_rawDescGZIP() []byte {
	file_games_fantan_record_proto_rawDescOnce.Do(func() {
		file_games_fantan_record_proto_rawDescData = protoimpl.X.CompressGZIP(file_games_fantan_record_proto_rawDescData)
	})
	return file_games_fantan_record_proto_rawDescData
}

var file_games_fantan_record_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_games_fantan_record_proto_goTypes = []interface{}{
	(GameSubtype)(0), // 0: games.fantan.GameSubtype
	(Step)(0),        // 1: games.fantan.Step
}
var file_games_fantan_record_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_games_fantan_record_proto_init() }
func file_games_fantan_record_proto_init() {
	if File_games_fantan_record_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_games_fantan_record_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_games_fantan_record_proto_goTypes,
		DependencyIndexes: file_games_fantan_record_proto_depIdxs,
		EnumInfos:         file_games_fantan_record_proto_enumTypes,
	}.Build()
	File_games_fantan_record_proto = out.File
	file_games_fantan_record_proto_rawDesc = nil
	file_games_fantan_record_proto_goTypes = nil
	file_games_fantan_record_proto_depIdxs = nil
}
