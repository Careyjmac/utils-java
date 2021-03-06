// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/cigar.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.CigarUnit}
 *
 * <pre>
 * A single CIGAR operation.
 * </pre>
 */
public  final class CigarUnit extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.CigarUnit)
    CigarUnitOrBuilder {
  // Use CigarUnit.newBuilder() to construct.
  private CigarUnit(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private CigarUnit() {
    operation_ = 0;
    operationLength_ = 0L;
    referenceSequence_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CigarUnit(
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
          case 8: {
            int rawValue = input.readEnum();

            operation_ = rawValue;
            break;
          }
          case 16: {

            operationLength_ = input.readInt64();
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();

            referenceSequence_ = bs;
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
    return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.CigarUnit.class, com.google.genomics.v1.CigarUnit.Builder.class);
  }

  public static final com.google.protobuf.Parser<CigarUnit> PARSER =
      new com.google.protobuf.AbstractParser<CigarUnit>() {
    public CigarUnit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CigarUnit(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<CigarUnit> getParserForType() {
    return PARSER;
  }

  /**
   * Protobuf enum {@code google.genomics.v1.CigarUnit.Operation}
   *
   * <pre>
   * Describes the different types of CIGAR alignment operations that exist.
   * Used wherever CIGAR alignments are used.
   * </pre>
   */
  public enum Operation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OPERATION_UNSPECIFIED = 0;</code>
     */
    OPERATION_UNSPECIFIED(0, 0),
    /**
     * <code>ALIGNMENT_MATCH = 1;</code>
     *
     * <pre>
     * An alignment match indicates that a sequence can be aligned to the
     * reference without evidence of an INDEL. Unlike the
     * `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators,
     * the `ALIGNMENT_MATCH` operator does not indicate whether the
     * reference and read sequences are an exact match. This operator is
     * equivalent to SAM's `M`.
     * </pre>
     */
    ALIGNMENT_MATCH(1, 1),
    /**
     * <code>INSERT = 2;</code>
     *
     * <pre>
     * The insert operator indicates that the read contains evidence of bases
     * being inserted into the reference. This operator is equivalent to SAM's
     * `I`.
     * </pre>
     */
    INSERT(2, 2),
    /**
     * <code>DELETE = 3;</code>
     *
     * <pre>
     * The delete operator indicates that the read contains evidence of bases
     * being deleted from the reference. This operator is equivalent to SAM's
     * `D`.
     * </pre>
     */
    DELETE(3, 3),
    /**
     * <code>SKIP = 4;</code>
     *
     * <pre>
     * The skip operator indicates that this read skips a long segment of the
     * reference, but the bases have not been deleted. This operator is commonly
     * used when working with RNA-seq data, where reads may skip long segments
     * of the reference between exons. This operator is equivalent to SAM's
     * `N`.
     * </pre>
     */
    SKIP(4, 4),
    /**
     * <code>CLIP_SOFT = 5;</code>
     *
     * <pre>
     * The soft clip operator indicates that bases at the start/end of a read
     * have not been considered during alignment. This may occur if the majority
     * of a read maps, except for low quality bases at the start/end of a read.
     * This operator is equivalent to SAM's `S`. Bases that are soft
     * clipped will still be stored in the read.
     * </pre>
     */
    CLIP_SOFT(5, 5),
    /**
     * <code>CLIP_HARD = 6;</code>
     *
     * <pre>
     * The hard clip operator indicates that bases at the start/end of a read
     * have been omitted from this alignment. This may occur if this linear
     * alignment is part of a chimeric alignment, or if the read has been
     * trimmed (for example, during error correction or to trim poly-A tails for
     * RNA-seq). This operator is equivalent to SAM's `H`.
     * </pre>
     */
    CLIP_HARD(6, 6),
    /**
     * <code>PAD = 7;</code>
     *
     * <pre>
     * The pad operator indicates that there is padding in an alignment. This
     * operator is equivalent to SAM's `P`.
     * </pre>
     */
    PAD(7, 7),
    /**
     * <code>SEQUENCE_MATCH = 8;</code>
     *
     * <pre>
     * This operator indicates that this portion of the aligned sequence exactly
     * matches the reference. This operator is equivalent to SAM's `=`.
     * </pre>
     */
    SEQUENCE_MATCH(8, 8),
    /**
     * <code>SEQUENCE_MISMATCH = 9;</code>
     *
     * <pre>
     * This operator indicates that this portion of the aligned sequence is an
     * alignment match to the reference, but a sequence mismatch. This can
     * indicate a SNP or a read error. This operator is equivalent to SAM's
     * `X`.
     * </pre>
     */
    SEQUENCE_MISMATCH(9, 9),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>OPERATION_UNSPECIFIED = 0;</code>
     */
    public static final int OPERATION_UNSPECIFIED_VALUE = 0;
    /**
     * <code>ALIGNMENT_MATCH = 1;</code>
     *
     * <pre>
     * An alignment match indicates that a sequence can be aligned to the
     * reference without evidence of an INDEL. Unlike the
     * `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators,
     * the `ALIGNMENT_MATCH` operator does not indicate whether the
     * reference and read sequences are an exact match. This operator is
     * equivalent to SAM's `M`.
     * </pre>
     */
    public static final int ALIGNMENT_MATCH_VALUE = 1;
    /**
     * <code>INSERT = 2;</code>
     *
     * <pre>
     * The insert operator indicates that the read contains evidence of bases
     * being inserted into the reference. This operator is equivalent to SAM's
     * `I`.
     * </pre>
     */
    public static final int INSERT_VALUE = 2;
    /**
     * <code>DELETE = 3;</code>
     *
     * <pre>
     * The delete operator indicates that the read contains evidence of bases
     * being deleted from the reference. This operator is equivalent to SAM's
     * `D`.
     * </pre>
     */
    public static final int DELETE_VALUE = 3;
    /**
     * <code>SKIP = 4;</code>
     *
     * <pre>
     * The skip operator indicates that this read skips a long segment of the
     * reference, but the bases have not been deleted. This operator is commonly
     * used when working with RNA-seq data, where reads may skip long segments
     * of the reference between exons. This operator is equivalent to SAM's
     * `N`.
     * </pre>
     */
    public static final int SKIP_VALUE = 4;
    /**
     * <code>CLIP_SOFT = 5;</code>
     *
     * <pre>
     * The soft clip operator indicates that bases at the start/end of a read
     * have not been considered during alignment. This may occur if the majority
     * of a read maps, except for low quality bases at the start/end of a read.
     * This operator is equivalent to SAM's `S`. Bases that are soft
     * clipped will still be stored in the read.
     * </pre>
     */
    public static final int CLIP_SOFT_VALUE = 5;
    /**
     * <code>CLIP_HARD = 6;</code>
     *
     * <pre>
     * The hard clip operator indicates that bases at the start/end of a read
     * have been omitted from this alignment. This may occur if this linear
     * alignment is part of a chimeric alignment, or if the read has been
     * trimmed (for example, during error correction or to trim poly-A tails for
     * RNA-seq). This operator is equivalent to SAM's `H`.
     * </pre>
     */
    public static final int CLIP_HARD_VALUE = 6;
    /**
     * <code>PAD = 7;</code>
     *
     * <pre>
     * The pad operator indicates that there is padding in an alignment. This
     * operator is equivalent to SAM's `P`.
     * </pre>
     */
    public static final int PAD_VALUE = 7;
    /**
     * <code>SEQUENCE_MATCH = 8;</code>
     *
     * <pre>
     * This operator indicates that this portion of the aligned sequence exactly
     * matches the reference. This operator is equivalent to SAM's `=`.
     * </pre>
     */
    public static final int SEQUENCE_MATCH_VALUE = 8;
    /**
     * <code>SEQUENCE_MISMATCH = 9;</code>
     *
     * <pre>
     * This operator indicates that this portion of the aligned sequence is an
     * alignment match to the reference, but a sequence mismatch. This can
     * indicate a SNP or a read error. This operator is equivalent to SAM's
     * `X`.
     * </pre>
     */
    public static final int SEQUENCE_MISMATCH_VALUE = 9;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static Operation valueOf(int value) {
      switch (value) {
        case 0: return OPERATION_UNSPECIFIED;
        case 1: return ALIGNMENT_MATCH;
        case 2: return INSERT;
        case 3: return DELETE;
        case 4: return SKIP;
        case 5: return CLIP_SOFT;
        case 6: return CLIP_HARD;
        case 7: return PAD;
        case 8: return SEQUENCE_MATCH;
        case 9: return SEQUENCE_MISMATCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operation>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Operation>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
            public Operation findValueByNumber(int number) {
              return Operation.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.genomics.v1.CigarUnit.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operation[] VALUES = values();

    public static Operation valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Operation(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.genomics.v1.CigarUnit.Operation)
  }

  public static final int OPERATION_FIELD_NUMBER = 1;
  private int operation_;
  /**
   * <code>optional .google.genomics.v1.CigarUnit.Operation operation = 1;</code>
   */
  public int getOperationValue() {
    return operation_;
  }
  /**
   * <code>optional .google.genomics.v1.CigarUnit.Operation operation = 1;</code>
   */
  public com.google.genomics.v1.CigarUnit.Operation getOperation() {
    com.google.genomics.v1.CigarUnit.Operation result = com.google.genomics.v1.CigarUnit.Operation.valueOf(operation_);
    return result == null ? com.google.genomics.v1.CigarUnit.Operation.UNRECOGNIZED : result;
  }

  public static final int OPERATION_LENGTH_FIELD_NUMBER = 2;
  private long operationLength_;
  /**
   * <code>optional int64 operation_length = 2;</code>
   *
   * <pre>
   * The number of genomic bases that the operation runs for. Required.
   * </pre>
   */
  public long getOperationLength() {
    return operationLength_;
  }

  public static final int REFERENCE_SEQUENCE_FIELD_NUMBER = 3;
  private java.lang.Object referenceSequence_;
  /**
   * <code>optional string reference_sequence = 3;</code>
   *
   * <pre>
   * `referenceSequence` is only used at mismatches
   * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
   * Filling this field replaces SAM's MD tag. If the relevant information is
   * not available, this field is unset.
   * </pre>
   */
  public java.lang.String getReferenceSequence() {
    java.lang.Object ref = referenceSequence_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        referenceSequence_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string reference_sequence = 3;</code>
   *
   * <pre>
   * `referenceSequence` is only used at mismatches
   * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
   * Filling this field replaces SAM's MD tag. If the relevant information is
   * not available, this field is unset.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getReferenceSequenceBytes() {
    java.lang.Object ref = referenceSequence_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceSequence_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (operation_ != com.google.genomics.v1.CigarUnit.Operation.OPERATION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operation_);
    }
    if (operationLength_ != 0L) {
      output.writeInt64(2, operationLength_);
    }
    if (!getReferenceSequenceBytes().isEmpty()) {
      output.writeBytes(3, getReferenceSequenceBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (operation_ != com.google.genomics.v1.CigarUnit.Operation.OPERATION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operation_);
    }
    if (operationLength_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, operationLength_);
    }
    if (!getReferenceSequenceBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getReferenceSequenceBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.CigarUnit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.genomics.v1.CigarUnit prototype) {
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
   * Protobuf type {@code google.genomics.v1.CigarUnit}
   *
   * <pre>
   * A single CIGAR operation.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.CigarUnit)
      com.google.genomics.v1.CigarUnitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.CigarUnit.class, com.google.genomics.v1.CigarUnit.Builder.class);
    }

    // Construct using com.google.genomics.v1.CigarUnit.newBuilder()
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
      operation_ = 0;

      operationLength_ = 0L;

      referenceSequence_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_descriptor;
    }

    public com.google.genomics.v1.CigarUnit getDefaultInstanceForType() {
      return com.google.genomics.v1.CigarUnit.getDefaultInstance();
    }

    public com.google.genomics.v1.CigarUnit build() {
      com.google.genomics.v1.CigarUnit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.CigarUnit buildPartial() {
      com.google.genomics.v1.CigarUnit result = new com.google.genomics.v1.CigarUnit(this);
      result.operation_ = operation_;
      result.operationLength_ = operationLength_;
      result.referenceSequence_ = referenceSequence_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.CigarUnit) {
        return mergeFrom((com.google.genomics.v1.CigarUnit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.CigarUnit other) {
      if (other == com.google.genomics.v1.CigarUnit.getDefaultInstance()) return this;
      if (other.operation_ != 0) {
        setOperationValue(other.getOperationValue());
      }
      if (other.getOperationLength() != 0L) {
        setOperationLength(other.getOperationLength());
      }
      if (!other.getReferenceSequence().isEmpty()) {
        referenceSequence_ = other.referenceSequence_;
        onChanged();
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
      com.google.genomics.v1.CigarUnit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.CigarUnit) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int operation_ = 0;
    /**
     * <code>optional .google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public int getOperationValue() {
      return operation_;
    }
    /**
     * <code>optional .google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public Builder setOperationValue(int value) {
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public com.google.genomics.v1.CigarUnit.Operation getOperation() {
      com.google.genomics.v1.CigarUnit.Operation result = com.google.genomics.v1.CigarUnit.Operation.valueOf(operation_);
      return result == null ? com.google.genomics.v1.CigarUnit.Operation.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public Builder setOperation(com.google.genomics.v1.CigarUnit.Operation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public Builder clearOperation() {
      
      operation_ = 0;
      onChanged();
      return this;
    }

    private long operationLength_ ;
    /**
     * <code>optional int64 operation_length = 2;</code>
     *
     * <pre>
     * The number of genomic bases that the operation runs for. Required.
     * </pre>
     */
    public long getOperationLength() {
      return operationLength_;
    }
    /**
     * <code>optional int64 operation_length = 2;</code>
     *
     * <pre>
     * The number of genomic bases that the operation runs for. Required.
     * </pre>
     */
    public Builder setOperationLength(long value) {
      
      operationLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 operation_length = 2;</code>
     *
     * <pre>
     * The number of genomic bases that the operation runs for. Required.
     * </pre>
     */
    public Builder clearOperationLength() {
      
      operationLength_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object referenceSequence_ = "";
    /**
     * <code>optional string reference_sequence = 3;</code>
     *
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     */
    public java.lang.String getReferenceSequence() {
      java.lang.Object ref = referenceSequence_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          referenceSequence_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string reference_sequence = 3;</code>
     *
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getReferenceSequenceBytes() {
      java.lang.Object ref = referenceSequence_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceSequence_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string reference_sequence = 3;</code>
     *
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     */
    public Builder setReferenceSequence(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referenceSequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string reference_sequence = 3;</code>
     *
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     */
    public Builder clearReferenceSequence() {
      
      referenceSequence_ = getDefaultInstance().getReferenceSequence();
      onChanged();
      return this;
    }
    /**
     * <code>optional string reference_sequence = 3;</code>
     *
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     */
    public Builder setReferenceSequenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referenceSequence_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.CigarUnit)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.CigarUnit)
  private static final com.google.genomics.v1.CigarUnit defaultInstance;static {
    defaultInstance = new com.google.genomics.v1.CigarUnit();
  }

  public static com.google.genomics.v1.CigarUnit getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.genomics.v1.CigarUnit getDefaultInstanceForType() {
    return defaultInstance;
  }

}

