package com.twu.biblioteca;

public class MenuController {

    private Menu menu;

    public MenuController( Menu menu) {
        this.menu = menu;
    }

    public void selectOption(int option, String loginID){
        menu.compute(option, loginID);
    }


}
