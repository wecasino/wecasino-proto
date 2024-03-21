// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             (unknown)
// source: recorder/recorder.proto

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
	RecorderService_RecordShiftStarted_FullMethodName    = "/recorder.RecorderService/RecordShiftStarted"
	RecorderService_RecordShiftEnded_FullMethodName      = "/recorder.RecorderService/RecordShiftEnded"
	RecorderService_RecordShoeStarted_FullMethodName     = "/recorder.RecorderService/RecordShoeStarted"
	RecorderService_RecordShoeEnded_FullMethodName       = "/recorder.RecorderService/RecordShoeEnded"
	RecorderService_RecordRoundStarted_FullMethodName    = "/recorder.RecorderService/RecordRoundStarted"
	RecorderService_RecordRoundSteps_FullMethodName      = "/recorder.RecorderService/RecordRoundSteps"
	RecorderService_RecordRoundBeCanceled_FullMethodName = "/recorder.RecorderService/RecordRoundBeCanceled"
	RecorderService_RecordRoundFinished_FullMethodName   = "/recorder.RecorderService/RecordRoundFinished"
	RecorderService_RecordRoundVideo_FullMethodName      = "/recorder.RecorderService/RecordRoundVideo"
	RecorderService_RecordCaptureFrame_FullMethodName    = "/recorder.RecorderService/RecordCaptureFrame"
)

// RecorderServiceClient is the client API for RecorderService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type RecorderServiceClient interface {
	// 建立新排班
	RecordShiftStarted(ctx context.Context, in *RecordShiftStartedRequest, opts ...grpc.CallOption) (*ShiftRecord, error)
	// 排班結束
	RecordShiftEnded(ctx context.Context, in *RecordShiftEndedRequest, opts ...grpc.CallOption) (*ShiftRecord, error)
	// 開始使用牌靴
	RecordShoeStarted(ctx context.Context, in *RecordShoeStartedRequest, opts ...grpc.CallOption) (*ShoeRecord, error)
	// 使用牌靴完畢
	RecordShoeEnded(ctx context.Context, in *RecordShoeEndedRequest, opts ...grpc.CallOption) (*ShoeRecord, error)
	// 開啟新局
	RecordRoundStarted(ctx context.Context, in *RecordRoundStartedRequest, opts ...grpc.CallOption) (*RoundRecord, error)
	// 記錄步驟
	RecordRoundSteps(ctx context.Context, in *RecordRoundStepsRequest, opts ...grpc.CallOption) (*RoundRecord, error)
	// 此局作廢
	RecordRoundBeCanceled(ctx context.Context, in *RecordRoundBeCanceledRequest, opts ...grpc.CallOption) (*RoundRecord, error)
	// 結束此局
	RecordRoundFinished(ctx context.Context, in *RecordRoundFinishedRequest, opts ...grpc.CallOption) (*RoundRecord, error)
	// 紀錄回放
	RecordRoundVideo(ctx context.Context, in *RecordRoundMediaRequest, opts ...grpc.CallOption) (*RoundRecord, error)
	// 捕獲單幀。玩家登入時使用
	RecordCaptureFrame(ctx context.Context, in *RecordRoundStartedRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
}

type recorderServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewRecorderServiceClient(cc grpc.ClientConnInterface) RecorderServiceClient {
	return &recorderServiceClient{cc}
}

func (c *recorderServiceClient) RecordShiftStarted(ctx context.Context, in *RecordShiftStartedRequest, opts ...grpc.CallOption) (*ShiftRecord, error) {
	out := new(ShiftRecord)
	err := c.cc.Invoke(ctx, RecorderService_RecordShiftStarted_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderServiceClient) RecordShiftEnded(ctx context.Context, in *RecordShiftEndedRequest, opts ...grpc.CallOption) (*ShiftRecord, error) {
	out := new(ShiftRecord)
	err := c.cc.Invoke(ctx, RecorderService_RecordShiftEnded_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderServiceClient) RecordShoeStarted(ctx context.Context, in *RecordShoeStartedRequest, opts ...grpc.CallOption) (*ShoeRecord, error) {
	out := new(ShoeRecord)
	err := c.cc.Invoke(ctx, RecorderService_RecordShoeStarted_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderServiceClient) RecordShoeEnded(ctx context.Context, in *RecordShoeEndedRequest, opts ...grpc.CallOption) (*ShoeRecord, error) {
	out := new(ShoeRecord)
	err := c.cc.Invoke(ctx, RecorderService_RecordShoeEnded_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderServiceClient) RecordRoundStarted(ctx context.Context, in *RecordRoundStartedRequest, opts ...grpc.CallOption) (*RoundRecord, error) {
	out := new(RoundRecord)
	err := c.cc.Invoke(ctx, RecorderService_RecordRoundStarted_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderServiceClient) RecordRoundSteps(ctx context.Context, in *RecordRoundStepsRequest, opts ...grpc.CallOption) (*RoundRecord, error) {
	out := new(RoundRecord)
	err := c.cc.Invoke(ctx, RecorderService_RecordRoundSteps_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderServiceClient) RecordRoundBeCanceled(ctx context.Context, in *RecordRoundBeCanceledRequest, opts ...grpc.CallOption) (*RoundRecord, error) {
	out := new(RoundRecord)
	err := c.cc.Invoke(ctx, RecorderService_RecordRoundBeCanceled_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderServiceClient) RecordRoundFinished(ctx context.Context, in *RecordRoundFinishedRequest, opts ...grpc.CallOption) (*RoundRecord, error) {
	out := new(RoundRecord)
	err := c.cc.Invoke(ctx, RecorderService_RecordRoundFinished_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderServiceClient) RecordRoundVideo(ctx context.Context, in *RecordRoundMediaRequest, opts ...grpc.CallOption) (*RoundRecord, error) {
	out := new(RoundRecord)
	err := c.cc.Invoke(ctx, RecorderService_RecordRoundVideo_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *recorderServiceClient) RecordCaptureFrame(ctx context.Context, in *RecordRoundStartedRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, RecorderService_RecordCaptureFrame_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// RecorderServiceServer is the server API for RecorderService service.
// All implementations must embed UnimplementedRecorderServiceServer
// for forward compatibility
type RecorderServiceServer interface {
	// 建立新排班
	RecordShiftStarted(context.Context, *RecordShiftStartedRequest) (*ShiftRecord, error)
	// 排班結束
	RecordShiftEnded(context.Context, *RecordShiftEndedRequest) (*ShiftRecord, error)
	// 開始使用牌靴
	RecordShoeStarted(context.Context, *RecordShoeStartedRequest) (*ShoeRecord, error)
	// 使用牌靴完畢
	RecordShoeEnded(context.Context, *RecordShoeEndedRequest) (*ShoeRecord, error)
	// 開啟新局
	RecordRoundStarted(context.Context, *RecordRoundStartedRequest) (*RoundRecord, error)
	// 記錄步驟
	RecordRoundSteps(context.Context, *RecordRoundStepsRequest) (*RoundRecord, error)
	// 此局作廢
	RecordRoundBeCanceled(context.Context, *RecordRoundBeCanceledRequest) (*RoundRecord, error)
	// 結束此局
	RecordRoundFinished(context.Context, *RecordRoundFinishedRequest) (*RoundRecord, error)
	// 紀錄回放
	RecordRoundVideo(context.Context, *RecordRoundMediaRequest) (*RoundRecord, error)
	// 捕獲單幀。玩家登入時使用
	RecordCaptureFrame(context.Context, *RecordRoundStartedRequest) (*emptypb.Empty, error)
	mustEmbedUnimplementedRecorderServiceServer()
}

// UnimplementedRecorderServiceServer must be embedded to have forward compatible implementations.
type UnimplementedRecorderServiceServer struct {
}

func (UnimplementedRecorderServiceServer) RecordShiftStarted(context.Context, *RecordShiftStartedRequest) (*ShiftRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordShiftStarted not implemented")
}
func (UnimplementedRecorderServiceServer) RecordShiftEnded(context.Context, *RecordShiftEndedRequest) (*ShiftRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordShiftEnded not implemented")
}
func (UnimplementedRecorderServiceServer) RecordShoeStarted(context.Context, *RecordShoeStartedRequest) (*ShoeRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordShoeStarted not implemented")
}
func (UnimplementedRecorderServiceServer) RecordShoeEnded(context.Context, *RecordShoeEndedRequest) (*ShoeRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordShoeEnded not implemented")
}
func (UnimplementedRecorderServiceServer) RecordRoundStarted(context.Context, *RecordRoundStartedRequest) (*RoundRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordRoundStarted not implemented")
}
func (UnimplementedRecorderServiceServer) RecordRoundSteps(context.Context, *RecordRoundStepsRequest) (*RoundRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordRoundSteps not implemented")
}
func (UnimplementedRecorderServiceServer) RecordRoundBeCanceled(context.Context, *RecordRoundBeCanceledRequest) (*RoundRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordRoundBeCanceled not implemented")
}
func (UnimplementedRecorderServiceServer) RecordRoundFinished(context.Context, *RecordRoundFinishedRequest) (*RoundRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordRoundFinished not implemented")
}
func (UnimplementedRecorderServiceServer) RecordRoundVideo(context.Context, *RecordRoundMediaRequest) (*RoundRecord, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordRoundVideo not implemented")
}
func (UnimplementedRecorderServiceServer) RecordCaptureFrame(context.Context, *RecordRoundStartedRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecordCaptureFrame not implemented")
}
func (UnimplementedRecorderServiceServer) mustEmbedUnimplementedRecorderServiceServer() {}

// UnsafeRecorderServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to RecorderServiceServer will
// result in compilation errors.
type UnsafeRecorderServiceServer interface {
	mustEmbedUnimplementedRecorderServiceServer()
}

func RegisterRecorderServiceServer(s grpc.ServiceRegistrar, srv RecorderServiceServer) {
	s.RegisterService(&RecorderService_ServiceDesc, srv)
}

func _RecorderService_RecordShiftStarted_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordShiftStartedRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordShiftStarted(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordShiftStarted_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordShiftStarted(ctx, req.(*RecordShiftStartedRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderService_RecordShiftEnded_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordShiftEndedRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordShiftEnded(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordShiftEnded_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordShiftEnded(ctx, req.(*RecordShiftEndedRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderService_RecordShoeStarted_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordShoeStartedRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordShoeStarted(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordShoeStarted_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordShoeStarted(ctx, req.(*RecordShoeStartedRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderService_RecordShoeEnded_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordShoeEndedRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordShoeEnded(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordShoeEnded_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordShoeEnded(ctx, req.(*RecordShoeEndedRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderService_RecordRoundStarted_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordRoundStartedRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordRoundStarted(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordRoundStarted_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordRoundStarted(ctx, req.(*RecordRoundStartedRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderService_RecordRoundSteps_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordRoundStepsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordRoundSteps(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordRoundSteps_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordRoundSteps(ctx, req.(*RecordRoundStepsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderService_RecordRoundBeCanceled_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordRoundBeCanceledRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordRoundBeCanceled(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordRoundBeCanceled_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordRoundBeCanceled(ctx, req.(*RecordRoundBeCanceledRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderService_RecordRoundFinished_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordRoundFinishedRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordRoundFinished(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordRoundFinished_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordRoundFinished(ctx, req.(*RecordRoundFinishedRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderService_RecordRoundVideo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordRoundMediaRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordRoundVideo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordRoundVideo_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordRoundVideo(ctx, req.(*RecordRoundMediaRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _RecorderService_RecordCaptureFrame_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RecordRoundStartedRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(RecorderServiceServer).RecordCaptureFrame(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: RecorderService_RecordCaptureFrame_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(RecorderServiceServer).RecordCaptureFrame(ctx, req.(*RecordRoundStartedRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// RecorderService_ServiceDesc is the grpc.ServiceDesc for RecorderService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var RecorderService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "recorder.RecorderService",
	HandlerType: (*RecorderServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "RecordShiftStarted",
			Handler:    _RecorderService_RecordShiftStarted_Handler,
		},
		{
			MethodName: "RecordShiftEnded",
			Handler:    _RecorderService_RecordShiftEnded_Handler,
		},
		{
			MethodName: "RecordShoeStarted",
			Handler:    _RecorderService_RecordShoeStarted_Handler,
		},
		{
			MethodName: "RecordShoeEnded",
			Handler:    _RecorderService_RecordShoeEnded_Handler,
		},
		{
			MethodName: "RecordRoundStarted",
			Handler:    _RecorderService_RecordRoundStarted_Handler,
		},
		{
			MethodName: "RecordRoundSteps",
			Handler:    _RecorderService_RecordRoundSteps_Handler,
		},
		{
			MethodName: "RecordRoundBeCanceled",
			Handler:    _RecorderService_RecordRoundBeCanceled_Handler,
		},
		{
			MethodName: "RecordRoundFinished",
			Handler:    _RecorderService_RecordRoundFinished_Handler,
		},
		{
			MethodName: "RecordRoundVideo",
			Handler:    _RecorderService_RecordRoundVideo_Handler,
		},
		{
			MethodName: "RecordCaptureFrame",
			Handler:    _RecorderService_RecordCaptureFrame_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "recorder/recorder.proto",
}
