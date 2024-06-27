package com.Lxh04319.test;

import com.Lxh04319.rpc.api.ByeService;
import com.Lxh04319.rpc.api.HelloObject;
import com.Lxh04319.rpc.api.HelloService;
import com.Lxh04319.rpc.serializer.CommonSerializer;
import com.Lxh04319.rpc.transport.RpcClient;
import com.Lxh04319.rpc.transport.RpcClientProxy;
import com.Lxh04319.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
