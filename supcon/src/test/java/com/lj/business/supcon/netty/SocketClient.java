package com.lj.business.supcon.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldPrepender;

import java.net.InetSocketAddress;

import com.lj.business.supcon.netty.codec.MessageDecoder;
import com.lj.business.supcon.netty.codec.MessageEncoder;
import com.lj.business.supcon.netty.common.ClientConfigs;
import com.lj.business.supcon.netty.handler.ClientTransportHandler;

public class SocketClient {

	/** 当前重接次数 */
	private int reconnectTimes = 0;

	public void start() {
		try {
			connect(ClientConfigs.REMOTE_SERVER_IP, ClientConfigs.REMOTE_SERVER_PORT);
		} catch (Exception e) {
			
		}
	}

	public void connect(String host, int port) throws Exception {
		EventLoopGroup group = new NioEventLoopGroup(1);
		try {
			Bootstrap b = new Bootstrap();
			b.group(group)
			.channel(NioSocketChannel.class)
			/*
			 * Netty4使用内存池，重用缓冲区
			 */
//			.option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT)
			.handler(new ChannelInitializer<SocketChannel>() {

				@Override
				protected void initChannel(SocketChannel arg0) throws Exception {
					ChannelPipeline pipeline = arg0.pipeline();
					pipeline.addLast(new MessageDecoder(Integer.MAX_VALUE, 0, 4, 0, 4));
					pipeline.addLast(new LengthFieldPrepender(4));
					pipeline.addLast(new MessageEncoder());
					pipeline.addLast(new ClientTransportHandler());
				}

			});

			ChannelFuture f = b.connect(new InetSocketAddress(host, port)).sync();
			f.channel().closeFuture().sync();
		} catch (Exception e) {
//			e.printStackTrace(); TODO
		} finally {
			resetReconnectTimes();
			
			// group.shutdownGracefully(); //这里不再是优雅关闭了
			// 设置最大重连次数，防止服务端正常关闭导致的空循环
			if (reconnectTimes < ClientConfigs.MAX_RECONNECT_TIMES) {
				reConnectServer();
			} else {
				System.err.println("重连次数超限：" + ClientConfigs.MAX_RECONNECT_TIMES);
			}
		}
	}

	/**
	 * 断线重连
	 */
	private void reConnectServer() {
		try {
			Thread.sleep(5000);	// 等待5秒
			System.err.println("客户端进行断线重连：" + (++reconnectTimes));
			connect(ClientConfigs.REMOTE_SERVER_IP, ClientConfigs.REMOTE_SERVER_PORT);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 重置重连次数
	 */
	public void resetReconnectTimes() {
		if (reconnectTimes > 0) {
			reconnectTimes = 0;
			System.err.println("断线重连成功");
		} 
	}

}
