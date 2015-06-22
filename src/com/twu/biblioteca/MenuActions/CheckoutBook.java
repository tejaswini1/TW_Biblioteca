package com.twu.biblioteca.MenuActions;

import com.twu.biblioteca.Dispatchers.ItemController;
import com.twu.biblioteca.LibrarySection;
import com.twu.biblioteca.Messages;

public class CheckoutBook implements MenuActionPerformable {

    private LibrarySection librarySection;
    private ItemController itemController;



    public CheckoutBook( ItemController itemController, LibrarySection librarySection){

        this.itemController = itemController;
        this.librarySection = librarySection;

    }


    public void execute(String loginId){

        itemController.checkout(librarySection, Messages.BOOK_CHECKOUT_SUCCESSFUL, Messages.BOOK_CHECKOUT_UNSUCCESSFUL, loginId);

    }
}
