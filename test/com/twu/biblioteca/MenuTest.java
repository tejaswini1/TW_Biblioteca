//package com.twu.biblioteca;
//
//import org.junit.Test;
//import org.mockito.Mockito;
//import java.util.HashMap;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;
//
//
//public class MenuTest {
//
//    @Test
//    public void shouldCallAppropriateClassMethod(){
//        HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();
//        ListAllItems listAllItems = mock(ListAllItems.class);
//        menuItems.put(1, listAllItems);
//        CheckoutBook checkoutBook = mock(CheckoutBook.class);
//        Menu menu = new Menu(menuItems,checkoutBook);
//
//
//        menu.compute(1);
//
//        verify(listAllItems, Mockito.times(1)).execute();
//    }
//
//
//
//    @Test
//    public void shouldCallInvalidClassMethodIfUserSpecifiesWrongOption(){
//        HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();
//        ListAllItems listAllItems = mock(ListAllItems.class);
//        InvalidOption invalidOptionStub = mock(InvalidOption.class);
//        menuItems.put(1, listAllItems);
//        menuItems.put(7, invalidOptionStub);
//
//        Menu menu = new Menu(menuItems);
//
//
//        menu.compute(8);
//
//        verify(invalidOptionStub, Mockito.times(1)).execute();
//    }
//
//
//}
