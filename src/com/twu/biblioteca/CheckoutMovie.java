package com.twu.biblioteca;

public class CheckoutMovie implements MenuActionPerformable{

    private MoviesController moviesController;


    public CheckoutMovie(MoviesController moviesController){
        this.moviesController = moviesController;

    }

    public void execute(){
        moviesController.checkout();
    }
}
