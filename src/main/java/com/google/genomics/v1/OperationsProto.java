// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/operations.proto

package com.google.genomics.v1;

public final class OperationsProto {
  private OperationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_OperationMetadata_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_OperationEvent_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_OperationEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/genomics/v1/operations.proto\022\022g" +
      "oogle.genomics.v1\032\034google/api/annotation" +
      "s.proto\032\031google/protobuf/any.proto\032\037goog" +
      "le/protobuf/timestamp.proto\"\257\001\n\021Operatio" +
      "nMetadata\022\022\n\nproject_id\030\001 \001(\t\022+\n\007created" +
      "\030\002 \001(\0132\032.google.protobuf.Timestamp\022%\n\007re" +
      "quest\030\005 \001(\0132\024.google.protobuf.Any\0222\n\006eve" +
      "nts\030\006 \003(\0132\".google.genomics.v1.Operation" +
      "Event\"%\n\016OperationEvent\022\023\n\013description\030\003" +
      " \001(\tB+\n\026com.google.genomics.v1B\017Operatio",
      "nsProtoP\001b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_genomics_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_genomics_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "ProjectId", "Created", "Request", "Events", });
    internal_static_google_genomics_v1_OperationEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_genomics_v1_OperationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_OperationEvent_descriptor,
        new java.lang.String[] { "Description", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
