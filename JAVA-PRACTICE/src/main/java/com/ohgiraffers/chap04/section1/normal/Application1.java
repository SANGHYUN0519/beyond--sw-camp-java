package com.ohgiraffers.chap04.section1.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("입력: ");
        int num = in.nextInt();

        if (num >= 1 && num <= 10) {
            if (num % 2 == 1) {
                System.out.println("홀수다.");
            } else {
                System.out.println("짝수다.");
            }
        } else {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }

        in.close();
    }

}
