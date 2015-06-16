package com.twu.biblioteca;

import java.util.ArrayList;

// gives all books details
public class LibrarySection<T extends Item> {


    private ArrayList<T> availableItems;
    private ArrayList<T> issuedItems;

    public LibrarySection(ArrayList<T> availableItems, ArrayList<T> issuedItems) {

        this.availableItems = availableItems;
        this.issuedItems = issuedItems;
    }

    @Override
    public String toString() {
        String result = "";
        for (T item : availableItems) {
            result += item.toString() + "\n";
        }
        return result;
    }

    public boolean checkout(String otherBook) {
        ArrayList<T> searchResult = search(otherBook, availableItems);
        for (T book : searchResult) {
            issuedItems.add(book);
            availableItems.remove(book);
            return true;
        }

        return false;
    }

    private ArrayList<T> search(String otherBook, ArrayList<T> bookList) {
        ArrayList<T> resultBooks = new ArrayList<T>();

        for (T item : bookList) {
            if (item.match(otherBook)){
                resultBooks.add(item);

            }
        }
        return resultBooks;
    }

    public boolean returnBook(String otherBook) {
        ArrayList<T> searchResult = search(otherBook, issuedItems);
        for (T book : searchResult) {
            availableItems.add(book);
            issuedItems.remove(book);
            return true;
        }

        return false;
    }
}
