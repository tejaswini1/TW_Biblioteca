package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuViewTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test

    public void shouldDisplayMenuList(){
        Menu menuStub = mock(Menu.class);
        when(menuStub.display())
                .thenReturn("1] List Of Books");

        MenuView menuView = new MenuView(menuStub);
        menuView.display();

        assertEquals("1] List Of Books\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
