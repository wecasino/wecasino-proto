// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.34.2
// 	protoc        (unknown)
// source: tagger/tagger.proto

package tagger

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	descriptorpb "google.golang.org/protobuf/types/descriptorpb"
	reflect "reflect"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

var file_tagger_tagger_proto_extTypes = []protoimpl.ExtensionInfo{
	{
		ExtendedType:  (*descriptorpb.FieldOptions)(nil),
		ExtensionType: (*string)(nil),
		Field:         847939,
		Name:          "tagger.tags",
		Tag:           "bytes,847939,opt,name=tags",
		Filename:      "tagger/tagger.proto",
	},
	{
		ExtendedType:  (*descriptorpb.OneofOptions)(nil),
		ExtensionType: (*string)(nil),
		Field:         847939,
		Name:          "tagger.oneof_tags",
		Tag:           "bytes,847939,opt,name=oneof_tags",
		Filename:      "tagger/tagger.proto",
	},
}

// Extension fields to descriptorpb.FieldOptions.
var (
	// Multiple Tags can be specified.
	//
	// optional string tags = 847939;
	E_Tags = &file_tagger_tagger_proto_extTypes[0]
)

// Extension fields to descriptorpb.OneofOptions.
var (
	// Multiple Tags can be specified.
	//
	// optional string oneof_tags = 847939;
	E_OneofTags = &file_tagger_tagger_proto_extTypes[1]
)

var File_tagger_tagger_proto protoreflect.FileDescriptor

var file_tagger_tagger_proto_rawDesc = []byte{
	0x0a, 0x13, 0x74, 0x61, 0x67, 0x67, 0x65, 0x72, 0x2f, 0x74, 0x61, 0x67, 0x67, 0x65, 0x72, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x06, 0x74, 0x61, 0x67, 0x67, 0x65, 0x72, 0x1a, 0x20, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x64,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x3a,
	0x33, 0x0a, 0x04, 0x74, 0x61, 0x67, 0x73, 0x12, 0x1d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x4f,
	0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0xc3, 0xe0, 0x33, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x74, 0x61, 0x67, 0x73, 0x3a, 0x3e, 0x0a, 0x0a, 0x6f, 0x6e, 0x65, 0x6f, 0x66, 0x5f, 0x74, 0x61,
	0x67, 0x73, 0x12, 0x1d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2e, 0x4f, 0x6e, 0x65, 0x6f, 0x66, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x18, 0xc3, 0xe0, 0x33, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x6f, 0x6e, 0x65, 0x6f, 0x66,
	0x54, 0x61, 0x67, 0x73, 0x42, 0x90, 0x01, 0x0a, 0x19, 0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x65, 0x63,
	0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x61, 0x67, 0x67,
	0x65, 0x72, 0x42, 0x0b, 0x54, 0x61, 0x67, 0x67, 0x65, 0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50,
	0x01, 0x5a, 0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x65,
	0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2d,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x62, 0x67, 0x6f, 0x2f, 0x74, 0x61, 0x67, 0x67, 0x65,
	0x72, 0xa2, 0x02, 0x03, 0x54, 0x58, 0x58, 0xaa, 0x02, 0x06, 0x54, 0x61, 0x67, 0x67, 0x65, 0x72,
	0xca, 0x02, 0x06, 0x54, 0x61, 0x67, 0x67, 0x65, 0x72, 0xe2, 0x02, 0x12, 0x54, 0x61, 0x67, 0x67,
	0x65, 0x72, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02,
	0x06, 0x54, 0x61, 0x67, 0x67, 0x65, 0x72, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_tagger_tagger_proto_goTypes = []any{
	(*descriptorpb.FieldOptions)(nil), // 0: google.protobuf.FieldOptions
	(*descriptorpb.OneofOptions)(nil), // 1: google.protobuf.OneofOptions
}
var file_tagger_tagger_proto_depIdxs = []int32{
	0, // 0: tagger.tags:extendee -> google.protobuf.FieldOptions
	1, // 1: tagger.oneof_tags:extendee -> google.protobuf.OneofOptions
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	0, // [0:2] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_tagger_tagger_proto_init() }
func file_tagger_tagger_proto_init() {
	if File_tagger_tagger_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_tagger_tagger_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 2,
			NumServices:   0,
		},
		GoTypes:           file_tagger_tagger_proto_goTypes,
		DependencyIndexes: file_tagger_tagger_proto_depIdxs,
		ExtensionInfos:    file_tagger_tagger_proto_extTypes,
	}.Build()
	File_tagger_tagger_proto = out.File
	file_tagger_tagger_proto_rawDesc = nil
	file_tagger_tagger_proto_goTypes = nil
	file_tagger_tagger_proto_depIdxs = nil
}
