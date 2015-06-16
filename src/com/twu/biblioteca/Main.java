package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("CN", "Stalling", "3Oct1990"));
        Library library = new Library(booksList, new ArrayList<Book>());

        BibliotecaView bibliotecaView = new BibliotecaView(new Scanner(System.in));



        BooksController booksController = new BooksController(bibliotecaView, library);

        HashMap<Integer, MenuActionPerformable> menuList = new HashMap<Integer, MenuActionPerformable>();

        menuList.put(1, new ListAllBooks(booksController));
        menuList.put(2, new Checkout(bibliotecaView, booksController));
        menuList.put(3, new ReturnBook(booksController));
        menuList.put(4, new Quit());
        menuList.put(5, new InvalidOption(bibliotecaView));


        Menu menu = new Menu(menuList);

        MenuController menuController = new MenuController(bibliotecaView, menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaView, booksController, menuController);

        bibliotecaApp.start();
    }
}
