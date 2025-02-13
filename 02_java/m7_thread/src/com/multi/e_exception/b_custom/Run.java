package com.multi.e_exception.b_custom;

public class Run {
    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(10000);
        System.out.println("예금액 : "+account.getBalance());

//        try{
//            account.withdraw(30000);
//        }catch(AccountCheckedException e){
//            throw new RuntimeException(e);
//        }
        try{
            account.withdraw(3000);
        }catch(AccountRuntimeException e){
            e.printStackTrace();
        }

        System.out.println("프로그램종료");
    }
}
