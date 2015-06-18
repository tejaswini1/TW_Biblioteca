package com.twu.biblioteca;

public interface Messages {

    String WELCOME_MESSAGE = " Welcome to biblioteca ";
    String INVALID_MESSAGE = " Select Valid Option! ";
    String MENU_ITEMS = " 1] List of ALL Books \n 2] Checkout-Book \n 3] Return-Book \n 4] List All Movies \n 5] Checkout-Movie \n 6] Return_Movie \n 7]Logout";
    String BOOK_CHECKOUT_SUCCESSFUL = "Thank you! Enjoy the book";
    String BOOK_CHECKOUT_UNSUCCESSFUL = "The book is not available";
    String BOOK_RETURN_SUCCESSFUL = "Thank you for returning book";
    String BOOK_RETURN_UNSUCCESSFUL = "That is not a valid book to return";
    String MOVIE_CHECKOUT_SUCCESSFUL = "Thank you! Enjoy the movie";
    String MOVIE_CHECKOUT_UNSUCCESSFUL = "The movie is not available";
    String MOVIE_RETURN_SUCCESSFUL = "Thank you for returning movie";
    String MOVIE_RETURN_UNSUCCESSFUL = "That is not a valid movie to return";
    String LOGIN_MESSAGE = "LOGIN\n Login ID : \n PASSWORD : ";
    String LIBRARIAN_MENU_ITEMS = " 8] Checkout History \n 9] Quit";

}
