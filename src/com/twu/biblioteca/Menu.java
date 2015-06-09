package com.twu.biblioteca;

import java.io.IOException;
import java.util.HashMap;

// handles work related to user and biblioteca system
public class Menu {


    HashMap<Integer, MenuActionPerformable> menuItems = new HashMap<Integer, MenuActionPerformable>();

//    public Menu (){
//        menuItems.put(1,new ListAllBooks());
//        menuItems.put(2,new InvalidOtion());
//
//
//    }
          public String display(){
              return "1] List Books";

          }

//        public void select(MenuView menuView) throws IOException {
//           int option = menuView.readOption();
//             menuItems.get(option).compute();
//
//        }

}
