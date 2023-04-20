// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.30.0
// 	protoc        (unknown)
// source: fantan/recorder.proto

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

// 使用卡牌種類
type CardType int32

const (
	// 未指定
	CardType_CARD_TYPE_UNSPECIFIED CardType = 0
	// 類骰子類型
	CardType_CARD_TYPE_INT CardType = 1
)

// Enum value maps for CardType.
var (
	CardType_name = map[int32]string{
		0: "CARD_TYPE_UNSPECIFIED",
		1: "CARD_TYPE_INT",
	}
	CardType_value = map[string]int32{
		"CARD_TYPE_UNSPECIFIED": 0,
		"CARD_TYPE_INT":         1,
	}
)

func (x CardType) Enum() *CardType {
	p := new(CardType)
	*p = x
	return p
}

func (x CardType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (CardType) Descriptor() protoreflect.EnumDescriptor {
	return file_fantan_recorder_proto_enumTypes[0].Descriptor()
}

func (CardType) Type() protoreflect.EnumType {
	return &file_fantan_recorder_proto_enumTypes[0]
}

func (x CardType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use CardType.Descriptor instead.
func (CardType) EnumDescriptor() ([]byte, []int) {
	return file_fantan_recorder_proto_rawDescGZIP(), []int{0}
}

type ResourceType int32

const (
	// 未指定
	ResourceType_RESOURCE_TYPE_UNSPECIFIED ResourceType = 0
	// 碗公
	ResourceType_BOWL ResourceType = 1
)

// Enum value maps for ResourceType.
var (
	ResourceType_name = map[int32]string{
		0: "RESOURCE_TYPE_UNSPECIFIED",
		1: "BOWL",
	}
	ResourceType_value = map[string]int32{
		"RESOURCE_TYPE_UNSPECIFIED": 0,
		"BOWL":                      1,
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
	return file_fantan_recorder_proto_enumTypes[1].Descriptor()
}

func (ResourceType) Type() protoreflect.EnumType {
	return &file_fantan_recorder_proto_enumTypes[1]
}

func (x ResourceType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ResourceType.Descriptor instead.
func (ResourceType) EnumDescriptor() ([]byte, []int) {
	return file_fantan_recorder_proto_rawDescGZIP(), []int{1}
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
	Step_OPEN_FOR_BETTING Step = 4
	// 停止下注
	Step_CLOSE_THE_BETTING Step = 5
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
		4:  "OPEN_FOR_BETTING",
		5:  "CLOSE_THE_BETTING",
		8:  "GRAB_DICE_AMOUNT",
		16: "PITBOSS_MODIFY_BOWL",
	}
	Step_value = map[string]int32{
		"STEP_UNSPECIFIED":    0,
		"ROUND_START":         1,
		"ROUND_FINISHED":      2,
		"ROUND_CANCELED":      3,
		"OPEN_FOR_BETTING":    4,
		"CLOSE_THE_BETTING":   5,
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
	return file_fantan_recorder_proto_enumTypes[2].Descriptor()
}

func (Step) Type() protoreflect.EnumType {
	return &file_fantan_recorder_proto_enumTypes[2]
}

func (x Step) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Step.Descriptor instead.
func (Step) EnumDescriptor() ([]byte, []int) {
	return file_fantan_recorder_proto_rawDescGZIP(), []int{2}
}

// 座位功能代碼
type Seat int32

const (
	// 未指定
	Seat_SEAT_UNSPECIFIED Seat = 0
	// Dealer
	Seat_DEALER Seat = 1
	// Pitboss
	Seat_PITBOSS Seat = 9
)

// Enum value maps for Seat.
var (
	Seat_name = map[int32]string{
		0: "SEAT_UNSPECIFIED",
		1: "DEALER",
		9: "PITBOSS",
	}
	Seat_value = map[string]int32{
		"SEAT_UNSPECIFIED": 0,
		"DEALER":           1,
		"PITBOSS":          9,
	}
)

func (x Seat) Enum() *Seat {
	p := new(Seat)
	*p = x
	return p
}

func (x Seat) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Seat) Descriptor() protoreflect.EnumDescriptor {
	return file_fantan_recorder_proto_enumTypes[3].Descriptor()
}

func (Seat) Type() protoreflect.EnumType {
	return &file_fantan_recorder_proto_enumTypes[3]
}

func (x Seat) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Seat.Descriptor instead.
func (Seat) EnumDescriptor() ([]byte, []int) {
	return file_fantan_recorder_proto_rawDescGZIP(), []int{3}
}

// 結果紀錄類型代碼
type ResultRecordType int32

const (
	// 未指定
	ResultRecordType_RESULT_RECORD_TYPE_UNSPECIFIED ResultRecordType = 0
	// 遊戲局結束
	ResultRecordType_ROUND_FINISH ResultRecordType = 1
	// Pitboss 修正
	ResultRecordType_PITBOSS_MODIFY_RESULT ResultRecordType = 2
)

// Enum value maps for ResultRecordType.
var (
	ResultRecordType_name = map[int32]string{
		0: "RESULT_RECORD_TYPE_UNSPECIFIED",
		1: "ROUND_FINISH",
		2: "PITBOSS_MODIFY_RESULT",
	}
	ResultRecordType_value = map[string]int32{
		"RESULT_RECORD_TYPE_UNSPECIFIED": 0,
		"ROUND_FINISH":                   1,
		"PITBOSS_MODIFY_RESULT":          2,
	}
)

func (x ResultRecordType) Enum() *ResultRecordType {
	p := new(ResultRecordType)
	*p = x
	return p
}

func (x ResultRecordType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ResultRecordType) Descriptor() protoreflect.EnumDescriptor {
	return file_fantan_recorder_proto_enumTypes[4].Descriptor()
}

func (ResultRecordType) Type() protoreflect.EnumType {
	return &file_fantan_recorder_proto_enumTypes[4]
}

func (x ResultRecordType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ResultRecordType.Descriptor instead.
func (ResultRecordType) EnumDescriptor() ([]byte, []int) {
	return file_fantan_recorder_proto_rawDescGZIP(), []int{4}
}

var File_fantan_recorder_proto protoreflect.FileDescriptor

var file_fantan_recorder_proto_rawDesc = []byte{
	0x0a, 0x15, 0x66, 0x61, 0x6e, 0x74, 0x61, 0x6e, 0x2f, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x65,
	0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x06, 0x66, 0x61, 0x6e, 0x74, 0x61, 0x6e, 0x2a,
	0x38, 0x0a, 0x08, 0x43, 0x61, 0x72, 0x64, 0x54, 0x79, 0x70, 0x65, 0x12, 0x19, 0x0a, 0x15, 0x43,
	0x41, 0x52, 0x44, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49,
	0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x11, 0x0a, 0x0d, 0x43, 0x41, 0x52, 0x44, 0x5f, 0x54,
	0x59, 0x50, 0x45, 0x5f, 0x49, 0x4e, 0x54, 0x10, 0x01, 0x2a, 0x37, 0x0a, 0x0c, 0x52, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1d, 0x0a, 0x19, 0x52, 0x45, 0x53,
	0x4f, 0x55, 0x52, 0x43, 0x45, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45,
	0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x08, 0x0a, 0x04, 0x42, 0x4f, 0x57, 0x4c,
	0x10, 0x01, 0x2a, 0xb1, 0x01, 0x0a, 0x04, 0x53, 0x74, 0x65, 0x70, 0x12, 0x14, 0x0a, 0x10, 0x53,
	0x54, 0x45, 0x50, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10,
	0x00, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4e, 0x44, 0x5f, 0x53, 0x54, 0x41, 0x52, 0x54,
	0x10, 0x01, 0x12, 0x12, 0x0a, 0x0e, 0x52, 0x4f, 0x55, 0x4e, 0x44, 0x5f, 0x46, 0x49, 0x4e, 0x49,
	0x53, 0x48, 0x45, 0x44, 0x10, 0x02, 0x12, 0x12, 0x0a, 0x0e, 0x52, 0x4f, 0x55, 0x4e, 0x44, 0x5f,
	0x43, 0x41, 0x4e, 0x43, 0x45, 0x4c, 0x45, 0x44, 0x10, 0x03, 0x12, 0x14, 0x0a, 0x10, 0x4f, 0x50,
	0x45, 0x4e, 0x5f, 0x46, 0x4f, 0x52, 0x5f, 0x42, 0x45, 0x54, 0x54, 0x49, 0x4e, 0x47, 0x10, 0x04,
	0x12, 0x15, 0x0a, 0x11, 0x43, 0x4c, 0x4f, 0x53, 0x45, 0x5f, 0x54, 0x48, 0x45, 0x5f, 0x42, 0x45,
	0x54, 0x54, 0x49, 0x4e, 0x47, 0x10, 0x05, 0x12, 0x14, 0x0a, 0x10, 0x47, 0x52, 0x41, 0x42, 0x5f,
	0x44, 0x49, 0x43, 0x45, 0x5f, 0x41, 0x4d, 0x4f, 0x55, 0x4e, 0x54, 0x10, 0x08, 0x12, 0x17, 0x0a,
	0x13, 0x50, 0x49, 0x54, 0x42, 0x4f, 0x53, 0x53, 0x5f, 0x4d, 0x4f, 0x44, 0x49, 0x46, 0x59, 0x5f,
	0x42, 0x4f, 0x57, 0x4c, 0x10, 0x10, 0x2a, 0x35, 0x0a, 0x04, 0x53, 0x65, 0x61, 0x74, 0x12, 0x14,
	0x0a, 0x10, 0x53, 0x45, 0x41, 0x54, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49,
	0x45, 0x44, 0x10, 0x00, 0x12, 0x0a, 0x0a, 0x06, 0x44, 0x45, 0x41, 0x4c, 0x45, 0x52, 0x10, 0x01,
	0x12, 0x0b, 0x0a, 0x07, 0x50, 0x49, 0x54, 0x42, 0x4f, 0x53, 0x53, 0x10, 0x09, 0x2a, 0x63, 0x0a,
	0x10, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x54, 0x79, 0x70,
	0x65, 0x12, 0x22, 0x0a, 0x1e, 0x52, 0x45, 0x53, 0x55, 0x4c, 0x54, 0x5f, 0x52, 0x45, 0x43, 0x4f,
	0x52, 0x44, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46,
	0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x10, 0x0a, 0x0c, 0x52, 0x4f, 0x55, 0x4e, 0x44, 0x5f, 0x46,
	0x49, 0x4e, 0x49, 0x53, 0x48, 0x10, 0x01, 0x12, 0x19, 0x0a, 0x15, 0x50, 0x49, 0x54, 0x42, 0x4f,
	0x53, 0x53, 0x5f, 0x4d, 0x4f, 0x44, 0x49, 0x46, 0x59, 0x5f, 0x52, 0x45, 0x53, 0x55, 0x4c, 0x54,
	0x10, 0x02, 0x42, 0x86, 0x01, 0x0a, 0x0a, 0x63, 0x6f, 0x6d, 0x2e, 0x66, 0x61, 0x6e, 0x74, 0x61,
	0x6e, 0x42, 0x0d, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x31, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73,
	0x6b, 0x79, 0x2d, 0x70, 0x6c, 0x61, 0x74, 0x66, 0x6f, 0x72, 0x6d, 0x2f, 0x73, 0x6b, 0x79, 0x63,
	0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x2f, 0x66,
	0x61, 0x6e, 0x74, 0x61, 0x6e, 0xa2, 0x02, 0x03, 0x46, 0x58, 0x58, 0xaa, 0x02, 0x06, 0x46, 0x61,
	0x6e, 0x74, 0x61, 0x6e, 0xca, 0x02, 0x06, 0x46, 0x61, 0x6e, 0x74, 0x61, 0x6e, 0xe2, 0x02, 0x12,
	0x46, 0x61, 0x6e, 0x74, 0x61, 0x6e, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61,
	0x74, 0x61, 0xea, 0x02, 0x06, 0x46, 0x61, 0x6e, 0x74, 0x61, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_fantan_recorder_proto_rawDescOnce sync.Once
	file_fantan_recorder_proto_rawDescData = file_fantan_recorder_proto_rawDesc
)

func file_fantan_recorder_proto_rawDescGZIP() []byte {
	file_fantan_recorder_proto_rawDescOnce.Do(func() {
		file_fantan_recorder_proto_rawDescData = protoimpl.X.CompressGZIP(file_fantan_recorder_proto_rawDescData)
	})
	return file_fantan_recorder_proto_rawDescData
}

var file_fantan_recorder_proto_enumTypes = make([]protoimpl.EnumInfo, 5)
var file_fantan_recorder_proto_goTypes = []interface{}{
	(CardType)(0),         // 0: fantan.CardType
	(ResourceType)(0),     // 1: fantan.ResourceType
	(Step)(0),             // 2: fantan.Step
	(Seat)(0),             // 3: fantan.Seat
	(ResultRecordType)(0), // 4: fantan.ResultRecordType
}
var file_fantan_recorder_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_fantan_recorder_proto_init() }
func file_fantan_recorder_proto_init() {
	if File_fantan_recorder_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_fantan_recorder_proto_rawDesc,
			NumEnums:      5,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_fantan_recorder_proto_goTypes,
		DependencyIndexes: file_fantan_recorder_proto_depIdxs,
		EnumInfos:         file_fantan_recorder_proto_enumTypes,
	}.Build()
	File_fantan_recorder_proto = out.File
	file_fantan_recorder_proto_rawDesc = nil
	file_fantan_recorder_proto_goTypes = nil
	file_fantan_recorder_proto_depIdxs = nil
}
