package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
public class ListBooksActionPermoreTest {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }


        @Test
        public void shouldDisplayListOfBooks(){
            ListBooksActionPerformer listAllBooks = new ListBooksActionPerformer();
            listAllBooks.execute();

            assertEquals("Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n", outContent.toString());
        }
        @After
        public void cleanUpStreams() {
            System.setOut(null);
        }

}
