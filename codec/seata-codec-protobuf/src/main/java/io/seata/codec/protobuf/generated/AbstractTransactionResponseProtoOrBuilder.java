// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractTransactionResponse.proto

package io.seata.codec.protobuf.generated;

public interface AbstractTransactionResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.AbstractTransactionResponseProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
   */
  boolean hasAbstractResultMessage();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
   */
  io.seata.codec.protobuf.generated.AbstractResultMessageProto getAbstractResultMessage();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
   */
  io.seata.codec.protobuf.generated.AbstractResultMessageProtoOrBuilder getAbstractResultMessageOrBuilder();

  /**
   * <code>.io.seata.protocol.protobuf.TransactionExceptionCodeProto transactionExceptionCode = 2;</code>
   */
  int getTransactionExceptionCodeValue();
  /**
   * <code>.io.seata.protocol.protobuf.TransactionExceptionCodeProto transactionExceptionCode = 2;</code>
   */
  io.seata.codec.protobuf.generated.TransactionExceptionCodeProto getTransactionExceptionCode();
}
