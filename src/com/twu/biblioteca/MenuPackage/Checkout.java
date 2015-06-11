package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;

public class Checkout implements MenuActionPerformable {

    private BibliotecaView bibliotecaView;
    private  BooksController booksController;

    public Checkout(BibliotecaView bibliotecaView, BooksController booksController){
        this.bibliotecaView = bibliotecaView;
        this.booksController = booksController;
    }

    public void execute(){
        String book = bibliotecaView.read();
        booksController.checkout(book);
    }
}
