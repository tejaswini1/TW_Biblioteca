package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class LogoutTest {

    @Test
    public void shouldCallBibliotecaAppsStartMethod(){
        BibliotecaApp bibliotecaAppStub = mock(BibliotecaApp.class);
        Logout logout = new Logout(bibliotecaAppStub);

        logout.execute("teju-123");

        verify(bibliotecaAppStub, times(1)).start();
    }
}