package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.HashMap;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class MenuTest {

    @Test
    public void shouldCallAppropriateClassMethod(){
        HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();
        ListAllItems listAllItems = mock(ListAllItems.class);
        menuItems.put(1, listAllItems);

        Menu menu = new Menu(menuItems);


        menu.compute(1, "teju-123");

        verify(listAllItems, Mockito.times(1)).execute("teju-123");
    }



    @Test
    public void shouldCallInvalidClassMethodIfUserSpecifiesWrongOption(){
        HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();
        ListAllItems listAllItems = mock(ListAllItems.class);
        InvalidOption invalidOptionStub = mock(InvalidOption.class);
        menuItems.put(1, listAllItems);
        menuItems.put(10, invalidOptionStub);

        Menu menu = new Menu(menuItems);


        menu.compute(10, "login");

        verify(invalidOptionStub, Mockito.times(1)).execute("login");
    }


}
