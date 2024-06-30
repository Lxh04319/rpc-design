package com.lxh04319.rpc.rpc.loadbalancer;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;

/**
 */
public interface LoadBalancer {

    Instance select(List<Instance> instances);

}
