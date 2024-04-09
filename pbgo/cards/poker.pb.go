// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: cards/poker.proto

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

// 撲克牌代碼
type PokerCard int32

const (
	// 未指定
	PokerCard_POKER_CARD_UNSPECIFIED PokerCard = 0
	// 未指定花色
	PokerCard_ANY_A  PokerCard = 1
	PokerCard_ANY_2  PokerCard = 2
	PokerCard_ANY_3  PokerCard = 3
	PokerCard_ANY_4  PokerCard = 4
	PokerCard_ANY_5  PokerCard = 5
	PokerCard_ANY_6  PokerCard = 6
	PokerCard_ANY_7  PokerCard = 7
	PokerCard_ANY_8  PokerCard = 8
	PokerCard_ANY_9  PokerCard = 9
	PokerCard_ANY_10 PokerCard = 10
	PokerCard_ANY_J  PokerCard = 11
	PokerCard_ANY_Q  PokerCard = 12
	PokerCard_ANY_K  PokerCard = 13
	PokerCard_MASK   PokerCard = 15
	// 黑桃
	PokerCard_SPADE_ANY PokerCard = 16
	PokerCard_SPADE_A   PokerCard = 17
	PokerCard_SPADE_2   PokerCard = 18
	PokerCard_SPADE_3   PokerCard = 19
	PokerCard_SPADE_4   PokerCard = 20
	PokerCard_SPADE_5   PokerCard = 21
	PokerCard_SPADE_6   PokerCard = 22
	PokerCard_SPADE_7   PokerCard = 23
	PokerCard_SPADE_8   PokerCard = 24
	PokerCard_SPADE_9   PokerCard = 25
	PokerCard_SPADE_10  PokerCard = 26
	PokerCard_SPADE_J   PokerCard = 27
	PokerCard_SPADE_Q   PokerCard = 28
	PokerCard_SPADE_K   PokerCard = 29
	// 愛心
	PokerCard_HEART_ANY PokerCard = 32
	PokerCard_HEART_A   PokerCard = 33
	PokerCard_HEART_2   PokerCard = 34
	PokerCard_HEART_3   PokerCard = 35
	PokerCard_HEART_4   PokerCard = 36
	PokerCard_HEART_5   PokerCard = 37
	PokerCard_HEART_6   PokerCard = 38
	PokerCard_HEART_7   PokerCard = 39
	PokerCard_HEART_8   PokerCard = 40
	PokerCard_HEART_9   PokerCard = 41
	PokerCard_HEART_10  PokerCard = 42
	PokerCard_HEART_J   PokerCard = 43
	PokerCard_HEART_Q   PokerCard = 44
	PokerCard_HEART_K   PokerCard = 45
	// 梅花
	PokerCard_CLUB_ANY PokerCard = 48
	PokerCard_CLUB_A   PokerCard = 49
	PokerCard_CLUB_2   PokerCard = 50
	PokerCard_CLUB_3   PokerCard = 51
	PokerCard_CLUB_4   PokerCard = 52
	PokerCard_CLUB_5   PokerCard = 53
	PokerCard_CLUB_6   PokerCard = 54
	PokerCard_CLUB_7   PokerCard = 55
	PokerCard_CLUB_8   PokerCard = 56
	PokerCard_CLUB_9   PokerCard = 57
	PokerCard_CLUB_10  PokerCard = 58
	PokerCard_CLUB_J   PokerCard = 59
	PokerCard_CLUB_Q   PokerCard = 60
	PokerCard_CLUB_K   PokerCard = 61
	// 鑽石
	PokerCard_DIAMOND_ANY PokerCard = 64
	PokerCard_DIAMOND_A   PokerCard = 65
	PokerCard_DIAMOND_2   PokerCard = 66
	PokerCard_DIAMOND_3   PokerCard = 67
	PokerCard_DIAMOND_4   PokerCard = 68
	PokerCard_DIAMOND_5   PokerCard = 69
	PokerCard_DIAMOND_6   PokerCard = 70
	PokerCard_DIAMOND_7   PokerCard = 71
	PokerCard_DIAMOND_8   PokerCard = 72
	PokerCard_DIAMOND_9   PokerCard = 73
	PokerCard_DIAMOND_10  PokerCard = 74
	PokerCard_DIAMOND_J   PokerCard = 75
	PokerCard_DIAMOND_Q   PokerCard = 76
	PokerCard_DIAMOND_K   PokerCard = 77
	// 鬼牌
	PokerCard_JOKER_COLOR PokerCard = 94
	PokerCard_JOKER_BLACK PokerCard = 95
	// 花色遮罩
	PokerCard_SUIT_MASK PokerCard = 112
)

// Enum value maps for PokerCard.
var (
	PokerCard_name = map[int32]string{
		0:   "POKER_CARD_UNSPECIFIED",
		1:   "ANY_A",
		2:   "ANY_2",
		3:   "ANY_3",
		4:   "ANY_4",
		5:   "ANY_5",
		6:   "ANY_6",
		7:   "ANY_7",
		8:   "ANY_8",
		9:   "ANY_9",
		10:  "ANY_10",
		11:  "ANY_J",
		12:  "ANY_Q",
		13:  "ANY_K",
		15:  "MASK",
		16:  "SPADE_ANY",
		17:  "SPADE_A",
		18:  "SPADE_2",
		19:  "SPADE_3",
		20:  "SPADE_4",
		21:  "SPADE_5",
		22:  "SPADE_6",
		23:  "SPADE_7",
		24:  "SPADE_8",
		25:  "SPADE_9",
		26:  "SPADE_10",
		27:  "SPADE_J",
		28:  "SPADE_Q",
		29:  "SPADE_K",
		32:  "HEART_ANY",
		33:  "HEART_A",
		34:  "HEART_2",
		35:  "HEART_3",
		36:  "HEART_4",
		37:  "HEART_5",
		38:  "HEART_6",
		39:  "HEART_7",
		40:  "HEART_8",
		41:  "HEART_9",
		42:  "HEART_10",
		43:  "HEART_J",
		44:  "HEART_Q",
		45:  "HEART_K",
		48:  "CLUB_ANY",
		49:  "CLUB_A",
		50:  "CLUB_2",
		51:  "CLUB_3",
		52:  "CLUB_4",
		53:  "CLUB_5",
		54:  "CLUB_6",
		55:  "CLUB_7",
		56:  "CLUB_8",
		57:  "CLUB_9",
		58:  "CLUB_10",
		59:  "CLUB_J",
		60:  "CLUB_Q",
		61:  "CLUB_K",
		64:  "DIAMOND_ANY",
		65:  "DIAMOND_A",
		66:  "DIAMOND_2",
		67:  "DIAMOND_3",
		68:  "DIAMOND_4",
		69:  "DIAMOND_5",
		70:  "DIAMOND_6",
		71:  "DIAMOND_7",
		72:  "DIAMOND_8",
		73:  "DIAMOND_9",
		74:  "DIAMOND_10",
		75:  "DIAMOND_J",
		76:  "DIAMOND_Q",
		77:  "DIAMOND_K",
		94:  "JOKER_COLOR",
		95:  "JOKER_BLACK",
		112: "SUIT_MASK",
	}
	PokerCard_value = map[string]int32{
		"POKER_CARD_UNSPECIFIED": 0,
		"ANY_A":                  1,
		"ANY_2":                  2,
		"ANY_3":                  3,
		"ANY_4":                  4,
		"ANY_5":                  5,
		"ANY_6":                  6,
		"ANY_7":                  7,
		"ANY_8":                  8,
		"ANY_9":                  9,
		"ANY_10":                 10,
		"ANY_J":                  11,
		"ANY_Q":                  12,
		"ANY_K":                  13,
		"MASK":                   15,
		"SPADE_ANY":              16,
		"SPADE_A":                17,
		"SPADE_2":                18,
		"SPADE_3":                19,
		"SPADE_4":                20,
		"SPADE_5":                21,
		"SPADE_6":                22,
		"SPADE_7":                23,
		"SPADE_8":                24,
		"SPADE_9":                25,
		"SPADE_10":               26,
		"SPADE_J":                27,
		"SPADE_Q":                28,
		"SPADE_K":                29,
		"HEART_ANY":              32,
		"HEART_A":                33,
		"HEART_2":                34,
		"HEART_3":                35,
		"HEART_4":                36,
		"HEART_5":                37,
		"HEART_6":                38,
		"HEART_7":                39,
		"HEART_8":                40,
		"HEART_9":                41,
		"HEART_10":               42,
		"HEART_J":                43,
		"HEART_Q":                44,
		"HEART_K":                45,
		"CLUB_ANY":               48,
		"CLUB_A":                 49,
		"CLUB_2":                 50,
		"CLUB_3":                 51,
		"CLUB_4":                 52,
		"CLUB_5":                 53,
		"CLUB_6":                 54,
		"CLUB_7":                 55,
		"CLUB_8":                 56,
		"CLUB_9":                 57,
		"CLUB_10":                58,
		"CLUB_J":                 59,
		"CLUB_Q":                 60,
		"CLUB_K":                 61,
		"DIAMOND_ANY":            64,
		"DIAMOND_A":              65,
		"DIAMOND_2":              66,
		"DIAMOND_3":              67,
		"DIAMOND_4":              68,
		"DIAMOND_5":              69,
		"DIAMOND_6":              70,
		"DIAMOND_7":              71,
		"DIAMOND_8":              72,
		"DIAMOND_9":              73,
		"DIAMOND_10":             74,
		"DIAMOND_J":              75,
		"DIAMOND_Q":              76,
		"DIAMOND_K":              77,
		"JOKER_COLOR":            94,
		"JOKER_BLACK":            95,
		"SUIT_MASK":              112,
	}
)

func (x PokerCard) Enum() *PokerCard {
	p := new(PokerCard)
	*p = x
	return p
}

func (x PokerCard) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (PokerCard) Descriptor() protoreflect.EnumDescriptor {
	return file_cards_poker_proto_enumTypes[0].Descriptor()
}

func (PokerCard) Type() protoreflect.EnumType {
	return &file_cards_poker_proto_enumTypes[0]
}

func (x PokerCard) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use PokerCard.Descriptor instead.
func (PokerCard) EnumDescriptor() ([]byte, []int) {
	return file_cards_poker_proto_rawDescGZIP(), []int{0}
}

var File_cards_poker_proto protoreflect.FileDescriptor

var file_cards_poker_proto_rawDesc = []byte{
	0x0a, 0x11, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2f, 0x70, 0x6f, 0x6b, 0x65, 0x72, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x05, 0x63, 0x61, 0x72, 0x64, 0x73, 0x2a, 0xe4, 0x07, 0x0a, 0x09, 0x50,
	0x6f, 0x6b, 0x65, 0x72, 0x43, 0x61, 0x72, 0x64, 0x12, 0x1a, 0x0a, 0x16, 0x50, 0x4f, 0x4b, 0x45,
	0x52, 0x5f, 0x43, 0x41, 0x52, 0x44, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49,
	0x45, 0x44, 0x10, 0x00, 0x12, 0x09, 0x0a, 0x05, 0x41, 0x4e, 0x59, 0x5f, 0x41, 0x10, 0x01, 0x12,
	0x09, 0x0a, 0x05, 0x41, 0x4e, 0x59, 0x5f, 0x32, 0x10, 0x02, 0x12, 0x09, 0x0a, 0x05, 0x41, 0x4e,
	0x59, 0x5f, 0x33, 0x10, 0x03, 0x12, 0x09, 0x0a, 0x05, 0x41, 0x4e, 0x59, 0x5f, 0x34, 0x10, 0x04,
	0x12, 0x09, 0x0a, 0x05, 0x41, 0x4e, 0x59, 0x5f, 0x35, 0x10, 0x05, 0x12, 0x09, 0x0a, 0x05, 0x41,
	0x4e, 0x59, 0x5f, 0x36, 0x10, 0x06, 0x12, 0x09, 0x0a, 0x05, 0x41, 0x4e, 0x59, 0x5f, 0x37, 0x10,
	0x07, 0x12, 0x09, 0x0a, 0x05, 0x41, 0x4e, 0x59, 0x5f, 0x38, 0x10, 0x08, 0x12, 0x09, 0x0a, 0x05,
	0x41, 0x4e, 0x59, 0x5f, 0x39, 0x10, 0x09, 0x12, 0x0a, 0x0a, 0x06, 0x41, 0x4e, 0x59, 0x5f, 0x31,
	0x30, 0x10, 0x0a, 0x12, 0x09, 0x0a, 0x05, 0x41, 0x4e, 0x59, 0x5f, 0x4a, 0x10, 0x0b, 0x12, 0x09,
	0x0a, 0x05, 0x41, 0x4e, 0x59, 0x5f, 0x51, 0x10, 0x0c, 0x12, 0x09, 0x0a, 0x05, 0x41, 0x4e, 0x59,
	0x5f, 0x4b, 0x10, 0x0d, 0x12, 0x08, 0x0a, 0x04, 0x4d, 0x41, 0x53, 0x4b, 0x10, 0x0f, 0x12, 0x0d,
	0x0a, 0x09, 0x53, 0x50, 0x41, 0x44, 0x45, 0x5f, 0x41, 0x4e, 0x59, 0x10, 0x10, 0x12, 0x0b, 0x0a,
	0x07, 0x53, 0x50, 0x41, 0x44, 0x45, 0x5f, 0x41, 0x10, 0x11, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x50,
	0x41, 0x44, 0x45, 0x5f, 0x32, 0x10, 0x12, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x50, 0x41, 0x44, 0x45,
	0x5f, 0x33, 0x10, 0x13, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x50, 0x41, 0x44, 0x45, 0x5f, 0x34, 0x10,
	0x14, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x50, 0x41, 0x44, 0x45, 0x5f, 0x35, 0x10, 0x15, 0x12, 0x0b,
	0x0a, 0x07, 0x53, 0x50, 0x41, 0x44, 0x45, 0x5f, 0x36, 0x10, 0x16, 0x12, 0x0b, 0x0a, 0x07, 0x53,
	0x50, 0x41, 0x44, 0x45, 0x5f, 0x37, 0x10, 0x17, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x50, 0x41, 0x44,
	0x45, 0x5f, 0x38, 0x10, 0x18, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x50, 0x41, 0x44, 0x45, 0x5f, 0x39,
	0x10, 0x19, 0x12, 0x0c, 0x0a, 0x08, 0x53, 0x50, 0x41, 0x44, 0x45, 0x5f, 0x31, 0x30, 0x10, 0x1a,
	0x12, 0x0b, 0x0a, 0x07, 0x53, 0x50, 0x41, 0x44, 0x45, 0x5f, 0x4a, 0x10, 0x1b, 0x12, 0x0b, 0x0a,
	0x07, 0x53, 0x50, 0x41, 0x44, 0x45, 0x5f, 0x51, 0x10, 0x1c, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x50,
	0x41, 0x44, 0x45, 0x5f, 0x4b, 0x10, 0x1d, 0x12, 0x0d, 0x0a, 0x09, 0x48, 0x45, 0x41, 0x52, 0x54,
	0x5f, 0x41, 0x4e, 0x59, 0x10, 0x20, 0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45, 0x41, 0x52, 0x54, 0x5f,
	0x41, 0x10, 0x21, 0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45, 0x41, 0x52, 0x54, 0x5f, 0x32, 0x10, 0x22,
	0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45, 0x41, 0x52, 0x54, 0x5f, 0x33, 0x10, 0x23, 0x12, 0x0b, 0x0a,
	0x07, 0x48, 0x45, 0x41, 0x52, 0x54, 0x5f, 0x34, 0x10, 0x24, 0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45,
	0x41, 0x52, 0x54, 0x5f, 0x35, 0x10, 0x25, 0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45, 0x41, 0x52, 0x54,
	0x5f, 0x36, 0x10, 0x26, 0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45, 0x41, 0x52, 0x54, 0x5f, 0x37, 0x10,
	0x27, 0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45, 0x41, 0x52, 0x54, 0x5f, 0x38, 0x10, 0x28, 0x12, 0x0b,
	0x0a, 0x07, 0x48, 0x45, 0x41, 0x52, 0x54, 0x5f, 0x39, 0x10, 0x29, 0x12, 0x0c, 0x0a, 0x08, 0x48,
	0x45, 0x41, 0x52, 0x54, 0x5f, 0x31, 0x30, 0x10, 0x2a, 0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45, 0x41,
	0x52, 0x54, 0x5f, 0x4a, 0x10, 0x2b, 0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45, 0x41, 0x52, 0x54, 0x5f,
	0x51, 0x10, 0x2c, 0x12, 0x0b, 0x0a, 0x07, 0x48, 0x45, 0x41, 0x52, 0x54, 0x5f, 0x4b, 0x10, 0x2d,
	0x12, 0x0c, 0x0a, 0x08, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x41, 0x4e, 0x59, 0x10, 0x30, 0x12, 0x0a,
	0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x41, 0x10, 0x31, 0x12, 0x0a, 0x0a, 0x06, 0x43, 0x4c,
	0x55, 0x42, 0x5f, 0x32, 0x10, 0x32, 0x12, 0x0a, 0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x33,
	0x10, 0x33, 0x12, 0x0a, 0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x34, 0x10, 0x34, 0x12, 0x0a,
	0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x35, 0x10, 0x35, 0x12, 0x0a, 0x0a, 0x06, 0x43, 0x4c,
	0x55, 0x42, 0x5f, 0x36, 0x10, 0x36, 0x12, 0x0a, 0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x37,
	0x10, 0x37, 0x12, 0x0a, 0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x38, 0x10, 0x38, 0x12, 0x0a,
	0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x39, 0x10, 0x39, 0x12, 0x0b, 0x0a, 0x07, 0x43, 0x4c,
	0x55, 0x42, 0x5f, 0x31, 0x30, 0x10, 0x3a, 0x12, 0x0a, 0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f,
	0x4a, 0x10, 0x3b, 0x12, 0x0a, 0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x51, 0x10, 0x3c, 0x12,
	0x0a, 0x0a, 0x06, 0x43, 0x4c, 0x55, 0x42, 0x5f, 0x4b, 0x10, 0x3d, 0x12, 0x0f, 0x0a, 0x0b, 0x44,
	0x49, 0x41, 0x4d, 0x4f, 0x4e, 0x44, 0x5f, 0x41, 0x4e, 0x59, 0x10, 0x40, 0x12, 0x0d, 0x0a, 0x09,
	0x44, 0x49, 0x41, 0x4d, 0x4f, 0x4e, 0x44, 0x5f, 0x41, 0x10, 0x41, 0x12, 0x0d, 0x0a, 0x09, 0x44,
	0x49, 0x41, 0x4d, 0x4f, 0x4e, 0x44, 0x5f, 0x32, 0x10, 0x42, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49,
	0x41, 0x4d, 0x4f, 0x4e, 0x44, 0x5f, 0x33, 0x10, 0x43, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49, 0x41,
	0x4d, 0x4f, 0x4e, 0x44, 0x5f, 0x34, 0x10, 0x44, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49, 0x41, 0x4d,
	0x4f, 0x4e, 0x44, 0x5f, 0x35, 0x10, 0x45, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49, 0x41, 0x4d, 0x4f,
	0x4e, 0x44, 0x5f, 0x36, 0x10, 0x46, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49, 0x41, 0x4d, 0x4f, 0x4e,
	0x44, 0x5f, 0x37, 0x10, 0x47, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49, 0x41, 0x4d, 0x4f, 0x4e, 0x44,
	0x5f, 0x38, 0x10, 0x48, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49, 0x41, 0x4d, 0x4f, 0x4e, 0x44, 0x5f,
	0x39, 0x10, 0x49, 0x12, 0x0e, 0x0a, 0x0a, 0x44, 0x49, 0x41, 0x4d, 0x4f, 0x4e, 0x44, 0x5f, 0x31,
	0x30, 0x10, 0x4a, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49, 0x41, 0x4d, 0x4f, 0x4e, 0x44, 0x5f, 0x4a,
	0x10, 0x4b, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49, 0x41, 0x4d, 0x4f, 0x4e, 0x44, 0x5f, 0x51, 0x10,
	0x4c, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x49, 0x41, 0x4d, 0x4f, 0x4e, 0x44, 0x5f, 0x4b, 0x10, 0x4d,
	0x12, 0x0f, 0x0a, 0x0b, 0x4a, 0x4f, 0x4b, 0x45, 0x52, 0x5f, 0x43, 0x4f, 0x4c, 0x4f, 0x52, 0x10,
	0x5e, 0x12, 0x0f, 0x0a, 0x0b, 0x4a, 0x4f, 0x4b, 0x45, 0x52, 0x5f, 0x42, 0x4c, 0x41, 0x43, 0x4b,
	0x10, 0x5f, 0x12, 0x0d, 0x0a, 0x09, 0x53, 0x55, 0x49, 0x54, 0x5f, 0x4d, 0x41, 0x53, 0x4b, 0x10,
	0x70, 0x42, 0x89, 0x01, 0x0a, 0x18, 0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69,
	0x6e, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x63, 0x61, 0x72, 0x64, 0x73, 0x42, 0x0a,
	0x50, 0x6f, 0x6b, 0x65, 0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2d, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e,
	0x6f, 0x2f, 0x77, 0x65, 0x63, 0x61, 0x73, 0x69, 0x6e, 0x6f, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x70, 0x62, 0x67, 0x6f, 0x2f, 0x63, 0x61, 0x72, 0x64, 0x73, 0xa2, 0x02, 0x03, 0x43, 0x58,
	0x58, 0xaa, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0xca, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64,
	0x73, 0xe2, 0x02, 0x11, 0x43, 0x61, 0x72, 0x64, 0x73, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74,
	0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x05, 0x43, 0x61, 0x72, 0x64, 0x73, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_cards_poker_proto_rawDescOnce sync.Once
	file_cards_poker_proto_rawDescData = file_cards_poker_proto_rawDesc
)

func file_cards_poker_proto_rawDescGZIP() []byte {
	file_cards_poker_proto_rawDescOnce.Do(func() {
		file_cards_poker_proto_rawDescData = protoimpl.X.CompressGZIP(file_cards_poker_proto_rawDescData)
	})
	return file_cards_poker_proto_rawDescData
}

var file_cards_poker_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_cards_poker_proto_goTypes = []interface{}{
	(PokerCard)(0), // 0: cards.PokerCard
}
var file_cards_poker_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_cards_poker_proto_init() }
func file_cards_poker_proto_init() {
	if File_cards_poker_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_cards_poker_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_cards_poker_proto_goTypes,
		DependencyIndexes: file_cards_poker_proto_depIdxs,
		EnumInfos:         file_cards_poker_proto_enumTypes,
	}.Build()
	File_cards_poker_proto = out.File
	file_cards_poker_proto_rawDesc = nil
	file_cards_poker_proto_goTypes = nil
	file_cards_poker_proto_depIdxs = nil
}
