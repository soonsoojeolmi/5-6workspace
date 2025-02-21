package com.multi.task;

import javax.swing.*;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("암호를 입력하세요: ");
                String password = sc.next();
                if (password.equals("pass")) {
                    System.out.println("들어오세요.");
                } else {
                    System.out.println("나가세요.");
                }

                System.out.print("먹고 싶은 저녁 메뉴(자장면, 라면, 회): ");
                String menu = sc.next();
                switch (menu) {
                    case "자장면":
                        System.out.println("중국집으로 가요");
                        break;
                    case "라면":
                        System.out.println("분식집으로 가요");
                        break;
                    case "회":
                        System.out.println("횟집으로 가요");
                        break;
                    default:
                        System.out.println("그냥 안 먹어요");
                }


                String num1 = JOptionPane.showInputDialog("첫 번째 정수를 입력하세요:");
                String num2 = JOptionPane.showInputDialog("두 번째 정수를 입력하세요:");
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);

                if (n1 > n2) {
                    JOptionPane.showMessageDialog(null, "더 큰 수는: " + n1);
                } else if (n1 < n2) {
                    JOptionPane.showMessageDialog(null, "더 큰 수는: " + n2);
                } else {
                    JOptionPane.showMessageDialog(null, "두 수는 같습니다.");
                }


                System.out.print("사원번호를 입력하세요 (예: A100EX): ");
        String empNo = sc.next();
        char firstChar = empNo.charAt(0);

        switch (firstChar) {
            case 'A':
                System.out.println("기획부");
                break;
            case 'B':
                System.out.println("총무부");
                break;
            case 'C':
                System.out.println("개발부");
                break;
            default:
                System.out.println("알 수 없는 부서");
        }

        sc.close();
    }
}