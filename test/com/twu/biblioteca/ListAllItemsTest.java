package com.twu.biblioteca;



import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class ListAllItemsTest {


    @Test
    public void shouldCallMethodToListBooksOnConsole() {
        ItemController itemsController = mock(ItemController.class);
        ArrayList<Book> availableBook = new ArrayList<Book>();
        availableBook.add(new Book("book1", "author1", "12Feb"));
        availableBook.add(new Book("book2", "author2", "13Jan"));
        LibrarySection<Book> librarySection = new LibrarySection<Book>(availableBook, new ArrayList<Book>());
        ListAllItems listAllItems = new ListAllItems(itemsController, librarySection);

        listAllItems.execute();

        verify(itemsController, times(1)).listAllItems(librarySection);
    }


}
