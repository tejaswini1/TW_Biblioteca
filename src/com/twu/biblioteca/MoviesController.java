package com.twu.biblioteca;

import java.util.ArrayList;

public class MoviesController {
    private BibliotecaView bibliotecaView;
    private LibrarySection<Movie> librarySection;

    public MoviesController(BibliotecaView bibliotecaView, LibrarySection<Movie> librarySection) {
        this.bibliotecaView = bibliotecaView;
        this.librarySection = librarySection;
    }

    public void listAllMovies() {
        String data = librarySection.toString();
        bibliotecaView.display(data);
    }

    public void checkout(){
        String nameOfBook = bibliotecaView.read();
        bibliotecaView.display(librarySection.checkout(nameOfBook));
    }

    public void returnMovie(){
        String nameOfBook = bibliotecaView.read();
        bibliotecaView.display(librarySection.returnBook(nameOfBook));


    }
}
