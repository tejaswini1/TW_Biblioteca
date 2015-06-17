package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckoutBookTest {
    @Test
    public void shouldCallExecuteMethodOfBooksController() {
        ItemController itemControllerStub = mock(ItemController.class);
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        availableBooks.add(new Book("b1", "a1", "12jan"));
        LibrarySection<Book> librarySectionBooks = new LibrarySection<Book>(availableBooks, new ArrayList<Book>());
        CheckoutBook checkoutBook = new CheckoutBook(itemControllerStub, librarySectionBooks);

        checkoutBook.execute();

        verify(itemControllerStub, times(1)).checkout(librarySectionBooks, Messages.BOOK_CHECKOUT_SUCCESSFUL, Messages.BOOK_CHECKOUT_UNSUCCESSFUL);
    }

}