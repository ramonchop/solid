package com.ramon.solid.p1.bad;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


public class Book {
    private String title;
    private String author;

    private String bookContent;
    private static final String BOOK_DIRECTORY_PATH = "/tmp";

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

    public void save() throws IOException{
        String bookFilePath =
                Book.BOOK_DIRECTORY_PATH + "/" + this.title + "_" + new Date().getTime();
        BufferedWriter writer = new BufferedWriter(new FileWriter(bookFilePath));
        writer.write(bookContent);
        writer.close();
    }

}
