package com.twu.biblioteca.InputOutputHandler;


// has constant messages of whole project
public interface Messages {

    String WELCOME_MESSAGE = " Welcome to biblioteca ";
    String INVALID_MESSAGE = " Select Valid Option! ";
    String MENU_ITEMS = "Checkout Book\nReturn Book\nCheckout Movie\nReturn Movie\nLogout";
    String BOOK_CHECKOUT_SUCCESSFUL = "Thank you! Enjoy the book";
    String BOOK_CHECKOUT_UNSUCCESSFUL = "The book is not available";
    String BOOK_RETURN_SUCCESSFUL = "Thank you for returning book";
    String BOOK_RETURN_UNSUCCESSFUL = "That is not a valid book to return";
    String MOVIE_CHECKOUT_SUCCESSFUL = "Thank you! Enjoy the movie";
    String MOVIE_CHECKOUT_UNSUCCESSFUL = "The movie is not available";
    String MOVIE_RETURN_SUCCESSFUL = "Thank you for returning movie";
    String MOVIE_RETURN_UNSUCCESSFUL = "That is not a valid movie to return";
    String LOGIN_MESSAGE = "\nLOGIN\n Login ID : \n PASSWORD : ";
    String LIBRARIAN_MENU_ITEMS = "Checkout History\nQuit";
    String INITIAL_MENU_ITEM  = " List Books\n List Movies\n Login\n";

}
