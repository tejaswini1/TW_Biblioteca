package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {
    @Test
    public void shouldReturnBookDetails(){
        Book book = new Book("Alchemist", "Paulo", "26Feb2000");

        String actualDetails = book.toString();
        assertThat(actualDetails,is(equalTo("Alchemist, Paulo, 26Feb2000")));
    }
}
