// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.UpdateVariantRequest}
 */
public  final class UpdateVariantRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.UpdateVariantRequest)
    UpdateVariantRequestOrBuilder {
  // Use UpdateVariantRequest.newBuilder() to construct.
  private UpdateVariantRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private UpdateVariantRequest() {
    variantId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateVariantRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            variantId_ = bs;
            break;
          }
          case 18: {
            com.google.genomics.v1.Variant.Builder subBuilder = null;
            if (variant_ != null) {
              subBuilder = variant_.toBuilder();
            }
            variant_ = input.readMessage(com.google.genomics.v1.Variant.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(variant_);
              variant_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateVariantRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateVariantRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.UpdateVariantRequest.class, com.google.genomics.v1.UpdateVariantRequest.Builder.class);
  }

  public static final com.google.protobuf.Parser<UpdateVariantRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateVariantRequest>() {
    public UpdateVariantRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateVariantRequest(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateVariantRequest> getParserForType() {
    return PARSER;
  }

  public static final int VARIANT_ID_FIELD_NUMBER = 1;
  private java.lang.Object variantId_;
  /**
   * <code>optional string variant_id = 1;</code>
   *
   * <pre>
   * The ID of the variant to be updated.
   * </pre>
   */
  public java.lang.String getVariantId() {
    java.lang.Object ref = variantId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        variantId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string variant_id = 1;</code>
   *
   * <pre>
   * The ID of the variant to be updated.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getVariantIdBytes() {
    java.lang.Object ref = variantId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      variantId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VARIANT_FIELD_NUMBER = 2;
  private com.google.genomics.v1.Variant variant_;
  /**
   * <code>optional .google.genomics.v1.Variant variant = 2;</code>
   *
   * <pre>
   * The new variant data.
   * </pre>
   */
  public boolean hasVariant() {
    return variant_ != null;
  }
  /**
   * <code>optional .google.genomics.v1.Variant variant = 2;</code>
   *
   * <pre>
   * The new variant data.
   * </pre>
   */
  public com.google.genomics.v1.Variant getVariant() {
    return variant_ == null ? com.google.genomics.v1.Variant.getDefaultInstance() : variant_;
  }
  /**
   * <code>optional .google.genomics.v1.Variant variant = 2;</code>
   *
   * <pre>
   * The new variant data.
   * </pre>
   */
  public com.google.genomics.v1.VariantOrBuilder getVariantOrBuilder() {
    return getVariant();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!getVariantIdBytes().isEmpty()) {
      output.writeBytes(1, getVariantIdBytes());
    }
    if (variant_ != null) {
      output.writeMessage(2, getVariant());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVariantIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getVariantIdBytes());
    }
    if (variant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVariant());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.UpdateVariantRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.UpdateVariantRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateVariantRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.UpdateVariantRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateVariantRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.UpdateVariantRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateVariantRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.UpdateVariantRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateVariantRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.UpdateVariantRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.genomics.v1.UpdateVariantRequest prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.genomics.v1.UpdateVariantRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.UpdateVariantRequest)
      com.google.genomics.v1.UpdateVariantRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateVariantRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateVariantRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.UpdateVariantRequest.class, com.google.genomics.v1.UpdateVariantRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1.UpdateVariantRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      variantId_ = "";

      if (variantBuilder_ == null) {
        variant_ = null;
      } else {
        variant_ = null;
        variantBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateVariantRequest_descriptor;
    }

    public com.google.genomics.v1.UpdateVariantRequest getDefaultInstanceForType() {
      return com.google.genomics.v1.UpdateVariantRequest.getDefaultInstance();
    }

    public com.google.genomics.v1.UpdateVariantRequest build() {
      com.google.genomics.v1.UpdateVariantRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.UpdateVariantRequest buildPartial() {
      com.google.genomics.v1.UpdateVariantRequest result = new com.google.genomics.v1.UpdateVariantRequest(this);
      result.variantId_ = variantId_;
      if (variantBuilder_ == null) {
        result.variant_ = variant_;
      } else {
        result.variant_ = variantBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.UpdateVariantRequest) {
        return mergeFrom((com.google.genomics.v1.UpdateVariantRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.UpdateVariantRequest other) {
      if (other == com.google.genomics.v1.UpdateVariantRequest.getDefaultInstance()) return this;
      if (!other.getVariantId().isEmpty()) {
        variantId_ = other.variantId_;
        onChanged();
      }
      if (other.hasVariant()) {
        mergeVariant(other.getVariant());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.genomics.v1.UpdateVariantRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.UpdateVariantRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object variantId_ = "";
    /**
     * <code>optional string variant_id = 1;</code>
     *
     * <pre>
     * The ID of the variant to be updated.
     * </pre>
     */
    public java.lang.String getVariantId() {
      java.lang.Object ref = variantId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          variantId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string variant_id = 1;</code>
     *
     * <pre>
     * The ID of the variant to be updated.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getVariantIdBytes() {
      java.lang.Object ref = variantId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        variantId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string variant_id = 1;</code>
     *
     * <pre>
     * The ID of the variant to be updated.
     * </pre>
     */
    public Builder setVariantId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      variantId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string variant_id = 1;</code>
     *
     * <pre>
     * The ID of the variant to be updated.
     * </pre>
     */
    public Builder clearVariantId() {
      
      variantId_ = getDefaultInstance().getVariantId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string variant_id = 1;</code>
     *
     * <pre>
     * The ID of the variant to be updated.
     * </pre>
     */
    public Builder setVariantIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      variantId_ = value;
      onChanged();
      return this;
    }

    private com.google.genomics.v1.Variant variant_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder> variantBuilder_;
    /**
     * <code>optional .google.genomics.v1.Variant variant = 2;</code>
     *
     * <pre>
     * The new variant data.
     * </pre>
     */
    public boolean hasVariant() {
      return variantBuilder_ != null || variant_ != null;
    }
    /**
     * <code>optional .google.genomics.v1.Variant variant = 2;</code>
     *
     * <pre>
     * The new variant data.
     * </pre>
     */
    public com.google.genomics.v1.Variant getVariant() {
      if (variantBuilder_ == null) {
        return variant_ == null ? com.google.genomics.v1.Variant.getDefaultInstance() : variant_;
      } else {
        return variantBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.genomics.v1.Variant variant = 2;</code>
     *
     * <pre>
     * The new variant data.
     * </pre>
     */
    public Builder setVariant(com.google.genomics.v1.Variant value) {
      if (variantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        variant_ = value;
        onChanged();
      } else {
        variantBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.Variant variant = 2;</code>
     *
     * <pre>
     * The new variant data.
     * </pre>
     */
    public Builder setVariant(
        com.google.genomics.v1.Variant.Builder builderForValue) {
      if (variantBuilder_ == null) {
        variant_ = builderForValue.build();
        onChanged();
      } else {
        variantBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.Variant variant = 2;</code>
     *
     * <pre>
     * The new variant data.
     * </pre>
     */
    public Builder mergeVariant(com.google.genomics.v1.Variant value) {
      if (variantBuilder_ == null) {
        if (variant_ != null) {
          variant_ =
            com.google.genomics.v1.Variant.newBuilder(variant_).mergeFrom(value).buildPartial();
        } else {
          variant_ = value;
        }
        onChanged();
      } else {
        variantBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.Variant variant = 2;</code>
     *
     * <pre>
     * The new variant data.
     * </pre>
     */
    public Builder clearVariant() {
      if (variantBuilder_ == null) {
        variant_ = null;
        onChanged();
      } else {
        variant_ = null;
        variantBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.Variant variant = 2;</code>
     *
     * <pre>
     * The new variant data.
     * </pre>
     */
    public com.google.genomics.v1.Variant.Builder getVariantBuilder() {
      
      onChanged();
      return getVariantFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.genomics.v1.Variant variant = 2;</code>
     *
     * <pre>
     * The new variant data.
     * </pre>
     */
    public com.google.genomics.v1.VariantOrBuilder getVariantOrBuilder() {
      if (variantBuilder_ != null) {
        return variantBuilder_.getMessageOrBuilder();
      } else {
        return variant_ == null ?
            com.google.genomics.v1.Variant.getDefaultInstance() : variant_;
      }
    }
    /**
     * <code>optional .google.genomics.v1.Variant variant = 2;</code>
     *
     * <pre>
     * The new variant data.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder> 
        getVariantFieldBuilder() {
      if (variantBuilder_ == null) {
        variantBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder>(
                getVariant(),
                getParentForChildren(),
                isClean());
        variant_ = null;
      }
      return variantBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.UpdateVariantRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.UpdateVariantRequest)
  private static final com.google.genomics.v1.UpdateVariantRequest defaultInstance;static {
    defaultInstance = new com.google.genomics.v1.UpdateVariantRequest();
  }

  public static com.google.genomics.v1.UpdateVariantRequest getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.genomics.v1.UpdateVariantRequest getDefaultInstanceForType() {
    return defaultInstance;
  }

}
