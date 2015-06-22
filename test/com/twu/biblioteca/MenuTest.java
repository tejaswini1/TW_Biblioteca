package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class MenuTest {

    @Test
    public void shouldCallAppropriateClassMethod(){
        HashMap<String, MenuActionPerformable> menuItems = new HashMap<String, MenuActionPerformable>();
        ListAllItems listAllItems = mock(ListAllItems.class);
        menuItems.put("List Books", listAllItems);
        Menu menu = new Menu(menuItems);

        menu.compute("List Books", "teju-123");

        verify(listAllItems, Mockito.times(1)).execute("teju-123");
    }

    @Test
    public void shouldCallInvalidClassMethodIfUserSpecifiesWrongOption(){
        HashMap<String , MenuActionPerformable> menuItems = new HashMap<String, MenuActionPerformable>();
        ListAllItems listAllItems = mock(ListAllItems.class);
        InvalidOption invalidOptionStub = mock(InvalidOption.class);
        menuItems.put("List Books", listAllItems);
        menuItems.put("Invalid Option", invalidOptionStub);
        Menu menu = new Menu(menuItems);

        menu.compute("List Food Items", "login-id");

        verify(invalidOptionStub, Mockito.times(1)).execute("login-id");
    }


}
