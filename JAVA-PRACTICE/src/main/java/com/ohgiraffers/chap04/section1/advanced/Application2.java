package com.ohgiraffers.chap04.section1.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("월 급여 입력 : ");
        double monsalary = in.nextDouble();

        System.out.println("매출액 입력: ");
        double salesAmount = in.nextDouble();



        double bounsRate;
        if (salesAmount >= 50000000) {
            bounsRate = 0.05;
        } else if (salesAmount >= 30000000) {
            bounsRate = 0.3;
        } else if (salesAmount >= 10000000) {
            bounsRate = 0.1;
        } else {bounsRate = 0.0;}
        {

            double bonusAmount = salesAmount * bounsRate;
            double totalsalary = monsalary + bonusAmount;
        }



    }

}
