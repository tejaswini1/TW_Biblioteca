package com.twu.biblioteca;

public class MenuView {
    private Menu menu;

    public MenuView(Menu menu){
        this.menu = menu;
    }

    public void display(){
        System.out.println( menu.display());
    }
}
