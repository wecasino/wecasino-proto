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
	RecorderReadService_FetchShiftRecord_FullMethodName        = "/recorder.RecorderReadService/FetchShiftRecord"
	RecorderReadService_FetchLastOneShiftRecord_FullMethodName = "/recorder.RecorderReadService/FetchLastOneShiftRecord"
	RecorderReadService_FetchShoeRecord_FullMethodName         = "/recorder.RecorderReadService/FetchShoeRecord"
	RecorderReadService_FetchLastOneShoeRecord_FullMethodName  = "/recorder.RecorderReadService/FetchLastOneShoeRecord"
	RecorderReadService_FetchRoundRecord_FullMethodName        = "/recorder.RecorderReadService/FetchRoundRecord"
	RecorderReadService_FetchLastOneRoundRecord_FullMethodName = "/recorder.RecorderReadService/FetchLastOneRoundRecord"
)

// RecorderReadServiceClient is the client API for RecorderReadService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type RecorderReadServiceClient interface {
	// 讀取班次紀錄list
	FetchShiftRecord(ctx context.Context, in *FetchShiftRecordRequest, opts ...grpc.CallOption) (*FetchShiftRecordResponse, error)
	// 讀取最新班次紀錄
	FetchLastOneShiftRecord(ctx context.Context, in *FetchShiftRecordRequest, opts ...grpc.CallOption) (*FetchShiftRecordResponse, error)
	// 讀牌靴紀錄list
	FetchShoeRecord(ctx context.Context, in *FetchShoeRecordRequest, opts ...grpc.CallOption) (*FetchShoeRecordResponse, error)
	// 讀最新牌靴紀錄
	FetchLastOneShoeRecord(ctx context.Context, in *FetchShoeRecordRequest, opts ...grpc.CallOption) (*FetchShoeRecordResponse, error)
	// 讀遊戲局號紀錄list
	FetchRoundRecord(ctx context.Context, in *FetchRoundRecordRequest, opts ...grpc.CallOption) (*FetchRoundRecordResponse, error)
	// 讀最新遊戲局號紀錄
	FetchLastOneRoundRecord(ctx context.Context, in *FetchRoundRecordRequest, opts ...grpc.CallOption) (*FetchRoundRecordResponse, error)
}

type recorderReadServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewRecorderReadServiceClient(cc grpc.ClientConnInterface) RecorderReadServiceClient {
	return &recorderReadServiceClient{cc}
}

func (c *recorderReadServiceClient) FetchShiftRecord(ctx context.Context, in *FetchShiftRecordRequest, opts ...grpc.CallOption) (*FetchShiftRecordResponse, error) {
	out := new(FetchShiftRecordResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_FetchShiftRecord_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) FetchLastOneShiftRecord(ctx context.Context, in *FetchShiftRecordRequest, opts ...grpc.CallOption) (*FetchShiftRecordResponse, error) {
	out := new(FetchShiftRecordResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_FetchLastOneShiftRecord_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) FetchShoeRecord(ctx context.Context, in *FetchShoeRecordRequest, opts ...grpc.CallOption) (*FetchShoeRecordResponse, error) {
	out := new(FetchShoeRecordResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_FetchShoeRecord_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) FetchLastOneShoeRecord(ctx context.Context, in *FetchShoeRecordRequest, opts ...grpc.CallOption) (*FetchShoeRecordResponse, error) {
	out := new(FetchShoeRecordResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_FetchLastOneShoeRecord_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) FetchRoundRecord(ctx context.Context, in *FetchRoundRecordRequest, opts ...grpc.CallOption) (*FetchRoundRecordResponse, error) {
	out := new(FetchRoundRecordResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_FetchRoundRecord_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderReadServiceClient) FetchLastOneRoundRecord(ctx context.Context, in *FetchRoundRecordRequest, opts ...grpc.CallOption) (*FetchRoundRecordResponse, error) {
	out := new(FetchRoundRecordResponse)
	err := c.cc.Invoke(ctx, RecorderReadService_FetchLastOneRoundRecord_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// RecorderReadServiceServer is the server API for RecorderReadService service.
// All implementations must embed UnimplementedRecorderReadServiceServer
// for forward compatibility
type RecorderReadServiceServer interface {
	// 讀取班次紀錄list
	FetchShiftRecord(context.Context, *FetchShiftRecordRequest) (*FetchShiftRecordResponse, error)
	// 讀取最新班次紀錄
	FetchLastOneShiftRecord(context.Context, *FetchShiftRecordRequest) (*FetchShiftRecordResponse, error)
	// 讀牌靴紀錄list
	FetchShoeRecord(context.Context, *FetchShoeRecordRequest) (*FetchShoeRecordResponse, error)
	// 讀最新牌靴紀錄
	FetchLastOneShoeRecord(context.Context, *FetchShoeRecordRequest) (*FetchShoeRecordResponse, error)
	// 讀遊戲局號紀錄list
	FetchRoundRecord(context.Context, *FetchRoundRecordRequest) (*FetchRoundRecordResponse, error)
	// 讀最新遊戲局號紀錄
	FetchLastOneRoundRecord(context.Context, *FetchRoundRecordRequest) (*FetchRoundRecordResponse, error)
	mustEmbedUnimplementedRecorderReadServiceServer()
}

// UnimplementedRecorderReadServiceServer must be embedded to have forward compatible implementations.
type UnimplementedRecorderReadServiceServer struct {
}

func (UnimplementedRecorderReadServiceServer) FetchShiftRecord(context.Context, *FetchShiftRecordRequest) (*FetchShiftRecordResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchShiftRecord not implemented")
}
func (UnimplementedRecorderReadServiceServer) FetchLastOneShiftRecord(context.Context, *FetchShiftRecordRequest) (*FetchShiftRecordResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchLastOneShiftRecord not implemented")
}
func (UnimplementedRecorderReadServiceServer) FetchShoeRecord(context.Context, *FetchShoeRecordRequest) (*FetchShoeRecordResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchShoeRecord not implemented")
}
func (UnimplementedRecorderReadServiceServer) FetchLastOneShoeRecord(context.Context, *FetchShoeRecordRequest) (*FetchShoeRecordResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchLastOneShoeRecord not implemented")
}
func (UnimplementedRecorderReadServiceServer) FetchRoundRecord(context.Context, *FetchRoundRecordRequest) (*FetchRoundRecordResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchRoundRecord not implemented")
}
func (UnimplementedRecorderReadServiceServer) FetchLastOneRoundRecord(context.Context, *FetchRoundRecordRequest) (*FetchRoundRecordResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchLastOneRoundRecord not implemented")
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

func _RecorderReadService_FetchShiftRecord_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FetchShiftRecordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).FetchShiftRecord(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_FetchShiftRecord_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).FetchShiftRecord(ctx, req.(*FetchShiftRecordRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_FetchLastOneShiftRecord_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FetchShiftRecordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).FetchLastOneShiftRecord(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_FetchLastOneShiftRecord_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).FetchLastOneShiftRecord(ctx, req.(*FetchShiftRecordRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_FetchShoeRecord_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FetchShoeRecordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).FetchShoeRecord(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_FetchShoeRecord_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).FetchShoeRecord(ctx, req.(*FetchShoeRecordRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_FetchLastOneShoeRecord_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FetchShoeRecordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).FetchLastOneShoeRecord(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_FetchLastOneShoeRecord_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).FetchLastOneShoeRecord(ctx, req.(*FetchShoeRecordRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_FetchRoundRecord_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FetchRoundRecordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).FetchRoundRecord(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_FetchRoundRecord_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).FetchRoundRecord(ctx, req.(*FetchRoundRecordRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderReadService_FetchLastOneRoundRecord_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FetchRoundRecordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderReadServiceServer).FetchLastOneRoundRecord(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderReadService_FetchLastOneRoundRecord_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderReadServiceServer).FetchLastOneRoundRecord(ctx, req.(*FetchRoundRecordRequest))
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
			MethodName: "FetchShiftRecord",
			Handler:    _RecorderReadService_FetchShiftRecord_Handler,
		},
		{
			MethodName: "FetchLastOneShiftRecord",
			Handler:    _RecorderReadService_FetchLastOneShiftRecord_Handler,
		},
		{
			MethodName: "FetchShoeRecord",
			Handler:    _RecorderReadService_FetchShoeRecord_Handler,
		},
		{
			MethodName: "FetchLastOneShoeRecord",
			Handler:    _RecorderReadService_FetchLastOneShoeRecord_Handler,
		},
		{
			MethodName: "FetchRoundRecord",
			Handler:    _RecorderReadService_FetchRoundRecord_Handler,
		},
		{
			MethodName: "FetchLastOneRoundRecord",
			Handler:    _RecorderReadService_FetchLastOneRoundRecord_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "recorder/provider.proto",
}

const (
	ProviderService_FetchGameProvideList_FullMethodName = "/recorder.ProviderService/FetchGameProvideList"
	ProviderService_FetchCurrentGame_FullMethodName     = "/recorder.ProviderService/FetchCurrentGame"
)

// ProviderServiceClient is the client API for ProviderService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type ProviderServiceClient interface {
	// 取得即時遊戲列表
	FetchGameProvideList(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*FetchGameProvideListResponse, error)
	// 讀即時遊戲桌資訊
	FetchCurrentGame(ctx context.Context, in *FetchCurrentGameRequest, opts ...grpc.CallOption) (*FetchCurrentGameResponse, error)
}

type providerServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewProviderServiceClient(cc grpc.ClientConnInterface) ProviderServiceClient {
	return &providerServiceClient{cc}
}

func (c *providerServiceClient) FetchGameProvideList(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*FetchGameProvideListResponse, error) {
	out := new(FetchGameProvideListResponse)
	err := c.cc.Invoke(ctx, ProviderService_FetchGameProvideList_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *providerServiceClient) FetchCurrentGame(ctx context.Context, in *FetchCurrentGameRequest, opts ...grpc.CallOption) (*FetchCurrentGameResponse, error) {
	out := new(FetchCurrentGameResponse)
	err := c.cc.Invoke(ctx, ProviderService_FetchCurrentGame_FullMethodName, in, out, opts...)
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
	FetchGameProvideList(context.Context, *emptypb.Empty) (*FetchGameProvideListResponse, error)
	// 讀即時遊戲桌資訊
	FetchCurrentGame(context.Context, *FetchCurrentGameRequest) (*FetchCurrentGameResponse, error)
	mustEmbedUnimplementedProviderServiceServer()
}

// UnimplementedProviderServiceServer must be embedded to have forward compatible implementations.
type UnimplementedProviderServiceServer struct {
}

func (UnimplementedProviderServiceServer) FetchGameProvideList(context.Context, *emptypb.Empty) (*FetchGameProvideListResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchGameProvideList not implemented")
}
func (UnimplementedProviderServiceServer) FetchCurrentGame(context.Context, *FetchCurrentGameRequest) (*FetchCurrentGameResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchCurrentGame not implemented")
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

func _ProviderService_FetchGameProvideList_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProviderServiceServer).FetchGameProvideList(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: ProviderService_FetchGameProvideList_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProviderServiceServer).FetchGameProvideList(ctx, req.(*emptypb.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

func _ProviderService_FetchCurrentGame_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FetchCurrentGameRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProviderServiceServer).FetchCurrentGame(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: ProviderService_FetchCurrentGame_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProviderServiceServer).FetchCurrentGame(ctx, req.(*FetchCurrentGameRequest))
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
			MethodName: "FetchGameProvideList",
			Handler:    _ProviderService_FetchGameProvideList_Handler,
		},
		{
			MethodName: "FetchCurrentGame",
			Handler:    _ProviderService_FetchCurrentGame_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "recorder/provider.proto",
}
