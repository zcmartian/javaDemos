package socket.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;


public class MyClient {
    public static void main(String[] args) throws Exception {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            // handler 针对boss, childHandler针对worker
            bootstrap.group(workerGroup).channel(NioSocketChannel.class).handler(new MyClientInitializer());
            ChannelFuture channelFuture = bootstrap.connect("localhost", 8899).sync();
            channelFuture.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
        }

    }

}
