// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.2
// 	protoc        (unknown)
// source: games/baccarat/record.proto

package baccarat

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
	GameSubtype_BACCARAT_TYPE_UNSPECIFIED GameSubtype = 0
	// 經典百家樂
	GameSubtype_BACCARAT_CLASSIC GameSubtype = 1
	// 傳統百家樂
	GameSubtype_BACCARAT_TRADITIONAL GameSubtype = 2
	// 極速百家樂
	GameSubtype_BACCARAT_SPEED GameSubtype = 3
	// 瞇牌百家樂
	GameSubtype_BACCARAT_PEEK GameSubtype = 8
	// 財神百家樂
	GameSubtype_BACCARAT_FORTUNE GameSubtype = 12
	// 區塊鏈百家樂
	GameSubtype_BACCARAT_BLOCKCHAIN GameSubtype = 16
	// 區塊鏈極速百家樂
	GameSubtype_BACCARAT_SPEED_BLOCKCHAIN GameSubtype = 18
	// 區塊鏈瞇牌百家樂
	GameSubtype_BACCARAT_PEEK_BLOCKCHAIN GameSubtype = 24
)

// Enum value maps for GameSubtype.
var (
	GameSubtype_name = map[int32]string{
		0:  "BACCARAT_TYPE_UNSPECIFIED",
		1:  "BACCARAT_CLASSIC",
		2:  "BACCARAT_TRADITIONAL",
		3:  "BACCARAT_SPEED",
		8:  "BACCARAT_PEEK",
		12: "BACCARAT_FORTUNE",
		16: "BACCARAT_BLOCKCHAIN",
		18: "BACCARAT_SPEED_BLOCKCHAIN",
		24: "BACCARAT_PEEK_BLOCKCHAIN",
	}
	GameSubtype_value = map[string]int32{
		"BACCARAT_TYPE_UNSPECIFIED": 0,
		"BACCARAT_CLASSIC":          1,
		"BACCARAT_TRADITIONAL":      2,
		"BACCARAT_SPEED":            3,
		"BACCARAT_PEEK":             8,
		"BACCARAT_FORTUNE":          12,
		"BACCARAT_BLOCKCHAIN":       16,
		"BACCARAT_SPEED_BLOCKCHAIN": 18,
		"BACCARAT_PEEK_BLOCKCHAIN":  24,
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
	return file_games_baccarat_record_proto_enumTypes[0].Descriptor()
}

func (GameSubtype) Type() protoreflect.EnumType {
	return &file_games_baccarat_record_proto_enumTypes[0]
}

func (x GameSubtype) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use GameSubtype.Descriptor instead.
func (GameSubtype) EnumDescriptor() ([]byte, []int) {
	return file_games_baccarat_record_proto_rawDescGZIP(), []int{0}
}

type ResourceType int32

const (
	// 未指定
	ResourceType_RESOURCE_TYPE_UNSPECIFIED ResourceType = 0
	// 例牌
	ResourceType_NORMAL ResourceType = 1
	// 非例牌
	ResourceType_EXTRA ResourceType = 2
)

// Enum value maps for ResourceType.
var (
	ResourceType_name = map[int32]string{
		0: "RESOURCE_TYPE_UNSPECIFIED",
		1: "NORMAL",
		2: "EXTRA",
	}
	ResourceType_value = map[string]int32{
		"RESOURCE_TYPE_UNSPECIFIED": 0,
		"NORMAL":                    1,
		"EXTRA":                     2,
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
	return file_games_baccarat_record_proto_enumTypes[1].Descriptor()
}

func (ResourceType) Type() protoreflect.EnumType {
	return &file_games_baccarat_record_proto_enumTypes[1]
}

func (x ResourceType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ResourceType.Descriptor instead.
func (ResourceType) EnumDescriptor() ([]byte, []int) {
	return file_games_baccarat_record_proto_rawDescGZIP(), []int{1}
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
	// 展示第一張牌
	Step_SHOW_FIRST_CARD Step = 3
	// 派發閒家例牌1
	Step_DEAL_PLAYER_1 Step = 4
	// 派發莊家例牌1
	Step_DEAL_BANKER_1 Step = 5
	// 派發閒家例牌2
	Step_DEAL_PLAYER_2 Step = 6
	// 派發莊家例牌2
	Step_DEAL_BANKER_2 Step = 7
	// 開放下注
	Step_ROUND_BET Step = 8
	// 停止下注
	Step_NO_MORE_BET Step = 9
	// 非瞇牌開例牌
	Step_SHOW_NORMAL Step = 11
	// 開 莊牌
	Step_SHOW_BANKER Step = 12
	// 開 閒牌
	Step_SHOW_PLAYER Step = 13
	// 瞇牌例牌
	Step_PEEK_NORMAL Step = 14
	// 瞇牌公布例牌
	Step_PEEK_SHOW_NORMAL Step = 15
	// 非瞇牌補閒家牌
	Step_DEAL_PLAYER_EXTRA Step = 16
	// 瞇牌閒家補牌
	Step_PEEK_DEAL_PLAYER_EXTRA Step = 17
	// 瞇牌公布閒家補牌
	Step_PEEK_SHOW_PLAYER_EXTRA Step = 18
	// 非瞇牌補莊家牌
	Step_DEAL_BANKER_EXTRA Step = 20
	// 瞇牌莊家補牌
	Step_PEEK_DEAL_BANKER_EXTRA Step = 21
	// 瞇牌公布莊家補牌
	Step_PEEK_SHOW_BANKER_EXTRA Step = 22
	Step_DEALER_CONFIRM         Step = 23
	// PITBOSS 修改派發例牌
	Step_PITBOSS_MODIFY_NORMAL Step = 24
	// PITBOSS 修改派發閒家補牌
	Step_PITBOSS_MODIFY_PLAYER_EXTRA Step = 25
	// PITBOSS 修改派發莊家補牌
	Step_PITBOSS_MODIFY_BANKER_EXTRA Step = 26
)

// Enum value maps for Step.
var (
	Step_name = map[int32]string{
		0:  "STEP_UNSPECIFIED",
		1:  "ROUND_START",
		2:  "ROUND_FINISHED",
		3:  "SHOW_FIRST_CARD",
		4:  "DEAL_PLAYER_1",
		5:  "DEAL_BANKER_1",
		6:  "DEAL_PLAYER_2",
		7:  "DEAL_BANKER_2",
		8:  "ROUND_BET",
		9:  "NO_MORE_BET",
		11: "SHOW_NORMAL",
		12: "SHOW_BANKER",
		13: "SHOW_PLAYER",
		14: "PEEK_NORMAL",
		15: "PEEK_SHOW_NORMAL",
		16: "DEAL_PLAYER_EXTRA",
		17: "PEEK_DEAL_PLAYER_EXTRA",
		18: "PEEK_SHOW_PLAYER_EXTRA",
		20: "DEAL_BANKER_EXTRA",
		21: "PEEK_DEAL_BANKER_EXTRA",
		22: "PEEK_SHOW_BANKER_EXTRA",
		23: "DEALER_CONFIRM",
		24: "PITBOSS_MODIFY_NORMAL",
		25: "PITBOSS_MODIFY_PLAYER_EXTRA",
		26: "PITBOSS_MODIFY_BANKER_EXTRA",
	}
	Step_value = map[string]int32{
		"STEP_UNSPECIFIED":            0,
		"ROUND_START":                 1,
		"ROUND_FINISHED":              2,
		"SHOW_FIRST_CARD":             3,
		"DEAL_PLAYER_1":               4,
		"DEAL_BANKER_1":               5,
		"DEAL_PLAYER_2":               6,
		"DEAL_BANKER_2":               7,
		"ROUND_BET":                   8,
		"NO_MORE_BET":                 9,
		"SHOW_NORMAL":                 11,
		"SHOW_BANKER":                 12,
		"SHOW_PLAYER":                 13,
		"PEEK_NORMAL":                 14,
		"PEEK_SHOW_NORMAL":            15,
		"DEAL_PLAYER_EXTRA":           16,
		"PEEK_DEAL_PLAYER_EXTRA":      17,
		"PEEK_SHOW_PLAYER_EXTRA":      18,
		"DEAL_BANKER_EXTRA":           20,
		"PEEK_DEAL_BANKER_EXTRA":      21,
		"PEEK_SHOW_BANKER_EXTRA":      22,
		"DEALER_CONFIRM":              23,
		"PITBOSS_MODIFY_NORMAL":       24,
		"PITBOSS_MODIFY_PLAYER_EXTRA": 25,
		"PITBOSS_MODIFY_BANKER_EXTRA": 26,
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
	return file_games_baccarat_record_proto_enumTypes[2].Descriptor()
}

func (Step) Type() protoreflect.EnumType {
	return &file_games_baccarat_record_proto_enumTypes[2]
}

func (x Step) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Step.Descriptor instead.
func (Step) EnumDescriptor() ([]byte, []int) {
	return file_games_baccarat_record_proto_rawDescGZIP(), []int{2}
}

// 座位功能代碼
type GameSeat int32

const (
	// 未指定
	GameSeat_SEAT_UNSPECIFIED GameSeat = 0
	// 閒家
	GameSeat_PLAYER GameSeat = 2
	// 莊家
	GameSeat_BANKER GameSeat = 3
)

// Enum value maps for GameSeat.
var (
	GameSeat_name = map[int32]string{
		0: "SEAT_UNSPECIFIED",
		2: "PLAYER",
		3: "BANKER",
	}
	GameSeat_value = map[string]int32{
		"SEAT_UNSPECIFIED": 0,
		"PLAYER":           2,
		"BANKER":           3,
	}
)

func (x GameSeat) Enum() *GameSeat {
	p := new(GameSeat)
	*p = x
	return p
}

func (x GameSeat) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (GameSeat) Descriptor() protoreflect.EnumDescriptor {
	return file_games_baccarat_record_proto_enumTypes[3].Descriptor()
}

func (GameSeat) Type() protoreflect.EnumType {
	return &file_games_baccarat_record_proto_enumTypes[3]
}

func (x GameSeat) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use GameSeat.Descriptor instead.
func (GameSeat) EnumDescriptor() ([]byte, []int) {
	return file_games_baccarat_record_proto_rawDescGZIP(), []int{3}
}

var File_games_baccarat_record_proto protoreflect.FileDescriptor

var file_games_baccarat_record_proto_rawDesc = []byte{
	0x0a, 0x1b, 0x67, 0x61, 0x6d, 0x65, 0x73, 0x2f, 0x62, 0x61, 0x63, 0x63, 0x61, 0x72, 0x61, 0x74,
	0x2f, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e, 0x67,
	0x61, 0x6d, 0x65, 0x73, 0x2e, 0x62, 0x61, 0x63, 0x63, 0x61, 0x72, 0x61, 0x74, 0x2a, 0xef, 0x01,
	0x0a, 0x0b, 0x47, 0x61, 0x6d, 0x65, 0x53, 0x75, 0x62, 0x74, 0x79, 0x70, 0x65, 0x12, 0x1d, 0x0a,
	0x19, 0x42, 0x41, 0x43, 0x43, 0x41, 0x52, 0x41, 0x54, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x55,
	0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x14, 0x0a, 0x10,
	0x42, 0x41, 0x43, 0x43, 0x41, 0x52, 0x41, 0x54, 0x5f, 0x43, 0x4c, 0x41, 0x53, 0x53, 0x49, 0x43,
	0x10, 0x01, 0x12, 0x18, 0x0a, 0x14, 0x42, 0x41, 0x43, 0x43, 0x41, 0x52, 0x41, 0x54, 0x5f, 0x54,
	0x52, 0x41, 0x44, 0x49, 0x54, 0x49, 0x4f, 0x4e, 0x41, 0x4c, 0x10, 0x02, 0x12, 0x12, 0x0a, 0x0e,
	0x42, 0x41, 0x43, 0x43, 0x41, 0x52, 0x41, 0x54, 0x5f, 0x53, 0x50, 0x45, 0x45, 0x44, 0x10, 0x03,
	0x12, 0x11, 0x0a, 0x0d, 0x42, 0x41, 0x43, 0x43, 0x41, 0x52, 0x41, 0x54, 0x5f, 0x50, 0x45, 0x45,
	0x4b, 0x10, 0x08, 0x12, 0x14, 0x0a, 0x10, 0x42, 0x41, 0x43, 0x43, 0x41, 0x52, 0x41, 0x54, 0x5f,
	0x46, 0x4f, 0x52, 0x54, 0x55, 0x4e, 0x45, 0x10, 0x0c, 0x12, 0x17, 0x0a, 0x13, 0x42, 0x41, 0x43,
	0x43, 0x41, 0x52, 0x41, 0x54, 0x5f, 0x42, 0x4c, 0x4f, 0x43, 0x4b, 0x43, 0x48, 0x41, 0x49, 0x4e,
	0x10, 0x10, 0x12, 0x1d, 0x0a, 0x19, 0x42, 0x41, 0x43, 0x43, 0x41, 0x52, 0x41, 0x54, 0x5f, 0x53,
	0x50, 0x45, 0x45, 0x44, 0x5f, 0x42, 0x4c, 0x4f, 0x43, 0x4b, 0x43, 0x48, 0x41, 0x49, 0x4e, 0x10,
	0x12, 0x12, 0x1c, 0x0a, 0x18, 0x42, 0x41, 0x43, 0x43, 0x41, 0x52, 0x41, 0x54, 0x5f, 0x50, 0x45,
	0x45, 0x4b, 0x5f, 0x42, 0x4c, 0x4f, 0x43, 0x4b, 0x43, 0x48, 0x41, 0x49, 0x4e, 0x10, 0x18, 0x2a,
	0x44, 0x0a, 0x0c, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x12,
	0x1d, 0x0a, 0x19, 0x52, 0x45, 0x53, 0x4f, 0x55, 0x52, 0x43, 0x45, 0x5f, 0x54, 0x59, 0x50, 0x45,
	0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0a,
	0x0a, 0x06, 0x4e, 0x4f, 0x52, 0x4d, 0x41, 0x4c, 0x10, 0x01, 0x12, 0x09, 0x0a, 0x05, 0x45, 0x58,
	0x54, 0x52, 0x41, 0x10, 0x02, 0x2a, 0xab, 0x04, 0x0a, 0x04, 0x53, 0x74, 0x65, 0x70, 0x12, 0x14,
	0x0a, 0x10, 0x53, 0x54, 0x45, 0x50, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49,
	0x45, 0x44, 0x10, 0x00, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4e, 0x44, 0x5f, 0x53, 0x54,
	0x41, 0x52, 0x54, 0x10, 0x01, 0x12, 0x12, 0x0a, 0x0e, 0x52, 0x4f, 0x55, 0x4e, 0x44, 0x5f, 0x46,
	0x49, 0x4e, 0x49, 0x53, 0x48, 0x45, 0x44, 0x10, 0x02, 0x12, 0x13, 0x0a, 0x0f, 0x53, 0x48, 0x4f,
	0x57, 0x5f, 0x46, 0x49, 0x52, 0x53, 0x54, 0x5f, 0x43, 0x41, 0x52, 0x44, 0x10, 0x03, 0x12, 0x11,
	0x0a, 0x0d, 0x44, 0x45, 0x41, 0x4c, 0x5f, 0x50, 0x4c, 0x41, 0x59, 0x45, 0x52, 0x5f, 0x31, 0x10,
	0x04, 0x12, 0x11, 0x0a, 0x0d, 0x44, 0x45, 0x41, 0x4c, 0x5f, 0x42, 0x41, 0x4e, 0x4b, 0x45, 0x52,
	0x5f, 0x31, 0x10, 0x05, 0x12, 0x11, 0x0a, 0x0d, 0x44, 0x45, 0x41, 0x4c, 0x5f, 0x50, 0x4c, 0x41,
	0x59, 0x45, 0x52, 0x5f, 0x32, 0x10, 0x06, 0x12, 0x11, 0x0a, 0x0d, 0x44, 0x45, 0x41, 0x4c, 0x5f,
	0x42, 0x41, 0x4e, 0x4b, 0x45, 0x52, 0x5f, 0x32, 0x10, 0x07, 0x12, 0x0d, 0x0a, 0x09, 0x52, 0x4f,
	0x55, 0x4e, 0x44, 0x5f, 0x42, 0x45, 0x54, 0x10, 0x08, 0x12, 0x0f, 0x0a, 0x0b, 0x4e, 0x4f, 0x5f,
	0x4d, 0x4f, 0x52, 0x45, 0x5f, 0x42, 0x45, 0x54, 0x10, 0x09, 0x12, 0x0f, 0x0a, 0x0b, 0x53, 0x48,
	0x4f, 0x57, 0x5f, 0x4e, 0x4f, 0x52, 0x4d, 0x41, 0x4c, 0x10, 0x0b, 0x12, 0x0f, 0x0a, 0x0b, 0x53,
	0x48, 0x4f, 0x57, 0x5f, 0x42, 0x41, 0x4e, 0x4b, 0x45, 0x52, 0x10, 0x0c, 0x12, 0x0f, 0x0a, 0x0b,
	0x53, 0x48, 0x4f, 0x57, 0x5f, 0x50, 0x4c, 0x41, 0x59, 0x45, 0x52, 0x10, 0x0d, 0x12, 0x0f, 0x0a,
	0x0b, 0x50, 0x45, 0x45, 0x4b, 0x5f, 0x4e, 0x4f, 0x52, 0x4d, 0x41, 0x4c, 0x10, 0x0e, 0x12, 0x14,
	0x0a, 0x10, 0x50, 0x45, 0x45, 0x4b, 0x5f, 0x53, 0x48, 0x4f, 0x57, 0x5f, 0x4e, 0x4f, 0x52, 0x4d,
	0x41, 0x4c, 0x10, 0x0f, 0x12, 0x15, 0x0a, 0x11, 0x44, 0x45, 0x41, 0x4c, 0x5f, 0x50, 0x4c, 0x41,
	0x59, 0x45, 0x52, 0x5f, 0x45, 0x58, 0x54, 0x52, 0x41, 0x10, 0x10, 0x12, 0x1a, 0x0a, 0x16, 0x50,
	0x45, 0x45, 0x4b, 0x5f, 0x44, 0x45, 0x41, 0x4c, 0x5f, 0x50, 0x4c, 0x41, 0x59, 0x45, 0x52, 0x5f,
	0x45, 0x58, 0x54, 0x52, 0x41, 0x10, 0x11, 0x12, 0x1a, 0x0a, 0x16, 0x50, 0x45, 0x45, 0x4b, 0x5f,
	0x53, 0x48, 0x4f, 0x57, 0x5f, 0x50, 0x4c, 0x41, 0x59, 0x45, 0x52, 0x5f, 0x45, 0x58, 0x54, 0x52,
	0x41, 0x10, 0x12, 0x12, 0x15, 0x0a, 0x11, 0x44, 0x45, 0x41, 0x4c, 0x5f, 0x42, 0x41, 0x4e, 0x4b,
	0x45, 0x52, 0x5f, 0x45, 0x58, 0x54, 0x52, 0x41, 0x10, 0x14, 0x12, 0x1a, 0x0a, 0x16, 0x50, 0x45,
	0x45, 0x4b, 0x5f, 0x44, 0x45, 0x41, 0x4c, 0x5f, 0x42, 0x41, 0x4e, 0x4b, 0x45, 0x52, 0x5f, 0x45,
	0x58, 0x54, 0x52, 0x41, 0x10, 0x15, 0x12, 0x1a, 0x0a, 0x16, 0x50, 0x45, 0x45, 0x4b, 0x5f, 0x53,
	0x48, 0x4f, 0x57, 0x5f, 0x42, 0x41, 0x4e, 0x4b, 0x45, 0x52, 0x5f, 0x45, 0x58, 0x54, 0x52, 0x41,
	0x10, 0x16, 0x12, 0x12, 0x0a, 0x0e, 0x44, 0x45, 0x41, 0x4c, 0x45, 0x52, 0x5f, 0x43, 0x4f, 0x4e,
	0x46, 0x49, 0x52, 0x4d, 0x10, 0x17, 0x12, 0x19, 0x0a, 0x15, 0x50, 0x49, 0x54, 0x42, 0x4f, 0x53,
	0x53, 0x5f, 0x4d, 0x4f, 0x44, 0x49, 0x46, 0x59, 0x5f, 0x4e, 0x4f, 0x52, 0x4d, 0x41, 0x4c, 0x10,
	0x18, 0x12, 0x1f, 0x0a, 0x1b, 0x50, 0x49, 0x54, 0x42, 0x4f, 0x53, 0x53, 0x5f, 0x4d, 0x4f, 0x44,
	0x49, 0x46, 0x59, 0x5f, 0x50, 0x4c, 0x41, 0x59, 0x45, 0x52, 0x5f, 0x45, 0x58, 0x54, 0x52, 0x41,
	0x10, 0x19, 0x12, 0x1f, 0x0a, 0x1b, 0x50, 0x49, 0x54, 0x42, 0x4f, 0x53, 0x53, 0x5f, 0x4d, 0x4f,
	0x44, 0x49, 0x46, 0x59, 0x5f, 0x42, 0x41, 0x4e, 0x4b, 0x45, 0x52, 0x5f, 0x45, 0x58, 0x54, 0x52,
	0x41, 0x10, 0x1a, 0x2a, 0x38, 0x0a, 0x08, 0x47, 0x61, 0x6d, 0x65, 0x53, 0x65, 0x61, 0x74, 0x12,
	0x14, 0x0a, 0x10, 0x53, 0x45, 0x41, 0x54, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46,
	0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0a, 0x0a, 0x06, 0x50, 0x4c, 0x41, 0x59, 0x45, 0x52, 0x10,
	0x02, 0x12, 0x0a, 0x0a, 0x06, 0x42, 0x41, 0x4e, 0x4b, 0x45, 0x52, 0x10, 0x03, 0x42, 0xc1, 0x01,
	0x0a, 0x21, 0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x67, 0x61, 0x6d, 0x65, 0x73, 0x2e, 0x62, 0x61, 0x63, 0x63, 0x61,
	0x72, 0x61, 0x74, 0x42, 0x0b, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77,
	0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f,
	0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x62, 0x67, 0x6f, 0x2f, 0x67, 0x61, 0x6d, 0x65,
	0x73, 0x2f, 0x62, 0x61, 0x63, 0x63, 0x61, 0x72, 0x61, 0x74, 0xa2, 0x02, 0x03, 0x47, 0x42, 0x58,
	0xaa, 0x02, 0x0e, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x2e, 0x42, 0x61, 0x63, 0x63, 0x61, 0x72, 0x61,
	0x74, 0xca, 0x02, 0x0e, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x5c, 0x42, 0x61, 0x63, 0x63, 0x61, 0x72,
	0x61, 0x74, 0xe2, 0x02, 0x1a, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x5c, 0x42, 0x61, 0x63, 0x63, 0x61,
	0x72, 0x61, 0x74, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea,
	0x02, 0x0f, 0x47, 0x61, 0x6d, 0x65, 0x73, 0x3a, 0x3a, 0x42, 0x61, 0x63, 0x63, 0x61, 0x72, 0x61,
	0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_games_baccarat_record_proto_rawDescOnce sync.Once
	file_games_baccarat_record_proto_rawDescData = file_games_baccarat_record_proto_rawDesc
)

func file_games_baccarat_record_proto_rawDescGZIP() []byte {
	file_games_baccarat_record_proto_rawDescOnce.Do(func() {
		file_games_baccarat_record_proto_rawDescData = protoimpl.X.CompressGZIP(file_games_baccarat_record_proto_rawDescData)
	})
	return file_games_baccarat_record_proto_rawDescData
}

var file_games_baccarat_record_proto_enumTypes = make([]protoimpl.EnumInfo, 4)
var file_games_baccarat_record_proto_goTypes = []any{
	(GameSubtype)(0),  // 0: games.baccarat.GameSubtype
	(ResourceType)(0), // 1: games.baccarat.ResourceType
	(Step)(0),         // 2: games.baccarat.Step
	(GameSeat)(0),     // 3: games.baccarat.GameSeat
}
var file_games_baccarat_record_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_games_baccarat_record_proto_init() }
func file_games_baccarat_record_proto_init() {
	if File_games_baccarat_record_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_games_baccarat_record_proto_rawDesc,
			NumEnums:      4,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_games_baccarat_record_proto_goTypes,
		DependencyIndexes: file_games_baccarat_record_proto_depIdxs,
		EnumInfos:         file_games_baccarat_record_proto_enumTypes,
	}.Build()
	File_games_baccarat_record_proto = out.File
	file_games_baccarat_record_proto_rawDesc = nil
	file_games_baccarat_record_proto_goTypes = nil
	file_games_baccarat_record_proto_depIdxs = nil
}
