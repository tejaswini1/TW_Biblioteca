package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.Messages;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class InvalidOptionTest {




    @Test
    public void shouldDisplayInvalidMessageOnConsole() {
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);
        InvalidOption invalidOption =new InvalidOption(bibliotecaView);

        invalidOption.execute();

        verify(bibliotecaView, times(1)).display(Messages.INVALID_MESSAGE);
    }


}