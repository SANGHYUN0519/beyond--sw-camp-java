package com.ohgiraffers.chap04.section1.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" 국어 점수를 입력하세요 : ");
        int language = in.nextInt();
        System.out.println(" 영어 점수를 입력하세요 : ");
        int english = in.nextInt();
        System.out.println(" 수학 점수를 입력하세요 : ");
        int math = in.nextInt();

        int average = (language + english + math) / 3;

        if (average >= 60 && language >= 40 && english >= 40 && math >= 40) {
            System.out.println("합격입니다!");
        }
        else { if (average < 60);
            { System.out.println("평균 점수 미달로 불합격입니다.");}
            if (language < 40) {
                System.out.println("국어 점수 미달로 불합격입니다.");}
            if (english < 40) {
                System.out.println("영어 점수 미달로 불합격입니다.");}
            if (math < 40) {
                System.out.println("수학 점수 미달로 불합격입니다.");
            }

            in.close();
        }


    }

}