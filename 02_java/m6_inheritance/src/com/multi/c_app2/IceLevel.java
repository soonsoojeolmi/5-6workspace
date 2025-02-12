package com.multi.c_app2;

public enum IceLevel {
    NONE, LOW, MEDIUM, HIGHColdBeverage;

    public String getDesc(){
            return switch (this) {
            case NONE -> "얼음 없이 제공됩니다.";
            case LOW -> "얼음이 적게 들어갑니다.";
            case MEDIUM -> "얼음이 보통으로 들어갑니다.";
            case HIGHColdBeverage -> "얼음이 많이 들어갑니다.";
            default -> "얼음 양을 알 수 없습니다.";
        };
    }
}
