package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MenuTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
     public void shouldDisplayMenu(){
         Menu menu = new Menu();
         String actualMenu = menu.display();

         assertThat(actualMenu, is(equalTo("1] List Books")));
     }
//
//    @Test
//    public void shouldDispalyListOfBooksWhen() throws IOException{
//        Menu menu = new Menu();
//         MenuView menuViewStub = mock(MenuView.class);
//        when(menuViewStub.readOption())
//                .thenReturn(1);
//
//        String actual = menu.select(menuViewStub);
//
//        String expectedList = "Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n";
//        assertEquals(expectedList, actual);
//    }

    @Test
    public void shouldDispalyListOfBooksWhen1() throws IOException{
        Menu menu = new Menu();
        MenuView menuViewStub = mock(MenuView.class);
        when(menuViewStub.readOption())
                .thenReturn(1);
        menu.select(menuViewStub);

        assertEquals("Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n", outContent.toString());

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
