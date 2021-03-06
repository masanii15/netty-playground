package masanii15.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

public class DiscardServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf in = (ByteBuf) msg;
        System.out.println("channel read");
        try {
//        	String string = in.toString();
//            System.out.println("str:"+string);
            System.out.println(in.toString(io.netty.util.CharsetUtil.US_ASCII));
//            while (in.isReadable()) {
//            	System.out.println("loop");
//                System.out.print((char) in.readByte());
//                System.out.flush();
//            }

        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

}