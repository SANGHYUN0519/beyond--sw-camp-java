package com.ohgiraffers.chap05.array.basic;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[10];


        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}

