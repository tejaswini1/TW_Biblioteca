package com.twu.biblioteca;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BibliotecaViewTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
     ByteArrayInputStream inputStream ;


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintWelcomeMessage(){
        BibliotecaView bibliotecaView = new BibliotecaView(new Scanner(System.in));

        bibliotecaView.display(Messages.WELCOME_MESSAGE);

        assertEquals(" Welcome to biblioteca \n", outContent.toString());

    }

    @Test
    public void shouldTakeInputFromConsole(){
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);
        when(bibliotecaView.read())
                .thenReturn("hello");
        String input = "hello";
        inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        String actual = bibliotecaView.read();

        assertEquals("hello", actual);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}