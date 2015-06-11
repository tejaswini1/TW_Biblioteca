package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import java.util.HashMap;

// handles work related to user and biblioteca system
public class Menu {


    private HashMap<String, MenuActionPerformable> menuItems = new HashMap<String, MenuActionPerformable>();
    private BibliotecaView bibliotecaView;

    public Menu(HashMap<String, MenuActionPerformable> menuItems, BibliotecaView bibliotecaView) {
        this.menuItems = menuItems;
        this.bibliotecaView = bibliotecaView;
    }


    public void displayItems(){
        String items = "1] List All Books\n 2] exit";
        bibliotecaView.display(items);
    }

}
