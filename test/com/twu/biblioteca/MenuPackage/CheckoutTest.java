package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckoutTest {
    @Test
    public void shouldTakeInputFromBibliotecView() {
        BibliotecaView bibliotecaView = mock(BibliotecaView.class);
        BooksController booksController = mock(BooksController.class);
        Checkout checkout = new Checkout(bibliotecaView, booksController);

        checkout.execute();

        verify(booksController, times(1)).checkout();
    }

}