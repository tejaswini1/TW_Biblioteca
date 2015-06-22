package com.twu.biblioteca;

import com.twu.biblioteca.Dispatchers.ItemController;
import com.twu.biblioteca.MenuActions.CheckoutBook;
import com.twu.biblioteca.MenuActions.CheckoutHistory;
import com.twu.biblioteca.Models.Book;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckoutBookTest {
    @Test
    public void shouldCallExecuteMethodOfBooksController() {
        
        ItemController itemControllerStub = mock(ItemController.class);
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        availableBooks.add(new Book("b1", "a1", "12jan"));
        CheckoutHistory checkoutHistoryStub = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySectionBooks = new LibrarySection<Book>(availableBooks, new ArrayList<Book>(), checkoutHistoryStub);
        CheckoutBook checkoutBook = new CheckoutBook(itemControllerStub, librarySectionBooks);

        checkoutBook.execute("login id");

        verify(itemControllerStub, times(1)).checkout(librarySectionBooks, Messages.BOOK_CHECKOUT_SUCCESSFUL, Messages.BOOK_CHECKOUT_UNSUCCESSFUL, "login id");
    }

}