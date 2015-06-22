package com.twu.biblioteca;

import com.twu.biblioteca.MenuActions.CheckoutHistory;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class LibrarySectionTest {


    @Test
    public void shouldPrintSuccessfulMessageForSuccessfulCheckout(){
        ArrayList booksList = new ArrayList();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection = new LibrarySection<Book>(booksList, new ArrayList<Book>(), checkoutHistory);


        String actual = librarySection.checkout("Os", Messages.BOOK_CHECKOUT_SUCCESSFUL, Messages.BOOK_CHECKOUT_UNSUCCESSFUL, "login id");


        assertEquals(Messages.BOOK_CHECKOUT_SUCCESSFUL, actual);
    }

    @Test
    public void shouldPrintUnSuccessfulMessageForUnSuccessfulCheckout(){
        ArrayList booksList = new ArrayList();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection = new LibrarySection<Book>(booksList, new ArrayList<Book>(), checkoutHistory);

        String actualBooleanValue = librarySection.checkout("cn", Messages.BOOK_CHECKOUT_SUCCESSFUL, Messages.BOOK_CHECKOUT_UNSUCCESSFUL, "login_id");


        assertEquals(Messages.BOOK_CHECKOUT_UNSUCCESSFUL, actualBooleanValue);
    }

    @Test
    public void shouldPrintSuccessfulMessageForSuccessfulReturn(){
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection = new LibrarySection<Book>(new ArrayList<Book>(), booksList, checkoutHistory);


        String actual = librarySection.returnItem("Java", Messages.BOOK_RETURN_SUCCESSFUL, Messages.BOOK_RETURN_UNSUCCESSFUL, "login");


        assertEquals(Messages.BOOK_RETURN_SUCCESSFUL, actual);
    }


    @Test
    public void shouldPrintUnSuccessfulMessageForSuccessfulReturn(){
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection = new LibrarySection<Book>(new ArrayList<Book>(), booksList, checkoutHistory);


        String actual = librarySection.returnItem("cn", Messages.BOOK_RETURN_SUCCESSFUL, Messages.BOOK_RETURN_UNSUCCESSFUL, "login id");


        assertEquals(Messages.BOOK_RETURN_UNSUCCESSFUL, actual);
    }


    @Test
    public void shouldPrintListOfAvailableBooks(){
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection = new LibrarySection<Book>( booksList, new ArrayList<Book>(), checkoutHistory);


        String actual = librarySection.toString();


        assertEquals("Java, Jones, 21Feb2019\nOs, Jones, 21Feb2019\n", actual);
    }

}
