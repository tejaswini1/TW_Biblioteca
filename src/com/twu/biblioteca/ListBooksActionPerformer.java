package com.twu.biblioteca;

public class ListBooksActionPerformer implements MenuActionPerformable {

    public void execute(){
        new BooksView(new Books()).displayBooks();
    }
}
