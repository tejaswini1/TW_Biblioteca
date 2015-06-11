package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.Books;

public class BooksController {

    private BibliotecaView bibliotecaView ;
    private Books books ;

    public BooksController(BibliotecaView bibliotecaView, Books books) {
        this.bibliotecaView = bibliotecaView ;
        this.books = books ;
    }


    public void listAllBooks() {
        String data = books.toString();
        bibliotecaView.display(data);
    }
}
