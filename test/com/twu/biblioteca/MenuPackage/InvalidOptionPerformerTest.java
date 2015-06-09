package com.twu.biblioteca.MenuPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class InvalidOptionPerformerTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void shouldDisplayMessage() {
        InvalidOptionPerformer invalidOptionPerformer = new InvalidOptionPerformer();
        invalidOptionPerformer.execute();

        assertEquals(" Type a Valid Option ..\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);

    }
}