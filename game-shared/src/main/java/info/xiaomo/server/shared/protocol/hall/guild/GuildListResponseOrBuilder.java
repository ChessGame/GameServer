// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallGuildMessage.proto

package info.xiaomo.server.shared.protocol.hall.guild;

public interface GuildListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GuildListResponse)
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
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  java.util.List<info.xiaomo.server.shared.protocol.hall.guild.GuildInfo> 
      getGuildsList();
  /**
   * <pre>
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  info.xiaomo.server.shared.protocol.hall.guild.GuildInfo getGuilds(int index);
  /**
   * <pre>
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  int getGuildsCount();
  /**
   * <pre>
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  java.util.List<? extends info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder> 
      getGuildsOrBuilderList();
  /**
   * <pre>
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder getGuildsOrBuilder(
      int index);
}