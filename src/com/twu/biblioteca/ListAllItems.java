package com.twu.biblioteca;


public class ListAllItems implements MenuActionPerformable {
    private ItemController itemController;
    private LibrarySection librarySection;

    public ListAllItems(ItemController itemsController, LibrarySection librarySection) {
        this.itemController = itemsController;
        this.librarySection = librarySection;
    }


    public void execute() {
        itemController.listAllItems(librarySection);
    }
}
