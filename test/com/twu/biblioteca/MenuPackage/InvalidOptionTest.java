package com.twu.biblioteca.MenuPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class InvalidOptionTest {

    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void shouldDisplayMessageOnConsole() {
        InvalidOption invalidOption = new InvalidOption();
        invalidOption.execute();

        assertEquals(" Type a Valid Option ..\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);

    }
}