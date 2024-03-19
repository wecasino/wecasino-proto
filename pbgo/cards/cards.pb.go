// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: cards/cards.proto

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

type CardType int32

const (
	// 未指定
	CardType_CARD_TYPE_UNSPECIFIED CardType = 0
	CardType_INT                   CardType = 1
	CardType_POKER                 CardType = 2
	CardType_DICE                  CardType = 3
	CardType_ROULETTE              CardType = 4
	CardType_WEEL                  CardType = 5
	CardType_FLOW                  CardType = 6
)

// Enum value maps for CardType.
var (
	CardType_name = map[int32]string{
		0: "CARD_TYPE_UNSPECIFIED",
		1: "INT",
		2: "POKER",
		3: "DICE",
		4: "ROULETTE",
		5: "WEEL",
		6: "FLOW",
	}
	CardType_value = map[string]int32{
		"CARD_TYPE_UNSPECIFIED": 0,
		"INT":                   1,
		"POKER":                 2,
		"DICE":                  3,
		"ROULETTE":              4,
		"WEEL":                  5,
		"FLOW":                  6,
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
	return file_cards_cards_proto_enumTypes[0].Descriptor()
}

func (CardType) Type() protoreflect.EnumType {
	return &file_cards_cards_proto_enumTypes[0]
}

func (x CardType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use CardType.Descriptor instead.
func (CardType) EnumDescriptor() ([]byte, []int) {
	return file_cards_cards_proto_rawDescGZIP(), []int{0}
}

var File_cards_cards_proto protoreflect.FileDescriptor

var file_cards_cards_proto_rawDesc = []byte{
	0x0a, 0x11, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2f, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x05, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2a, 0x65, 0x0a, 0x08, 0x43, 0x61,
	0x72, 0x64, 0x54, 0x79, 0x70, 0x65, 0x12, 0x19, 0x0a, 0x15, 0x43, 0x41, 0x52, 0x44, 0x5f, 0x54,
	0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10,
	0x00, 0x12, 0x07, 0x0a, 0x03, 0x49, 0x4e, 0x54, 0x10, 0x01, 0x12, 0x09, 0x0a, 0x05, 0x50, 0x4f,
	0x4b, 0x45, 0x52, 0x10, 0x02, 0x12, 0x08, 0x0a, 0x04, 0x44, 0x49, 0x43, 0x45, 0x10, 0x03, 0x12,
	0x0c, 0x0a, 0x08, 0x52, 0x4f, 0x55, 0x4c, 0x45, 0x54, 0x54, 0x45, 0x10, 0x04, 0x12, 0x08, 0x0a,
	0x04, 0x57, 0x45, 0x45, 0x4c, 0x10, 0x05, 0x12, 0x08, 0x0a, 0x04, 0x46, 0x4c, 0x4f, 0x57, 0x10,
	0x06, 0x42, 0x7a, 0x0a, 0x09, 0x63, 0x6f, 0x6d, 0x2e, 0x63, 0x61, 0x72, 0x64, 0x73, 0x42, 0x0a,
	0x43, 0x61, 0x72, 0x64, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2d, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e,
	0x6f, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x70, 0x62, 0x67, 0x6f, 0x2f, 0x63, 0x61, 0x72, 0x64, 0x73, 0xa2, 0x02, 0x03, 0x43, 0x58,
	0x58, 0xaa, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0xca, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64,
	0x73, 0xe2, 0x02, 0x11, 0x43, 0x61, 0x72, 0x64, 0x73, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74,
	0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_cards_cards_proto_rawDescOnce sync.Once
	file_cards_cards_proto_rawDescData = file_cards_cards_proto_rawDesc
)

func file_cards_cards_proto_rawDescGZIP() []byte {
	file_cards_cards_proto_rawDescOnce.Do(func() {
		file_cards_cards_proto_rawDescData = protoimpl.X.CompressGZIP(file_cards_cards_proto_rawDescData)
	})
	return file_cards_cards_proto_rawDescData
}

var file_cards_cards_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_cards_cards_proto_goTypes = []interface{}{
	(CardType)(0), // 0: cards.CardType
}
var file_cards_cards_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_cards_cards_proto_init() }
func file_cards_cards_proto_init() {
	if File_cards_cards_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_cards_cards_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_cards_cards_proto_goTypes,
		DependencyIndexes: file_cards_cards_proto_depIdxs,
		EnumInfos:         file_cards_cards_proto_enumTypes,
	}.Build()
	File_cards_cards_proto = out.File
	file_cards_cards_proto_rawDesc = nil
	file_cards_cards_proto_goTypes = nil
	file_cards_cards_proto_depIdxs = nil
}
