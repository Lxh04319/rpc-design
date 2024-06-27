package com.Lxh04319.test;

import com.Lxh04319.rpc.api.ByeService;
import com.Lxh04319.rpc.api.HelloObject;
import com.Lxh04319.rpc.api.HelloService;
import com.Lxh04319.rpc.serializer.CommonSerializer;
import com.Lxh04319.rpc.transport.RpcClientProxy;
import com.Lxh04319.rpc.transport.socket.client.SocketClient;

/**
 * 测试用消费者（客户端）
 */
public class SocketTestClient {

    public static void main(String[] args) {
        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = proxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }
}
