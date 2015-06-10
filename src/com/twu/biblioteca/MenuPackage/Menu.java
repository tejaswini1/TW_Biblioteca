package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.Books;
import com.twu.biblioteca.BooksView;

import java.io.IOException;
import java.util.HashMap;

// handles work related to user and biblioteca system
public class Menu {


    HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();

    public Menu (){
        menuItems.put(1,new ListAllBooks(new BooksView(new Books())));
        menuItems.put(2,new InvalidOption());



    }
          public String display(){
              return "1] List Books";

          }

        public void select(MenuView menuView) throws IOException {
           int option = menuView.readOption();
            if(menuItems.get(option) == null)
                new InvalidOption().execute();
            else
                menuItems.get(option).execute();

        }

}
