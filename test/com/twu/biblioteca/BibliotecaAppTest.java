package com.twu.biblioteca;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class BibliotecaAppTest {


    @Test
    public void shouldReturnWelcomeString(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        String actualMessage = bibliotecaApp.welcomeMessage();

        assertThat(actualMessage, is(equalTo("Welcome")));
    }

//    @Test
//    public void shouldDisplayMenuItems(){
//
//        BibliotecaApp bibliotecaApp = new BibliotecaApp();
//
//        String actualItem = bibliotecaApp.menu("List books");
//
//        assertThat(actualItem, is(equalTo("Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n")));
}
