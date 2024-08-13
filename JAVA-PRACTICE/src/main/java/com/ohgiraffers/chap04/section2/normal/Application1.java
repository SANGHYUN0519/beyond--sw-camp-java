package com.ohgiraffers.chap04.section2.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" 문자열을 입력하세요 : ");

        String input = in.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println();
        }

    }
}









