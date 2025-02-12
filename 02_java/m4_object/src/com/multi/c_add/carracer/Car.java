package com.multi.c_add.carracer;

public class Car {

    private boolean isOn=false;//false //사용이 꺼진 상태
    private int speed;//0

    public void startUp(){
        if(isOn){
            System.out.println("이미 시동이 걸려 있습니다.");
        }else{
            this.isOn = true;
            System.out.println("시동이 걸렸습니다.");
        }
    }
    public void go(){
        if(isOn){
            System.out.println("차가 앞으로 나갑니다.");
            this.speed +=10;
            System.out.println("현재 차 시속은 "+this.speed+"km/h 입니다.");
        }else{
            System.out.println("시동이 걸려있지 않습니다. 시동을 켜주세요.");
        }
    }
    public void stop(){
        if(isOn){
            if(this.speed > 0){
                this.speed  = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            }else{
                System.out.println("시동이 걸려있지 않습니다. 시동을 켜주세요");
            }
        }
    }
    public void turnOff(){
        if(isOn) {
            if (this.speed > 0) {
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 먼점 멈추세요.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜주세요");
            }
        }else{
            System.out.println("이미 시동이 걸려있지 않습니다.");
        }
    }
}
