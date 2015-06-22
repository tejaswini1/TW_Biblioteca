package com.twu.biblioteca.Dispatchers;

public class MenuController {

    private Menu menu;

    public MenuController( Menu menu) {
        this.menu = menu;
    }

    public void selectOption(String option, String loginID){
        menu.compute(option, loginID);
    }


}
