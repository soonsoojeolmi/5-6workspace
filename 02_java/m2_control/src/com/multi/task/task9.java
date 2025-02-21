package com.multi.task;

public class task9 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println("▣▣▣▣");
        }

        int rows = 8;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }
}
