package com.ohgiraffers.chap09.basic;

import java.util.Locale;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        StringBuilder sb = new StringBuilder();
        System.out.println(" 문자열 입력 : ");
        String[] word = in.nextLine().split(" ");

        for (int i = 0; i < word.length; i++) {
            if (!word[i].isEmpty()) {
                char firstChar = Character.toUpperCase(word[i].charAt(0));
                String restOfWord = word[i].substring(1).toLowerCase(Locale.ROOT);
                sb.append(firstChar).append(restOfWord).append(" ");
            }

        }
        String result = sb.toString().trim();
        System.out.println("변환 된 문자열 : " + result);
        System.out.println(" 총 단어 개수 : " + word.length);
    }


}










