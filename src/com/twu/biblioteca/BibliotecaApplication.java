package com.twu.biblioteca;

import com.twu.biblioteca.MenuPackage.BooksController;

import java.util.ArrayList;

public class BibliotecaApplication {

    public static void main(String[] args) {

        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("CN", "Stalling", "3Oct1990"));
        Books books = new Books(booksList);

        BibliotecaView bibliotecaView = new BibliotecaView();

        BooksController booksController = new BooksController(bibliotecaView, books);
    }
}
