package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnBookTest {

    @Test
    public void shouldCallMethodOfBookControllerToReturnBook(){

        BooksController booksControllerStub = mock(BooksController.class);
        ReturnBook returnBook = new ReturnBook(booksControllerStub);

        returnBook.execute();

        verify(booksControllerStub, times(1)).returnBook();
    }

}