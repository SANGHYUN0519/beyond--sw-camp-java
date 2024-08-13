package com.ohgiraffers.chap04.section1.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("몸무게 : ");
        double kg = in.nextDouble();
        System.out.println("키 입력 : ");
        double m = in.nextDouble();
        double bmi = m / (kg * kg);

        if (bmi < 20) {
            System.out.println("당신은 저체중 입니다.");
        } else if (bmi > 20 && bmi < 25) {
            System.out.println("당신은 정상체중 입니다.");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("당신은 과제중 입니다.");
        } else if (bmi >= 30) {
            System.out.println("당신은 비만 입니다.");
        }

        in.close();
    }
}
