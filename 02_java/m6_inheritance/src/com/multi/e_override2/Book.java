package com.multi.e_override2;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // 오버라이딩 전 : Object 클래스의 hashCode() 메소드 실행 --> 해당 객체의 실제 주소값을 10진수로 계산한 결과
        // 오버라이딩 후 : 두 객체의 실제 주소값을 가지고 작업하지 않고 두 객체의 실제 멤버의 값들이 같은 경우 같은 해쉬코드값이 나오도록 재정의
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        // obj를 Book 타입으로 형변환하고, 필드 비교
        Book other = (Book) obj;
        return this.price == other.price &&
                Objects.equals(this.title, other.title) &&
                Objects.equals(this.author, other.author);
    }

    @Override
    public int hashCode() {
        // 주어진 매개값들로 배열을 생성하고 Arrays.hashCode(Object[])를 호출해서 해쉬코드를 얻고 이 값을 리턴해줌
        return Objects.hash(title, author, price);
    }
}
