package com.twu.biblioteca;

import com.twu.biblioteca.Dispatchers.ItemController;
import com.twu.biblioteca.InputOutputHandler.BibliotecaView;
import com.twu.biblioteca.InputOutputHandler.Messages;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ItemControllerTest {

    @Test
    public void shouldCalltoStringMethodForListingAllItems() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        ItemController itemController = new ItemController(bibliotecaViewStub);
        LibrarySection librarySection = mock(LibrarySection.class);

        itemController.listAllItems(librarySection);

        verify(bibliotecaViewStub, times(1)).display(anyString());
    }


    @Test
    public void shouldCallCheckoutMethodFromLibrarySection() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        ItemController itemController = new ItemController(bibliotecaViewStub);
        LibrarySection librarySection = mock(LibrarySection.class);

        itemController.checkout(librarySection, Messages.MOVIE_CHECKOUT_SUCCESSFUL, Messages.MOVIE_CHECKOUT_UNSUCCESSFUL, "login Id");

        verify(librarySection, times(1)).checkout(anyString(), anyString(), anyString(), anyString());
    }


    @Test
    public void shouldCallReturnMethodFromLibrarySection() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        ItemController itemController = new ItemController(bibliotecaViewStub);
        LibrarySection librarySection = mock(LibrarySection.class);

        itemController.returnItem(librarySection, Messages.MOVIE_RETURN_SUCCESSFUL, Messages.MOVIE_RETURN_UNSUCCESSFUL, "loginId");

        verify(librarySection, times(1)).returnItem(anyString(), anyString(), anyString(), anyString());
    }

}