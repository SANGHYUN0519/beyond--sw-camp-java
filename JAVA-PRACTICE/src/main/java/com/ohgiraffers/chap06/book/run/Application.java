package com.ohgiraffers.chap06.book.run;

import com.ohgiraffers.chap06.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {

        BookDTO book1 = new BookDTO(null, null, null, 0, 0.0);
        book1.printInformation();

        BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성", 0, 0.0);
        book2.printInformation();

        BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        book3.printInformation();

    }
}
