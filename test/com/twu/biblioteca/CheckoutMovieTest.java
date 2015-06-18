package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;


import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckoutMovieTest {

    @Test
    public void shouldCallExecuteMethodFromMoviesController() {
        ItemController itemController = mock(ItemController.class);
        ArrayList<Movie> availableMovies = new ArrayList<Movie>();
        availableMovies.add(new Movie("m1","12oct", "a1", "unrated"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection librarySection = new LibrarySection(availableMovies, new ArrayList(), checkoutHistory);

        CheckoutMovie checkoutMovie = new CheckoutMovie(itemController, librarySection);


        checkoutMovie.execute("login Id");

        verify(itemController, times(1)).checkout(librarySection, Messages.MOVIE_CHECKOUT_SUCCESSFUL, Messages.MOVIE_CHECKOUT_UNSUCCESSFUL, "login Id");
    }

}