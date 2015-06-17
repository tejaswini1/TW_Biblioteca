package com.twu.biblioteca;

public class ReturnBook implements MenuActionPerformable {

    private ItemController itemsController;
    private LibrarySection librarySection;

    public ReturnBook(ItemController itemsController, LibrarySection librarySection){
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    @Override
    public void execute() {
        itemsController.returnItem(librarySection, Messages.BOOK_RETURN_SUCCESSFUL, Messages.BOOK_RETURN_UNSUCCESSFUL);
    }
}
