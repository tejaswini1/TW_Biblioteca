package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;

public class Checkout implements MenuActionPerformable {

    private BibliotecaView bibliotecaView;
    private  BooksController booksController;
    private BookTokenizer bookTokenizer;

    public Checkout(BibliotecaView bibliotecaView, BooksController booksController, BookTokenizer bookTokenizer){
        this.bibliotecaView = bibliotecaView;
        this.booksController = booksController;
        this.bookTokenizer = bookTokenizer;
    }

    public void execute(){
        booksController.checkout();
    }
}
