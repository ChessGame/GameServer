// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallLoginMessage.proto

package info.xiaomo.server.shared.protocol.hall.login;

public interface QuitSubGameRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:QuitSubGameRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  int getMsgIdValue();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  info.xiaomo.server.shared.protocol.msg.MsgId getMsgId();

  /**
   * <pre>
   *角色ID
   * </pre>
   *
   * <code>int64 rid = 2;</code>
   * @return The rid.
   */
  long getRid();
}