package com.lxh04319.rpc.rpc.provider;

/**
 * 保存和提供服务实例对象
 */
public interface ServiceProvider {


    <T> void addServiceProvider(T service, String serviceName);

    Object getServiceProvider(String serviceName);

}
