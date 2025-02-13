package com.multi.e_exception.b_custom;

public class AccountCheckedException extends  Exception{
    public AccountCheckedException(){}

    public AccountCheckedException(String message){
        super(message);}
}
