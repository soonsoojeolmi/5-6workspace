package com.multi.g_test;

public class NctU extends NctDream{
    private int combi; //조합 명 (0 : Make a wish 1 : From Home, 2 : 90's love, 3 : Work It, 4 : Resonance)
    private boolean isRenjun;

    public NctU(String member, String position, int combi, boolean isRenjun){
        super(member, position);
        this.combi=combi;
        this.isRenjun=isRenjun;
    }

    public void Combination(){
        System.out.println(switch(combi){
            case 0 -> "Make a wish";
            case 1 -> "From Home";
            case 2 -> "90's love";
            case 3 -> "Work It";
            case 4 -> "Resonance";
            default -> "NCT 2020 앨범이 아닙니다.";
        });

        if(isRenjun){
            System.out.println(getPosition()+"을 맡은 "+getMember()+"의 참여 곡입니다.");
        }else{
            System.out.println(getPosition()+"을 맡은 "+getMember()+"의 미참여 곡입니다.");
        }
    }

    @Override
    public String toString() {
        return "NctU{" +
                "combi=" + combi +
                ", isRenjun=" + isRenjun +
                '}';
    }
}
