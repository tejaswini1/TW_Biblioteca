package com.twu.biblioteca;

public class ReturnBook implements MenuActionPerformable {

    private ItemController itemsController;
    private LibrarySection librarySection;
    private CheckoutHistory checkoutHistory;

    public ReturnBook(ItemController itemsController, LibrarySection librarySection, CheckoutHistory checkoutHistory){
        this.itemsController = itemsController;
        this.librarySection = librarySection;
        this.checkoutHistory = checkoutHistory;
    }



    public void execute(){}
    public void execute1(String loginId) {
        itemsController.returnItem(librarySection, Messages.BOOK_RETURN_SUCCESSFUL, Messages.BOOK_RETURN_UNSUCCESSFUL, loginId, checkoutHistory);
    }
}
