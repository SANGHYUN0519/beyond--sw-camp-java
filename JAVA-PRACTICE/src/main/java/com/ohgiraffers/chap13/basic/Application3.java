package com.ohgiraffers.chap13.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'):");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("next")) {
                if (queue.isEmpty()) {
                    System.out.println("대기 고객이 없습니다.");
                } else {
                    String customer = queue.poll();
                    System.out.println(customer + " 고객님 차례입니다.");
                }
            } else {
                queue.add(input);
                System.out.println(input + " 고객님 대기 등록 되었습니다.");
            }
        }

        scanner.close();
    }
}
