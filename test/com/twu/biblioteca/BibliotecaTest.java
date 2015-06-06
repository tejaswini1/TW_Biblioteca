package com.twu.biblioteca;


import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BibliotecaTest {


    @Test
    public void shouldReturnWelcomeString(){
        Biblioteca biblioteca = new Biblioteca();

        String actualMessage = biblioteca.welcomeMessage();

        assertThat(actualMessage, is(equalTo("Welcome")));
    }
}
