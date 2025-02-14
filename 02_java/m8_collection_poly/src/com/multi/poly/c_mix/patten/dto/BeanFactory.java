package com.multi.poly.c_mix.patten.dto;

public class BeanFactory { //개발자가 객체를 선택해서 생성하게 하기 위한 전용객체
    public static Object getBean(String name) {
        Singer  singer = null;

        if(name.equals("aespa")){
            singer = new Aespa();
        }else{
            singer = new NJZ();
        }
        return singer;
    }
}
