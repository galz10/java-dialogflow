// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * Response message for [KnowledgeBases.ListKnowledgeBases][google.cloud.dialogflow.v2beta1.KnowledgeBases.ListKnowledgeBases].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse}
 */
public  final class ListKnowledgeBasesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse)
    ListKnowledgeBasesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListKnowledgeBasesResponse.newBuilder() to construct.
  private ListKnowledgeBasesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListKnowledgeBasesResponse() {
    knowledgeBases_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListKnowledgeBasesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              knowledgeBases_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.KnowledgeBase>();
              mutable_bitField0_ |= 0x00000001;
            }
            knowledgeBases_.add(
                input.readMessage(com.google.cloud.dialogflow.v2beta1.KnowledgeBase.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        knowledgeBases_ = java.util.Collections.unmodifiableList(knowledgeBases_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.class, com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int KNOWLEDGE_BASES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dialogflow.v2beta1.KnowledgeBase> knowledgeBases_;
  /**
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  public java.util.List<com.google.cloud.dialogflow.v2beta1.KnowledgeBase> getKnowledgeBasesList() {
    return knowledgeBases_;
  }
  /**
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder> 
      getKnowledgeBasesOrBuilderList() {
    return knowledgeBases_;
  }
  /**
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  public int getKnowledgeBasesCount() {
    return knowledgeBases_.size();
  }
  /**
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBases(int index) {
    return knowledgeBases_.get(index);
  }
  /**
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBasesOrBuilder(
      int index) {
    return knowledgeBases_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < knowledgeBases_.size(); i++) {
      output.writeMessage(1, knowledgeBases_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < knowledgeBases_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, knowledgeBases_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse other = (com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse) obj;

    boolean result = true;
    result = result && getKnowledgeBasesList()
        .equals(other.getKnowledgeBasesList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getKnowledgeBasesCount() > 0) {
      hash = (37 * hash) + KNOWLEDGE_BASES_FIELD_NUMBER;
      hash = (53 * hash) + getKnowledgeBasesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse prototype) {
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
   * <pre>
   * Response message for [KnowledgeBases.ListKnowledgeBases][google.cloud.dialogflow.v2beta1.KnowledgeBases.ListKnowledgeBases].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse)
      com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.class, com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.newBuilder()
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
        getKnowledgeBasesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (knowledgeBasesBuilder_ == null) {
        knowledgeBases_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        knowledgeBasesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse build() {
      com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse result = new com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (knowledgeBasesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          knowledgeBases_ = java.util.Collections.unmodifiableList(knowledgeBases_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.knowledgeBases_ = knowledgeBases_;
      } else {
        result.knowledgeBases_ = knowledgeBasesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse.getDefaultInstance()) return this;
      if (knowledgeBasesBuilder_ == null) {
        if (!other.knowledgeBases_.isEmpty()) {
          if (knowledgeBases_.isEmpty()) {
            knowledgeBases_ = other.knowledgeBases_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKnowledgeBasesIsMutable();
            knowledgeBases_.addAll(other.knowledgeBases_);
          }
          onChanged();
        }
      } else {
        if (!other.knowledgeBases_.isEmpty()) {
          if (knowledgeBasesBuilder_.isEmpty()) {
            knowledgeBasesBuilder_.dispose();
            knowledgeBasesBuilder_ = null;
            knowledgeBases_ = other.knowledgeBases_;
            bitField0_ = (bitField0_ & ~0x00000001);
            knowledgeBasesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKnowledgeBasesFieldBuilder() : null;
          } else {
            knowledgeBasesBuilder_.addAllMessages(other.knowledgeBases_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.dialogflow.v2beta1.KnowledgeBase> knowledgeBases_ =
      java.util.Collections.emptyList();
    private void ensureKnowledgeBasesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        knowledgeBases_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.KnowledgeBase>(knowledgeBases_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.KnowledgeBase, com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder, com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder> knowledgeBasesBuilder_;

    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.KnowledgeBase> getKnowledgeBasesList() {
      if (knowledgeBasesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(knowledgeBases_);
      } else {
        return knowledgeBasesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public int getKnowledgeBasesCount() {
      if (knowledgeBasesBuilder_ == null) {
        return knowledgeBases_.size();
      } else {
        return knowledgeBasesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBases(int index) {
      if (knowledgeBasesBuilder_ == null) {
        return knowledgeBases_.get(index);
      } else {
        return knowledgeBasesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public Builder setKnowledgeBases(
        int index, com.google.cloud.dialogflow.v2beta1.KnowledgeBase value) {
      if (knowledgeBasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKnowledgeBasesIsMutable();
        knowledgeBases_.set(index, value);
        onChanged();
      } else {
        knowledgeBasesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public Builder setKnowledgeBases(
        int index, com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder builderForValue) {
      if (knowledgeBasesBuilder_ == null) {
        ensureKnowledgeBasesIsMutable();
        knowledgeBases_.set(index, builderForValue.build());
        onChanged();
      } else {
        knowledgeBasesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public Builder addKnowledgeBases(com.google.cloud.dialogflow.v2beta1.KnowledgeBase value) {
      if (knowledgeBasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKnowledgeBasesIsMutable();
        knowledgeBases_.add(value);
        onChanged();
      } else {
        knowledgeBasesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public Builder addKnowledgeBases(
        int index, com.google.cloud.dialogflow.v2beta1.KnowledgeBase value) {
      if (knowledgeBasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKnowledgeBasesIsMutable();
        knowledgeBases_.add(index, value);
        onChanged();
      } else {
        knowledgeBasesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public Builder addKnowledgeBases(
        com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder builderForValue) {
      if (knowledgeBasesBuilder_ == null) {
        ensureKnowledgeBasesIsMutable();
        knowledgeBases_.add(builderForValue.build());
        onChanged();
      } else {
        knowledgeBasesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public Builder addKnowledgeBases(
        int index, com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder builderForValue) {
      if (knowledgeBasesBuilder_ == null) {
        ensureKnowledgeBasesIsMutable();
        knowledgeBases_.add(index, builderForValue.build());
        onChanged();
      } else {
        knowledgeBasesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public Builder addAllKnowledgeBases(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2beta1.KnowledgeBase> values) {
      if (knowledgeBasesBuilder_ == null) {
        ensureKnowledgeBasesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, knowledgeBases_);
        onChanged();
      } else {
        knowledgeBasesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public Builder clearKnowledgeBases() {
      if (knowledgeBasesBuilder_ == null) {
        knowledgeBases_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        knowledgeBasesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public Builder removeKnowledgeBases(int index) {
      if (knowledgeBasesBuilder_ == null) {
        ensureKnowledgeBasesIsMutable();
        knowledgeBases_.remove(index);
        onChanged();
      } else {
        knowledgeBasesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder getKnowledgeBasesBuilder(
        int index) {
      return getKnowledgeBasesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBasesOrBuilder(
        int index) {
      if (knowledgeBasesBuilder_ == null) {
        return knowledgeBases_.get(index);  } else {
        return knowledgeBasesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder> 
         getKnowledgeBasesOrBuilderList() {
      if (knowledgeBasesBuilder_ != null) {
        return knowledgeBasesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(knowledgeBases_);
      }
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder addKnowledgeBasesBuilder() {
      return getKnowledgeBasesFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder addKnowledgeBasesBuilder(
        int index) {
      return getKnowledgeBasesFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of knowledge bases.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder> 
         getKnowledgeBasesBuilderList() {
      return getKnowledgeBasesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.KnowledgeBase, com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder, com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder> 
        getKnowledgeBasesFieldBuilder() {
      if (knowledgeBasesBuilder_ == null) {
        knowledgeBasesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase, com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder, com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder>(
                knowledgeBases_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        knowledgeBases_ = null;
      }
      return knowledgeBasesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse)
  private static final com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListKnowledgeBasesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListKnowledgeBasesResponse>() {
    public ListKnowledgeBasesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListKnowledgeBasesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListKnowledgeBasesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListKnowledgeBasesResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

