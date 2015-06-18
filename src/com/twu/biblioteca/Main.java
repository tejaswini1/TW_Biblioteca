package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("teju", "tejubhosle@gmail", 9850748390l, "pune-123", "teju", "user"));
        users.add(new User("tejas", "tejas@gmail", 9850748390l, "pune-678", "tejas", "user"));
        users.add(new User("jone", "jone@gmail", 9850748390l, "pune-78", "jone", "librarian"));

        Authentication authentication = new Authentication(users);

        HashMap<String, ArrayList<Book>> checkoutHistory = new HashMap<String, ArrayList<Book>>();
        checkoutHistory.put("teju", new ArrayList<Book>());
        checkoutHistory.put("tejas", new ArrayList<Book>());
        checkoutHistory.put("jone", new ArrayList<Book>());

        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("CN", "Stalling", "3Oct1990"));
        LibrarySection<Book> librarySectionBooks = new LibrarySection<Book>(booksList, new ArrayList<Book>());


        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        moviesList.add(new Movie("movie1", "1991", "author1", "3"));
        moviesList.add(new Movie("movie2", "1993", "author2", "4"));

        LibrarySection<Movie> librarySectionMovies = new LibrarySection<Movie>(moviesList, new ArrayList<Movie>());

        BibliotecaView bibliotecaView = new BibliotecaView(new Scanner(System.in));
        ItemController itemController = new ItemController(bibliotecaView);

        HashMap<Integer, MenuActionPerformable> menuList = new HashMap<Integer, MenuActionPerformable>();

        menuList.put(1, new ListAllItems(itemController, librarySectionBooks));
        menuList.put(2, new CheckoutBook(itemController, librarySectionBooks));
        menuList.put(3, new ReturnBook(itemController, librarySectionBooks));
        menuList.put(4, new ListAllItems(itemController, librarySectionMovies));
        menuList.put(5, new CheckoutMovie(itemController, librarySectionMovies));
        menuList.put(6, new ReturnMovie(itemController, librarySectionMovies));
        menuList.put(7, new Quit());
        menuList.put(8, new InvalidOption(bibliotecaView));
        menuList.put(9, new CheckoutHistory(checkoutHistory, bibliotecaView));


        Menu menu = new Menu(menuList);

        MenuController menuController = new MenuController(bibliotecaView, menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaView, menuController, authentication);

        bibliotecaApp.start();
    }
}
