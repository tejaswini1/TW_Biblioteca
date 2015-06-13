package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import org.junit.Test;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class MenuControllerTest {

    @Test
    public void shouldCallAppropriateMenuOption() {
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);

        Menu menu = mock(Menu.class);
        MenuController menuController = new MenuController(bibliotecaView, menu);

        menuController.selectOption(1);

        verify(menu, times(1)).compute(anyInt());
    }


}