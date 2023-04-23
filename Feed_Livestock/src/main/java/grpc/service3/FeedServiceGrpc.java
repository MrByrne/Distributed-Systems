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
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: feed.proto")
public final class FeedServiceGrpc {

  private FeedServiceGrpc() {}

  public static final String SERVICE_NAME = "feed.FeedService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service3.FeedMessage,
      grpc.service3.FeedResponse> getFeedLivestockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "feedLivestock",
      requestType = grpc.service3.FeedMessage.class,
      responseType = grpc.service3.FeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.service3.FeedMessage,
      grpc.service3.FeedResponse> getFeedLivestockMethod() {
    io.grpc.MethodDescriptor<grpc.service3.FeedMessage, grpc.service3.FeedResponse> getFeedLivestockMethod;
    if ((getFeedLivestockMethod = FeedServiceGrpc.getFeedLivestockMethod) == null) {
      synchronized (FeedServiceGrpc.class) {
        if ((getFeedLivestockMethod = FeedServiceGrpc.getFeedLivestockMethod) == null) {
          FeedServiceGrpc.getFeedLivestockMethod = getFeedLivestockMethod = 
              io.grpc.MethodDescriptor.<grpc.service3.FeedMessage, grpc.service3.FeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "feed.FeedService", "feedLivestock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.FeedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service3.FeedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedServiceMethodDescriptorSupplier("feedLivestock"))
                  .build();
          }
        }
     }
     return getFeedLivestockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedServiceStub newStub(io.grpc.Channel channel) {
    return new FeedServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FeedServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FeedServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class FeedServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service3.FeedMessage> feedLivestock(
        io.grpc.stub.StreamObserver<grpc.service3.FeedResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFeedLivestockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFeedLivestockMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.service3.FeedMessage,
                grpc.service3.FeedResponse>(
                  this, METHODID_FEED_LIVESTOCK)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class FeedServiceStub extends io.grpc.stub.AbstractStub<FeedServiceStub> {
    private FeedServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.service3.FeedMessage> feedLivestock(
        io.grpc.stub.StreamObserver<grpc.service3.FeedResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFeedLivestockMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class FeedServiceBlockingStub extends io.grpc.stub.AbstractStub<FeedServiceBlockingStub> {
    private FeedServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class FeedServiceFutureStub extends io.grpc.stub.AbstractStub<FeedServiceFutureStub> {
    private FeedServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FEED_LIVESTOCK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_FEED_LIVESTOCK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.feedLivestock(
              (io.grpc.stub.StreamObserver<grpc.service3.FeedResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service3.FeedServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedService");
    }
  }

  private static final class FeedServiceFileDescriptorSupplier
      extends FeedServiceBaseDescriptorSupplier {
    FeedServiceFileDescriptorSupplier() {}
  }

  private static final class FeedServiceMethodDescriptorSupplier
      extends FeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedServiceFileDescriptorSupplier())
              .addMethod(getFeedLivestockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
