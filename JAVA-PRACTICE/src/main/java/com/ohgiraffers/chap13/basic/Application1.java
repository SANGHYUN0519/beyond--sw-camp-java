package com.ohgiraffers.chap13.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<>();
        String str = "Y";

        while (str.equalsIgnoreCase("Y")){
            System.out.println("학생 성적 : ");
            int score1 = in.nextInt();
            score.add(score1);

            System.out.println(" 추가 입력 하려면 y : Y : ");
            str = in.next();

        }
        if(!score.isEmpty()){
            double total = 0;
            for (Integer integer : score) {
                total = total + integer;
            }
            double avg = total/score.size();
            System.out.println( " 학생 인원 : " + score.size());
            System.out.println( " 평균 점수 : " + avg);


        }

        in.close();



    }

}
