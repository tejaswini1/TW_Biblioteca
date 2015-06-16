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

        if(library.checkout(nameOfBook))
            bibliotecaView.display(Messages.CHECKOUT_SUCCESSFUL);
        else
            bibliotecaView.display(Messages.CHECKOUT_UNSUCCESSFUL);
    }

    public void returnBook(){
        String nameOfBook = bibliotecaView.read();
        if(library.returnBook(nameOfBook))
            bibliotecaView.display(Messages.RETURN_SUCCESSFUL);
        else
            bibliotecaView.display(Messages.RETURN_UNSUCCESSFUL);


    }
}
