// Code generated by protoc-gen-connect-go. DO NOT EDIT.
//
// Source: recorder/recorder.proto

package recorderconnect

import (
	connect "connectrpc.com/connect"
	context "context"
	errors "errors"
	recorder "github.com/wecasino/wecasino-proto/pbgo/recorder"
	http "net/http"
	strings "strings"
)

// This is a compile-time assertion to ensure that this generated file and the connect package are
// compatible. If you get a compiler error that this constant is not defined, this code was
// generated with a version of connect newer than the one compiled into your binary. You can fix the
// problem by either regenerating this code with an older version of connect or updating the connect
// version compiled into your binary.
const _ = connect.IsAtLeastVersion1_13_0

const (
	// RecorderServiceName is the fully-qualified name of the RecorderService service.
	RecorderServiceName = "recorder.RecorderService"
)

// These constants are the fully-qualified names of the RPCs defined in this package. They're
// exposed at runtime as Spec.Procedure and as the final two segments of the HTTP route.
//
// Note that these are different from the fully-qualified method names used by
// google.golang.org/protobuf/reflect/protoreflect. To convert from these constants to
// reflection-formatted method names, remove the leading slash and convert the remaining slash to a
// period.
const (
	// RecorderServiceRecordShiftStartedProcedure is the fully-qualified name of the RecorderService's
	// RecordShiftStarted RPC.
	RecorderServiceRecordShiftStartedProcedure = "/recorder.RecorderService/RecordShiftStarted"
	// RecorderServiceRecordShiftEndedProcedure is the fully-qualified name of the RecorderService's
	// RecordShiftEnded RPC.
	RecorderServiceRecordShiftEndedProcedure = "/recorder.RecorderService/RecordShiftEnded"
	// RecorderServiceRecordShoeStartedProcedure is the fully-qualified name of the RecorderService's
	// RecordShoeStarted RPC.
	RecorderServiceRecordShoeStartedProcedure = "/recorder.RecorderService/RecordShoeStarted"
	// RecorderServiceRecordShoeEndedProcedure is the fully-qualified name of the RecorderService's
	// RecordShoeEnded RPC.
	RecorderServiceRecordShoeEndedProcedure = "/recorder.RecorderService/RecordShoeEnded"
	// RecorderServiceRecordRoundStartedProcedure is the fully-qualified name of the RecorderService's
	// RecordRoundStarted RPC.
	RecorderServiceRecordRoundStartedProcedure = "/recorder.RecorderService/RecordRoundStarted"
	// RecorderServiceRecordRoundStepsProcedure is the fully-qualified name of the RecorderService's
	// RecordRoundSteps RPC.
	RecorderServiceRecordRoundStepsProcedure = "/recorder.RecorderService/RecordRoundSteps"
	// RecorderServiceRecordRoundBeCanceledProcedure is the fully-qualified name of the
	// RecorderService's RecordRoundBeCanceled RPC.
	RecorderServiceRecordRoundBeCanceledProcedure = "/recorder.RecorderService/RecordRoundBeCanceled"
	// RecorderServiceRecordRoundFinishedProcedure is the fully-qualified name of the RecorderService's
	// RecordRoundFinished RPC.
	RecorderServiceRecordRoundFinishedProcedure = "/recorder.RecorderService/RecordRoundFinished"
	// RecorderServiceRecordRoundBeCanceledAfterFinishedProcedure is the fully-qualified name of the
	// RecorderService's RecordRoundBeCanceledAfterFinished RPC.
	RecorderServiceRecordRoundBeCanceledAfterFinishedProcedure = "/recorder.RecorderService/RecordRoundBeCanceledAfterFinished"
	// RecorderServiceRecordRoundVideoProcedure is the fully-qualified name of the RecorderService's
	// RecordRoundVideo RPC.
	RecorderServiceRecordRoundVideoProcedure = "/recorder.RecorderService/RecordRoundVideo"
)

// These variables are the protoreflect.Descriptor objects for the RPCs defined in this package.
var (
	recorderServiceServiceDescriptor                                  = recorder.File_recorder_recorder_proto.Services().ByName("RecorderService")
	recorderServiceRecordShiftStartedMethodDescriptor                 = recorderServiceServiceDescriptor.Methods().ByName("RecordShiftStarted")
	recorderServiceRecordShiftEndedMethodDescriptor                   = recorderServiceServiceDescriptor.Methods().ByName("RecordShiftEnded")
	recorderServiceRecordShoeStartedMethodDescriptor                  = recorderServiceServiceDescriptor.Methods().ByName("RecordShoeStarted")
	recorderServiceRecordShoeEndedMethodDescriptor                    = recorderServiceServiceDescriptor.Methods().ByName("RecordShoeEnded")
	recorderServiceRecordRoundStartedMethodDescriptor                 = recorderServiceServiceDescriptor.Methods().ByName("RecordRoundStarted")
	recorderServiceRecordRoundStepsMethodDescriptor                   = recorderServiceServiceDescriptor.Methods().ByName("RecordRoundSteps")
	recorderServiceRecordRoundBeCanceledMethodDescriptor              = recorderServiceServiceDescriptor.Methods().ByName("RecordRoundBeCanceled")
	recorderServiceRecordRoundFinishedMethodDescriptor                = recorderServiceServiceDescriptor.Methods().ByName("RecordRoundFinished")
	recorderServiceRecordRoundBeCanceledAfterFinishedMethodDescriptor = recorderServiceServiceDescriptor.Methods().ByName("RecordRoundBeCanceledAfterFinished")
	recorderServiceRecordRoundVideoMethodDescriptor                   = recorderServiceServiceDescriptor.Methods().ByName("RecordRoundVideo")
)

// RecorderServiceClient is a client for the recorder.RecorderService service.
type RecorderServiceClient interface {
	// 建立新排班
	RecordShiftStarted(context.Context, *connect.Request[recorder.RecordShiftStartedRequest]) (*connect.Response[recorder.ShiftRecord], error)
	// 排班結束
	RecordShiftEnded(context.Context, *connect.Request[recorder.RecordShiftEndedRequest]) (*connect.Response[recorder.ShiftRecord], error)
	// 開始使用牌靴
	RecordShoeStarted(context.Context, *connect.Request[recorder.RecordShoeStartedRequest]) (*connect.Response[recorder.ShoeRecord], error)
	// 使用牌靴完畢
	RecordShoeEnded(context.Context, *connect.Request[recorder.RecordShoeEndedRequest]) (*connect.Response[recorder.ShoeRecord], error)
	// 開啟新局
	RecordRoundStarted(context.Context, *connect.Request[recorder.RecordRoundStartedRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 記錄步驟
	RecordRoundSteps(context.Context, *connect.Request[recorder.RecordRoundStepsRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 此局作廢
	RecordRoundBeCanceled(context.Context, *connect.Request[recorder.RecordRoundBeCanceledRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 結束此局
	RecordRoundFinished(context.Context, *connect.Request[recorder.RecordRoundFinishedRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 事後取消此局
	RecordRoundBeCanceledAfterFinished(context.Context, *connect.Request[recorder.RecordRoundBeCanceledRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 紀錄回放
	RecordRoundVideo(context.Context, *connect.Request[recorder.RecordRoundMediaRequest]) (*connect.Response[recorder.RoundRecord], error)
}

// NewRecorderServiceClient constructs a client for the recorder.RecorderService service. By
// default, it uses the Connect protocol with the binary Protobuf Codec, asks for gzipped responses,
// and sends uncompressed requests. To use the gRPC or gRPC-Web protocols, supply the
// connect.WithGRPC() or connect.WithGRPCWeb() options.
//
// The URL supplied here should be the base URL for the Connect or gRPC server (for example,
// http://api.acme.com or https://acme.com/grpc).
func NewRecorderServiceClient(httpClient connect.HTTPClient, baseURL string, opts ...connect.ClientOption) RecorderServiceClient {
	baseURL = strings.TrimRight(baseURL, "/")
	return &recorderServiceClient{
		recordShiftStarted: connect.NewClient[recorder.RecordShiftStartedRequest, recorder.ShiftRecord](
			httpClient,
			baseURL+RecorderServiceRecordShiftStartedProcedure,
			connect.WithSchema(recorderServiceRecordShiftStartedMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
		recordShiftEnded: connect.NewClient[recorder.RecordShiftEndedRequest, recorder.ShiftRecord](
			httpClient,
			baseURL+RecorderServiceRecordShiftEndedProcedure,
			connect.WithSchema(recorderServiceRecordShiftEndedMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
		recordShoeStarted: connect.NewClient[recorder.RecordShoeStartedRequest, recorder.ShoeRecord](
			httpClient,
			baseURL+RecorderServiceRecordShoeStartedProcedure,
			connect.WithSchema(recorderServiceRecordShoeStartedMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
		recordShoeEnded: connect.NewClient[recorder.RecordShoeEndedRequest, recorder.ShoeRecord](
			httpClient,
			baseURL+RecorderServiceRecordShoeEndedProcedure,
			connect.WithSchema(recorderServiceRecordShoeEndedMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
		recordRoundStarted: connect.NewClient[recorder.RecordRoundStartedRequest, recorder.RoundRecord](
			httpClient,
			baseURL+RecorderServiceRecordRoundStartedProcedure,
			connect.WithSchema(recorderServiceRecordRoundStartedMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
		recordRoundSteps: connect.NewClient[recorder.RecordRoundStepsRequest, recorder.RoundRecord](
			httpClient,
			baseURL+RecorderServiceRecordRoundStepsProcedure,
			connect.WithSchema(recorderServiceRecordRoundStepsMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
		recordRoundBeCanceled: connect.NewClient[recorder.RecordRoundBeCanceledRequest, recorder.RoundRecord](
			httpClient,
			baseURL+RecorderServiceRecordRoundBeCanceledProcedure,
			connect.WithSchema(recorderServiceRecordRoundBeCanceledMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
		recordRoundFinished: connect.NewClient[recorder.RecordRoundFinishedRequest, recorder.RoundRecord](
			httpClient,
			baseURL+RecorderServiceRecordRoundFinishedProcedure,
			connect.WithSchema(recorderServiceRecordRoundFinishedMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
		recordRoundBeCanceledAfterFinished: connect.NewClient[recorder.RecordRoundBeCanceledRequest, recorder.RoundRecord](
			httpClient,
			baseURL+RecorderServiceRecordRoundBeCanceledAfterFinishedProcedure,
			connect.WithSchema(recorderServiceRecordRoundBeCanceledAfterFinishedMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
		recordRoundVideo: connect.NewClient[recorder.RecordRoundMediaRequest, recorder.RoundRecord](
			httpClient,
			baseURL+RecorderServiceRecordRoundVideoProcedure,
			connect.WithSchema(recorderServiceRecordRoundVideoMethodDescriptor),
			connect.WithClientOptions(opts...),
		),
	}
}

// recorderServiceClient implements RecorderServiceClient.
type recorderServiceClient struct {
	recordShiftStarted                 *connect.Client[recorder.RecordShiftStartedRequest, recorder.ShiftRecord]
	recordShiftEnded                   *connect.Client[recorder.RecordShiftEndedRequest, recorder.ShiftRecord]
	recordShoeStarted                  *connect.Client[recorder.RecordShoeStartedRequest, recorder.ShoeRecord]
	recordShoeEnded                    *connect.Client[recorder.RecordShoeEndedRequest, recorder.ShoeRecord]
	recordRoundStarted                 *connect.Client[recorder.RecordRoundStartedRequest, recorder.RoundRecord]
	recordRoundSteps                   *connect.Client[recorder.RecordRoundStepsRequest, recorder.RoundRecord]
	recordRoundBeCanceled              *connect.Client[recorder.RecordRoundBeCanceledRequest, recorder.RoundRecord]
	recordRoundFinished                *connect.Client[recorder.RecordRoundFinishedRequest, recorder.RoundRecord]
	recordRoundBeCanceledAfterFinished *connect.Client[recorder.RecordRoundBeCanceledRequest, recorder.RoundRecord]
	recordRoundVideo                   *connect.Client[recorder.RecordRoundMediaRequest, recorder.RoundRecord]
}

// RecordShiftStarted calls recorder.RecorderService.RecordShiftStarted.
func (c *recorderServiceClient) RecordShiftStarted(ctx context.Context, req *connect.Request[recorder.RecordShiftStartedRequest]) (*connect.Response[recorder.ShiftRecord], error) {
	return c.recordShiftStarted.CallUnary(ctx, req)
}

// RecordShiftEnded calls recorder.RecorderService.RecordShiftEnded.
func (c *recorderServiceClient) RecordShiftEnded(ctx context.Context, req *connect.Request[recorder.RecordShiftEndedRequest]) (*connect.Response[recorder.ShiftRecord], error) {
	return c.recordShiftEnded.CallUnary(ctx, req)
}

// RecordShoeStarted calls recorder.RecorderService.RecordShoeStarted.
func (c *recorderServiceClient) RecordShoeStarted(ctx context.Context, req *connect.Request[recorder.RecordShoeStartedRequest]) (*connect.Response[recorder.ShoeRecord], error) {
	return c.recordShoeStarted.CallUnary(ctx, req)
}

// RecordShoeEnded calls recorder.RecorderService.RecordShoeEnded.
func (c *recorderServiceClient) RecordShoeEnded(ctx context.Context, req *connect.Request[recorder.RecordShoeEndedRequest]) (*connect.Response[recorder.ShoeRecord], error) {
	return c.recordShoeEnded.CallUnary(ctx, req)
}

// RecordRoundStarted calls recorder.RecorderService.RecordRoundStarted.
func (c *recorderServiceClient) RecordRoundStarted(ctx context.Context, req *connect.Request[recorder.RecordRoundStartedRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return c.recordRoundStarted.CallUnary(ctx, req)
}

// RecordRoundSteps calls recorder.RecorderService.RecordRoundSteps.
func (c *recorderServiceClient) RecordRoundSteps(ctx context.Context, req *connect.Request[recorder.RecordRoundStepsRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return c.recordRoundSteps.CallUnary(ctx, req)
}

// RecordRoundBeCanceled calls recorder.RecorderService.RecordRoundBeCanceled.
func (c *recorderServiceClient) RecordRoundBeCanceled(ctx context.Context, req *connect.Request[recorder.RecordRoundBeCanceledRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return c.recordRoundBeCanceled.CallUnary(ctx, req)
}

// RecordRoundFinished calls recorder.RecorderService.RecordRoundFinished.
func (c *recorderServiceClient) RecordRoundFinished(ctx context.Context, req *connect.Request[recorder.RecordRoundFinishedRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return c.recordRoundFinished.CallUnary(ctx, req)
}

// RecordRoundBeCanceledAfterFinished calls
// recorder.RecorderService.RecordRoundBeCanceledAfterFinished.
func (c *recorderServiceClient) RecordRoundBeCanceledAfterFinished(ctx context.Context, req *connect.Request[recorder.RecordRoundBeCanceledRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return c.recordRoundBeCanceledAfterFinished.CallUnary(ctx, req)
}

// RecordRoundVideo calls recorder.RecorderService.RecordRoundVideo.
func (c *recorderServiceClient) RecordRoundVideo(ctx context.Context, req *connect.Request[recorder.RecordRoundMediaRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return c.recordRoundVideo.CallUnary(ctx, req)
}

// RecorderServiceHandler is an implementation of the recorder.RecorderService service.
type RecorderServiceHandler interface {
	// 建立新排班
	RecordShiftStarted(context.Context, *connect.Request[recorder.RecordShiftStartedRequest]) (*connect.Response[recorder.ShiftRecord], error)
	// 排班結束
	RecordShiftEnded(context.Context, *connect.Request[recorder.RecordShiftEndedRequest]) (*connect.Response[recorder.ShiftRecord], error)
	// 開始使用牌靴
	RecordShoeStarted(context.Context, *connect.Request[recorder.RecordShoeStartedRequest]) (*connect.Response[recorder.ShoeRecord], error)
	// 使用牌靴完畢
	RecordShoeEnded(context.Context, *connect.Request[recorder.RecordShoeEndedRequest]) (*connect.Response[recorder.ShoeRecord], error)
	// 開啟新局
	RecordRoundStarted(context.Context, *connect.Request[recorder.RecordRoundStartedRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 記錄步驟
	RecordRoundSteps(context.Context, *connect.Request[recorder.RecordRoundStepsRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 此局作廢
	RecordRoundBeCanceled(context.Context, *connect.Request[recorder.RecordRoundBeCanceledRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 結束此局
	RecordRoundFinished(context.Context, *connect.Request[recorder.RecordRoundFinishedRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 事後取消此局
	RecordRoundBeCanceledAfterFinished(context.Context, *connect.Request[recorder.RecordRoundBeCanceledRequest]) (*connect.Response[recorder.RoundRecord], error)
	// 紀錄回放
	RecordRoundVideo(context.Context, *connect.Request[recorder.RecordRoundMediaRequest]) (*connect.Response[recorder.RoundRecord], error)
}

// NewRecorderServiceHandler builds an HTTP handler from the service implementation. It returns the
// path on which to mount the handler and the handler itself.
//
// By default, handlers support the Connect, gRPC, and gRPC-Web protocols with the binary Protobuf
// and JSON codecs. They also support gzip compression.
func NewRecorderServiceHandler(svc RecorderServiceHandler, opts ...connect.HandlerOption) (string, http.Handler) {
	recorderServiceRecordShiftStartedHandler := connect.NewUnaryHandler(
		RecorderServiceRecordShiftStartedProcedure,
		svc.RecordShiftStarted,
		connect.WithSchema(recorderServiceRecordShiftStartedMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	recorderServiceRecordShiftEndedHandler := connect.NewUnaryHandler(
		RecorderServiceRecordShiftEndedProcedure,
		svc.RecordShiftEnded,
		connect.WithSchema(recorderServiceRecordShiftEndedMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	recorderServiceRecordShoeStartedHandler := connect.NewUnaryHandler(
		RecorderServiceRecordShoeStartedProcedure,
		svc.RecordShoeStarted,
		connect.WithSchema(recorderServiceRecordShoeStartedMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	recorderServiceRecordShoeEndedHandler := connect.NewUnaryHandler(
		RecorderServiceRecordShoeEndedProcedure,
		svc.RecordShoeEnded,
		connect.WithSchema(recorderServiceRecordShoeEndedMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	recorderServiceRecordRoundStartedHandler := connect.NewUnaryHandler(
		RecorderServiceRecordRoundStartedProcedure,
		svc.RecordRoundStarted,
		connect.WithSchema(recorderServiceRecordRoundStartedMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	recorderServiceRecordRoundStepsHandler := connect.NewUnaryHandler(
		RecorderServiceRecordRoundStepsProcedure,
		svc.RecordRoundSteps,
		connect.WithSchema(recorderServiceRecordRoundStepsMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	recorderServiceRecordRoundBeCanceledHandler := connect.NewUnaryHandler(
		RecorderServiceRecordRoundBeCanceledProcedure,
		svc.RecordRoundBeCanceled,
		connect.WithSchema(recorderServiceRecordRoundBeCanceledMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	recorderServiceRecordRoundFinishedHandler := connect.NewUnaryHandler(
		RecorderServiceRecordRoundFinishedProcedure,
		svc.RecordRoundFinished,
		connect.WithSchema(recorderServiceRecordRoundFinishedMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	recorderServiceRecordRoundBeCanceledAfterFinishedHandler := connect.NewUnaryHandler(
		RecorderServiceRecordRoundBeCanceledAfterFinishedProcedure,
		svc.RecordRoundBeCanceledAfterFinished,
		connect.WithSchema(recorderServiceRecordRoundBeCanceledAfterFinishedMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	recorderServiceRecordRoundVideoHandler := connect.NewUnaryHandler(
		RecorderServiceRecordRoundVideoProcedure,
		svc.RecordRoundVideo,
		connect.WithSchema(recorderServiceRecordRoundVideoMethodDescriptor),
		connect.WithHandlerOptions(opts...),
	)
	return "/recorder.RecorderService/", http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
		switch r.URL.Path {
		case RecorderServiceRecordShiftStartedProcedure:
			recorderServiceRecordShiftStartedHandler.ServeHTTP(w, r)
		case RecorderServiceRecordShiftEndedProcedure:
			recorderServiceRecordShiftEndedHandler.ServeHTTP(w, r)
		case RecorderServiceRecordShoeStartedProcedure:
			recorderServiceRecordShoeStartedHandler.ServeHTTP(w, r)
		case RecorderServiceRecordShoeEndedProcedure:
			recorderServiceRecordShoeEndedHandler.ServeHTTP(w, r)
		case RecorderServiceRecordRoundStartedProcedure:
			recorderServiceRecordRoundStartedHandler.ServeHTTP(w, r)
		case RecorderServiceRecordRoundStepsProcedure:
			recorderServiceRecordRoundStepsHandler.ServeHTTP(w, r)
		case RecorderServiceRecordRoundBeCanceledProcedure:
			recorderServiceRecordRoundBeCanceledHandler.ServeHTTP(w, r)
		case RecorderServiceRecordRoundFinishedProcedure:
			recorderServiceRecordRoundFinishedHandler.ServeHTTP(w, r)
		case RecorderServiceRecordRoundBeCanceledAfterFinishedProcedure:
			recorderServiceRecordRoundBeCanceledAfterFinishedHandler.ServeHTTP(w, r)
		case RecorderServiceRecordRoundVideoProcedure:
			recorderServiceRecordRoundVideoHandler.ServeHTTP(w, r)
		default:
			http.NotFound(w, r)
		}
	})
}

// UnimplementedRecorderServiceHandler returns CodeUnimplemented from all methods.
type UnimplementedRecorderServiceHandler struct{}

func (UnimplementedRecorderServiceHandler) RecordShiftStarted(context.Context, *connect.Request[recorder.RecordShiftStartedRequest]) (*connect.Response[recorder.ShiftRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordShiftStarted is not implemented"))
}

func (UnimplementedRecorderServiceHandler) RecordShiftEnded(context.Context, *connect.Request[recorder.RecordShiftEndedRequest]) (*connect.Response[recorder.ShiftRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordShiftEnded is not implemented"))
}

func (UnimplementedRecorderServiceHandler) RecordShoeStarted(context.Context, *connect.Request[recorder.RecordShoeStartedRequest]) (*connect.Response[recorder.ShoeRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordShoeStarted is not implemented"))
}

func (UnimplementedRecorderServiceHandler) RecordShoeEnded(context.Context, *connect.Request[recorder.RecordShoeEndedRequest]) (*connect.Response[recorder.ShoeRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordShoeEnded is not implemented"))
}

func (UnimplementedRecorderServiceHandler) RecordRoundStarted(context.Context, *connect.Request[recorder.RecordRoundStartedRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordRoundStarted is not implemented"))
}

func (UnimplementedRecorderServiceHandler) RecordRoundSteps(context.Context, *connect.Request[recorder.RecordRoundStepsRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordRoundSteps is not implemented"))
}

func (UnimplementedRecorderServiceHandler) RecordRoundBeCanceled(context.Context, *connect.Request[recorder.RecordRoundBeCanceledRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordRoundBeCanceled is not implemented"))
}

func (UnimplementedRecorderServiceHandler) RecordRoundFinished(context.Context, *connect.Request[recorder.RecordRoundFinishedRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordRoundFinished is not implemented"))
}

func (UnimplementedRecorderServiceHandler) RecordRoundBeCanceledAfterFinished(context.Context, *connect.Request[recorder.RecordRoundBeCanceledRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordRoundBeCanceledAfterFinished is not implemented"))
}

func (UnimplementedRecorderServiceHandler) RecordRoundVideo(context.Context, *connect.Request[recorder.RecordRoundMediaRequest]) (*connect.Response[recorder.RoundRecord], error) {
	return nil, connect.NewError(connect.CodeUnimplemented, errors.New("recorder.RecorderService.RecordRoundVideo is not implemented"))
}
