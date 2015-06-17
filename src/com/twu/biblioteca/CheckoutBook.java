package com.twu.biblioteca;

import java.awt.*;

public class CheckoutBook implements MenuActionPerformable {

    private LibrarySection librarySection;
    private ItemController itemController;


    public CheckoutBook( ItemController itemController, LibrarySection librarySection){
        this.itemController = itemController;

        this.librarySection = librarySection;
    }

    public void execute(){
        itemController.checkout(librarySection, Messages.BOOK_CHECKOUT_SUCCESSFUL, Messages.BOOK_CHECKOUT_UNSUCCESSFUL);
    }
}
