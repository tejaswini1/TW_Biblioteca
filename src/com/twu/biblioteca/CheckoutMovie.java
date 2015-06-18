package com.twu.biblioteca;

public class CheckoutMovie implements MenuActionPerformable{

    private ItemController itemController;
    private LibrarySection librarySection;
    private CheckoutHistory checkoutHistory;

    public CheckoutMovie(ItemController itemController, LibrarySection librarySection, CheckoutHistory checkoutHistory){
        this.itemController = itemController;
        this.librarySection = librarySection;
        this.checkoutHistory = checkoutHistory;
    }

    public void execute(){
      //  itemController.checkout(librarySection, Messages.MOVIE_CHECKOUT_SUCCESSFUL, Messages.MOVIE_CHECKOUT_UNSUCCESSFUL);
    }

    public void execute1(String loginId){

        itemController.checkout(librarySection, Messages.MOVIE_CHECKOUT_SUCCESSFUL, Messages.MOVIE_CHECKOUT_UNSUCCESSFUL, loginId, checkoutHistory);

    }
}
