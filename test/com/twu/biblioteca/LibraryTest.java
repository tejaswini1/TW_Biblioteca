package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

//    @Test
//    public void shouldReturnBookList(){
//        HashMap<Book, Boolean> books = new HashMap<Book, Boolean>();
//        books.put(new Book("Java", "Jones", "21Feb2019"), true);
//        Library book = new Library(books);
//
//        String expectedList = "Java, Jones, 21Feb2019\n";
//
//        String actualList = book.toString();
//
//        assertEquals(expectedList, actualList);
//    }
//
//    @Test
//    public void shouldReturnBookListWhichareNotCheckedOut(){
//        HashMap<Book, Boolean> books = new HashMap<Book, Boolean>();
//        books.put(new Book("Java", "Jones", "21Feb2019"), true);
//        books.put(new Book("Os", "Jones", "21Feb2019"), false);
//        Library book = new Library(books);
//
//        String expectedList = "Java, Jones, 21Feb2019\n";
//
//        String actualList = book.toString();
//
//        assertEquals(expectedList, actualList);
//    }
//
//    @Test
//    public void shouldReturnTrueIfBookIsPresent(){
//        HashMap<Book, Boolean> booksList = new HashMap<Book, Boolean>();
//        booksList.put(new Book("Java", "Jones", "21Feb2019"), true);
//        booksList.put(new Book("Os", "Jones", "21Feb2019"), false);
//        Library library = new Library(booksList);
//
//        boolean actualBooleanValue = library.checkout("Os");
//
//
//        assertEquals(false, actualBooleanValue);
//    }
//
//    @Test
//    public void shouldReturnTrueIfBookIsALreadyCheckedOut(){
//        HashMap<Book, Boolean> booksList = new HashMap<Book, Boolean>();
//        booksList.put(new Book("Java", "Jones", "21Feb2019"), true);
//        booksList.put(new Book("Os", "Jones", "21Feb2019"), false);
//        Library library = new Library(booksList);
//
//        boolean actualBooleanValue = library.returnBook("Os");
//
//
//        assertEquals(true, actualBooleanValue);
  //  }

    @Test
    public void shouldPrintSuccessfulMessageForSuccessfulCheckout(){
        ArrayList booksList = new ArrayList();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        Library library = new Library(booksList, new ArrayList<Book>());

        String actualBooleanValue = library.checkout("Os");


        assertEquals("Thank you! Enjoy the book", actualBooleanValue);
    }
}
