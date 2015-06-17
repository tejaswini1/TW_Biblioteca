package com.twu.biblioteca;


public class ListAllBooks implements MenuActionPerformable {
    private ItemController itemController;
    private LibrarySection librarySection;

    public ListAllBooks(ItemController itemsController, LibrarySection librarySection) {
        this.itemController = itemsController;
        this.librarySection = librarySection;
    }


    public void execute() {
        itemController.listAllItems(librarySection);
    }
}
