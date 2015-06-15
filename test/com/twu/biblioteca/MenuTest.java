package com.twu.biblioteca;

import com.twu.biblioteca.ListAllBooks;
import com.twu.biblioteca.Menu;
import com.twu.biblioteca.MenuActionPerformable;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.HashMap;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


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

    @Test
    public void shouldCallInvalidClassMethodIfUserSpecifiesWrongOption(){
        HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();
        ListAllBooks listAllBooks = mock(ListAllBooks.class);
        Quit quit = mock(Quit.class);
        menuItems.put(1, listAllBooks);
        menuItems.put(4, quit);

        Menu menu = new Menu(menuItems);


        menu.compute(7);

        verify(quit, Mockito.times(1)).execute();
    }


}
