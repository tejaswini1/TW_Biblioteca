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
        if(librarySection.checkout(nameOfBook))
             bibliotecaView.display(Messages.BOOK_CHECKOUT_SUCCESSFUL);
        else
            bibliotecaView.display(Messages.BOOK_CHECKOUT_UNSUCCESSFUL);
    }

    public void returnBook(){
        String nameOfBook = bibliotecaView.read();
        if(librarySection.returnItem(nameOfBook))
            bibliotecaView.display(Messages.BOOK_RETURN_SUCCESSFUL);
        else
            bibliotecaView.display(Messages.BOOK_RETURN_UNSUCCESSFUL);

    }
}
