package com.twu.biblioteca;

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
        if(librarySection.checkout(nameOfBook))
            bibliotecaView.display(Messages.MOVIE_CHECKOUT_SUCCESSFUL);
        else
            bibliotecaView.display(Messages.MOVIE_CHECKOUT_UNSUCCESSFUL);
    }


    public void returnMovie(){
        String nameOfMovie = bibliotecaView.read();
        if(librarySection.returnItem(nameOfMovie))
            bibliotecaView.display(Messages.MOVIE_RETURN_SUCCESSFUL);
        else
            bibliotecaView.display(Messages.MOVIE_RETURN_UNSUCCESSFUL);

    }


}
