package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckoutHistoryTest {

    @Test
    public void shouldDisplayCheckoutHistory(){
        HashMap<String, ArrayList<Book>> checkoutHistoryList = new HashMap<String, ArrayList<Book>>();
        checkoutHistoryList.put("teju", new ArrayList<Book>());
        checkoutHistoryList.put("sowmya", new ArrayList<Book>());

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutHistoryList);
        checkoutHistory.add("teju", new Book("java", "a1", "12feb"));

        String actual = checkoutHistory.display();

        assertEquals("teju java, a1, 12feb\n", actual);

    }

}