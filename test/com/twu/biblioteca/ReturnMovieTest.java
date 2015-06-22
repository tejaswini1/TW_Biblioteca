package com.twu.biblioteca;

import com.twu.biblioteca.Dispatchers.ItemController;
import com.twu.biblioteca.MenuActions.CheckoutHistory;
import com.twu.biblioteca.MenuActions.ReturnMovie;
import com.twu.biblioteca.Models.Movie;
import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnMovieTest {

    @Test
    public void shouldCallMethodOfMovieControllerToReturnBook(){

        ItemController itemController = mock(ItemController.class);
        ArrayList<Movie> available = new ArrayList<Movie>();
        available.add(new Movie("m1", "a1", "13oct", "unrated"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Movie> librarySection = new LibrarySection<Movie>(new ArrayList(), available, checkoutHistory);

        ReturnMovie returnMovie = new ReturnMovie(itemController, librarySection);

        returnMovie.execute("teju-123");

        verify(itemController, times(1)).returnItem(librarySection, Messages.MOVIE_RETURN_SUCCESSFUL, Messages.MOVIE_RETURN_UNSUCCESSFUL, "teju-123");
    }

}