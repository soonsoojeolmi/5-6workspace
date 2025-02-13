package com.multi.d_demon;

public class AutoSaveThread extends Thread{
    public void save(){
        System.out.println("자동저장되었습니다.");
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                break;
            }

            save();
        }
    }
}
