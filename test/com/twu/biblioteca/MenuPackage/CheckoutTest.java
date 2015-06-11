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
        Checkout checkout = new Checkout(bibliotecaView);

        checkout.execute();

        verify(bibliotecaView, times(1)).read();
    }

}