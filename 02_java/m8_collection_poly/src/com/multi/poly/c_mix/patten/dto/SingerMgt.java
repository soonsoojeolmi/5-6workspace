package com.multi.poly.c_mix.patten.dto;

public class SingerMgt {
    private Singer singer;

    public Singer getSinger(){
        return singer;
    }

    public void setSinger(Singer singer){
        this.singer= singer;
    }

    public void perform() {
        if (singer != null) {
            singer.sing();
            singer.compose();
            singer.dance();
        } else {
            System.out.println("가수를 선택하세요!");
        }
    }
}
