package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaView bibliotecaView;
    private BooksController booksController;
    private MenuController menuController;

    public BibliotecaApp(BibliotecaView bibliotecaView, BooksController booksController, MenuController menuController){

        this.bibliotecaView = bibliotecaView;
        this.booksController = booksController;
        this.menuController = menuController;
    }

    public void start(){
        bibliotecaView.display(Messages.WELCOME_MESSAGE);
        bibliotecaView.display(Messages.MENU_ITEMS);
        menuController.selectOption(bibliotecaView.readInteger());


    }
}
