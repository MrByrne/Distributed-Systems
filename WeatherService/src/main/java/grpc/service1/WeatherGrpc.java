package grpc.service1;

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
 * The Weather service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service1.proto")
public final class WeatherGrpc {

  private WeatherGrpc() {}

  public static final String SERVICE_NAME = "service1.Weather";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service1.WeatherRequest,
      grpc.service1.WeatherReply> getCheckWeatherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckWeather",
      requestType = grpc.service1.WeatherRequest.class,
      responseType = grpc.service1.WeatherReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.service1.WeatherRequest,
      grpc.service1.WeatherReply> getCheckWeatherMethod() {
    io.grpc.MethodDescriptor<grpc.service1.WeatherRequest, grpc.service1.WeatherReply> getCheckWeatherMethod;
    if ((getCheckWeatherMethod = WeatherGrpc.getCheckWeatherMethod) == null) {
      synchronized (WeatherGrpc.class) {
        if ((getCheckWeatherMethod = WeatherGrpc.getCheckWeatherMethod) == null) {
          WeatherGrpc.getCheckWeatherMethod = getCheckWeatherMethod = 
              io.grpc.MethodDescriptor.<grpc.service1.WeatherRequest, grpc.service1.WeatherReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.Weather", "CheckWeather"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service1.WeatherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service1.WeatherReply.getDefaultInstance()))
                  .setSchemaDescriptor(new WeatherMethodDescriptorSupplier("CheckWeather"))
                  .build();
          }
        }
     }
     return getCheckWeatherMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WeatherStub newStub(io.grpc.Channel channel) {
    return new WeatherStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WeatherBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WeatherBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WeatherFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WeatherFutureStub(channel);
  }

  /**
   * <pre>
   * The Weather service definition.
   * </pre>
   */
  public static abstract class WeatherImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkWeather(grpc.service1.WeatherRequest request,
        io.grpc.stub.StreamObserver<grpc.service1.WeatherReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckWeatherMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckWeatherMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.service1.WeatherRequest,
                grpc.service1.WeatherReply>(
                  this, METHODID_CHECK_WEATHER)))
          .build();
    }
  }

  /**
   * <pre>
   * The Weather service definition.
   * </pre>
   */
  public static final class WeatherStub extends io.grpc.stub.AbstractStub<WeatherStub> {
    private WeatherStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WeatherStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WeatherStub(channel, callOptions);
    }

    /**
     */
    public void checkWeather(grpc.service1.WeatherRequest request,
        io.grpc.stub.StreamObserver<grpc.service1.WeatherReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckWeatherMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Weather service definition.
   * </pre>
   */
  public static final class WeatherBlockingStub extends io.grpc.stub.AbstractStub<WeatherBlockingStub> {
    private WeatherBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WeatherBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WeatherBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.service1.WeatherReply checkWeather(grpc.service1.WeatherRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckWeatherMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Weather service definition.
   * </pre>
   */
  public static final class WeatherFutureStub extends io.grpc.stub.AbstractStub<WeatherFutureStub> {
    private WeatherFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WeatherFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WeatherFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.service1.WeatherReply> checkWeather(
        grpc.service1.WeatherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckWeatherMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_WEATHER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WeatherImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WeatherImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_WEATHER:
          serviceImpl.checkWeather((grpc.service1.WeatherRequest) request,
              (io.grpc.stub.StreamObserver<grpc.service1.WeatherReply>) responseObserver);
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

  private static abstract class WeatherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WeatherBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service1.WeatherImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Weather");
    }
  }

  private static final class WeatherFileDescriptorSupplier
      extends WeatherBaseDescriptorSupplier {
    WeatherFileDescriptorSupplier() {}
  }

  private static final class WeatherMethodDescriptorSupplier
      extends WeatherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WeatherMethodDescriptorSupplier(String methodName) {
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
      synchronized (WeatherGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WeatherFileDescriptorSupplier())
              .addMethod(getCheckWeatherMethod())
              .build();
        }
      }
    }
    return result;
  }
}
