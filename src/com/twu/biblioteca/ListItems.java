package com.twu.biblioteca;


public class ListItems implements MenuActionPerformable {
    private ItemController itemController;
    private LibrarySection librarySection;

    public ListItems(ItemController itemsController, LibrarySection librarySection) {
        this.itemController = itemsController;
        this.librarySection = librarySection;
    }

    public void execute(String loginID) {
        itemController.listAllItems(librarySection);
    }
}
