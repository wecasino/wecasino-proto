// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.2
// 	protoc        (unknown)
// source: games/games.proto

package games

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

// GameType
// 遊戲類型
type GameType int32

const (
	// 未指定
	GameType_GAME_TYPE_UNSPECIFIED GameType = 0
	// 百家樂
	GameType_BACCARAT GameType = 16
	// 龍虎鬥
	GameType_THEBIGBATTLE GameType = 17
	// 炸金花
	GameType_THREECARDS GameType = 18
	// 牛牛
	GameType_BULLFIGHT GameType = 19
	// 番攤
	GameType_FANTAN GameType = 20
	// 骰寶
	GameType_SICBO GameType = 32
	// 色彩遊戲
	GameType_COLORGAME GameType = 33
	// 丟球遊戲
	GameType_DROPBALL GameType = 34
	// 輪盤
	GameType_ROULETTE GameType = 36
	// 幸運輪
	GameType_LUCKYWHEEL GameType = 40
)

// Enum value maps for GameType.
var (
	GameType_name = map[int32]string{
		0:  "GAME_TYPE_UNSPECIFIED",
		16: "BACCARAT",
		17: "THEBIGBATTLE",
		18: "THREECARDS",
		19: "BULLFIGHT",
		20: "FANTAN",
		32: "SICBO",
		33: "COLORGAME",
		34: "DROPBALL",
		36: "ROULETTE",
		40: "LUCKYWHEEL",
	}
	GameType_value = map[string]int32{
		"GAME_TYPE_UNSPECIFIED": 0,
		"BACCARAT":              16,
		"THEBIGBATTLE":          17,
		"THREECARDS":            18,
		"BULLFIGHT":             19,
		"FANTAN":                20,
		"SICBO":                 32,
		"COLORGAME":             33,
		"DROPBALL":              34,
		"ROULETTE":              36,
		"LUCKYWHEEL":            40,
	}
)

func (x GameType) Enum() *GameType {
	p := new(GameType)
	*p = x
	return p
}

func (x GameType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (GameType) Descriptor() protoreflect.EnumDescriptor {
	return file_games_games_proto_enumTypes[0].Descriptor()
}

func (GameType) Type() protoreflect.EnumType {
	return &file_games_games_proto_enumTypes[0]
}

func (x GameType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use GameType.Descriptor instead.
func (GameType) EnumDescriptor() ([]byte, []int) {
	return file_games_games_proto_rawDescGZIP(), []int{0}
}

type FlowSeat int32

const (
	// 未指定
	FlowSeat_SEAT_UNSPECIFIED FlowSeat = 0
	// Dealer
	FlowSeat_DEALER FlowSeat = 64
	// 上一位 Dealer
	FlowSeat_PREVIOUS_DEALER FlowSeat = 65
	// Pitboss
	FlowSeat_PITBOSS FlowSeat = 66
	// 上一位 PITBOSS
	FlowSeat_PREVIOUS_PITBOSS FlowSeat = 67
	// 玩家
	FlowSeat_PLAYER FlowSeat = 68
	// 莊家
	FlowSeat_BANKER FlowSeat = 69
	// 左方
	FlowSeat_LEFT FlowSeat = 70
	// 右方
	FlowSeat_RIGHT FlowSeat = 71
	// 流程控制牌
	FlowSeat_CONTROL FlowSeat = 96
	// 玩家指示
	FlowSeat_Instructions FlowSeat = 99
)

// Enum value maps for FlowSeat.
var (
	FlowSeat_name = map[int32]string{
		0:  "SEAT_UNSPECIFIED",
		64: "DEALER",
		65: "PREVIOUS_DEALER",
		66: "PITBOSS",
		67: "PREVIOUS_PITBOSS",
		68: "PLAYER",
		69: "BANKER",
		70: "LEFT",
		71: "RIGHT",
		96: "CONTROL",
		99: "Instructions",
	}
	FlowSeat_value = map[string]int32{
		"SEAT_UNSPECIFIED": 0,
		"DEALER":           64,
		"PREVIOUS_DEALER":  65,
		"PITBOSS":          66,
		"PREVIOUS_PITBOSS": 67,
		"PLAYER":           68,
		"BANKER":           69,
		"LEFT":             70,
		"RIGHT":            71,
		"CONTROL":          96,
		"Instructions":     99,
	}
)

func (x FlowSeat) Enum() *FlowSeat {
	p := new(FlowSeat)
	*p = x
	return p
}

func (x FlowSeat) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (FlowSeat) Descriptor() protoreflect.EnumDescriptor {
	return file_games_games_proto_enumTypes[1].Descriptor()
}

func (FlowSeat) Type() protoreflect.EnumType {
	return &file_games_games_proto_enumTypes[1]
}

func (x FlowSeat) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use FlowSeat.Descriptor instead.
func (FlowSeat) EnumDescriptor() ([]byte, []int) {
	return file_games_games_proto_rawDescGZIP(), []int{1}
}

type ResourceType int32

const (
	// 未指定
	ResourceType_RESOURCE_TYPE_UNSPECIFIED ResourceType = 0
	// 牌靴
	ResourceType_SHOE ResourceType = 64
	// 手牌
	ResourceType_HAND ResourceType = 65
	// 場上
	ResourceType_FIELD ResourceType = 66
	// 第一張牌
	ResourceType_FIRST_CARD ResourceType = 67
	// 切牌
	ResourceType_SHOE_CUT ResourceType = 68
	// 棄牌
	ResourceType_DISCARD ResourceType = 69
)

// Enum value maps for ResourceType.
var (
	ResourceType_name = map[int32]string{
		0:  "RESOURCE_TYPE_UNSPECIFIED",
		64: "SHOE",
		65: "HAND",
		66: "FIELD",
		67: "FIRST_CARD",
		68: "SHOE_CUT",
		69: "DISCARD",
	}
	ResourceType_value = map[string]int32{
		"RESOURCE_TYPE_UNSPECIFIED": 0,
		"SHOE":                      64,
		"HAND":                      65,
		"FIELD":                     66,
		"FIRST_CARD":                67,
		"SHOE_CUT":                  68,
		"DISCARD":                   69,
	}
)

func (x ResourceType) Enum() *ResourceType {
	p := new(ResourceType)
	*p = x
	return p
}

func (x ResourceType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ResourceType) Descriptor() protoreflect.EnumDescriptor {
	return file_games_games_proto_enumTypes[2].Descriptor()
}

func (ResourceType) Type() protoreflect.EnumType {
	return &file_games_games_proto_enumTypes[2]
}

func (x ResourceType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ResourceType.Descriptor instead.
func (ResourceType) EnumDescriptor() ([]byte, []int) {
	return file_games_games_proto_rawDescGZIP(), []int{2}
}

// WinType
// 遊戲輸贏類型
type WinType int32

const (
	// 未指定
	WinType_WIN_TYPE_UNSPECIFIED WinType = 0
	// 輸
	WinType_LOSE WinType = 1
	// 贏
	WinType_WIN WinType = 2
	// 和
	WinType_TIE WinType = 3
)

// Enum value maps for WinType.
var (
	WinType_name = map[int32]string{
		0: "WIN_TYPE_UNSPECIFIED",
		1: "LOSE",
		2: "WIN",
		3: "TIE",
	}
	WinType_value = map[string]int32{
		"WIN_TYPE_UNSPECIFIED": 0,
		"LOSE":                 1,
		"WIN":                  2,
		"TIE":                  3,
	}
)

func (x WinType) Enum() *WinType {
	p := new(WinType)
	*p = x
	return p
}

func (x WinType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (WinType) Descriptor() protoreflect.EnumDescriptor {
	return file_games_games_proto_enumTypes[3].Descriptor()
}

func (WinType) Type() protoreflect.EnumType {
	return &file_games_games_proto_enumTypes[3]
}

func (x WinType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use WinType.Descriptor instead.
func (WinType) EnumDescriptor() ([]byte, []int) {
	return file_games_games_proto_rawDescGZIP(), []int{3}
}

var File_games_games_proto protoreflect.FileDescriptor

var file_games_games_proto_rawDesc = []byte{
	0x0a, 0x11, 0x67, 0x61, 0x6d, 0x65, 0x73, 0x2f, 0x67, 0x61, 0x6d, 0x65, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x05, 0x67, 0x61, 0x6d, 0x65, 0x73, 0x2a, 0xb6, 0x01, 0x0a, 0x08, 0x47,
	0x61, 0x6d, 0x65, 0x54, 0x79, 0x70, 0x65, 0x12, 0x19, 0x0a, 0x15, 0x47, 0x41, 0x4d, 0x45, 0x5f,
	0x54, 0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44,
	0x10, 0x00, 0x12, 0x0c, 0x0a, 0x08, 0x42, 0x41, 0x43, 0x43, 0x41, 0x52, 0x41, 0x54, 0x10, 0x10,
	0x12, 0x10, 0x0a, 0x0c, 0x54, 0x48, 0x45, 0x42, 0x49, 0x47, 0x42, 0x41, 0x54, 0x54, 0x4c, 0x45,
	0x10, 0x11, 0x12, 0x0e, 0x0a, 0x0a, 0x54, 0x48, 0x52, 0x45, 0x45, 0x43, 0x41, 0x52, 0x44, 0x53,
	0x10, 0x12, 0x12, 0x0d, 0x0a, 0x09, 0x42, 0x55, 0x4c, 0x4c, 0x46, 0x49, 0x47, 0x48, 0x54, 0x10,
	0x13, 0x12, 0x0a, 0x0a, 0x06, 0x46, 0x41, 0x4e, 0x54, 0x41, 0x4e, 0x10, 0x14, 0x12, 0x09, 0x0a,
	0x05, 0x53, 0x49, 0x43, 0x42, 0x4f, 0x10, 0x20, 0x12, 0x0d, 0x0a, 0x09, 0x43, 0x4f, 0x4c, 0x4f,
	0x52, 0x47, 0x41, 0x4d, 0x45, 0x10, 0x21, 0x12, 0x0c, 0x0a, 0x08, 0x44, 0x52, 0x4f, 0x50, 0x42,
	0x41, 0x4c, 0x4c, 0x10, 0x22, 0x12, 0x0c, 0x0a, 0x08, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54,
	0x45, 0x10, 0x24, 0x12, 0x0e, 0x0a, 0x0a, 0x4c, 0x55, 0x43, 0x4b, 0x59, 0x57, 0x48, 0x45, 0x45,
	0x4c, 0x10, 0x28, 0x2a, 0xb0, 0x01, 0x0a, 0x08, 0x46, 0x6c, 0x6f, 0x77, 0x53, 0x65, 0x61, 0x74,
	0x12, 0x14, 0x0a, 0x10, 0x53, 0x45, 0x41, 0x54, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49,
	0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0a, 0x0a, 0x06, 0x44, 0x45, 0x41, 0x4c, 0x45, 0x52,
	0x10, 0x40, 0x12, 0x13, 0x0a, 0x0f, 0x50, 0x52, 0x45, 0x56, 0x49, 0x4f, 0x55, 0x53, 0x5f, 0x44,
	0x45, 0x41, 0x4c, 0x45, 0x52, 0x10, 0x41, 0x12, 0x0b, 0x0a, 0x07, 0x50, 0x49, 0x54, 0x42, 0x4f,
	0x53, 0x53, 0x10, 0x42, 0x12, 0x14, 0x0a, 0x10, 0x50, 0x52, 0x45, 0x56, 0x49, 0x4f, 0x55, 0x53,
	0x5f, 0x50, 0x49, 0x54, 0x42, 0x4f, 0x53, 0x53, 0x10, 0x43, 0x12, 0x0a, 0x0a, 0x06, 0x50, 0x4c,
	0x41, 0x59, 0x45, 0x52, 0x10, 0x44, 0x12, 0x0a, 0x0a, 0x06, 0x42, 0x41, 0x4e, 0x4b, 0x45, 0x52,
	0x10, 0x45, 0x12, 0x08, 0x0a, 0x04, 0x4c, 0x45, 0x46, 0x54, 0x10, 0x46, 0x12, 0x09, 0x0a, 0x05,
	0x52, 0x49, 0x47, 0x48, 0x54, 0x10, 0x47, 0x12, 0x0b, 0x0a, 0x07, 0x43, 0x4f, 0x4e, 0x54, 0x52,
	0x4f, 0x4c, 0x10, 0x60, 0x12, 0x10, 0x0a, 0x0c, 0x49, 0x6e, 0x73, 0x74, 0x72, 0x75, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x10, 0x63, 0x2a, 0x77, 0x0a, 0x0c, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1d, 0x0a, 0x19, 0x52, 0x45, 0x53, 0x4f, 0x55, 0x52,
	0x43, 0x45, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46,
	0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x08, 0x0a, 0x04, 0x53, 0x48, 0x4f, 0x45, 0x10, 0x40, 0x12,
	0x08, 0x0a, 0x04, 0x48, 0x41, 0x4e, 0x44, 0x10, 0x41, 0x12, 0x09, 0x0a, 0x05, 0x46, 0x49, 0x45,
	0x4c, 0x44, 0x10, 0x42, 0x12, 0x0e, 0x0a, 0x0a, 0x46, 0x49, 0x52, 0x53, 0x54, 0x5f, 0x43, 0x41,
	0x52, 0x44, 0x10, 0x43, 0x12, 0x0c, 0x0a, 0x08, 0x53, 0x48, 0x4f, 0x45, 0x5f, 0x43, 0x55, 0x54,
	0x10, 0x44, 0x12, 0x0b, 0x0a, 0x07, 0x44, 0x49, 0x53, 0x43, 0x41, 0x52, 0x44, 0x10, 0x45, 0x2a,
	0x3f, 0x0a, 0x07, 0x57, 0x69, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x12, 0x18, 0x0a, 0x14, 0x57, 0x49,
	0x4e, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49,
	0x45, 0x44, 0x10, 0x00, 0x12, 0x08, 0x0a, 0x04, 0x4c, 0x4f, 0x53, 0x45, 0x10, 0x01, 0x12, 0x07,
	0x0a, 0x03, 0x57, 0x49, 0x4e, 0x10, 0x02, 0x12, 0x07, 0x0a, 0x03, 0x54, 0x49, 0x45, 0x10, 0x03,
	0x42, 0x89, 0x01, 0x0a, 0x18, 0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e,
	0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x67, 0x61, 0x6d, 0x65, 0x73, 0x42, 0x0a, 0x47,
	0x61, 0x6d, 0x65, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2d, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f,
	0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x70, 0x62, 0x67, 0x6f, 0x2f, 0x67, 0x61, 0x6d, 0x65, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x58, 0x58,
	0xaa, 0x02, 0x05, 0x47, 0x61, 0x6d, 0x65, 0x73, 0xca, 0x02, 0x05, 0x47, 0x61, 0x6d, 0x65, 0x73,
	0xe2, 0x02, 0x11, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61,
	0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x05, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_games_games_proto_rawDescOnce sync.Once
	file_games_games_proto_rawDescData = file_games_games_proto_rawDesc
)

func file_games_games_proto_rawDescGZIP() []byte {
	file_games_games_proto_rawDescOnce.Do(func() {
		file_games_games_proto_rawDescData = protoimpl.X.CompressGZIP(file_games_games_proto_rawDescData)
	})
	return file_games_games_proto_rawDescData
}

var file_games_games_proto_enumTypes = make([]protoimpl.EnumInfo, 4)
var file_games_games_proto_goTypes = []any{
	(GameType)(0),     // 0: games.GameType
	(FlowSeat)(0),     // 1: games.FlowSeat
	(ResourceType)(0), // 2: games.ResourceType
	(WinType)(0),      // 3: games.WinType
}
var file_games_games_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_games_games_proto_init() }
func file_games_games_proto_init() {
	if File_games_games_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_games_games_proto_rawDesc,
			NumEnums:      4,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_games_games_proto_goTypes,
		DependencyIndexes: file_games_games_proto_depIdxs,
		EnumInfos:         file_games_games_proto_enumTypes,
	}.Build()
	File_games_games_proto = out.File
	file_games_games_proto_rawDesc = nil
	file_games_games_proto_goTypes = nil
	file_games_games_proto_depIdxs = nil
}
