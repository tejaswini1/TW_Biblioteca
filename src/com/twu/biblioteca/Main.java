package com.twu.biblioteca;

import com.twu.biblioteca.Controllers.ItemController;
import com.twu.biblioteca.Controllers.MenuController;
import com.twu.biblioteca.MenuActions.*;
import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Models.Item;
import com.twu.biblioteca.Models.Movie;
import com.twu.biblioteca.Models.User;
import com.twu.biblioteca.Validation.Users;

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

        HashMap<String, ArrayList<Item>> checkoutHistory = new HashMap<String, ArrayList<Item>>();
        checkoutHistory.put("teju-123", new ArrayList<Item>());
        checkoutHistory.put("tejas-678", new ArrayList<Item>());
        checkoutHistory.put("jone-78", new ArrayList<Item>());

        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("CN", "Stalling", "3Oct1990"));

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        moviesList.add(new Movie("movie1", "1991", "author1", "3"));
        moviesList.add(new Movie("movie2", "1993", "author2", "4"));

        BibliotecaView bibliotecaView = new BibliotecaView(new Scanner(System.in));
        ItemController itemController = new ItemController(bibliotecaView);

        HashMap<String, MenuActionPerformable> menuList = new HashMap<String, MenuActionPerformable>();

        CheckoutHistory checkoutHistoryObject = new CheckoutHistory(checkoutHistory, bibliotecaView);
        LibrarySection<Movie> librarySectionMovies = new LibrarySection<Movie>(moviesList, new ArrayList<Movie>(), checkoutHistoryObject);
        LibrarySection<Book> librarySectionBooks = new LibrarySection<Book>(booksList, new ArrayList<Book>(), checkoutHistoryObject);
        Menu menu = new Menu(menuList);
        MenuController menuController = new MenuController(menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaView, menuController, users);


        menuList.put("List Books", new ListItems(itemController, librarySectionBooks));
        menuList.put("Checkout Book", new CheckoutBook(itemController, librarySectionBooks));
        menuList.put("Return Book", new ReturnBook(itemController, librarySectionBooks));
        menuList.put("List Movies", new ListItems(itemController, librarySectionMovies));
        menuList.put("Checkout Movie", new CheckoutMovie(itemController, librarySectionMovies));
        menuList.put("Return Movie", new ReturnMovie(itemController, librarySectionMovies));
        menuList.put("Logout", new Logout(bibliotecaApp));
        menuList.put("Checkout History", checkoutHistoryObject);
        menuList.put("Quit", new Quit());
        menuList.put("Invalid Option", new InvalidOption(bibliotecaView));

        bibliotecaApp.start();
    }
}
