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
            if(books.get(book) == true)
                booksList += book + "\n";
        }
        return booksList;
    }

    public boolean checkout(Book otherBook){
        for(Book book : books.keySet()){
            if(book.equals(otherBook)){
                books.put(book, false);
            return true;}
        }

        return false;
    }
}
