package com.twu.biblioteca;

public class MenuController {
    private BibliotecaView bibliotecaView;
    private Menu menu;

    public MenuController(BibliotecaView bibliotecaView, Menu menu) {
        this.bibliotecaView = bibliotecaView;
        this.menu = menu;
    }



    public void selectOption(int option, String loginID){
        menu.compute(option, loginID);
    }


}
