package com.multi.a_conn;

public class DBCP {
    private static  DBCP instance  = null;

    private DBCP(){}

    public static DBCP getInstance(){
        if(instance==null){
            instance = new DBCP();
        }
        return instance;
    }
}
