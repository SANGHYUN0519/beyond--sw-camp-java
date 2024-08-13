package com.ohgiraffers.chap03.normal;

import com.ohgiraffers.chap03.normal.RandomMaker;

public class Application {

    public static void main(String[] args) {

        System.out.println(RandomMaker.randomNumber(-128, 127));

        System.out.println(RandomMaker.randomUpperAlphabet(10));

        System.out.println(RandomMaker.rockPaperScissors());

        System.out.println(RandomMaker.tossCoin());
    }

}