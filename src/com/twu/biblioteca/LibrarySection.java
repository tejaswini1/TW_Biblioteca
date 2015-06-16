package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

// gives all books details
public class LibrarySection {


    private ArrayList<Book> availableBooks;
    private ArrayList<Book> issuedBooks;

    public LibrarySection(ArrayList<Book> availableBooks, ArrayList<Book> issuedBooks) {

        this.availableBooks = availableBooks;
        this.issuedBooks = issuedBooks;
    }

    @Override
    public String toString() {
        String result = "";
        for (Book book : availableBooks) {
            result += book.toString() + "\n";
        }
        return result;
    }

    public String checkout(String otherBook) {
        ArrayList<Book> searchResult = search(otherBook, availableBooks);
        for (Book book : searchResult) {
            issuedBooks.add(book);
            availableBooks.remove(book);
            return Messages.CHECKOUT_SUCCESSFUL;
        }
        return Messages.CHECKOUT_UNSUCCESSFUL;
    }

    private ArrayList<Book> search(String otherBook, ArrayList<Book> bookList) {
        ArrayList<Book> resultBooks = new ArrayList<Book>();

        for (Book book : bookList) {
            if (book.equals(otherBook))
                resultBooks.add(book);
        }
        return resultBooks;
    }

    public String returnBook(String otherBook) {
        ArrayList<Book> searchResult = search(otherBook, issuedBooks);
        for (Book book : searchResult) {
            availableBooks.add(book);
            issuedBooks.remove(book);
            return Messages.RETURN_SUCCESSFUL;
        }
        return Messages.RETURN_UNSUCCESSFUL;
    }
}
