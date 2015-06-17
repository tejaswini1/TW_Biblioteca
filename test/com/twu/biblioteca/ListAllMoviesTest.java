package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ListAllMoviesTest {

    @Test
    public void shouldCallMethodToListMoviessOnConsole() {
        MoviesController moviesController = mock(MoviesController.class);
        ListAllMovies listAllMovies = new ListAllMovies(moviesController);

        listAllMovies.execute();

        verify(moviesController, times(1)).listAllMovies();
    }



}