package com.twu.biblioteca;

import java.awt.*;

public class CheckoutBook implements MenuActionPerformable {

    private LibrarySection librarySection;
    private CheckoutHistory checkoutHistory;
    private ItemController itemController;



    public CheckoutBook( ItemController itemController, LibrarySection librarySection, CheckoutHistory checkoutHistory){

        this.itemController = itemController;
        this.librarySection = librarySection;
        this.checkoutHistory = checkoutHistory;
    }

    public void execute(){
        //itemController.checkout(librarySection, Messages.BOOK_CHECKOUT_SUCCESSFUL, Messages.BOOK_CHECKOUT_UNSUCCESSFUL, loginId, checkoutHistory);
    }

    public void execute1(String loginId){

        itemController.checkout(librarySection, Messages.BOOK_CHECKOUT_SUCCESSFUL, Messages.BOOK_CHECKOUT_UNSUCCESSFUL, loginId, checkoutHistory);

    }
}
