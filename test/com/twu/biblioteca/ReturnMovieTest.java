package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnMovieTest {

    @Test
    public void shouldCallMethodOfMovieControllerToReturnBook(){

        ItemController itemController = mock(ItemController.class);
        ArrayList<Movie> available = new ArrayList<Movie>();
        available.add(new Movie("m1", "a1", "13oct", "unrated"));

        LibrarySection librarySection = new LibrarySection(new ArrayList(), available);

        ReturnMovie returnMovie = new ReturnMovie(itemController, librarySection);

        returnMovie.execute();

        verify(itemController, times(1)).returnItem(librarySection, Messages.MOVIE_RETURN_SUCCESSFUL, Messages.MOVIE_RETURN_UNSUCCESSFUL);
    }

}