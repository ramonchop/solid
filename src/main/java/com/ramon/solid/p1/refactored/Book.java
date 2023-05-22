package com.ramon.solid.p1.refactored;

public class Book {
    private String title;
    private String author;

    private String bookContent;

    public Book(String title, String author, String bookContent){
        this.title = title;
        this.author = author;
        this.bookContent = bookContent;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookContent() {
        return bookContent;
    }

    public String getTitle() {
        return title;
    }



}
