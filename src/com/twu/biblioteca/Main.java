package com.twu.biblioteca;

import com.twu.biblioteca.MenuPackage.*;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<Book, Boolean> booksList = new HashMap<Book, Boolean>();
        booksList.put(new Book("Java", "Jones", "21Feb2019"), true);
        booksList.put(new Book("CN", "Stalling", "3Oct1990"), true);
        Books books = new Books(booksList);

        BibliotecaView bibliotecaView = new BibliotecaView(new Scanner(System.in));

        BooksController booksController = new BooksController(bibliotecaView, books);

        HashMap<Integer, MenuActionPerformable> menuList = new HashMap<Integer, MenuActionPerformable>();

        menuList.put(1, new ListAllBooks(booksController));
        menuList.put(2, new Quit());

        Menu menu = new Menu(menuList);

        MenuController menuController = new MenuController(bibliotecaView, menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaView, booksController, menuController);

        bibliotecaApp.start();
    }
}
