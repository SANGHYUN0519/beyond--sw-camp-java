package com.ohgiraffers.chap05.demensional_array.hard;

import java.util.Random;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cols;
        int rows;

        while(true) {
            System.out.print("가로 행의 수를 입력하세요 : ");
            rows = sc.nextInt();

            if(rows < 1 || rows > 10){
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }else{
                break;
            }

        }

        while(true) {
            System.out.print("세로 열의 수를 입력하세요 : ");
            cols = sc.nextInt();

            if(cols < 1 || cols > 10){
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }else{
                break;
            }

        }

        char[][] crr = new char[rows][cols];
        Random r = new Random();
        char c = 'A';
        int bound = 'Z' - 'A' + 1;

        for(int i = 0; i < crr.length; i ++){
            for(int j = 0; j < crr[i].length; j++){
                crr[i][j] = (char)(c + r.nextInt(bound));
                System.out.print(crr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}