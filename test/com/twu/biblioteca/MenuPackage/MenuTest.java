//package com.twu.biblioteca.MenuPackage;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mockito;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.PrintStream;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//import static org.mockito.internal.verification.VerificationModeFactory.times;
//
//public class MenuTest {
//    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//
//    @Before
//    public void setUpStreams() {
//        System.setOut(new PrintStream(outContent));
//    }
//
//    @Test
//    public void shouldReturnMenuString() {
//        Menu menu = new Menu();
//
//        String actualMessage = menu.display();
//
//        assertThat(actualMessage, is(equalTo("Menu\n" + "1.List Books")));
//    }
//
//    @Test
//    public void shouldDispalyListOfBooksWhenListAllBooksIsSelected() throws IOException {
//        Menu menu = new Menu();
//        MenuView menuViewStub = mock(MenuView.class);
//        ListAllBooks listAllBooks = mock(ListAllBooks.class);
//        when(menuViewStub.readOption())
//                .thenReturn(1);
//        menu.select(menuViewStub);
//
//        Mockito.verify(listAllBooks, times(1)).execute();
//
////        assertEquals("Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n", outContent.toString());
//
//    }
//
//    @After
//    public void cleanUpStreams() {
//        System.setOut(null);
//    }
//}
