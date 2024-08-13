package com.ohgiraffers.chap04.section1.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("정수 하나를 입력하세오. : ");
        int num = in.nextInt();

        if (num % 2 == 1) {
            System.out.println("홀수다.");
        } else {
            System.out.println("짝수다.");
        }
        in.close();
    }

}



