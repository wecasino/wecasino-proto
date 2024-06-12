// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.2
// 	protoc        (unknown)
// source: cards/roulette.proto

package cards

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

// 輪盤
type Roulette int32

const (
	// 未指定
	Roulette_ROULETTE_CARD_UNSPECIFIED Roulette = 0
	Roulette_ROULETTE_0                Roulette = 99
	Roulette_ROULETTE_1                Roulette = 1
	Roulette_ROULETTE_2                Roulette = 2
	Roulette_ROULETTE_3                Roulette = 3
	Roulette_ROULETTE_4                Roulette = 4
	Roulette_ROULETTE_5                Roulette = 5
	Roulette_ROULETTE_6                Roulette = 6
	Roulette_ROULETTE_7                Roulette = 7
	Roulette_ROULETTE_8                Roulette = 8
	Roulette_ROULETTE_9                Roulette = 9
	Roulette_ROULETTE_10               Roulette = 10
	Roulette_ROULETTE_11               Roulette = 11
	Roulette_ROULETTE_12               Roulette = 12
	Roulette_ROULETTE_13               Roulette = 13
	Roulette_ROULETTE_14               Roulette = 14
	Roulette_ROULETTE_15               Roulette = 15
	Roulette_ROULETTE_16               Roulette = 16
	Roulette_ROULETTE_17               Roulette = 17
	Roulette_ROULETTE_18               Roulette = 18
	Roulette_ROULETTE_19               Roulette = 19
	Roulette_ROULETTE_20               Roulette = 20
	Roulette_ROULETTE_21               Roulette = 21
	Roulette_ROULETTE_22               Roulette = 22
	Roulette_ROULETTE_23               Roulette = 23
	Roulette_ROULETTE_24               Roulette = 24
	Roulette_ROULETTE_25               Roulette = 25
	Roulette_ROULETTE_26               Roulette = 26
	Roulette_ROULETTE_27               Roulette = 27
	Roulette_ROULETTE_28               Roulette = 28
	Roulette_ROULETTE_29               Roulette = 29
	Roulette_ROULETTE_30               Roulette = 30
	Roulette_ROULETTE_31               Roulette = 31
	Roulette_ROULETTE_32               Roulette = 32
	Roulette_ROULETTE_33               Roulette = 33
	Roulette_ROULETTE_34               Roulette = 34
	Roulette_ROULETTE_35               Roulette = 35
	Roulette_ROULETTE_36               Roulette = 36
)

// Enum value maps for Roulette.
var (
	Roulette_name = map[int32]string{
		0:  "ROULETTE_CARD_UNSPECIFIED",
		99: "ROULETTE_0",
		1:  "ROULETTE_1",
		2:  "ROULETTE_2",
		3:  "ROULETTE_3",
		4:  "ROULETTE_4",
		5:  "ROULETTE_5",
		6:  "ROULETTE_6",
		7:  "ROULETTE_7",
		8:  "ROULETTE_8",
		9:  "ROULETTE_9",
		10: "ROULETTE_10",
		11: "ROULETTE_11",
		12: "ROULETTE_12",
		13: "ROULETTE_13",
		14: "ROULETTE_14",
		15: "ROULETTE_15",
		16: "ROULETTE_16",
		17: "ROULETTE_17",
		18: "ROULETTE_18",
		19: "ROULETTE_19",
		20: "ROULETTE_20",
		21: "ROULETTE_21",
		22: "ROULETTE_22",
		23: "ROULETTE_23",
		24: "ROULETTE_24",
		25: "ROULETTE_25",
		26: "ROULETTE_26",
		27: "ROULETTE_27",
		28: "ROULETTE_28",
		29: "ROULETTE_29",
		30: "ROULETTE_30",
		31: "ROULETTE_31",
		32: "ROULETTE_32",
		33: "ROULETTE_33",
		34: "ROULETTE_34",
		35: "ROULETTE_35",
		36: "ROULETTE_36",
	}
	Roulette_value = map[string]int32{
		"ROULETTE_CARD_UNSPECIFIED": 0,
		"ROULETTE_0":                99,
		"ROULETTE_1":                1,
		"ROULETTE_2":                2,
		"ROULETTE_3":                3,
		"ROULETTE_4":                4,
		"ROULETTE_5":                5,
		"ROULETTE_6":                6,
		"ROULETTE_7":                7,
		"ROULETTE_8":                8,
		"ROULETTE_9":                9,
		"ROULETTE_10":               10,
		"ROULETTE_11":               11,
		"ROULETTE_12":               12,
		"ROULETTE_13":               13,
		"ROULETTE_14":               14,
		"ROULETTE_15":               15,
		"ROULETTE_16":               16,
		"ROULETTE_17":               17,
		"ROULETTE_18":               18,
		"ROULETTE_19":               19,
		"ROULETTE_20":               20,
		"ROULETTE_21":               21,
		"ROULETTE_22":               22,
		"ROULETTE_23":               23,
		"ROULETTE_24":               24,
		"ROULETTE_25":               25,
		"ROULETTE_26":               26,
		"ROULETTE_27":               27,
		"ROULETTE_28":               28,
		"ROULETTE_29":               29,
		"ROULETTE_30":               30,
		"ROULETTE_31":               31,
		"ROULETTE_32":               32,
		"ROULETTE_33":               33,
		"ROULETTE_34":               34,
		"ROULETTE_35":               35,
		"ROULETTE_36":               36,
	}
)

func (x Roulette) Enum() *Roulette {
	p := new(Roulette)
	*p = x
	return p
}

func (x Roulette) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Roulette) Descriptor() protoreflect.EnumDescriptor {
	return file_cards_roulette_proto_enumTypes[0].Descriptor()
}

func (Roulette) Type() protoreflect.EnumType {
	return &file_cards_roulette_proto_enumTypes[0]
}

func (x Roulette) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Roulette.Descriptor instead.
func (Roulette) EnumDescriptor() ([]byte, []int) {
	return file_cards_roulette_proto_rawDescGZIP(), []int{0}
}

var File_cards_roulette_proto protoreflect.FileDescriptor

var file_cards_roulette_proto_rawDesc = []byte{
	0x0a, 0x14, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2f, 0x72, 0x6f, 0x75, 0x6c, 0x65, 0x74, 0x74, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2a, 0x94, 0x05,
	0x0a, 0x08, 0x52, 0x6f, 0x75, 0x6c, 0x65, 0x74, 0x74, 0x65, 0x12, 0x1d, 0x0a, 0x19, 0x52, 0x4f,
	0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x43, 0x41, 0x52, 0x44, 0x5f, 0x55, 0x4e, 0x53, 0x50,
	0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x30, 0x10, 0x63, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x10, 0x01, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x32, 0x10, 0x02, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x33, 0x10, 0x03, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x34, 0x10, 0x04, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x35, 0x10, 0x05, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x36, 0x10, 0x06, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x37, 0x10, 0x07, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x38, 0x10, 0x08, 0x12, 0x0e, 0x0a, 0x0a, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x39, 0x10, 0x09, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x30, 0x10, 0x0a, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f,
	0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x31, 0x10, 0x0b, 0x12, 0x0f, 0x0a, 0x0b, 0x52,
	0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x32, 0x10, 0x0c, 0x12, 0x0f, 0x0a, 0x0b,
	0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x33, 0x10, 0x0d, 0x12, 0x0f, 0x0a,
	0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x34, 0x10, 0x0e, 0x12, 0x0f,
	0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x35, 0x10, 0x0f, 0x12,
	0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x36, 0x10, 0x10,
	0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x37, 0x10,
	0x11, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31, 0x38,
	0x10, 0x12, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x31,
	0x39, 0x10, 0x13, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f,
	0x32, 0x30, 0x10, 0x14, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45,
	0x5f, 0x32, 0x31, 0x10, 0x15, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54,
	0x45, 0x5f, 0x32, 0x32, 0x10, 0x16, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54,
	0x54, 0x45, 0x5f, 0x32, 0x33, 0x10, 0x17, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45,
	0x54, 0x54, 0x45, 0x5f, 0x32, 0x34, 0x10, 0x18, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c,
	0x45, 0x54, 0x54, 0x45, 0x5f, 0x32, 0x35, 0x10, 0x19, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55,
	0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x32, 0x36, 0x10, 0x1a, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f,
	0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x32, 0x37, 0x10, 0x1b, 0x12, 0x0f, 0x0a, 0x0b, 0x52,
	0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x32, 0x38, 0x10, 0x1c, 0x12, 0x0f, 0x0a, 0x0b,
	0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x32, 0x39, 0x10, 0x1d, 0x12, 0x0f, 0x0a,
	0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x33, 0x30, 0x10, 0x1e, 0x12, 0x0f,
	0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x33, 0x31, 0x10, 0x1f, 0x12,
	0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x33, 0x32, 0x10, 0x20,
	0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x33, 0x33, 0x10,
	0x21, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x33, 0x34,
	0x10, 0x22, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f, 0x33,
	0x35, 0x10, 0x23, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x5f,
	0x33, 0x36, 0x10, 0x24, 0x42, 0x8c, 0x01, 0x0a, 0x18, 0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x65, 0x63,
	0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x63, 0x61, 0x72, 0x64,
	0x73, 0x42, 0x0d, 0x52, 0x6f, 0x75, 0x6c, 0x65, 0x74, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x2d, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77,
	0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f,
	0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x62, 0x67, 0x6f, 0x2f, 0x63, 0x61, 0x72, 0x64,
	0x73, 0xa2, 0x02, 0x03, 0x43, 0x58, 0x58, 0xaa, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0xca,
	0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0xe2, 0x02, 0x11, 0x43, 0x61, 0x72, 0x64, 0x73, 0x5c,
	0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x05, 0x43, 0x61,
	0x72, 0x64, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_cards_roulette_proto_rawDescOnce sync.Once
	file_cards_roulette_proto_rawDescData = file_cards_roulette_proto_rawDesc
)

func file_cards_roulette_proto_rawDescGZIP() []byte {
	file_cards_roulette_proto_rawDescOnce.Do(func() {
		file_cards_roulette_proto_rawDescData = protoimpl.X.CompressGZIP(file_cards_roulette_proto_rawDescData)
	})
	return file_cards_roulette_proto_rawDescData
}

var file_cards_roulette_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_cards_roulette_proto_goTypes = []any{
	(Roulette)(0), // 0: cards.Roulette
}
var file_cards_roulette_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_cards_roulette_proto_init() }
func file_cards_roulette_proto_init() {
	if File_cards_roulette_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_cards_roulette_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_cards_roulette_proto_goTypes,
		DependencyIndexes: file_cards_roulette_proto_depIdxs,
		EnumInfos:         file_cards_roulette_proto_enumTypes,
	}.Build()
	File_cards_roulette_proto = out.File
	file_cards_roulette_proto_rawDesc = nil
	file_cards_roulette_proto_goTypes = nil
	file_cards_roulette_proto_depIdxs = nil
}
