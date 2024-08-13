package com.ohgiraffers.chap05.array.normal;
/* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
 * 성별 자리 이후부터 *로 가려서 출력하세요
 *
 * -- 입력 예시 --
 * 주민등록번호를 입력하세요 : 990101-1234567
 *
 * -- 출력 예시 --
 * 990101-1******
 * 13자리가 넘으면 출력 안 되게 추가해봄
 * */

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요 : ");
        String idNumber = sc.nextLine();

        if (idNumber.length() != 13) {
            System.out.println("알 수 없는 주민등록 번호 입니다");
            return;
        }

        char[] charArr = idNumber.toCharArray();

        for (int i = 8; i < charArr.length; i++) {
            charArr[i] = '*';
        }

        System.out.println(new String(charArr));
    }
}