package com.twu.biblioteca;

public class CheckoutBook implements MenuActionPerformable {

    private  BooksController booksController;


    public CheckoutBook( BooksController booksController){
        this.booksController = booksController;

    }

    public void execute(){
        booksController.checkout();
    }
}
