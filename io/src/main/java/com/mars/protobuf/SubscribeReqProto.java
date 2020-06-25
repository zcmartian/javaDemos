// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.mars.serialize.SubscribeReq.proto

package com.mars.protobuf;

public final class SubscribeReqProto {
    static {
    }

    private SubscribeReqProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public interface SubscribeReqOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // required int32 subReqID = 1;

        /**
         * <code>required int32 subReqID = 1;</code>
         */
        boolean hasSubReqID();

        /**
         * <code>required int32 subReqID = 1;</code>
         */
        int getSubReqID();

        // required string userName = 2;

        /**
         * <code>required string userName = 2;</code>
         */
        boolean hasUserName();

        /**
         * <code>required string userName = 2;</code>
         */
        java.lang.String getUserName();

        /**
         * <code>required string userName = 2;</code>
         */
        com.google.protobuf.ByteString
        getUserNameBytes();

        // required string productName = 3;

        /**
         * <code>required string productName = 3;</code>
         */
        boolean hasProductName();

        /**
         * <code>required string productName = 3;</code>
         */
        java.lang.String getProductName();

        /**
         * <code>required string productName = 3;</code>
         */
        com.google.protobuf.ByteString
        getProductNameBytes();

        // repeated string address = 4;

        /**
         * <code>repeated string address = 4;</code>
         */
        java.util.List<java.lang.String>
        getAddressList();

        /**
         * <code>repeated string address = 4;</code>
         */
        int getAddressCount();

        /**
         * <code>repeated string address = 4;</code>
         */
        java.lang.String getAddress(int index);

        /**
         * <code>repeated string address = 4;</code>
         */
        com.google.protobuf.ByteString
        getAddressBytes(int index);
    }

    /**
     * Protobuf type {@code com.mars.protobuf.com.mars.serialize.SubscribeReq}
     */
    public static final class SubscribeReq extends
            com.google.protobuf.GeneratedMessageLite
            implements SubscribeReqOrBuilder {
        // required int32 subReqID = 1;
        public static final int SUBREQID_FIELD_NUMBER = 1;
        // required string userName = 2;
        public static final int USERNAME_FIELD_NUMBER = 2;
        // required string productName = 3;
        public static final int PRODUCTNAME_FIELD_NUMBER = 3;
        // repeated string address = 4;
        public static final int ADDRESS_FIELD_NUMBER = 4;
        private static final SubscribeReq defaultInstance;
        private static final long serialVersionUID = 0L;
        public static com.google.protobuf.Parser<SubscribeReq> PARSER =
                new com.google.protobuf.AbstractParser<SubscribeReq>() {
                    public SubscribeReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SubscribeReq(input, extensionRegistry);
                    }
                };

        static {
            defaultInstance = new SubscribeReq(true);
            defaultInstance.initFields();
        }

        private int bitField0_;
        private int subReqID_;
        private java.lang.Object userName_;
        private java.lang.Object productName_;
        private com.google.protobuf.LazyStringList address_;
        private byte memoizedIsInitialized = -1;
        private int memoizedSerializedSize = -1;
        // Use com.mars.serialize.SubscribeReq.newBuilder() to construct.
        private SubscribeReq(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);

        }

        private SubscribeReq(boolean noInit) {
        }

        private SubscribeReq(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                            if (!parseUnknownField(input,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            subReqID_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            userName_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            productName_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                                address_ = new com.google.protobuf.LazyStringArrayList();
                                mutable_bitField0_ |= 0x00000008;
                            }
                            address_.add(input.readBytes());
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
                if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                    address_ = new com.google.protobuf.UnmodifiableLazyStringList(address_);
                }
                makeExtensionsImmutable();
            }
        }

        public static SubscribeReq getDefaultInstance() {
            return defaultInstance;
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.mars.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(com.mars.protobuf.SubscribeReqProto.SubscribeReq prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        @Override
        public String toString() {
            return "SubscribeReq{" +
                    "userName_=" + getUserName() +
                    ", productName_=" + getProductName() +
                    ", address_=" + getAddressList() +
                    '}';
        }

        public SubscribeReq getDefaultInstanceForType() {
            return defaultInstance;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<SubscribeReq> getParserForType() {
            return PARSER;
        }

        /**
         * <code>required int32 subReqID = 1;</code>
         */
        public boolean hasSubReqID() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>required int32 subReqID = 1;</code>
         */
        public int getSubReqID() {
            return subReqID_;
        }

        /**
         * <code>required string userName = 2;</code>
         */
        public boolean hasUserName() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>required string userName = 2;</code>
         */
        public java.lang.String getUserName() {
            java.lang.Object ref = userName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    userName_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string userName = 2;</code>
         */
        public com.google.protobuf.ByteString
        getUserNameBytes() {
            java.lang.Object ref = userName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                userName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>required string productName = 3;</code>
         */
        public boolean hasProductName() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>required string productName = 3;</code>
         */
        public java.lang.String getProductName() {
            java.lang.Object ref = productName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    productName_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string productName = 3;</code>
         */
        public com.google.protobuf.ByteString
        getProductNameBytes() {
            java.lang.Object ref = productName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                productName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>repeated string address = 4;</code>
         */
        public java.util.List<java.lang.String>
        getAddressList() {
            return address_;
        }

        /**
         * <code>repeated string address = 4;</code>
         */
        public int getAddressCount() {
            return address_.size();
        }

        /**
         * <code>repeated string address = 4;</code>
         */
        public java.lang.String getAddress(int index) {
            return address_.get(index);
        }

        /**
         * <code>repeated string address = 4;</code>
         */
        public com.google.protobuf.ByteString
        getAddressBytes(int index) {
            return address_.getByteString(index);
        }

        private void initFields() {
            subReqID_ = 0;
            userName_ = "";
            productName_ = "";
            address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasSubReqID()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasUserName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasProductName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, subReqID_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getUserNameBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getProductNameBytes());
            }
            for (int i = 0; i < address_.size(); i++) {
                output.writeBytes(4, address_.getByteString(i));
            }
        }

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, subReqID_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getUserNameBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getProductNameBytes());
            }
            {
                int dataSize = 0;
                for (int i = 0; i < address_.size(); i++) {
                    dataSize += com.google.protobuf.CodedOutputStream
                            .computeBytesSizeNoTag(address_.getByteString(i));
                }
                size += dataSize;
                size += 1 * getAddressList().size();
            }
            memoizedSerializedSize = size;
            return size;
        }

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        /**
         * Protobuf type {@code com.mars.protobuf.com.mars.serialize.SubscribeReq}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        com.mars.protobuf.SubscribeReqProto.SubscribeReq, Builder>
                implements com.mars.protobuf.SubscribeReqProto.SubscribeReqOrBuilder {
            private int bitField0_;
            // required int32 subReqID = 1;
            private int subReqID_;
            // required string userName = 2;
            private java.lang.Object userName_ = "";
            // required string productName = 3;
            private java.lang.Object productName_ = "";
            // repeated string address = 4;
            private com.google.protobuf.LazyStringList address_ = com.google.protobuf.LazyStringArrayList.EMPTY;

            // Construct using com.mars.protobuf.SubscribeReqProto.com.mars.serialize.SubscribeReq.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private static Builder create() {
                return new Builder();
            }

            private void maybeForceBuilderInitialization() {
            }

            public Builder clear() {
                super.clear();
                subReqID_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                userName_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                productName_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.mars.protobuf.SubscribeReqProto.SubscribeReq getDefaultInstanceForType() {
                return com.mars.protobuf.SubscribeReqProto.SubscribeReq.getDefaultInstance();
            }

            public com.mars.protobuf.SubscribeReqProto.SubscribeReq build() {
                com.mars.protobuf.SubscribeReqProto.SubscribeReq result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.mars.protobuf.SubscribeReqProto.SubscribeReq buildPartial() {
                com.mars.protobuf.SubscribeReqProto.SubscribeReq result = new com.mars.protobuf.SubscribeReqProto.SubscribeReq(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.subReqID_ = subReqID_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.userName_ = userName_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.productName_ = productName_;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    address_ = new com.google.protobuf.UnmodifiableLazyStringList(
                            address_);
                    bitField0_ = (bitField0_ & ~0x00000008);
                }
                result.address_ = address_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(com.mars.protobuf.SubscribeReqProto.SubscribeReq other) {
                if (other == com.mars.protobuf.SubscribeReqProto.SubscribeReq.getDefaultInstance()) return this;
                if (other.hasSubReqID()) {
                    setSubReqID(other.getSubReqID());
                }
                if (other.hasUserName()) {
                    bitField0_ |= 0x00000002;
                    userName_ = other.userName_;

                }
                if (other.hasProductName()) {
                    bitField0_ |= 0x00000004;
                    productName_ = other.productName_;

                }
                if (!other.address_.isEmpty()) {
                    if (address_.isEmpty()) {
                        address_ = other.address_;
                        bitField0_ = (bitField0_ & ~0x00000008);
                    } else {
                        ensureAddressIsMutable();
                        address_.addAll(other.address_);
                    }

                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasSubReqID()) {

                    return false;
                }
                if (!hasUserName()) {

                    return false;
                }
                if (!hasProductName()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.mars.protobuf.SubscribeReqProto.SubscribeReq parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.mars.protobuf.SubscribeReqProto.SubscribeReq) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>required int32 subReqID = 1;</code>
             */
            public boolean hasSubReqID() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>required int32 subReqID = 1;</code>
             */
            public int getSubReqID() {
                return subReqID_;
            }

            /**
             * <code>required int32 subReqID = 1;</code>
             */
            public Builder setSubReqID(int value) {
                bitField0_ |= 0x00000001;
                subReqID_ = value;

                return this;
            }

            /**
             * <code>required int32 subReqID = 1;</code>
             */
            public Builder clearSubReqID() {
                bitField0_ = (bitField0_ & ~0x00000001);
                subReqID_ = 0;

                return this;
            }

            /**
             * <code>required string userName = 2;</code>
             */
            public boolean hasUserName() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>required string userName = 2;</code>
             */
            public java.lang.String getUserName() {
                java.lang.Object ref = userName_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    userName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>required string userName = 2;</code>
             */
            public Builder setUserName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                userName_ = value;

                return this;
            }

            /**
             * <code>required string userName = 2;</code>
             */
            public com.google.protobuf.ByteString
            getUserNameBytes() {
                java.lang.Object ref = userName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    userName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string userName = 2;</code>
             */
            public Builder setUserNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                userName_ = value;

                return this;
            }

            /**
             * <code>required string userName = 2;</code>
             */
            public Builder clearUserName() {
                bitField0_ = (bitField0_ & ~0x00000002);
                userName_ = getDefaultInstance().getUserName();

                return this;
            }

            /**
             * <code>required string productName = 3;</code>
             */
            public boolean hasProductName() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            /**
             * <code>required string productName = 3;</code>
             */
            public java.lang.String getProductName() {
                java.lang.Object ref = productName_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    productName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>required string productName = 3;</code>
             */
            public Builder setProductName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                productName_ = value;

                return this;
            }

            /**
             * <code>required string productName = 3;</code>
             */
            public com.google.protobuf.ByteString
            getProductNameBytes() {
                java.lang.Object ref = productName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    productName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string productName = 3;</code>
             */
            public Builder setProductNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                productName_ = value;

                return this;
            }

            /**
             * <code>required string productName = 3;</code>
             */
            public Builder clearProductName() {
                bitField0_ = (bitField0_ & ~0x00000004);
                productName_ = getDefaultInstance().getProductName();

                return this;
            }

            private void ensureAddressIsMutable() {
                if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                    address_ = new com.google.protobuf.LazyStringArrayList(address_);
                    bitField0_ |= 0x00000008;
                }
            }

            /**
             * <code>repeated string address = 4;</code>
             */
            public java.util.List<java.lang.String>
            getAddressList() {
                return java.util.Collections.unmodifiableList(address_);
            }

            /**
             * <code>repeated string address = 4;</code>
             */
            public int getAddressCount() {
                return address_.size();
            }

            /**
             * <code>repeated string address = 4;</code>
             */
            public java.lang.String getAddress(int index) {
                return address_.get(index);
            }

            /**
             * <code>repeated string address = 4;</code>
             */
            public com.google.protobuf.ByteString
            getAddressBytes(int index) {
                return address_.getByteString(index);
            }

            /**
             * <code>repeated string address = 4;</code>
             */
            public Builder setAddress(
                    int index, java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureAddressIsMutable();
                address_.set(index, value);

                return this;
            }

            /**
             * <code>repeated string address = 4;</code>
             */
            public Builder addAddress(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureAddressIsMutable();
                address_.add(value);

                return this;
            }

            /**
             * <code>repeated string address = 4;</code>
             */
            public Builder addAllAddress(
                    java.lang.Iterable<java.lang.String> values) {
                ensureAddressIsMutable();
                super.addAll(values, address_);

                return this;
            }

            /**
             * <code>repeated string address = 4;</code>
             */
            public Builder clearAddress() {
                address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000008);

                return this;
            }

            /**
             * <code>repeated string address = 4;</code>
             */
            public Builder addAddressBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureAddressIsMutable();
                address_.add(value);

                return this;
            }

            // @@protoc_insertion_point(builder_scope:com.mars.protobuf.com.mars.serialize.SubscribeReq)
        }

        // @@protoc_insertion_point(class_scope:com.mars.protobuf.com.mars.serialize.SubscribeReq)
    }

    // @@protoc_insertion_point(outer_class_scope)
}