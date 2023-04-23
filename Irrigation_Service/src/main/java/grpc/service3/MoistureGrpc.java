package grpc.service3;

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
 * The Moisture Service Definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: moisture.proto")
public final class MoistureGrpc {

  private MoistureGrpc() {}

  public static final String SERVICE_NAME = "service3.Moisture";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service3.MoistureRequest,
      grpc.service3.MoistureReply> getCheckMoistureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckMoisture",
      requestType = grpc.service3.MoistureRequest.class,
      responseType = grpc.service3.MoistureReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.service3.MoistureRequest,
      grpc.service3.MoistureReply> getCheckMoistureMethod() {
    io.grpc.MethodDescriptor<grpc.service3.MoistureRequest, grpc.service3.MoistureReply> getCheckMoistureMethod;
    if ((getCheckMoistureMethod = MoistureGrpc.getCheckMoistureMethod) == null) {
      synchronized (MoistureGrpc.class) {
        if ((getCheckMoistureMethod = MoistureGrpc.getCheckMoistureMethod) == null) {
          MoistureGrpc.getCheckMoistureMethod = getCheckMoistureMethod = 
              io.grpc.MethodDescriptor.<grpc.service3.MoistureRequest, grpc.service3.MoistureReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service3.Moisture", "CheckMoisture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.MoistureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.MoistureReply.getDefaultInstance()))
                  .setSchemaDescriptor(new MoistureMethodDescriptorSupplier("CheckMoisture"))
                  .build();
          }
        }
     }
     return getCheckMoistureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MoistureStub newStub(io.grpc.Channel channel) {
    return new MoistureStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MoistureBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MoistureBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MoistureFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MoistureFutureStub(channel);
  }

  /**
   * <pre>
   * The Moisture Service Definition
   * </pre>
   */
  public static abstract class MoistureImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkMoisture(grpc.service3.MoistureRequest request,
        io.grpc.stub.StreamObserver<grpc.service3.MoistureReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMoistureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckMoistureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.service3.MoistureRequest,
                grpc.service3.MoistureReply>(
                  this, METHODID_CHECK_MOISTURE)))
          .build();
    }
  }

  /**
   * <pre>
   * The Moisture Service Definition
   * </pre>
   */
  public static final class MoistureStub extends io.grpc.stub.AbstractStub<MoistureStub> {
    private MoistureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MoistureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MoistureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MoistureStub(channel, callOptions);
    }

    /**
     */
    public void checkMoisture(grpc.service3.MoistureRequest request,
        io.grpc.stub.StreamObserver<grpc.service3.MoistureReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMoistureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Moisture Service Definition
   * </pre>
   */
  public static final class MoistureBlockingStub extends io.grpc.stub.AbstractStub<MoistureBlockingStub> {
    private MoistureBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MoistureBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MoistureBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MoistureBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.service3.MoistureReply checkMoisture(grpc.service3.MoistureRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckMoistureMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Moisture Service Definition
   * </pre>
   */
  public static final class MoistureFutureStub extends io.grpc.stub.AbstractStub<MoistureFutureStub> {
    private MoistureFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MoistureFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MoistureFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MoistureFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.service3.MoistureReply> checkMoisture(
        grpc.service3.MoistureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMoistureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_MOISTURE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MoistureImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MoistureImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_MOISTURE:
          serviceImpl.checkMoisture((grpc.service3.MoistureRequest) request,
              (io.grpc.stub.StreamObserver<grpc.service3.MoistureReply>) responseObserver);
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

  private static abstract class MoistureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MoistureBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service3.MoistureImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Moisture");
    }
  }

  private static final class MoistureFileDescriptorSupplier
      extends MoistureBaseDescriptorSupplier {
    MoistureFileDescriptorSupplier() {}
  }

  private static final class MoistureMethodDescriptorSupplier
      extends MoistureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MoistureMethodDescriptorSupplier(String methodName) {
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
      synchronized (MoistureGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MoistureFileDescriptorSupplier())
              .addMethod(getCheckMoistureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
