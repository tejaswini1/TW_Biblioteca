package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnMovieTest {

    @Test
    public void shouldCallMethodOfMovieControllerToReturnBook(){

        MoviesController moviesControllerStub = mock(MoviesController.class);
        ReturnMovie returnBook = new ReturnMovie(moviesControllerStub);

        returnBook.execute();

        verify(moviesControllerStub, times(1)).returnMovie();
    }

}