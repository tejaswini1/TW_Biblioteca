package com.twu.biblioteca;

public class CheckoutMovie implements MenuActionPerformable{

    private ItemController itemController;
    private LibrarySection librarySection;

    public CheckoutMovie(ItemController itemController, LibrarySection librarySection){
        this.itemController = itemController;
        this.librarySection = librarySection;

    }

    public void execute(){
        itemController.checkout(librarySection, Messages.MOVIE_CHECKOUT_SUCCESSFUL, Messages.MOVIE_CHECKOUT_UNSUCCESSFUL);
    }
}
