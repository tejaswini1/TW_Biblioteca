package com.twu.biblioteca;

public class BooksController {

    private BibliotecaView bibliotecaView ;
    private LibrarySection librarySection;


    public BooksController(BibliotecaView bibliotecaView, LibrarySection librarySection) {
        this.bibliotecaView = bibliotecaView ;
        this.librarySection = librarySection;

    }


    public void listAllBooks() {
        String data = librarySection.toString();
        bibliotecaView.display(data);
    }

    public void checkout(){
        String nameOfBook = bibliotecaView.read();
        bibliotecaView.display(librarySection.checkout(nameOfBook));
    }

    public void returnBook(){
        String nameOfBook = bibliotecaView.read();
        bibliotecaView.display(librarySection.returnBook(nameOfBook));


    }
}
