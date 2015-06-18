package com.twu.biblioteca;

import org.junit.Test;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class MenuControllerTest {

    @Test
    public void shouldCallAppropriateMenuOption() {
        Menu menu = mock(Menu.class);
        MenuController menuController = new MenuController(menu);

        menuController.selectOption(1, "login");

        verify(menu, times(1)).compute(1, "login");
    }


}