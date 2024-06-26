package com.Lxh04319.rpc.exception;

import com.Lxh04319.rpc.enumeration.RpcError;

/**
 * RPC调用异常
 */
public class RpcException extends RuntimeException {

    public RpcException(RpcError error, String detail) {
        super(error.getMessage() + ": " + detail);
    }

    public RpcException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcException(RpcError error) {
        super(error.getMessage());
    }

}
