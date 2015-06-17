package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaView bibliotecaView;
    private MenuController menuController;

    public BibliotecaApp(BibliotecaView bibliotecaView, MenuController menuController) {

        this.bibliotecaView = bibliotecaView;
        this.menuController = menuController;
    }

    public void start() {
        bibliotecaView.display(Messages.WELCOME_MESSAGE);
        int option;

        do {
            bibliotecaView.display(Messages.MENU_ITEMS);
            option = bibliotecaView.readInteger();
            menuController.selectOption(option);

        } while (option != 6);


    }
}
