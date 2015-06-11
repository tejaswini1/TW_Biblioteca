package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.Books;
import com.twu.biblioteca.Messages;

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

    public void checkout(String nameOfBook){
        if(books.checkout(nameOfBook))
            bibliotecaView.display(Messages.CHECKOUT_SUCCESSFUL);
        else
            bibliotecaView.display(Messages.CHECKOUT_UNSUCCESSFUL);
    }
}
