package com.twu.biblioteca;

public class Checkout implements MenuActionPerformable {

    private BibliotecaView bibliotecaView;
    private  BooksController booksController;


    public Checkout(BibliotecaView bibliotecaView, BooksController booksController){
        this.bibliotecaView = bibliotecaView;
        this.booksController = booksController;

    }

    public void execute(){
        booksController.checkout();
    }
}
