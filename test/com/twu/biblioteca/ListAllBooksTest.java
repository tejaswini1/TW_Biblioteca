package com.twu.biblioteca;


import com.twu.biblioteca.BooksController;
import com.twu.biblioteca.ListAllBooks;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class ListAllBooksTest {


    @Test
    public void shouldListBooksOnConsole() {
        BooksController booksController = mock(BooksController.class);
        ListAllBooks listAllBooks = new ListAllBooks(booksController);

        listAllBooks.execute();

        verify(booksController, times(1)).listAllBooks();
    }


}
