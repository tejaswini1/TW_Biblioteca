package com.twu.biblioteca;

public class ItemController {

    private BibliotecaView bibliotecaView;


    public ItemController(BibliotecaView bibliotecaView) {
        this.bibliotecaView = bibliotecaView;
    }

    public void listAllItems(LibrarySection librarySection) {
        String data = librarySection.toString();
        bibliotecaView.display(data);
    }

    public void checkout(LibrarySection librarySection, String successMessage, String unsuccesfulMessage){
        String nameOfItem = bibliotecaView.read();
        if(librarySection.checkout(nameOfItem))
            bibliotecaView.display(successMessage);
        else
            bibliotecaView.display(unsuccesfulMessage);
    }

    public void returnItem(LibrarySection librarySection, String successMessage, String unsuccessfulMessge){
        String nameOfItem = bibliotecaView.read();
        if(librarySection.returnItem(nameOfItem))
            bibliotecaView.display(successMessage);
        else
            bibliotecaView.display(unsuccessfulMessge);
    }
}
