package com.twu.biblioteca;

import java.util.HashMap;

// handles work related to user and biblioteca system
public class Menu {


    private HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();


    public Menu(HashMap<Integer, MenuActionPerformable> menuItems) {
        this.menuItems = menuItems;
    }

    public void compute(int option) {
        if (menuItems.get(option) == null)
            menuItems.get(7).execute();
        else
            menuItems.get(option).execute();
    }


}
