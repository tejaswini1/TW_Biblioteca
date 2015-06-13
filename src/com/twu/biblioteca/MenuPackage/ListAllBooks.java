package com.twu.biblioteca.MenuPackage;


public class ListAllBooks implements MenuActionPerformable {
    private BooksController booksController;

    public ListAllBooks(BooksController booksController) {
        this.booksController = booksController;
    }


    public void execute() {
        booksController.listAllBooks();
    }
}
