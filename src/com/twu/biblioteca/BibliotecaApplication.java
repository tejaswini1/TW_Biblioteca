package com.twu.biblioteca;

import com.twu.biblioteca.MenuPackage.BooksController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BibliotecaApplication {

    public static void main(String[] args) {

        HashMap<Book, Boolean> booksList = new HashMap<Book, Boolean>();
        booksList.put(new Book("Java", "Jones", "21Feb2019"), true);
        booksList.put(new Book("CN", "Stalling", "3Oct1990"), true);
        Books books = new Books(booksList);

        BibliotecaView bibliotecaView = new BibliotecaView(new Scanner(System.in));

        BooksController booksController = new BooksController(bibliotecaView, books);
    }
}
