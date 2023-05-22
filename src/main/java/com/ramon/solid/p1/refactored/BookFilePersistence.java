package com.ramon.solid.p1.refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class BookFilePersistence implements BookPersistence{

    private static final String BOOK_DIRECTORY_PATH = "/tmp";

    @Override
    public void save(Book book) {
        try{
            String bookFilePath =
                    BOOK_DIRECTORY_PATH + "/" + book.getTitle() + "_" + new Date().getTime();
            BufferedWriter writer = new BufferedWriter(new FileWriter(bookFilePath));
            writer.write(book.getBookContent());
            writer.close();
        }catch(Exception e){
            throw new BookPersistenceException();
        }
    }
}
