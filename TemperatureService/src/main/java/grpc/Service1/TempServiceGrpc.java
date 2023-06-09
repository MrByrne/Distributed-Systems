package grpc.Service1;

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
    comments = "Source: temp.proto")
public final class TempServiceGrpc {

  private TempServiceGrpc() {}

  public static final String SERVICE_NAME = "maths.TempService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Service1.NumberMessage,
      grpc.Service1.CalculateResponse> getAverageTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "averageTemp",
      requestType = grpc.Service1.NumberMessage.class,
      responseType = grpc.Service1.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.Service1.NumberMessage,
      grpc.Service1.CalculateResponse> getAverageTempMethod() {
    io.grpc.MethodDescriptor<grpc.Service1.NumberMessage, grpc.Service1.CalculateResponse> getAverageTempMethod;
    if ((getAverageTempMethod = TempServiceGrpc.getAverageTempMethod) == null) {
      synchronized (TempServiceGrpc.class) {
        if ((getAverageTempMethod = TempServiceGrpc.getAverageTempMethod) == null) {
          TempServiceGrpc.getAverageTempMethod = getAverageTempMethod = 
              io.grpc.MethodDescriptor.<grpc.Service1.NumberMessage, grpc.Service1.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "maths.TempService", "averageTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Service1.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Service1.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TempServiceMethodDescriptorSupplier("averageTemp"))
                  .build();
          }
        }
     }
     return getAverageTempMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TempServiceStub newStub(io.grpc.Channel channel) {
    return new TempServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TempServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TempServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TempServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TempServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class TempServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.Service1.NumberMessage> averageTemp(
        io.grpc.stub.StreamObserver<grpc.Service1.CalculateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageTempMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAverageTempMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.Service1.NumberMessage,
                grpc.Service1.CalculateResponse>(
                  this, METHODID_AVERAGE_TEMP)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TempServiceStub extends io.grpc.stub.AbstractStub<TempServiceStub> {
    private TempServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TempServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TempServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TempServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.Service1.NumberMessage> averageTemp(
        io.grpc.stub.StreamObserver<grpc.Service1.CalculateResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageTempMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TempServiceBlockingStub extends io.grpc.stub.AbstractStub<TempServiceBlockingStub> {
    private TempServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TempServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TempServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TempServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TempServiceFutureStub extends io.grpc.stub.AbstractStub<TempServiceFutureStub> {
    private TempServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TempServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TempServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TempServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_AVERAGE_TEMP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TempServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TempServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVERAGE_TEMP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.averageTemp(
              (io.grpc.stub.StreamObserver<grpc.Service1.CalculateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TempServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TempServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Service1.TempServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TempService");
    }
  }

  private static final class TempServiceFileDescriptorSupplier
      extends TempServiceBaseDescriptorSupplier {
    TempServiceFileDescriptorSupplier() {}
  }

  private static final class TempServiceMethodDescriptorSupplier
      extends TempServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TempServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TempServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TempServiceFileDescriptorSupplier())
              .addMethod(getAverageTempMethod())
              .build();
        }
      }
    }
    return result;
  }
}
