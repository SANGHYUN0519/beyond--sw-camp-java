package com.ohgiraffers.chap04.section2.advanced;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("받으신 금액을 입력하세요 : ");
        int money = sc.nextInt();

        System.out.print("상품 가격을 입력하세요 : ");
        int price = sc.nextInt();

        int change = money - price;
        int currency = 50000;
        boolean isCurrencySwitch = true;

        System.out.println("===========================");

        while (change > 0) {
            int count = change / currency;

            if (count > 0) {
                if (currency >= 1000) {
                    System.out.println(currency + "원권 지폐 " + count + "장");
                } else {
                    System.out.println(currency + "원권 동전 " + count + "개");
                }
                change %= currency;
            }

            if (isCurrencySwitch) {
                currency /= 5;
            } else {
                currency /= 2;
            }

            isCurrencySwitch = !isCurrencySwitch;
        }

        System.out.println("===========================");
        System.out.println("거스름돈 : " + (money - price) + "원");
    }

}