package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.LibrarySection;

public class ItemController {

    private BibliotecaView bibliotecaView;


    public ItemController(BibliotecaView bibliotecaView) {
        this.bibliotecaView = bibliotecaView;
    }

    public void listAllItems(LibrarySection librarySection) {
        String data = librarySection.toString();
        bibliotecaView.display(data);
    }

    public void checkout(LibrarySection librarySection, String successMessage, String unsuccesfulMessage, String loginID){
        String nameOfItem = bibliotecaView.read();
            bibliotecaView.display(librarySection.checkout(nameOfItem, successMessage, unsuccesfulMessage, loginID));
    }

    public void returnItem(LibrarySection librarySection, String successMessage, String unsuccessfulMessge, String loginID){
        String nameOfItem = bibliotecaView.read();
            bibliotecaView.display(librarySection.returnItem(nameOfItem, successMessage, unsuccessfulMessge, loginID));
    }
}
