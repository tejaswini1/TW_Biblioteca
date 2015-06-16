package com.twu.biblioteca;

public class BooksController {

    private BibliotecaView bibliotecaView ;
    private Library library;


    public BooksController(BibliotecaView bibliotecaView, Library library) {
        this.bibliotecaView = bibliotecaView ;
        this.library = library;

    }


    public void listAllBooks() {
        String data = library.toString();
        bibliotecaView.display(data);
    }

    public void checkout(){
        String nameOfBook = bibliotecaView.read();
        bibliotecaView.display(library.checkout(nameOfBook));
    }

    public void returnBook(){
        String nameOfBook = bibliotecaView.read();
        bibliotecaView.display(library.returnBook(nameOfBook));


    }
}
