package com.multi.g_test;

//메인 클래스 Nct
//부모 클래스 : NctDream -> 멤버, 담당, 무대하다()
//자식 클래스 Nct, NctU
//Nct ->멤버 수, 앨범(), NctU -> 조합, 조합명()

public class Run {
    public static void main(String[] args) {
        NctDream nctdream = new NctDream("제노", "랩");
        nctdream.doStage();

        NctU nctu =  new NctU("런쥔", "보컬", 1, true);
        nctu.Combination();

        Nct nct = new Nct("마크", "랩", 25);
        nct.album();
    }
}
