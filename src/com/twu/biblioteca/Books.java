package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {
    ArrayList<String> books = new ArrayList<String>();

    public Books(){
        books.add("OS");
        books.add("Java");
        books.add("Db");
    }

    @Override
    public String toString() {
        String booksList = "";
        for(String book:books){
            booksList += book + "\n";
        }
        return booksList;
    }
}
