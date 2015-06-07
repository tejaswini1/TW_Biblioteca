package com.twu.biblioteca;

import java.util.ArrayList;

// gives all books details
public class Books {
    ArrayList<Book> books = new ArrayList<Book>();

    public Books(){
        books.add(new Book("Java", "Jones", "21Feb2019"));
        books.add(new Book("CN", "Stalling", "3Oct1990"));
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
