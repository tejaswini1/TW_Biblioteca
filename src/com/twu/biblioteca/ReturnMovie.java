package com.twu.biblioteca;

public class ReturnMovie implements MenuActionPerformable{


    private ItemController itemController;
    private LibrarySection librarySection;
    private CheckoutHistory checkoutHistory;

    public ReturnMovie(ItemController itemController, LibrarySection librarySection, CheckoutHistory checkoutHistory){
        this.itemController = itemController;


        this.librarySection = librarySection;
        this.checkoutHistory = checkoutHistory;
    }


    @Override
    public void execute() {
        //itemController.returnItem(librarySection, Messages.MOVIE_RETURN_SUCCESSFUL, Messages.MOVIE_RETURN_UNSUCCESSFUL);
    }

    public void execute1(String loginId){
        itemController.returnItem(librarySection, Messages.MOVIE_RETURN_SUCCESSFUL, Messages.MOVIE_RETURN_UNSUCCESSFUL, loginId, checkoutHistory);
    }
}
