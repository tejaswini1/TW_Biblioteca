package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;

public class Checkout implements MenuActionPerformable {

    private BibliotecaView bibliotecaView;
    public Checkout(BibliotecaView bibliotecaView){
        this.bibliotecaView = bibliotecaView;
    }

    public void execute(){
        String book = bibliotecaView.read();
    }
}
