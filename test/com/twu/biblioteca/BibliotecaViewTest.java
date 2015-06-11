package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class BibliotecaViewTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


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

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}