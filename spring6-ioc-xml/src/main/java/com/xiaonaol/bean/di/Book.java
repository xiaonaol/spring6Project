package com.xiaonaol.bean.di;

public class Book {
    private String bname;
    private String author;

    public Book() {
        System.out.println("无参数构造执行了...");
    }
    public Book(String bname, String author) {
        System.out.println("有参数构造执行了...");
        this.bname = bname;
        this.author = author;
    }

    //生成set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        //set方法注入
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("xiaonaol");

        //通过构造器注入
        Book book1 = new Book("c++", "xiaonaol");
    }
}
