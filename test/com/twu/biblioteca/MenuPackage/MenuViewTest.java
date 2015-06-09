package com.twu.biblioteca.MenuPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuViewTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
     ByteArrayInputStream byteArrayInputStream ;

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

    @Test
    public void shouldTakeOptionInputFromConsole() throws IOException {
        String inputData  ="1";
        byteArrayInputStream = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(byteArrayInputStream);

        int actualOption = new MenuView(new Menu()).readOption();
        assertThat(actualOption, is(equalTo(1)));
    }
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
