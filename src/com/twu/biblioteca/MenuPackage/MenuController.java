package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.Messages;

public class MenuController {
    private BibliotecaView bibliotecaView;
    private Menu menu;

    public MenuController(BibliotecaView bibliotecaView, Menu menu) {
        this.bibliotecaView = bibliotecaView;
        this.menu = menu;
    }



    public void selectOption(){
        menu.compute(bibliotecaView.readInt());
    }
}
