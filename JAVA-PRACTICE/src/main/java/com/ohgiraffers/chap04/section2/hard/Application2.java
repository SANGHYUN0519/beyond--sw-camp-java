package com.ohgiraffers.chap04.section2.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int random = new Random().nextInt(100) + 1;
        int count = 1;

        while(true) {
            System.out.print("정수를 입력하세요 : ");
            int input = sc.nextInt();

            if(input > random){
                System.out.println("입력하신 정수보다 작습니다.");
                count++;
            }else if(input < random){
                System.out.println("입력하신 정수보다 큽니다.");
                count++;
            }else{
                System.out.println("정답입니다. " + count + "회 만에 정답을 맞추셨습니다.");
                break;
            }
        }
    }

}