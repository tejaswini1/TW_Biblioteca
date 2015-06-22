package com.twu.biblioteca.MenuActions;

import com.twu.biblioteca.Controllers.ItemController;
import com.twu.biblioteca.LibrarySection;
import com.twu.biblioteca.Messages;

public class CheckoutMovie implements MenuActionPerformable {

    private ItemController itemController;
    private LibrarySection librarySection;


    public CheckoutMovie(ItemController itemController, LibrarySection librarySection){
        this.itemController = itemController;
        this.librarySection = librarySection;

    }

    public void execute(String loginId){
        itemController.checkout(librarySection, Messages.MOVIE_CHECKOUT_SUCCESSFUL, Messages.MOVIE_CHECKOUT_UNSUCCESSFUL, loginId);
    }
}
