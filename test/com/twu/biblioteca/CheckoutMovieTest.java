package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckoutMovieTest {

    @Test
    public void shouldCallExecuteMethodFromMoviesController() {
        MoviesController moviesController = mock(MoviesController.class);
        CheckoutMovie checkoutMovie = new CheckoutMovie(moviesController);

        checkoutMovie.execute();

        verify(moviesController, times(1)).checkout();
    }

}