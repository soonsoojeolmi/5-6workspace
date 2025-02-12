package com.multi.g_test;

public class NctDream {
    private String member;
    private String position;

    public NctDream(String member, String position){
        this.member=member;
        this.position=position;
    }

    public String getMember() {
        return member;
    }

    public String getPosition(){
        return position;
    }

    public void doStage(){
        System.out.println(position+"을 맡고 있는 "+member+"가 좋아하는 멤버의 최애곡은 Nct Dream의 별밤");
    }

    @Override
    public String toString() {
        return "NctDream{" +
                "member='" + member + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
