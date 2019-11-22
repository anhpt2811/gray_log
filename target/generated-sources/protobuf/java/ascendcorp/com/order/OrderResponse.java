// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: verify_order.proto

package ascendcorp.com.order;

/**
 * Protobuf type {@code ascendcorp.com.order.OrderResponse}
 */
public  final class OrderResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ascendcorp.com.order.OrderResponse)
    OrderResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderResponse.newBuilder() to construct.
  private OrderResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            ascendcorp.com.order.GrpcOrder.Builder subBuilder = null;
            if (order_ != null) {
              subBuilder = order_.toBuilder();
            }
            order_ = input.readMessage(ascendcorp.com.order.GrpcOrder.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(order_);
              order_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ascendcorp.com.order.VerifyOrder.internal_static_ascendcorp_com_order_OrderResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ascendcorp.com.order.VerifyOrder.internal_static_ascendcorp_com_order_OrderResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ascendcorp.com.order.OrderResponse.class, ascendcorp.com.order.OrderResponse.Builder.class);
  }

  public static final int ORDER_FIELD_NUMBER = 1;
  private ascendcorp.com.order.GrpcOrder order_;
  /**
   * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
   */
  public boolean hasOrder() {
    return order_ != null;
  }
  /**
   * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
   */
  public ascendcorp.com.order.GrpcOrder getOrder() {
    return order_ == null ? ascendcorp.com.order.GrpcOrder.getDefaultInstance() : order_;
  }
  /**
   * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
   */
  public ascendcorp.com.order.GrpcOrderOrBuilder getOrderOrBuilder() {
    return getOrder();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (order_ != null) {
      output.writeMessage(1, getOrder());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (order_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOrder());
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
    if (!(obj instanceof ascendcorp.com.order.OrderResponse)) {
      return super.equals(obj);
    }
    ascendcorp.com.order.OrderResponse other = (ascendcorp.com.order.OrderResponse) obj;

    if (hasOrder() != other.hasOrder()) return false;
    if (hasOrder()) {
      if (!getOrder()
          .equals(other.getOrder())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasOrder()) {
      hash = (37 * hash) + ORDER_FIELD_NUMBER;
      hash = (53 * hash) + getOrder().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ascendcorp.com.order.OrderResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ascendcorp.com.order.OrderResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ascendcorp.com.order.OrderResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ascendcorp.com.order.OrderResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ascendcorp.com.order.OrderResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ascendcorp.com.order.OrderResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ascendcorp.com.order.OrderResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ascendcorp.com.order.OrderResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ascendcorp.com.order.OrderResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ascendcorp.com.order.OrderResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ascendcorp.com.order.OrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ascendcorp.com.order.OrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ascendcorp.com.order.OrderResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code ascendcorp.com.order.OrderResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ascendcorp.com.order.OrderResponse)
      ascendcorp.com.order.OrderResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ascendcorp.com.order.VerifyOrder.internal_static_ascendcorp_com_order_OrderResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ascendcorp.com.order.VerifyOrder.internal_static_ascendcorp_com_order_OrderResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ascendcorp.com.order.OrderResponse.class, ascendcorp.com.order.OrderResponse.Builder.class);
    }

    // Construct using ascendcorp.com.order.OrderResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (orderBuilder_ == null) {
        order_ = null;
      } else {
        order_ = null;
        orderBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ascendcorp.com.order.VerifyOrder.internal_static_ascendcorp_com_order_OrderResponse_descriptor;
    }

    @java.lang.Override
    public ascendcorp.com.order.OrderResponse getDefaultInstanceForType() {
      return ascendcorp.com.order.OrderResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ascendcorp.com.order.OrderResponse build() {
      ascendcorp.com.order.OrderResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ascendcorp.com.order.OrderResponse buildPartial() {
      ascendcorp.com.order.OrderResponse result = new ascendcorp.com.order.OrderResponse(this);
      if (orderBuilder_ == null) {
        result.order_ = order_;
      } else {
        result.order_ = orderBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ascendcorp.com.order.OrderResponse) {
        return mergeFrom((ascendcorp.com.order.OrderResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ascendcorp.com.order.OrderResponse other) {
      if (other == ascendcorp.com.order.OrderResponse.getDefaultInstance()) return this;
      if (other.hasOrder()) {
        mergeOrder(other.getOrder());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ascendcorp.com.order.OrderResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ascendcorp.com.order.OrderResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ascendcorp.com.order.GrpcOrder order_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ascendcorp.com.order.GrpcOrder, ascendcorp.com.order.GrpcOrder.Builder, ascendcorp.com.order.GrpcOrderOrBuilder> orderBuilder_;
    /**
     * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
     */
    public boolean hasOrder() {
      return orderBuilder_ != null || order_ != null;
    }
    /**
     * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
     */
    public ascendcorp.com.order.GrpcOrder getOrder() {
      if (orderBuilder_ == null) {
        return order_ == null ? ascendcorp.com.order.GrpcOrder.getDefaultInstance() : order_;
      } else {
        return orderBuilder_.getMessage();
      }
    }
    /**
     * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
     */
    public Builder setOrder(ascendcorp.com.order.GrpcOrder value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        order_ = value;
        onChanged();
      } else {
        orderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
     */
    public Builder setOrder(
        ascendcorp.com.order.GrpcOrder.Builder builderForValue) {
      if (orderBuilder_ == null) {
        order_ = builderForValue.build();
        onChanged();
      } else {
        orderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
     */
    public Builder mergeOrder(ascendcorp.com.order.GrpcOrder value) {
      if (orderBuilder_ == null) {
        if (order_ != null) {
          order_ =
            ascendcorp.com.order.GrpcOrder.newBuilder(order_).mergeFrom(value).buildPartial();
        } else {
          order_ = value;
        }
        onChanged();
      } else {
        orderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
     */
    public Builder clearOrder() {
      if (orderBuilder_ == null) {
        order_ = null;
        onChanged();
      } else {
        order_ = null;
        orderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
     */
    public ascendcorp.com.order.GrpcOrder.Builder getOrderBuilder() {
      
      onChanged();
      return getOrderFieldBuilder().getBuilder();
    }
    /**
     * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
     */
    public ascendcorp.com.order.GrpcOrderOrBuilder getOrderOrBuilder() {
      if (orderBuilder_ != null) {
        return orderBuilder_.getMessageOrBuilder();
      } else {
        return order_ == null ?
            ascendcorp.com.order.GrpcOrder.getDefaultInstance() : order_;
      }
    }
    /**
     * <code>.ascendcorp.com.order.GrpcOrder order = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ascendcorp.com.order.GrpcOrder, ascendcorp.com.order.GrpcOrder.Builder, ascendcorp.com.order.GrpcOrderOrBuilder> 
        getOrderFieldBuilder() {
      if (orderBuilder_ == null) {
        orderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ascendcorp.com.order.GrpcOrder, ascendcorp.com.order.GrpcOrder.Builder, ascendcorp.com.order.GrpcOrderOrBuilder>(
                getOrder(),
                getParentForChildren(),
                isClean());
        order_ = null;
      }
      return orderBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ascendcorp.com.order.OrderResponse)
  }

  // @@protoc_insertion_point(class_scope:ascendcorp.com.order.OrderResponse)
  private static final ascendcorp.com.order.OrderResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ascendcorp.com.order.OrderResponse();
  }

  public static ascendcorp.com.order.OrderResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderResponse>
      PARSER = new com.google.protobuf.AbstractParser<OrderResponse>() {
    @java.lang.Override
    public OrderResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ascendcorp.com.order.OrderResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
