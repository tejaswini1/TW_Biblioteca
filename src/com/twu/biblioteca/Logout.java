package com.twu.biblioteca;

public class Logout implements MenuActionPerformable{

    private BibliotecaApp bibliotecaApp;

    public Logout(BibliotecaApp bibliotecaApp){
        this.bibliotecaApp = bibliotecaApp;
    }


    @Override
    public void execute() {
        bibliotecaApp.start();
    }
}
