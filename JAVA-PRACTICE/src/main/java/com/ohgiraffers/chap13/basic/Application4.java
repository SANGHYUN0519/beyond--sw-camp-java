package com.ohgiraffers.chap13.basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application4 {
    public static void main(String[] args) {
        Set<String> studentIDs = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String id = scanner.nextLine();
            if(id.equals("exit")) break;

            if(!studentIDs.add(id)) {
                System.out.println("이미 등록 된 ID입니다.");
            } else {
                System.out.println("ID가 추가 되었습니다.");
            }
        }

        System.out.println("모든 학생의 ID : " + studentIDs);
    }
}
