package com.twu.biblioteca;

public class ListAllMovies implements MenuActionPerformable{
    private MoviesController moviesController;

    public ListAllMovies(MoviesController moviesController) {
        this.moviesController = moviesController;
    }


    public void execute() {
        moviesController.listAllMovies();
    }
}
