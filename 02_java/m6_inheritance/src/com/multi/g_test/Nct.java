package com.multi.g_test;

public class Nct extends NctDream {
    private int numMember;

    public Nct(String member, String position, int numMember){
        super(member, position);
        this.numMember=numMember;
    }

    public void album(){
        System.out.println(getMember()+"는 RESONANCE, "+numMember+"명 중 센터이다.");
    }

    @Override
    public String toString() {
        return "Nct{" +
                "numMember=" + numMember +
                '}';
    }
}
