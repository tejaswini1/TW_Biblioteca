package com.twu.biblioteca;

public class ReturnMovie implements MenuActionPerformable{

    private MoviesController moviesController;

    public ReturnMovie(MoviesController moviesController){
        this.moviesController = moviesController;

    }


    @Override
    public void execute() {
        moviesController.returnMovie();
    }
}
