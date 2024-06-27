package com.Lxh04319.rpc.provider.service.impl;
@RpcService(interfaceClass = AbstractService.class)
public class AbstractServiceImpl extends AbstractService {
    @Override
    public String abstractHello(String name) {
        return "abstract hello " + name;
    }
}
