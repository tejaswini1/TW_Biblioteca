package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Menu;

public class MenuController {

    private Menu menu;

    public MenuController( Menu menu) {
        this.menu = menu;
    }

    public void selectOption(String option, String loginID){
        menu.compute(option, loginID);
    }


}
