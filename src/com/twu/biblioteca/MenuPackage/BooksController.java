package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.Book;
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

    public void checkout(){
        String nameOfBook = bibliotecaView.read();
        BookTokenizer bookTokenizer = new BookTokenizer();
        Book book = bookTokenizer.get(nameOfBook);
        if(books.checkout(book))
            bibliotecaView.display(Messages.CHECKOUT_SUCCESSFUL);
        else
            bibliotecaView.display(Messages.CHECKOUT_UNSUCCESSFUL);
    }
}
