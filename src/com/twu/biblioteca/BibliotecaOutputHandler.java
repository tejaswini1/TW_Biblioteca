package com.twu.biblioteca;
//job, print data
public class BibliotecaOutputHandler {

    public void displayWelcomeMessage(Biblioteca biblioteca){
        System.out.println(biblioteca.welcomeMessage());
    }

    public void displayListBooks(Books books){
        System.out.println(books.toString());
    }

    public void displayListBooks(Book book){
        System.out.println(book.toString());
    }
}
