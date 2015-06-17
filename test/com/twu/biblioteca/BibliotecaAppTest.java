package com.twu.biblioteca;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class BibliotecaAppTest {


    @Test
    public void shouldCallReadIntegerMethodInStartMethod(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.readInteger())
                .thenReturn(1, 7);
        MenuController menuControllerStub = mock(MenuController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, menuControllerStub);

        bibliotecaApp.start();

        verify(bibliotecaViewStub, times(2)).readInteger();
    }



    @Test
    public void shouldCallMethodsInStartMethod(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.readInteger())
                .thenReturn(1, 7);
        MenuController menuControllerStub = mock(MenuController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, menuControllerStub);

        bibliotecaApp.start();

        verify(bibliotecaViewStub, times(2)).display(Messages.MENU_ITEMS);
    }


}