package com.twu.biblioteca;

import com.twu.biblioteca.InputOutputHandler.BibliotecaView;
import com.twu.biblioteca.MenuActions.CheckoutHistory;
import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Models.Item;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class CheckoutHistoryTest {

    @Test
    public void shouldDisplayCheckoutHistory(){
        HashMap<String, ArrayList<Item>> checkoutHistoryList = new HashMap<String, ArrayList<Item>>();
        checkoutHistoryList.put("teju", new ArrayList<Item>());
        checkoutHistoryList.put("sowmya", new ArrayList<Item>());
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutHistoryList, bibliotecaView);
        checkoutHistory.add("teju", new Book("java", "a1", "12feb"));

        checkoutHistory.execute("login-id");

        Mockito.verify(bibliotecaView, times(1)).display("User : teju\njava, a1, 12feb\n\n");

    }


    @Test
    public void shouldDisplayCheckoutHistoryForMoreThanOneBook(){
        HashMap<String, ArrayList<Item>> checkoutHistoryList = new HashMap<String, ArrayList<Item>>();
        checkoutHistoryList.put("teju", new ArrayList<Item>());
        checkoutHistoryList.put("sowmya", new ArrayList<Item>());
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutHistoryList, bibliotecaView);
        checkoutHistory.add("teju", new Book("java", "a1", "12feb"));
        checkoutHistory.add("teju", new Book("os", "a4", "12feb"));

        checkoutHistory.execute("login id");

        Mockito.verify(bibliotecaView, times(1)).display(anyString());

    }

    @Test
    public void shouldDisplayItemsWhichAreNotRemoved(){
        HashMap<String, ArrayList<Item>> checkoutHistoryList = new HashMap<String, ArrayList<Item>>();
        checkoutHistoryList.put("teju", new ArrayList<Item>());
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);
        Book book = new Book("java", "a1", "12feb");

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutHistoryList, bibliotecaView);
        checkoutHistory.add("teju", book);
        checkoutHistory.add("teju", new Book("os", "a4", "12feb"));
        checkoutHistory.remove("teju", book);

        checkoutHistory.execute("teju");

        Mockito.verify(bibliotecaView, times(1)).display("User : teju\nos, a4, 12feb\n\n");

    }

}