package com.twu.biblioteca;

import com.twu.biblioteca.MenuActions.MenuActionPerformable;

import java.util.HashMap;

// handles work related to user and biblioteca system
public class Menu {

    private HashMap<String, MenuActionPerformable> menuItems = new HashMap<String, MenuActionPerformable>();

    public Menu(HashMap<String, MenuActionPerformable> menuItems) {
        this.menuItems = menuItems;
    }

    public void compute(String option, String loginId) {
        if (menuItems.get(option) == null)
            menuItems.get("Invalid Option").execute(loginId);
        else
            menuItems.get(option).execute(loginId);
    }
}
