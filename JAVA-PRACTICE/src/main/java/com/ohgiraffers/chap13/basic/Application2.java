package com.ohgiraffers.chap13.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<String> que = new LinkedList<>();

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            que.add(input);

            System.out.println("최근 방문 url : " + que.toString());
        }

        scanner.close();
    }
}


