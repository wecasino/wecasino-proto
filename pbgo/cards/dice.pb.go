// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.2
// 	protoc        (unknown)
// source: cards/dice.proto

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

type DiceCard int32

const (
	// 未指定
	DiceCard_DICE_CARD_UNSPECIFIED DiceCard = 0
	DiceCard_DICE_1                DiceCard = 1
	DiceCard_DICE_2                DiceCard = 2
	DiceCard_DICE_3                DiceCard = 3
	DiceCard_DICE_4                DiceCard = 4
	DiceCard_DICE_5                DiceCard = 5
	DiceCard_DICE_6                DiceCard = 6
)

// Enum value maps for DiceCard.
var (
	DiceCard_name = map[int32]string{
		0: "DICE_CARD_UNSPECIFIED",
		1: "DICE_1",
		2: "DICE_2",
		3: "DICE_3",
		4: "DICE_4",
		5: "DICE_5",
		6: "DICE_6",
	}
	DiceCard_value = map[string]int32{
		"DICE_CARD_UNSPECIFIED": 0,
		"DICE_1":                1,
		"DICE_2":                2,
		"DICE_3":                3,
		"DICE_4":                4,
		"DICE_5":                5,
		"DICE_6":                6,
	}
)

func (x DiceCard) Enum() *DiceCard {
	p := new(DiceCard)
	*p = x
	return p
}

func (x DiceCard) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (DiceCard) Descriptor() protoreflect.EnumDescriptor {
	return file_cards_dice_proto_enumTypes[0].Descriptor()
}

func (DiceCard) Type() protoreflect.EnumType {
	return &file_cards_dice_proto_enumTypes[0]
}

func (x DiceCard) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use DiceCard.Descriptor instead.
func (DiceCard) EnumDescriptor() ([]byte, []int) {
	return file_cards_dice_proto_rawDescGZIP(), []int{0}
}

var File_cards_dice_proto protoreflect.FileDescriptor

var file_cards_dice_proto_rawDesc = []byte{
	0x0a, 0x10, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2f, 0x64, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x05, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2a, 0x6d, 0x0a, 0x08, 0x44, 0x69, 0x63,
	0x65, 0x43, 0x61, 0x72, 0x64, 0x12, 0x19, 0x0a, 0x15, 0x44, 0x49, 0x43, 0x45, 0x5f, 0x43, 0x41,
	0x52, 0x44, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00,
	0x12, 0x0a, 0x0a, 0x06, 0x44, 0x49, 0x43, 0x45, 0x5f, 0x31, 0x10, 0x01, 0x12, 0x0a, 0x0a, 0x06,
	0x44, 0x49, 0x43, 0x45, 0x5f, 0x32, 0x10, 0x02, 0x12, 0x0a, 0x0a, 0x06, 0x44, 0x49, 0x43, 0x45,
	0x5f, 0x33, 0x10, 0x03, 0x12, 0x0a, 0x0a, 0x06, 0x44, 0x49, 0x43, 0x45, 0x5f, 0x34, 0x10, 0x04,
	0x12, 0x0a, 0x0a, 0x06, 0x44, 0x49, 0x43, 0x45, 0x5f, 0x35, 0x10, 0x05, 0x12, 0x0a, 0x0a, 0x06,
	0x44, 0x49, 0x43, 0x45, 0x5f, 0x36, 0x10, 0x06, 0x42, 0x88, 0x01, 0x0a, 0x18, 0x63, 0x6f, 0x6d,
	0x2e, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x63, 0x61, 0x72, 0x64, 0x73, 0x42, 0x09, 0x44, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x2d, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77,
	0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f,
	0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x62, 0x67, 0x6f, 0x2f, 0x63, 0x61, 0x72, 0x64,
	0x73, 0xa2, 0x02, 0x03, 0x43, 0x58, 0x58, 0xaa, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0xca,
	0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0xe2, 0x02, 0x11, 0x43, 0x61, 0x72, 0x64, 0x73, 0x5c,
	0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x05, 0x43, 0x61,
	0x72, 0x64, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_cards_dice_proto_rawDescOnce sync.Once
	file_cards_dice_proto_rawDescData = file_cards_dice_proto_rawDesc
)

func file_cards_dice_proto_rawDescGZIP() []byte {
	file_cards_dice_proto_rawDescOnce.Do(func() {
		file_cards_dice_proto_rawDescData = protoimpl.X.CompressGZIP(file_cards_dice_proto_rawDescData)
	})
	return file_cards_dice_proto_rawDescData
}

var file_cards_dice_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_cards_dice_proto_goTypes = []any{
	(DiceCard)(0), // 0: cards.DiceCard
}
var file_cards_dice_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_cards_dice_proto_init() }
func file_cards_dice_proto_init() {
	if File_cards_dice_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_cards_dice_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_cards_dice_proto_goTypes,
		DependencyIndexes: file_cards_dice_proto_depIdxs,
		EnumInfos:         file_cards_dice_proto_enumTypes,
	}.Build()
	File_cards_dice_proto = out.File
	file_cards_dice_proto_rawDesc = nil
	file_cards_dice_proto_goTypes = nil
	file_cards_dice_proto_depIdxs = nil
}
