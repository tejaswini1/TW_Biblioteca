package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("teju", "tejubhosle@gmail", 9850748390l, "teju-123", "teju", "user"));
        userList.add(new User("tejas", "tejas@gmail", 9850748390l, "tejas-678", "tejas", "user"));
        userList.add(new User("jone", "jone@gmail", 9850748390l, "jone-78", "jone", "librarian"));

        Users users = new Users(userList);

        HashMap<String, ArrayList<Book>> checkoutHistory = new HashMap<String, ArrayList<Book>>();
        checkoutHistory.put("teju-123", new ArrayList<Book>());
        checkoutHistory.put("tejas-678", new ArrayList<Book>());
        checkoutHistory.put("jone-78", new ArrayList<Book>());

        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("CN", "Stalling", "3Oct1990"));



        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        moviesList.add(new Movie("movie1", "1991", "author1", "3"));
        moviesList.add(new Movie("movie2", "1993", "author2", "4"));



        BibliotecaView bibliotecaView = new BibliotecaView(new Scanner(System.in));
        ItemController itemController = new ItemController(bibliotecaView);



        HashMap<Integer, MenuActionPerformable> menuList = new HashMap<Integer, MenuActionPerformable>();

        CheckoutHistory checkoutHistoryObject = new CheckoutHistory(checkoutHistory, bibliotecaView);
        LibrarySection<Movie> librarySectionMovies = new LibrarySection<Movie>(moviesList, new ArrayList<Movie>(), checkoutHistoryObject);
        LibrarySection<Book> librarySectionBooks = new LibrarySection<Book>(booksList, new ArrayList<Book>(), checkoutHistoryObject);
        Menu menu = new Menu(menuList);
        MenuController menuController = new MenuController(menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaView, menuController, users);


        menuList.put(1, new ListAllItems(itemController, librarySectionBooks));
        menuList.put(2, new CheckoutBook(itemController, librarySectionBooks));
        menuList.put(3, new ReturnBook(itemController, librarySectionBooks));
        menuList.put(4, new ListAllItems(itemController, librarySectionMovies));
        menuList.put(5, new CheckoutMovie(itemController, librarySectionMovies));
        menuList.put(6, new ReturnMovie(itemController, librarySectionMovies));
        menuList.put(7, new Logout(bibliotecaApp));
        menuList.put(8, checkoutHistoryObject);
        menuList.put(9, new Quit());
        menuList.put(10, new InvalidOption(bibliotecaView));





        bibliotecaApp.start();
    }
}
