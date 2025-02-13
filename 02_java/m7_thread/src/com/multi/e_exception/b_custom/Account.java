package com.multi.e_exception.b_custom;

public class Account {
    private long balance;

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }

//    public void withdraw(int money) throws AccountCheckedException{
//        if(balance < money){
//            throw  new AccountCheckedException("잔고부족 : "+(money-balance)+"모자랆");
//        }
//        balance -= money;
//    }

    public void withdraw(int money) throws AccountRuntimeException {
        if(balance < money){
            throw new AccountRuntimeException("잔고부족 : "+(money-balance));
        }

        balance -= money;
    }
}
