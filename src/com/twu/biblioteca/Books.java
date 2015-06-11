package com.twu.biblioteca;

import java.util.HashMap;

// gives all books details
public class Books {
    HashMap<Book, Boolean> books = new HashMap<Book, Boolean>();

    public Books(HashMap<Book, Boolean> books){
            this.books = books;
    }

    @Override
    public String toString() {
        String booksList = "";
        for(Book book:books.keySet()){
            booksList += book + "\n";
        }
        return booksList;
    }

    public boolean checkout(String name){
        for(Book book : books.keySet()){
            if(book.equals(name)){
                books.put(book, false);
            return true;}
        }

        return false;
    }
}
