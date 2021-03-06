package com.bob.demo02.server;

import io.netty.channel.Channel;
import io.netty.channel.socket.SocketChannel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Bob on 2016/4/13.
 */
public class NettyChannelMap {
  private static Map<String, SocketChannel> map = new ConcurrentHashMap<String, SocketChannel>();

  public static void add(String clientId, SocketChannel socketChannel) {
    map.put(clientId, socketChannel);
  }

  public static Channel get(String clientId) {
    return map.get(clientId);
  }

  public static void remove(SocketChannel socketChannel) {
    for (Map.Entry entry : map.entrySet()) {
      if (entry.getValue() == socketChannel) {
        map.remove(entry.getKey());
      }
    }
  }
}
