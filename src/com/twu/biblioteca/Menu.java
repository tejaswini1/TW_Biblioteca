package com.twu.biblioteca;

import java.util.HashMap;

// handles work related to user and biblioteca system
public class Menu {

    private CheckoutBook checkoutBook;
    private ReturnBook returnBook;
    private HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();


    public Menu(HashMap<Integer, MenuActionPerformable> menuItems, CheckoutBook checkoutBook, ReturnBook returnBook) {
        this.menuItems = menuItems;
        this.checkoutBook = checkoutBook;
        this.returnBook = returnBook;
    }

    public void compute(int option, String loginId) {
        if (menuItems.get(option) == null)
            menuItems.get(10).execute();
        else if (option == 2)
            checkoutBook.execute1(loginId);
        else if (option == 3)
            returnBook.execute1(loginId);
            else
            menuItems.get(option).execute();
    }
}
