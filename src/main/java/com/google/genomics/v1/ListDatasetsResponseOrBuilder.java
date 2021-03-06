// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/datasets.proto

package com.google.genomics.v1;

public interface ListDatasetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.ListDatasetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.genomics.v1.Dataset datasets = 1;</code>
   *
   * <pre>
   * The list of matching Datasets.
   * </pre>
   */
  java.util.List<com.google.genomics.v1.Dataset> 
      getDatasetsList();
  /**
   * <code>repeated .google.genomics.v1.Dataset datasets = 1;</code>
   *
   * <pre>
   * The list of matching Datasets.
   * </pre>
   */
  com.google.genomics.v1.Dataset getDatasets(int index);
  /**
   * <code>repeated .google.genomics.v1.Dataset datasets = 1;</code>
   *
   * <pre>
   * The list of matching Datasets.
   * </pre>
   */
  int getDatasetsCount();
  /**
   * <code>repeated .google.genomics.v1.Dataset datasets = 1;</code>
   *
   * <pre>
   * The list of matching Datasets.
   * </pre>
   */
  java.util.List<? extends com.google.genomics.v1.DatasetOrBuilder> 
      getDatasetsOrBuilderList();
  /**
   * <code>repeated .google.genomics.v1.Dataset datasets = 1;</code>
   *
   * <pre>
   * The list of matching Datasets.
   * </pre>
   */
  com.google.genomics.v1.DatasetOrBuilder getDatasetsOrBuilder(
      int index);

  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
