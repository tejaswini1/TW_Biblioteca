package com.twu.biblioteca;

import java.util.HashMap;

// gives all books details
public class Library {
    HashMap<Book, Boolean> books = new HashMap<Book, Boolean>();

    public Library(HashMap<Book, Boolean> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String booksList = "";
        for (Book book : books.keySet()) {
            if (books.get(book) == true)
                booksList += book + "\n";
        }
        return booksList;
    }

    public boolean checkout(String otherBook) {
        for (Book book : books.keySet()) {
            if (book.equals(otherBook) && books.get(book) == true) {
                books.put(book, false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String otherBook) {
        for (Book book : books.keySet()) {
            if (book.equals(otherBook) && books.get(book) == false) {
                books.put(book, true);
                return true;
            }

        }
        return false;
    }
}
