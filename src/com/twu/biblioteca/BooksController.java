package com.twu.biblioteca;

public class BooksController {

    private BibliotecaView bibliotecaView ;
    private Books books ;
    private BookTokenizer bookTokenizer;

    public BooksController(BibliotecaView bibliotecaView, Books books, BookTokenizer bookTokenizer) {
        this.bibliotecaView = bibliotecaView ;
        this.books = books ;
        this.bookTokenizer = bookTokenizer;
    }


    public void listAllBooks() {
        String data = books.toString();
        bibliotecaView.display(data);
    }

    public void checkout(){
        String nameOfBook = bibliotecaView.read();
        Book book = bookTokenizer.get(nameOfBook);
        if(books.checkout(book))
            bibliotecaView.display(Messages.CHECKOUT_SUCCESSFUL);
        else
            bibliotecaView.display(Messages.CHECKOUT_UNSUCCESSFUL);
    }

    public void returnBook(){
//        String nameOfBook = bibliotecaView.read();
//        Book book = bookTokenizer.get(nameOfBook);

    }
}
