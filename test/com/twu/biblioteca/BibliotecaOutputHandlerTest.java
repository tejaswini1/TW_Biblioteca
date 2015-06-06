package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BibliotecaOutputHandlerTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }



    @Test
    public void shouldPrintWelcomeMessage(){
        Biblioteca bibliotecaStub = mock(Biblioteca.class);
        when(bibliotecaStub.welcomeMessage())
                .thenReturn("Welcome B");

        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.displayWelcomeMessage(bibliotecaStub);

        assertEquals("Welcome B\n", outContent.toString());

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


}
