package grpc.service2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The LivestockData Service Definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: livestockData.proto")
public final class LivestockDataGrpc {

  private LivestockDataGrpc() {}

  public static final String SERVICE_NAME = "service5.LivestockData";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service2.LivestockDataRequest,
      grpc.service2.LivestockDataReply> getCheckLivestockDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckLivestockData",
      requestType = grpc.service2.LivestockDataRequest.class,
      responseType = grpc.service2.LivestockDataReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.service2.LivestockDataRequest,
      grpc.service2.LivestockDataReply> getCheckLivestockDataMethod() {
    io.grpc.MethodDescriptor<grpc.service2.LivestockDataRequest, grpc.service2.LivestockDataReply> getCheckLivestockDataMethod;
    if ((getCheckLivestockDataMethod = LivestockDataGrpc.getCheckLivestockDataMethod) == null) {
      synchronized (LivestockDataGrpc.class) {
        if ((getCheckLivestockDataMethod = LivestockDataGrpc.getCheckLivestockDataMethod) == null) {
          LivestockDataGrpc.getCheckLivestockDataMethod = getCheckLivestockDataMethod = 
              io.grpc.MethodDescriptor.<grpc.service2.LivestockDataRequest, grpc.service2.LivestockDataReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service5.LivestockData", "CheckLivestockData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.LivestockDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.LivestockDataReply.getDefaultInstance()))
                  .setSchemaDescriptor(new LivestockDataMethodDescriptorSupplier("CheckLivestockData"))
                  .build();
          }
        }
     }
     return getCheckLivestockDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LivestockDataStub newStub(io.grpc.Channel channel) {
    return new LivestockDataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LivestockDataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LivestockDataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LivestockDataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LivestockDataFutureStub(channel);
  }

  /**
   * <pre>
   * The LivestockData Service Definition
   * </pre>
   */
  public static abstract class LivestockDataImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkLivestockData(grpc.service2.LivestockDataRequest request,
        io.grpc.stub.StreamObserver<grpc.service2.LivestockDataReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckLivestockDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckLivestockDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.service2.LivestockDataRequest,
                grpc.service2.LivestockDataReply>(
                  this, METHODID_CHECK_LIVESTOCK_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * The LivestockData Service Definition
   * </pre>
   */
  public static final class LivestockDataStub extends io.grpc.stub.AbstractStub<LivestockDataStub> {
    private LivestockDataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LivestockDataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LivestockDataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LivestockDataStub(channel, callOptions);
    }

    /**
     */
    public void checkLivestockData(grpc.service2.LivestockDataRequest request,
        io.grpc.stub.StreamObserver<grpc.service2.LivestockDataReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckLivestockDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The LivestockData Service Definition
   * </pre>
   */
  public static final class LivestockDataBlockingStub extends io.grpc.stub.AbstractStub<LivestockDataBlockingStub> {
    private LivestockDataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LivestockDataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LivestockDataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LivestockDataBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.service2.LivestockDataReply checkLivestockData(grpc.service2.LivestockDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckLivestockDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The LivestockData Service Definition
   * </pre>
   */
  public static final class LivestockDataFutureStub extends io.grpc.stub.AbstractStub<LivestockDataFutureStub> {
    private LivestockDataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LivestockDataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LivestockDataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LivestockDataFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.service2.LivestockDataReply> checkLivestockData(
        grpc.service2.LivestockDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckLivestockDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_LIVESTOCK_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LivestockDataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LivestockDataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_LIVESTOCK_DATA:
          serviceImpl.checkLivestockData((grpc.service2.LivestockDataRequest) request,
              (io.grpc.stub.StreamObserver<grpc.service2.LivestockDataReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LivestockDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LivestockDataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service2.LivestockDataImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LivestockData");
    }
  }

  private static final class LivestockDataFileDescriptorSupplier
      extends LivestockDataBaseDescriptorSupplier {
    LivestockDataFileDescriptorSupplier() {}
  }

  private static final class LivestockDataMethodDescriptorSupplier
      extends LivestockDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LivestockDataMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LivestockDataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LivestockDataFileDescriptorSupplier())
              .addMethod(getCheckLivestockDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
