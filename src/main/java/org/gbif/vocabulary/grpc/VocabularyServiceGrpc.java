package org.gbif.vocabulary.grpc;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: vocabulary.proto")
public final class VocabularyServiceGrpc {

  private VocabularyServiceGrpc() {}

  public static final String SERVICE_NAME = "org.gbif.vocabulary.grpc.VocabularyService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getConceptsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.gbif.vocabulary.grpc.VocabularyKey,
      org.gbif.vocabulary.grpc.Concept> METHOD_CONCEPTS = getConceptsMethod();

  private static volatile io.grpc.MethodDescriptor<org.gbif.vocabulary.grpc.VocabularyKey,
      org.gbif.vocabulary.grpc.Concept> getConceptsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.gbif.vocabulary.grpc.VocabularyKey,
      org.gbif.vocabulary.grpc.Concept> getConceptsMethod() {
    io.grpc.MethodDescriptor<org.gbif.vocabulary.grpc.VocabularyKey, org.gbif.vocabulary.grpc.Concept> getConceptsMethod;
    if ((getConceptsMethod = VocabularyServiceGrpc.getConceptsMethod) == null) {
      synchronized (VocabularyServiceGrpc.class) {
        if ((getConceptsMethod = VocabularyServiceGrpc.getConceptsMethod) == null) {
          VocabularyServiceGrpc.getConceptsMethod = getConceptsMethod = 
              io.grpc.MethodDescriptor.<org.gbif.vocabulary.grpc.VocabularyKey, org.gbif.vocabulary.grpc.Concept>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "org.gbif.vocabulary.grpc.VocabularyService", "Concepts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.gbif.vocabulary.grpc.VocabularyKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.gbif.vocabulary.grpc.Concept.getDefaultInstance()))
                  .setSchemaDescriptor(new VocabularyServiceMethodDescriptorSupplier("Concepts"))
                  .build();
          }
        }
     }
     return getConceptsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VocabularyServiceStub newStub(io.grpc.Channel channel) {
    return new VocabularyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VocabularyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VocabularyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VocabularyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VocabularyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class VocabularyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void concepts(org.gbif.vocabulary.grpc.VocabularyKey request,
        io.grpc.stub.StreamObserver<org.gbif.vocabulary.grpc.Concept> responseObserver) {
      asyncUnimplementedUnaryCall(getConceptsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConceptsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.gbif.vocabulary.grpc.VocabularyKey,
                org.gbif.vocabulary.grpc.Concept>(
                  this, METHODID_CONCEPTS)))
          .build();
    }
  }

  /**
   */
  public static final class VocabularyServiceStub extends io.grpc.stub.AbstractStub<VocabularyServiceStub> {
    private VocabularyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VocabularyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VocabularyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VocabularyServiceStub(channel, callOptions);
    }

    /**
     */
    public void concepts(org.gbif.vocabulary.grpc.VocabularyKey request,
        io.grpc.stub.StreamObserver<org.gbif.vocabulary.grpc.Concept> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getConceptsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VocabularyServiceBlockingStub extends io.grpc.stub.AbstractStub<VocabularyServiceBlockingStub> {
    private VocabularyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VocabularyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VocabularyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VocabularyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.gbif.vocabulary.grpc.Concept> concepts(
        org.gbif.vocabulary.grpc.VocabularyKey request) {
      return blockingServerStreamingCall(
          getChannel(), getConceptsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VocabularyServiceFutureStub extends io.grpc.stub.AbstractStub<VocabularyServiceFutureStub> {
    private VocabularyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VocabularyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VocabularyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VocabularyServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONCEPTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VocabularyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VocabularyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONCEPTS:
          serviceImpl.concepts((org.gbif.vocabulary.grpc.VocabularyKey) request,
              (io.grpc.stub.StreamObserver<org.gbif.vocabulary.grpc.Concept>) responseObserver);
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

  private static abstract class VocabularyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VocabularyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.gbif.vocabulary.grpc.VocabularyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VocabularyService");
    }
  }

  private static final class VocabularyServiceFileDescriptorSupplier
      extends VocabularyServiceBaseDescriptorSupplier {
    VocabularyServiceFileDescriptorSupplier() {}
  }

  private static final class VocabularyServiceMethodDescriptorSupplier
      extends VocabularyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VocabularyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VocabularyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VocabularyServiceFileDescriptorSupplier())
              .addMethod(getConceptsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
