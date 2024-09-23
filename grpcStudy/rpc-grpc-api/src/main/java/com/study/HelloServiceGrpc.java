package com.study;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: Hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest,
      com.study.HelloProto.HelloRespone> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = com.study.HelloProto.HelloRequest.class,
      responseType = com.study.HelloProto.HelloRespone.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest,
      com.study.HelloProto.HelloRespone> getHelloMethod() {
    io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest, com.study.HelloProto.HelloRespone> getHelloMethod;
    if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
          HelloServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<com.study.HelloProto.HelloRequest, com.study.HelloProto.HelloRespone>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.study.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.study.HelloProto.HelloRespone.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest,
      com.study.HelloProto.HelloRespone> getServerHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverHello",
      requestType = com.study.HelloProto.HelloRequest.class,
      responseType = com.study.HelloProto.HelloRespone.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest,
      com.study.HelloProto.HelloRespone> getServerHelloMethod() {
    io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest, com.study.HelloProto.HelloRespone> getServerHelloMethod;
    if ((getServerHelloMethod = HelloServiceGrpc.getServerHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getServerHelloMethod = HelloServiceGrpc.getServerHelloMethod) == null) {
          HelloServiceGrpc.getServerHelloMethod = getServerHelloMethod =
              io.grpc.MethodDescriptor.<com.study.HelloProto.HelloRequest, com.study.HelloProto.HelloRespone>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.study.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.study.HelloProto.HelloRespone.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("serverHello"))
              .build();
        }
      }
    }
    return getServerHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest,
      com.study.HelloProto.HelloRespone> getClientHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientHello",
      requestType = com.study.HelloProto.HelloRequest.class,
      responseType = com.study.HelloProto.HelloRespone.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest,
      com.study.HelloProto.HelloRespone> getClientHelloMethod() {
    io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest, com.study.HelloProto.HelloRespone> getClientHelloMethod;
    if ((getClientHelloMethod = HelloServiceGrpc.getClientHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getClientHelloMethod = HelloServiceGrpc.getClientHelloMethod) == null) {
          HelloServiceGrpc.getClientHelloMethod = getClientHelloMethod =
              io.grpc.MethodDescriptor.<com.study.HelloProto.HelloRequest, com.study.HelloProto.HelloRespone>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clientHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.study.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.study.HelloProto.HelloRespone.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("clientHello"))
              .build();
        }
      }
    }
    return getClientHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest,
      com.study.HelloProto.HelloRespone> getDoubleHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doubleHello",
      requestType = com.study.HelloProto.HelloRequest.class,
      responseType = com.study.HelloProto.HelloRespone.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest,
      com.study.HelloProto.HelloRespone> getDoubleHelloMethod() {
    io.grpc.MethodDescriptor<com.study.HelloProto.HelloRequest, com.study.HelloProto.HelloRespone> getDoubleHelloMethod;
    if ((getDoubleHelloMethod = HelloServiceGrpc.getDoubleHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getDoubleHelloMethod = HelloServiceGrpc.getDoubleHelloMethod) == null) {
          HelloServiceGrpc.getDoubleHelloMethod = getDoubleHelloMethod =
              io.grpc.MethodDescriptor.<com.study.HelloProto.HelloRequest, com.study.HelloProto.HelloRespone>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doubleHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.study.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.study.HelloProto.HelloRespone.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("doubleHello"))
              .build();
        }
      }
    }
    return getDoubleHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 服务
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 普通rpc接口
     * </pre>
     */
    default void hello(com.study.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * 服务端流式rpc接口
     * </pre>
     */
    default void serverHello(com.study.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * 客户端流式rpc接口
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRequest> clientHello(
        io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * 双向流rpc接口
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRequest> doubleHello(
        io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDoubleHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HelloService.
   * <pre>
   * 服务
   * </pre>
   */
  public static abstract class HelloServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HelloServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HelloService.
   * <pre>
   * 服务
   * </pre>
   */
  public static final class HelloServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 普通rpc接口
     * </pre>
     */
    public void hello(com.study.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 服务端流式rpc接口
     * </pre>
     */
    public void serverHello(com.study.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 客户端流式rpc接口
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRequest> clientHello(
        io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientHelloMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 双向流rpc接口
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRequest> doubleHello(
        io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getDoubleHelloMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HelloService.
   * <pre>
   * 服务
   * </pre>
   */
  public static final class HelloServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 普通rpc接口
     * </pre>
     */
    public com.study.HelloProto.HelloRespone hello(com.study.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 服务端流式rpc接口
     * </pre>
     */
    public java.util.Iterator<com.study.HelloProto.HelloRespone> serverHello(
        com.study.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getServerHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HelloService.
   * <pre>
   * 服务
   * </pre>
   */
  public static final class HelloServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 普通rpc接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.study.HelloProto.HelloRespone> hello(
        com.study.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_SERVER_HELLO = 1;
  private static final int METHODID_CLIENT_HELLO = 2;
  private static final int METHODID_DOUBLE_HELLO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.study.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone>) responseObserver);
          break;
        case METHODID_SERVER_HELLO:
          serviceImpl.serverHello((com.study.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone>) responseObserver);
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
        case METHODID_CLIENT_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientHello(
              (io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone>) responseObserver);
        case METHODID_DOUBLE_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.doubleHello(
              (io.grpc.stub.StreamObserver<com.study.HelloProto.HelloRespone>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.study.HelloProto.HelloRequest,
              com.study.HelloProto.HelloRespone>(
                service, METHODID_HELLO)))
        .addMethod(
          getServerHelloMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.study.HelloProto.HelloRequest,
              com.study.HelloProto.HelloRespone>(
                service, METHODID_SERVER_HELLO)))
        .addMethod(
          getClientHelloMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.study.HelloProto.HelloRequest,
              com.study.HelloProto.HelloRespone>(
                service, METHODID_CLIENT_HELLO)))
        .addMethod(
          getDoubleHelloMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.study.HelloProto.HelloRequest,
              com.study.HelloProto.HelloRespone>(
                service, METHODID_DOUBLE_HELLO)))
        .build();
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.study.HelloProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HelloServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getServerHelloMethod())
              .addMethod(getClientHelloMethod())
              .addMethod(getDoubleHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
