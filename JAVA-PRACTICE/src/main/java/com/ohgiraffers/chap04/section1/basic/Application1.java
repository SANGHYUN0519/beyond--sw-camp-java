package com.ohgiraffers.chap04.section1.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" 정수를 하나 입력하세요 : ");
        int num = in.nextInt();

        if (num > 0) {
            System.out.println("양수다");
        } else {
            System.out.println("양수가 아니다");
        }
        System.out.println();
    }

}
