package com.twu.biblioteca;

import com.twu.biblioteca.MenuActions.MenuActionPerformable;

public class Logout implements MenuActionPerformable {

    private BibliotecaApp bibliotecaApp;

    public Logout(BibliotecaApp bibliotecaApp){
        this.bibliotecaApp = bibliotecaApp;
    }

    @Override
    public void execute(String loginId) {
        bibliotecaApp.start();
    }
}
