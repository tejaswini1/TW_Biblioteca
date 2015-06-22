package com.twu.biblioteca;

import com.twu.biblioteca.Models.Movie;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void shouldReturnMovieDetails(){
        Movie book = new Movie("movie1", "12Feb2000", "xyz", "unrated");

        String actualDetails = book.toString();
        assertThat(actualDetails,is(equalTo("movie1, 12Feb2000, xyz, unrated")));
    }

    @Test
    public void shouldReturnTrueIfNameOfBookIsSame(){
        Movie movie = new Movie("abc", "xyz", "12Oct", "unrated");

        boolean isEqual = movie.match("abc");

        assertEquals(true, isEqual);
    }


    @Test
    public void shouldReturnFalseIfNameOfBookIsSame(){
        Movie movie = new Movie("abc", "xyz", "12Oct", "3");

        boolean isEqual = movie.equals(new Movie("xyz", "xyz", "12Oct", "3"));

        assertEquals(false, isEqual);
    }

}