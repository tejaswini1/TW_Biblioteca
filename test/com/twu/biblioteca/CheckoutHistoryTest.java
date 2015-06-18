package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;

import static com.sun.javaws.JnlpxArgs.verify;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class CheckoutHistoryTest {

    @Test
    public void shouldDisplayCheckoutHistory(){
        HashMap<String, ArrayList<Book>> checkoutHistoryList = new HashMap<String, ArrayList<Book>>();
        checkoutHistoryList.put("teju", new ArrayList<Book>());
        checkoutHistoryList.put("sowmya", new ArrayList<Book>());
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutHistoryList, bibliotecaView);
        checkoutHistory.add("teju", new Book("java", "a1", "12feb"));

        checkoutHistory.execute();

        Mockito.verify(bibliotecaView, times(1)).display("User : teju\njava, a1, 12feb\n\n");

    }


    @Test
    public void shouldDisplayCheckoutHistoryForMoreThanOneBook(){
        HashMap<String, ArrayList<Book>> checkoutHistoryList = new HashMap<String, ArrayList<Book>>();
        checkoutHistoryList.put("teju", new ArrayList<Book>());
        checkoutHistoryList.put("sowmya", new ArrayList<Book>());
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutHistoryList, bibliotecaView);
        checkoutHistory.add("teju", new Book("java", "a1", "12feb"));
        checkoutHistory.add("teju", new Book("os", "a4", "12feb"));

        checkoutHistory.execute();

        Mockito.verify(bibliotecaView, times(1)).display(anyString());

    }

}