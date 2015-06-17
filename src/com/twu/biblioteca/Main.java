package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("CN", "Stalling", "3Oct1990"));
        LibrarySection<Book> librarySectionBooks = new LibrarySection<Book>(booksList, new ArrayList<Book>());


        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        moviesList.add(new Movie("movie1", "1991", "author1", "3"));
        moviesList.add(new Movie("movie2", "1993", "author2", "4"));

        LibrarySection<Movie> librarySectionMovies = new LibrarySection<Movie>(moviesList, new ArrayList<Movie>());

        BibliotecaView bibliotecaView = new BibliotecaView(new Scanner(System.in));
        BooksController booksController = new BooksController(bibliotecaView, librarySectionBooks);
        MoviesController moviesController = new MoviesController(bibliotecaView, librarySectionMovies);

        HashMap<Integer, MenuActionPerformable> menuList = new HashMap<Integer, MenuActionPerformable>();

        menuList.put(1, new ListAllBooks(booksController));
        menuList.put(2, new CheckoutBook(booksController));
        menuList.put(3, new ReturnBook(booksController));
        menuList.put(4, new ListAllMovies(moviesController));
        menuList.put(5, new CheckoutMovie(moviesController));
        menuList.put(6, new ReturnMovie(moviesController));
        menuList.put(7, new Quit());
        menuList.put(8, new InvalidOption(bibliotecaView));


        Menu menu = new Menu(menuList);

        MenuController menuController = new MenuController(bibliotecaView, menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaView, menuController);

        bibliotecaApp.start();
    }
}
