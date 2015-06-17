package com.twu.biblioteca;

public class CheckoutBook implements MenuActionPerformable {

    private BibliotecaView bibliotecaView;
    private  BooksController booksController;


    public CheckoutBook(BibliotecaView bibliotecaView, BooksController booksController){
        this.bibliotecaView = bibliotecaView;
        this.booksController = booksController;

    }

    public void execute(){
        booksController.checkout();
    }
}
