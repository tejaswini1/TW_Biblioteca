package com.twu.biblioteca;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckoutBookTest {
    @Test
    public void shouldTakeInputFromBibliotecView() {
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);
        BooksController booksController = mock(BooksController.class);
        CheckoutBook checkoutBook = new CheckoutBook(bibliotecaView, booksController);

        checkoutBook.execute();

        verify(booksController, times(1)).checkout();
    }

}