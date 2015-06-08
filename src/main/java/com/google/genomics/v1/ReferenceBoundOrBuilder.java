// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface ReferenceBoundOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.ReferenceBound)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string reference_name = 1;</code>
   *
   * <pre>
   * The reference the bound is associate with.
   * </pre>
   */
  java.lang.String getReferenceName();
  /**
   * <code>optional string reference_name = 1;</code>
   *
   * <pre>
   * The reference the bound is associate with.
   * </pre>
   */
  com.google.protobuf.ByteString
      getReferenceNameBytes();

  /**
   * <code>optional int64 upper_bound = 2;</code>
   *
   * <pre>
   * An upper bound (inclusive) on the starting coordinate of any
   * variant in the reference sequence.
   * </pre>
   */
  long getUpperBound();
}