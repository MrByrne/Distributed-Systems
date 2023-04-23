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
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: water.proto")
public final class WaterServiceGrpc {

  private WaterServiceGrpc() {}

  public static final String SERVICE_NAME = "water.WaterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service2.WaterRequest,
      grpc.service2.WaterResponse> getWaterPlantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "waterPlants",
      requestType = grpc.service2.WaterRequest.class,
      responseType = grpc.service2.WaterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.service2.WaterRequest,
      grpc.service2.WaterResponse> getWaterPlantsMethod() {
    io.grpc.MethodDescriptor<grpc.service2.WaterRequest, grpc.service2.WaterResponse> getWaterPlantsMethod;
    if ((getWaterPlantsMethod = WaterServiceGrpc.getWaterPlantsMethod) == null) {
      synchronized (WaterServiceGrpc.class) {
        if ((getWaterPlantsMethod = WaterServiceGrpc.getWaterPlantsMethod) == null) {
          WaterServiceGrpc.getWaterPlantsMethod = getWaterPlantsMethod = 
              io.grpc.MethodDescriptor.<grpc.service2.WaterRequest, grpc.service2.WaterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "water.WaterService", "waterPlants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.WaterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service2.WaterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterServiceMethodDescriptorSupplier("waterPlants"))
                  .build();
          }
        }
     }
     return getWaterPlantsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterServiceStub newStub(io.grpc.Channel channel) {
    return new WaterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WaterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WaterServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class WaterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void waterPlants(grpc.service2.WaterRequest request,
        io.grpc.stub.StreamObserver<grpc.service2.WaterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWaterPlantsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWaterPlantsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.service2.WaterRequest,
                grpc.service2.WaterResponse>(
                  this, METHODID_WATER_PLANTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class WaterServiceStub extends io.grpc.stub.AbstractStub<WaterServiceStub> {
    private WaterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterServiceStub(channel, callOptions);
    }

    /**
     */
    public void waterPlants(grpc.service2.WaterRequest request,
        io.grpc.stub.StreamObserver<grpc.service2.WaterResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWaterPlantsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class WaterServiceBlockingStub extends io.grpc.stub.AbstractStub<WaterServiceBlockingStub> {
    private WaterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<grpc.service2.WaterResponse> waterPlants(
        grpc.service2.WaterRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWaterPlantsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class WaterServiceFutureStub extends io.grpc.stub.AbstractStub<WaterServiceFutureStub> {
    private WaterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WATER_PLANTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WaterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WaterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WATER_PLANTS:
          serviceImpl.waterPlants((grpc.service2.WaterRequest) request,
              (io.grpc.stub.StreamObserver<grpc.service2.WaterResponse>) responseObserver);
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

  private static abstract class WaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service2.WaterServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterService");
    }
  }

  private static final class WaterServiceFileDescriptorSupplier
      extends WaterServiceBaseDescriptorSupplier {
    WaterServiceFileDescriptorSupplier() {}
  }

  private static final class WaterServiceMethodDescriptorSupplier
      extends WaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WaterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WaterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterServiceFileDescriptorSupplier())
              .addMethod(getWaterPlantsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
