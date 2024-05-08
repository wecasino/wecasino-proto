// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             (unknown)
// source: recorder/provider.proto

package recorder

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

const (
	RecorderReadService_ListShifts_FullMethodName       = "/recorder.RecorderReadService/ListShifts"
	RecorderReadService_GetShift_FullMethodName         = "/recorder.RecorderReadService/GetShift"
	RecorderReadService_GetCurrentShift_FullMethodName  = "/recorder.RecorderReadService/GetCurrentShift"
	RecorderReadService_ListShoe_FullMethodName         = "/recorder.RecorderReadService/ListShoe"
	RecorderReadService_GetShoe_FullMethodName          = "/recorder.RecorderReadService/GetShoe"
	RecorderReadService_GetCurrentShoe_FullMethodName   = "/recorder.RecorderReadService/GetCurrentShoe"
	RecorderReadService_ListRounds_FullMethodName       = "/recorder.RecorderReadService/ListRounds"
	RecorderReadService_GetRound_FullMethodName         = "/recorder.RecorderReadService/GetRound"
	RecorderReadService_GetCurrentRound_FullMethodName  = "/recorder.RecorderReadService/GetCurrentRound"
	RecorderReadService_GetPlayBackRound_FullMethodName = "/recorder.RecorderReadService/GetPlayBackRound"
)

// RecorderReadServiceClient is the client API for RecorderReadService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type RecorderReadServiceClient interface {
	// 讀取班次紀錄List
	ListShifts(ctx context.Context, in *ListRecordsRequest, opts ...grpc.CallOption) (*ListShiftsResponse, error)
	// 讀取指定班次紀錄
	GetShift(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*ShiftRecord, error)
	// 讀取目前班次紀錄
	GetCurrentShift(ctx context.Context, in *GetCurrentRecordRequest, opts ...grpc.CallOption) (*ShiftRecord, error)
	// 讀牌靴紀錄list
	ListShoe(ctx context.Context, in *ListRecordsRequest, opts ...grpc.CallOption) (*ListShoesRecordResponse, error)
	// 讀取指定靴紀錄
	GetShoe(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*ShoeRecord, error)
	// 讀取目前靴紀錄
	GetCurrentShoe(ctx context.Context, in *GetCurrentRecordRequest, opts ...grpc.CallOption) (*ShoeRecord, error)
	// 讀牌局紀錄list
	ListRounds(ctx context.Context, in *ListRecordsRequest, opts ...grpc.CallOption) (*ListRoundsRecordResponse, error)
	// 讀取指定局紀錄
	GetRound(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*RoundRecord, error)
	// 讀取目前局紀錄
	GetCurrentRound(ctx context.Context, in *GetCurrentRecordRequest, opts ...grpc.CallOption) (*RoundRecord, error)
	GetPlayBackRound(ctx context.Context, in *GetRoundPlayBackRequest, opts ...grpc.CallOption) (*GetRoundPlayBackResponse, error)
}

type recorderReadServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewRecorderReadServiceClient(cc grpc.ClientConnInterface) RecorderReadServiceClient {
	return &recorderReadServiceClient{cc}
}

func (c *recorderReadServiceClient) ListShifts(ctx context.Context, in *ListRecordsRequest, opts ...grpc.CallOption) (*ListShiftsResponse, error) {
	out := new(ListShiftsResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_ListShifts_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) GetShift(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*ShiftRecord, error) {
	out := new(ShiftRecord)
	err := c.cc.Invoke(ctx, RecorderReadService_GetShift_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) GetCurrentShift(ctx context.Context, in *GetCurrentRecordRequest, opts ...grpc.CallOption) (*ShiftRecord, error) {
	out := new(ShiftRecord)
	err := c.cc.Invoke(ctx, RecorderReadService_GetCurrentShift_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) ListShoe(ctx context.Context, in *ListRecordsRequest, opts ...grpc.CallOption) (*ListShoesRecordResponse, error) {
	out := new(ListShoesRecordResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_ListShoe_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) GetShoe(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*ShoeRecord, error) {
	out := new(ShoeRecord)
	err := c.cc.Invoke(ctx, RecorderReadService_GetShoe_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) GetCurrentShoe(ctx context.Context, in *GetCurrentRecordRequest, opts ...grpc.CallOption) (*ShoeRecord, error) {
	out := new(ShoeRecord)
	err := c.cc.Invoke(ctx, RecorderReadService_GetCurrentShoe_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) ListRounds(ctx context.Context, in *ListRecordsRequest, opts ...grpc.CallOption) (*ListRoundsRecordResponse, error) {
	out := new(ListRoundsRecordResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_ListRounds_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) GetRound(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*RoundRecord, error) {
	out := new(RoundRecord)
	err := c.cc.Invoke(ctx, RecorderReadService_GetRound_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) GetCurrentRound(ctx context.Context, in *GetCurrentRecordRequest, opts ...grpc.CallOption) (*RoundRecord, error) {
	out := new(RoundRecord)
	err := c.cc.Invoke(ctx, RecorderReadService_GetCurrentRound_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) GetPlayBackRound(ctx context.Context, in *GetRoundPlayBackRequest, opts ...grpc.CallOption) (*GetRoundPlayBackResponse, error) {
	out := new(GetRoundPlayBackResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_GetPlayBackRound_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// RecorderReadServiceServer is the server API for RecorderReadService service.
// All implementations must embed UnimplementedRecorderReadServiceServer
// for forward compatibility
type RecorderReadServiceServer interface {
	// 讀取班次紀錄List
	ListShifts(context.Context, *ListRecordsRequest) (*ListShiftsResponse, error)
	// 讀取指定班次紀錄
	GetShift(context.Context, *GetRequest) (*ShiftRecord, error)
	// 讀取目前班次紀錄
	GetCurrentShift(context.Context, *GetCurrentRecordRequest) (*ShiftRecord, error)
	// 讀牌靴紀錄list
	ListShoe(context.Context, *ListRecordsRequest) (*ListShoesRecordResponse, error)
	// 讀取指定靴紀錄
	GetShoe(context.Context, *GetRequest) (*ShoeRecord, error)
	// 讀取目前靴紀錄
	GetCurrentShoe(context.Context, *GetCurrentRecordRequest) (*ShoeRecord, error)
	// 讀牌局紀錄list
	ListRounds(context.Context, *ListRecordsRequest) (*ListRoundsRecordResponse, error)
	// 讀取指定局紀錄
	GetRound(context.Context, *GetRequest) (*RoundRecord, error)
	// 讀取目前局紀錄
	GetCurrentRound(context.Context, *GetCurrentRecordRequest) (*RoundRecord, error)
	GetPlayBackRound(context.Context, *GetRoundPlayBackRequest) (*GetRoundPlayBackResponse, error)
	mustEmbedUnimplementedRecorderReadServiceServer()
}

// UnimplementedRecorderReadServiceServer must be embedded to have forward compatible implementations.
type UnimplementedRecorderReadServiceServer struct {
}

func (UnimplementedRecorderReadServiceServer) ListShifts(context.Context, *ListRecordsRequest) (*ListShiftsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListShifts not implemented")
}
func (UnimplementedRecorderReadServiceServer) GetShift(context.Context, *GetRequest) (*ShiftRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetShift not implemented")
}
func (UnimplementedRecorderReadServiceServer) GetCurrentShift(context.Context, *GetCurrentRecordRequest) (*ShiftRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetCurrentShift not implemented")
}
func (UnimplementedRecorderReadServiceServer) ListShoe(context.Context, *ListRecordsRequest) (*ListShoesRecordResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListShoe not implemented")
}
func (UnimplementedRecorderReadServiceServer) GetShoe(context.Context, *GetRequest) (*ShoeRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetShoe not implemented")
}
func (UnimplementedRecorderReadServiceServer) GetCurrentShoe(context.Context, *GetCurrentRecordRequest) (*ShoeRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetCurrentShoe not implemented")
}
func (UnimplementedRecorderReadServiceServer) ListRounds(context.Context, *ListRecordsRequest) (*ListRoundsRecordResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListRounds not implemented")
}
func (UnimplementedRecorderReadServiceServer) GetRound(context.Context, *GetRequest) (*RoundRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetRound not implemented")
}
func (UnimplementedRecorderReadServiceServer) GetCurrentRound(context.Context, *GetCurrentRecordRequest) (*RoundRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetCurrentRound not implemented")
}
func (UnimplementedRecorderReadServiceServer) GetPlayBackRound(context.Context, *GetRoundPlayBackRequest) (*GetRoundPlayBackResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetPlayBackRound not implemented")
}
func (UnimplementedRecorderReadServiceServer) mustEmbedUnimplementedRecorderReadServiceServer() {}

// UnsafeRecorderReadServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to RecorderReadServiceServer will
// result in compilation errors.
type UnsafeRecorderReadServiceServer interface {
	mustEmbedUnimplementedRecorderReadServiceServer()
}

func RegisterRecorderReadServiceServer(s grpc.ServiceRegistrar, srv RecorderReadServiceServer) {
	s.RegisterService(&RecorderReadService_ServiceDesc, srv)
}

func _RecorderReadService_ListShifts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListRecordsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).ListShifts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_ListShifts_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).ListShifts(ctx, req.(*ListRecordsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_GetShift_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).GetShift(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_GetShift_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).GetShift(ctx, req.(*GetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_GetCurrentShift_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetCurrentRecordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).GetCurrentShift(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_GetCurrentShift_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).GetCurrentShift(ctx, req.(*GetCurrentRecordRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_ListShoe_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListRecordsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).ListShoe(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_ListShoe_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).ListShoe(ctx, req.(*ListRecordsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_GetShoe_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).GetShoe(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_GetShoe_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).GetShoe(ctx, req.(*GetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_GetCurrentShoe_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetCurrentRecordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).GetCurrentShoe(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_GetCurrentShoe_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).GetCurrentShoe(ctx, req.(*GetCurrentRecordRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_ListRounds_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListRecordsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).ListRounds(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_ListRounds_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).ListRounds(ctx, req.(*ListRecordsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_GetRound_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).GetRound(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_GetRound_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).GetRound(ctx, req.(*GetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_GetCurrentRound_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetCurrentRecordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).GetCurrentRound(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_GetCurrentRound_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).GetCurrentRound(ctx, req.(*GetCurrentRecordRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_GetPlayBackRound_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetRoundPlayBackRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).GetPlayBackRound(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_GetPlayBackRound_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).GetPlayBackRound(ctx, req.(*GetRoundPlayBackRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// RecorderReadService_ServiceDesc is the grpc.ServiceDesc for RecorderReadService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var RecorderReadService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "recorder.RecorderReadService",
	HandlerType: (*RecorderReadServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ListShifts",
			Handler:    _RecorderReadService_ListShifts_Handler,
		},
		{
			MethodName: "GetShift",
			Handler:    _RecorderReadService_GetShift_Handler,
		},
		{
			MethodName: "GetCurrentShift",
			Handler:    _RecorderReadService_GetCurrentShift_Handler,
		},
		{
			MethodName: "ListShoe",
			Handler:    _RecorderReadService_ListShoe_Handler,
		},
		{
			MethodName: "GetShoe",
			Handler:    _RecorderReadService_GetShoe_Handler,
		},
		{
			MethodName: "GetCurrentShoe",
			Handler:    _RecorderReadService_GetCurrentShoe_Handler,
		},
		{
			MethodName: "ListRounds",
			Handler:    _RecorderReadService_ListRounds_Handler,
		},
		{
			MethodName: "GetRound",
			Handler:    _RecorderReadService_GetRound_Handler,
		},
		{
			MethodName: "GetCurrentRound",
			Handler:    _RecorderReadService_GetCurrentRound_Handler,
		},
		{
			MethodName: "GetPlayBackRound",
			Handler:    _RecorderReadService_GetPlayBackRound_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "recorder/provider.proto",
}

const (
	ProviderService_ListGames_FullMethodName   = "/recorder.ProviderService/ListGames"
	ProviderService_GetGames_FullMethodName    = "/recorder.ProviderService/GetGames"
	ProviderService_VerifyGame_FullMethodName  = "/recorder.ProviderService/VerifyGame"
	ProviderService_ListDealers_FullMethodName = "/recorder.ProviderService/ListDealers"
	ProviderService_GetDealer_FullMethodName   = "/recorder.ProviderService/GetDealer"
)

// ProviderServiceClient is the client API for ProviderService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type ProviderServiceClient interface {
	// 取得即時遊戲列表
	ListGames(ctx context.Context, in *ListGamesRequest, opts ...grpc.CallOption) (*ListGamesResponse, error)
	// 取得單一即時遊戲資訊
	GetGames(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*GameProvide, error)
	// 驗證
	VerifyGame(ctx context.Context, in *VerifyGameRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	// 荷官資料
	ListDealers(ctx context.Context, in *ListDealersRequest, opts ...grpc.CallOption) (*ListDealersResponse, error)
	// 荷官資料
	GetDealer(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*Dealer, error)
}

type providerServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewProviderServiceClient(cc grpc.ClientConnInterface) ProviderServiceClient {
	return &providerServiceClient{cc}
}

func (c *providerServiceClient) ListGames(ctx context.Context, in *ListGamesRequest, opts ...grpc.CallOption) (*ListGamesResponse, error) {
	out := new(ListGamesResponse)
	err := c.cc.Invoke(ctx, ProviderService_ListGames_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *providerServiceClient) GetGames(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*GameProvide, error) {
	out := new(GameProvide)
	err := c.cc.Invoke(ctx, ProviderService_GetGames_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *providerServiceClient) VerifyGame(ctx context.Context, in *VerifyGameRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, ProviderService_VerifyGame_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *providerServiceClient) ListDealers(ctx context.Context, in *ListDealersRequest, opts ...grpc.CallOption) (*ListDealersResponse, error) {
	out := new(ListDealersResponse)
	err := c.cc.Invoke(ctx, ProviderService_ListDealers_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *providerServiceClient) GetDealer(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*Dealer, error) {
	out := new(Dealer)
	err := c.cc.Invoke(ctx, ProviderService_GetDealer_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ProviderServiceServer is the server API for ProviderService service.
// All implementations must embed UnimplementedProviderServiceServer
// for forward compatibility
type ProviderServiceServer interface {
	// 取得即時遊戲列表
	ListGames(context.Context, *ListGamesRequest) (*ListGamesResponse, error)
	// 取得單一即時遊戲資訊
	GetGames(context.Context, *GetRequest) (*GameProvide, error)
	// 驗證
	VerifyGame(context.Context, *VerifyGameRequest) (*emptypb.Empty, error)
	// 荷官資料
	ListDealers(context.Context, *ListDealersRequest) (*ListDealersResponse, error)
	// 荷官資料
	GetDealer(context.Context, *GetRequest) (*Dealer, error)
	mustEmbedUnimplementedProviderServiceServer()
}

// UnimplementedProviderServiceServer must be embedded to have forward compatible implementations.
type UnimplementedProviderServiceServer struct {
}

func (UnimplementedProviderServiceServer) ListGames(context.Context, *ListGamesRequest) (*ListGamesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListGames not implemented")
}
func (UnimplementedProviderServiceServer) GetGames(context.Context, *GetRequest) (*GameProvide, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetGames not implemented")
}
func (UnimplementedProviderServiceServer) VerifyGame(context.Context, *VerifyGameRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method VerifyGame not implemented")
}
func (UnimplementedProviderServiceServer) ListDealers(context.Context, *ListDealersRequest) (*ListDealersResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListDealers not implemented")
}
func (UnimplementedProviderServiceServer) GetDealer(context.Context, *GetRequest) (*Dealer, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetDealer not implemented")
}
func (UnimplementedProviderServiceServer) mustEmbedUnimplementedProviderServiceServer() {}

// UnsafeProviderServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to ProviderServiceServer will
// result in compilation errors.
type UnsafeProviderServiceServer interface {
	mustEmbedUnimplementedProviderServiceServer()
}

func RegisterProviderServiceServer(s grpc.ServiceRegistrar, srv ProviderServiceServer) {
	s.RegisterService(&ProviderService_ServiceDesc, srv)
}

func _ProviderService_ListGames_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListGamesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProviderServiceServer).ListGames(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: ProviderService_ListGames_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProviderServiceServer).ListGames(ctx, req.(*ListGamesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ProviderService_GetGames_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProviderServiceServer).GetGames(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: ProviderService_GetGames_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProviderServiceServer).GetGames(ctx, req.(*GetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ProviderService_VerifyGame_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(VerifyGameRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProviderServiceServer).VerifyGame(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: ProviderService_VerifyGame_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProviderServiceServer).VerifyGame(ctx, req.(*VerifyGameRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ProviderService_ListDealers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListDealersRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProviderServiceServer).ListDealers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: ProviderService_ListDealers_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProviderServiceServer).ListDealers(ctx, req.(*ListDealersRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ProviderService_GetDealer_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProviderServiceServer).GetDealer(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: ProviderService_GetDealer_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProviderServiceServer).GetDealer(ctx, req.(*GetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// ProviderService_ServiceDesc is the grpc.ServiceDesc for ProviderService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var ProviderService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "recorder.ProviderService",
	HandlerType: (*ProviderServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ListGames",
			Handler:    _ProviderService_ListGames_Handler,
		},
		{
			MethodName: "GetGames",
			Handler:    _ProviderService_GetGames_Handler,
		},
		{
			MethodName: "VerifyGame",
			Handler:    _ProviderService_VerifyGame_Handler,
		},
		{
			MethodName: "ListDealers",
			Handler:    _ProviderService_ListDealers_Handler,
		},
		{
			MethodName: "GetDealer",
			Handler:    _ProviderService_GetDealer_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "recorder/provider.proto",
}
