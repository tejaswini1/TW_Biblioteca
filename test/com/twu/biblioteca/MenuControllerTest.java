package com.twu.biblioteca;

import com.twu.biblioteca.Controllers.MenuController;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class MenuControllerTest {

    @Test
    public void shouldCallAppropriateMenuOption() {
        Menu menu = mock(Menu.class);
        MenuController menuController = new MenuController(menu);

        menuController.selectOption("Login", "login");

        verify(menu, times(1)).compute("Login", "login");
    }


}