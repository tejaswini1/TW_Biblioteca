package com.twu.biblioteca;

import java.awt.event.ActionListener;
import java.util.HashMap;

public class Menu {

    HashMap<String, ActionListener> menuItems = new HashMap<String, ActionListener>();

    public Menu(HashMap<String, ActionListener> menuItems){
            this.menuItems = menuItems;
    }

}
