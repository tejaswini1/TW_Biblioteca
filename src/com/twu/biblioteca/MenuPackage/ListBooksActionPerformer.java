package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.Books;
import com.twu.biblioteca.BooksView;

public class ListBooksActionPerformer implements MenuActionPerformable {

    public void execute(){
        new BooksView(new Books()).displayBooks();
    }
}
