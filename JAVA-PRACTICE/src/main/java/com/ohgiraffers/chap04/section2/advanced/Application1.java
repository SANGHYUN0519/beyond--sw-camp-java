package com.ohgiraffers.chap04.section2.advanced;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열울 입력하세요 : ");
        String s = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        String result = "";
        int mod = num % 26;

        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp >= 'a' && temp <= 'z') {
                temp = (char) (temp + mod);
                if (temp > 'z') {
                    temp -= 26;
                }
            } else if (temp >= 'A' && temp <= 'Z') {
                temp = (char) (temp + mod);
                if (temp > 'Z') {
                    temp -= 26;
                }
            }
            result += temp;

        }

        System.out.println(result);
    }

}