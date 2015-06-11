package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class MenuTest {

    @Test
    public void shouldCallAppropriateClassMethod(){
        HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();
        ListAllBooks listAllBooks = mock(ListAllBooks.class);
        menuItems.put(1, listAllBooks);
        Menu menu = new Menu(menuItems);


        menu.compute(1);

        verify(listAllBooks, Mockito.times(1)).execute();
    }


}
