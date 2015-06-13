package com.twu.biblioteca;

public class ReturnBook implements MenuActionPerformable {

    private BooksController booksController;

    public ReturnBook(BooksController booksController){
        this.booksController = booksController;
    }

    @Override
    public void execute() {
        booksController.returnBook();
    }
}
