package com.twu.biblioteca;

public class CheckoutMovie implements MenuActionPerformable{

    private BibliotecaView bibliotecaView;
    private MoviesController moviesController;


    public CheckoutMovie(BibliotecaView bibliotecaView, MoviesController moviesController){
        this.bibliotecaView = bibliotecaView;
        this.moviesController = moviesController;

    }

    public void execute(){
        moviesController.checkout();
    }
}
