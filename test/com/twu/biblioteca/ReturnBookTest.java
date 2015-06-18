package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnBookTest {

    @Test
    public void shouldCallMethodOfBookControllerToReturnBook(){

        ItemController itemControllerStub = mock(ItemController.class);
        ArrayList availableBooks = new ArrayList();
        availableBooks.add(new Book("book1", "author1", "12oct"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection = new LibrarySection<Book>(new ArrayList<Book>(), availableBooks, checkoutHistory);

        ReturnBook returnBook = new ReturnBook(itemControllerStub, librarySection);

        returnBook.execute("teju-123");

        verify(itemControllerStub, times(1)).returnItem(librarySection, Messages.BOOK_RETURN_SUCCESSFUL, Messages.BOOK_RETURN_UNSUCCESSFUL, "teju-123");
    }

}