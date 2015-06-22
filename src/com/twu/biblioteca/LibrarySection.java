package com.twu.biblioteca;

import com.twu.biblioteca.MenuActions.CheckoutHistory;
import com.twu.biblioteca.Models.Item;

import java.util.ArrayList;

// gives all books details
public class LibrarySection<T extends Item> {


    private ArrayList<T> availableItems;
    private ArrayList<T> issuedItems;
    private CheckoutHistory checkoutHistory;


    public LibrarySection(ArrayList<T> availableItems, ArrayList<T> issuedItems, CheckoutHistory checkoutHistory) {

        this.availableItems = availableItems;
        this.issuedItems = issuedItems;
        this.checkoutHistory = checkoutHistory;
    }

    @Override
    public String toString() {
        String result = new String();
        for (T item : availableItems) {
            result += item.toString() + "\n";
        }
        return result;
    }

    public String checkout(String otherBook, String successfulMessage, String unsuccessfulMessage, String loginId) {
        ArrayList<T> searchResult = search(otherBook, availableItems);
        for (T item : searchResult) {
            issuedItems.add(item);
            availableItems.remove(item);

            checkoutHistory.add(loginId, item);
            return successfulMessage;
        }
        return unsuccessfulMessage;
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

    public String returnItem(String otherBook, String successfulMessage, String unsucessfulMessage, String loginId) {
        ArrayList<T> searchResult = search(otherBook, issuedItems);
        for (T item : searchResult) {
            availableItems.add(item);
            issuedItems.remove(item);

            checkoutHistory.remove(loginId, item);
            return successfulMessage;
        }
        return unsucessfulMessage;
    }
}
