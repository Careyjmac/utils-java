// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/datasets.proto

package com.google.genomics.v1;

public interface ListDatasetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.ListDatasetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string project_id = 1;</code>
   *
   * <pre>
   * Required. The project to list datasets for.
   * </pre>
   */
  java.lang.String getProjectId();
  /**
   * <code>optional string project_id = 1;</code>
   *
   * <pre>
   * Required. The project to list datasets for.
   * </pre>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>optional int32 page_size = 2;</code>
   *
   * <pre>
   * The maximum number of results returned by this request. If unspecified,
   * defaults to 50. The maximum value is 1024.
   * </pre>
   */
  int getPageSize();

  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * To get the next page of results, set this parameter to the value of
   * `nextPageToken` from the previous response.
   * </pre>
   */
  java.lang.String getPageToken();
  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * To get the next page of results, set this parameter to the value of
   * `nextPageToken` from the previous response.
   * </pre>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
