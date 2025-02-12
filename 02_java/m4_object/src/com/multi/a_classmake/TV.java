package com.multi.a_classmake;

public class TV {

    private int Volume;
    private int Channel;
    private boolean isOn;

    public void on(){
        isOn = true;
        System.out.println("TV가 켜졌습니다.");
    }

    public void off(){
        isOn  = false;
        System.out.println("TV가 꺼졌습니다.");
    }

    public void setChannel(int Channel){
        this.Channel=Channel;
    }

    public void setVolume(int Volume){
        this.Volume=Volume;
    }

    public String toString(){
        return "TV "+ Channel + ", "+ Volume;
    }
}
