// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: moisture.proto

package grpc.service3;

public final class MoistureImpl {
  private MoistureImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service3_MoistureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service3_MoistureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service3_MoistureReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service3_MoistureReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016moisture.proto\022\010service3\"\037\n\017MoistureRe" +
      "quest\022\014\n\004text\030\001 \001(\t\" \n\rMoistureReply\022\017\n\007" +
      "message\030\001 \001(\t2Q\n\010Moisture\022E\n\rCheckMoistu" +
      "re\022\031.service3.MoistureRequest\032\027.service3" +
      ".MoistureReply\"\000B\037\n\rgrpc.service3B\014Moist" +
      "ureImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_service3_MoistureRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_service3_MoistureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service3_MoistureRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_service3_MoistureReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_service3_MoistureReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service3_MoistureReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
