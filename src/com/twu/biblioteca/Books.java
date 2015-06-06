package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {
    ArrayList<Book> books = new ArrayList<Book>();

    public Books(ArrayList<Book> books){
        this.books = books;
    }

    @Override
    public String toString() {
        String booksList = "";
        for(Book book:books){
            booksList += book + "\n";
        }
        return booksList;
    }
}
