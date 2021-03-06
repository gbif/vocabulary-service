// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vocabulary.proto

package org.gbif.vocabulary.grpc;

/**
 * Protobuf type {@code org.gbif.vocabulary.grpc.VocabularyKey}
 */
public  final class VocabularyKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.gbif.vocabulary.grpc.VocabularyKey)
    VocabularyKeyOrBuilder {
  // Use VocabularyKey.newBuilder() to construct.
  private VocabularyKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VocabularyKey() {
    key_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private VocabularyKey(
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

            key_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.gbif.vocabulary.grpc.VocabularyOuterClass.internal_static_org_gbif_vocabulary_grpc_VocabularyKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.gbif.vocabulary.grpc.VocabularyOuterClass.internal_static_org_gbif_vocabulary_grpc_VocabularyKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.gbif.vocabulary.grpc.VocabularyKey.class, org.gbif.vocabulary.grpc.VocabularyKey.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private int key_;
  /**
   * <code>int32 key = 1;</code>
   */
  public int getKey() {
    return key_;
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
    if (key_ != 0) {
      output.writeInt32(1, key_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, key_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.gbif.vocabulary.grpc.VocabularyKey)) {
      return super.equals(obj);
    }
    org.gbif.vocabulary.grpc.VocabularyKey other = (org.gbif.vocabulary.grpc.VocabularyKey) obj;

    boolean result = true;
    result = result && (getKey()
        == other.getKey());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.gbif.vocabulary.grpc.VocabularyKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.gbif.vocabulary.grpc.VocabularyKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.gbif.vocabulary.grpc.VocabularyKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.gbif.vocabulary.grpc.VocabularyKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.gbif.vocabulary.grpc.VocabularyKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.gbif.vocabulary.grpc.VocabularyKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.gbif.vocabulary.grpc.VocabularyKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.gbif.vocabulary.grpc.VocabularyKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.gbif.vocabulary.grpc.VocabularyKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.gbif.vocabulary.grpc.VocabularyKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.gbif.vocabulary.grpc.VocabularyKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.gbif.vocabulary.grpc.VocabularyKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.gbif.vocabulary.grpc.VocabularyKey)
      org.gbif.vocabulary.grpc.VocabularyKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.gbif.vocabulary.grpc.VocabularyOuterClass.internal_static_org_gbif_vocabulary_grpc_VocabularyKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.gbif.vocabulary.grpc.VocabularyOuterClass.internal_static_org_gbif_vocabulary_grpc_VocabularyKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.gbif.vocabulary.grpc.VocabularyKey.class, org.gbif.vocabulary.grpc.VocabularyKey.Builder.class);
    }

    // Construct using org.gbif.vocabulary.grpc.VocabularyKey.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      key_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.gbif.vocabulary.grpc.VocabularyOuterClass.internal_static_org_gbif_vocabulary_grpc_VocabularyKey_descriptor;
    }

    public org.gbif.vocabulary.grpc.VocabularyKey getDefaultInstanceForType() {
      return org.gbif.vocabulary.grpc.VocabularyKey.getDefaultInstance();
    }

    public org.gbif.vocabulary.grpc.VocabularyKey build() {
      org.gbif.vocabulary.grpc.VocabularyKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.gbif.vocabulary.grpc.VocabularyKey buildPartial() {
      org.gbif.vocabulary.grpc.VocabularyKey result = new org.gbif.vocabulary.grpc.VocabularyKey(this);
      result.key_ = key_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.gbif.vocabulary.grpc.VocabularyKey) {
        return mergeFrom((org.gbif.vocabulary.grpc.VocabularyKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.gbif.vocabulary.grpc.VocabularyKey other) {
      if (other == org.gbif.vocabulary.grpc.VocabularyKey.getDefaultInstance()) return this;
      if (other.getKey() != 0) {
        setKey(other.getKey());
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
      org.gbif.vocabulary.grpc.VocabularyKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.gbif.vocabulary.grpc.VocabularyKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int key_ ;
    /**
     * <code>int32 key = 1;</code>
     */
    public int getKey() {
      return key_;
    }
    /**
     * <code>int32 key = 1;</code>
     */
    public Builder setKey(int value) {
      
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 key = 1;</code>
     */
    public Builder clearKey() {
      
      key_ = 0;
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


    // @@protoc_insertion_point(builder_scope:org.gbif.vocabulary.grpc.VocabularyKey)
  }

  // @@protoc_insertion_point(class_scope:org.gbif.vocabulary.grpc.VocabularyKey)
  private static final org.gbif.vocabulary.grpc.VocabularyKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.gbif.vocabulary.grpc.VocabularyKey();
  }

  public static org.gbif.vocabulary.grpc.VocabularyKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VocabularyKey>
      PARSER = new com.google.protobuf.AbstractParser<VocabularyKey>() {
    public VocabularyKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VocabularyKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VocabularyKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VocabularyKey> getParserForType() {
    return PARSER;
  }

  public org.gbif.vocabulary.grpc.VocabularyKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

