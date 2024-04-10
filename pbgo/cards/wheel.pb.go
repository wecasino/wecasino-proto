// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: cards/wheel.proto

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

// empty Wheel
type Wheel int32

const (
	Wheel_WHEEL_UNSPECIFIED Wheel = 0
	// 24格 1 倍
	Wheel_WHEEL24X1 Wheel = 1
	// 12格 3 倍
	Wheel_WHEEL12X3 Wheel = 2
	// 8格 5 倍
	Wheel_WHEEL8X5 Wheel = 3
	// 4格 10 倍
	Wheel_WHEEL4X10 Wheel = 4
	// 2格 20 倍
	Wheel_WHEEL2X20 Wheel = 5
	// 1格 45 倍
	Wheel_WHEELAX45 Wheel = 6
	// 1格 45 倍
	Wheel_WHEELBX45 Wheel = 7
)

// Enum value maps for Wheel.
var (
	Wheel_name = map[int32]string{
		0: "WHEEL_UNSPECIFIED",
		1: "WHEEL24X1",
		2: "WHEEL12X3",
		3: "WHEEL8X5",
		4: "WHEEL4X10",
		5: "WHEEL2X20",
		6: "WHEELAX45",
		7: "WHEELBX45",
	}
	Wheel_value = map[string]int32{
		"WHEEL_UNSPECIFIED": 0,
		"WHEEL24X1":         1,
		"WHEEL12X3":         2,
		"WHEEL8X5":          3,
		"WHEEL4X10":         4,
		"WHEEL2X20":         5,
		"WHEELAX45":         6,
		"WHEELBX45":         7,
	}
)

func (x Wheel) Enum() *Wheel {
	p := new(Wheel)
	*p = x
	return p
}

func (x Wheel) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Wheel) Descriptor() protoreflect.EnumDescriptor {
	return file_cards_wheel_proto_enumTypes[0].Descriptor()
}

func (Wheel) Type() protoreflect.EnumType {
	return &file_cards_wheel_proto_enumTypes[0]
}

func (x Wheel) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Wheel.Descriptor instead.
func (Wheel) EnumDescriptor() ([]byte, []int) {
	return file_cards_wheel_proto_rawDescGZIP(), []int{0}
}

var File_cards_wheel_proto protoreflect.FileDescriptor

var file_cards_wheel_proto_rawDesc = []byte{
	0x0a, 0x11, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2f, 0x77, 0x68, 0x65, 0x65, 0x6c, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x05, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2a, 0x86, 0x01, 0x0a, 0x05, 0x57,
	0x68, 0x65, 0x65, 0x6c, 0x12, 0x15, 0x0a, 0x11, 0x57, 0x48, 0x45, 0x45, 0x4c, 0x5f, 0x55, 0x4e,
	0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0d, 0x0a, 0x09, 0x57,
	0x48, 0x45, 0x45, 0x4c, 0x32, 0x34, 0x58, 0x31, 0x10, 0x01, 0x12, 0x0d, 0x0a, 0x09, 0x57, 0x48,
	0x45, 0x45, 0x4c, 0x31, 0x32, 0x58, 0x33, 0x10, 0x02, 0x12, 0x0c, 0x0a, 0x08, 0x57, 0x48, 0x45,
	0x45, 0x4c, 0x38, 0x58, 0x35, 0x10, 0x03, 0x12, 0x0d, 0x0a, 0x09, 0x57, 0x48, 0x45, 0x45, 0x4c,
	0x34, 0x58, 0x31, 0x30, 0x10, 0x04, 0x12, 0x0d, 0x0a, 0x09, 0x57, 0x48, 0x45, 0x45, 0x4c, 0x32,
	0x58, 0x32, 0x30, 0x10, 0x05, 0x12, 0x0d, 0x0a, 0x09, 0x57, 0x48, 0x45, 0x45, 0x4c, 0x41, 0x58,
	0x34, 0x35, 0x10, 0x06, 0x12, 0x0d, 0x0a, 0x09, 0x57, 0x48, 0x45, 0x45, 0x4c, 0x42, 0x58, 0x34,
	0x35, 0x10, 0x07, 0x42, 0x89, 0x01, 0x0a, 0x18, 0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x65, 0x63, 0x61,
	0x73, 0x69, 0x6e, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x63, 0x61, 0x72, 0x64, 0x73,
	0x42, 0x0a, 0x57, 0x68, 0x65, 0x65, 0x6c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2d,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73,
	0x69, 0x6e, 0x6f, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2d, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x70, 0x62, 0x67, 0x6f, 0x2f, 0x63, 0x61, 0x72, 0x64, 0x73, 0xa2, 0x02, 0x03,
	0x43, 0x58, 0x58, 0xaa, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0xca, 0x02, 0x05, 0x43, 0x61,
	0x72, 0x64, 0x73, 0xe2, 0x02, 0x11, 0x43, 0x61, 0x72, 0x64, 0x73, 0x5c, 0x47, 0x50, 0x42, 0x4d,
	0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_cards_wheel_proto_rawDescOnce sync.Once
	file_cards_wheel_proto_rawDescData = file_cards_wheel_proto_rawDesc
)

func file_cards_wheel_proto_rawDescGZIP() []byte {
	file_cards_wheel_proto_rawDescOnce.Do(func() {
		file_cards_wheel_proto_rawDescData = protoimpl.X.CompressGZIP(file_cards_wheel_proto_rawDescData)
	})
	return file_cards_wheel_proto_rawDescData
}

var file_cards_wheel_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_cards_wheel_proto_goTypes = []interface{}{
	(Wheel)(0), // 0: cards.Wheel
}
var file_cards_wheel_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_cards_wheel_proto_init() }
func file_cards_wheel_proto_init() {
	if File_cards_wheel_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_cards_wheel_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_cards_wheel_proto_goTypes,
		DependencyIndexes: file_cards_wheel_proto_depIdxs,
		EnumInfos:         file_cards_wheel_proto_enumTypes,
	}.Build()
	File_cards_wheel_proto = out.File
	file_cards_wheel_proto_rawDesc = nil
	file_cards_wheel_proto_goTypes = nil
	file_cards_wheel_proto_depIdxs = nil
}
