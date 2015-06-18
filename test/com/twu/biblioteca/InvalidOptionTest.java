package com.twu.biblioteca;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.InvalidOption;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class InvalidOptionTest {


    @Test
    public void shouldDisplayInvalidMessageOnConsole() {
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);
        InvalidOption invalidOption = new InvalidOption(bibliotecaView);

        invalidOption.execute("login id");

        verify(bibliotecaView, times(1)).display(anyString());
    }


}