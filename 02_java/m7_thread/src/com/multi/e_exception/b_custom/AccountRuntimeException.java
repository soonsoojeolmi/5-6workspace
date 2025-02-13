package com.multi.e_exception.b_custom;

public class AccountRuntimeException extends Exception {
    public AccountRuntimeException(){}

    public AccountRuntimeException(String message){
        super(message);
    }
}
