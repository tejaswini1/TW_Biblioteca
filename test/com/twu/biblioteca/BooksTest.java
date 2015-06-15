package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void shouldReturnBookList(){
        HashMap<Book, Boolean> books = new HashMap<Book, Boolean>();
        books.put(new Book("Java", "Jones", "21Feb2019"), true);
        Books book = new Books(books);

        String expectedList = "Java, Jones, 21Feb2019\n";

        String actualList = book.toString();

        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnBookListWhichareNotCheckedOut(){
        HashMap<Book, Boolean> books = new HashMap<Book, Boolean>();
        books.put(new Book("Java", "Jones", "21Feb2019"), true);
        books.put(new Book("Os", "Jones", "21Feb2019"), false);
        Books book = new Books(books);

        String expectedList = "Java, Jones, 21Feb2019\n";

        String actualList = book.toString();

        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnTrueIfBookIsPresent(){
        HashMap<Book, Boolean> booksList = new HashMap<Book, Boolean>();
        booksList.put(new Book("Java", "Jones", "21Feb2019"), true);
        booksList.put(new Book("Os", "Jones", "21Feb2019"), false);
        Books books = new Books(booksList);

        boolean actualBooleanValue = books.checkout(new Book("Os", "Jones", "21Feb2019"));


        assertEquals(false, actualBooleanValue);
    }

    @Test
    public void shouldReturnTrueIfBookIsALreadyCheckedOut(){
        HashMap<Book, Boolean> booksList = new HashMap<Book, Boolean>();
        booksList.put(new Book("Java", "Jones", "21Feb2019"), true);
        booksList.put(new Book("Os", "Jones", "21Feb2019"), false);
        Books books = new Books(booksList);

        boolean actualBooleanValue = books.returnBook(new Book("Os", "Jones", "21Feb2019"));


        assertEquals(true, actualBooleanValue);
    }

    @Test
    public void shouldReturnFalseIfBookIsDoesNotBelongToLibrary(){
        HashMap<Book, Boolean> booksList = new HashMap<Book, Boolean>();
        booksList.put(new Book("Java", "Jones", "21Feb2019"), true);
        booksList.put(new Book("Os", "Jones", "21Feb2019"), true);
        Books books = new Books(booksList);

        boolean actualBooleanValue = books.returnBook(new Book("Os", "Jones", "21Feb2019"));


        assertEquals(false, actualBooleanValue);
    }
}
