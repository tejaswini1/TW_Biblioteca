//package com.twu.biblioteca;
//
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static junit.framework.TestCase.assertEquals;
//import static org.mockito.Mockito.*;
//
//public class BibliotecaAppTest {
//
//
//    @Test
//    public void shouldCallReadIntegerMethodInStartMethod() {
//        Authentication authenticationStub = mock(Authentication.class);
//        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
//        when(bibliotecaViewStub.readInteger())
//                .thenReturn(1, 7);
//        MenuController menuControllerStub = mock(MenuController.class);
//        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, menuControllerStub, authenticationStub);
//
//        bibliotecaApp.start();
//
//        verify(bibliotecaViewStub, times(2)).readInteger();
//    }
//
//
//    @Test
//    public void shouldCallMethodsInStartMethod() {
//        Authentication authenticationStub = mock(Authentication.class);
//        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
//        when(bibliotecaViewStub.readInteger())
//                .thenReturn(1, 7);
//        MenuController menuControllerStub = mock(MenuController.class);
//        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, menuControllerStub, authenticationStub);
//
//        bibliotecaApp.start();
//
//        verify(bibliotecaViewStub, times(2)).display(Messages.MENU_ITEMS);
//    }
//
//
////    @Test
////    public void shouldCallReadMethodForTakingLoginIDAndPassword() {
////        ArrayList<User> users = new ArrayList<User>();
////        users.add(new User("teju", "tejubhosle@gmail", 9850748390l, "pune-123", "teju", "user"));
////        Authentication authentication = new Authentication(users);
////        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
////        when(bibliotecaViewStub.read())
////                .thenReturn("pune-123", "teju");
////        MenuController menuControllerStub = mock(MenuController.class);
////        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, menuControllerStub, authentication);
////
////        bibliotecaApp.start();
////
////        String actualRole = authentication.validUser("pune-123", "teju");
////
////        assertEquals("user", actualRole);
////    }
//
//
//}