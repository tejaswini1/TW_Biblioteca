package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class MenuTest {


    @Test
    public void shouldDisplayMenuItems() {
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);
        HashMap<String, MenuActionPerformable> menuItems = new HashMap<String, MenuActionPerformable>();
        Menu menu = new Menu(menuItems, bibliotecaView);

        menu.displayItems();

        verify(bibliotecaView, times(1)).display(anyString());
    }

}
