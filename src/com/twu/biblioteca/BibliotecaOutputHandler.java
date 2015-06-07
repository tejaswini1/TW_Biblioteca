package com.twu.biblioteca;

//job, print data

public class BibliotecaOutputHandler {

    public void displayWelcomeMessage(BibliotecaApp bibliotecaApp){
        System.out.println(bibliotecaApp.welcomeMessage());
    }

    public void displayListBooks(Books books){
        System.out.println(books.toString());
    }

    public void displayListBooks(Book book){
        System.out.println(book.toString());
    }
}
