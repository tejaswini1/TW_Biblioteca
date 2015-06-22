package com.twu.biblioteca.MenuActions;

import com.twu.biblioteca.Dispatchers.ItemController;
import com.twu.biblioteca.LibrarySection;
import com.twu.biblioteca.InputOutputHandler.Messages;

public class ReturnBook implements MenuActionPerformable {

    private ItemController itemsController;
    private LibrarySection librarySection;


    public ReturnBook(ItemController itemsController, LibrarySection librarySection ){
        this.itemsController = itemsController;
        this.librarySection = librarySection;

    }

    public void execute(String loginId) {
        itemsController.returnItem(librarySection, Messages.BOOK_RETURN_SUCCESSFUL, Messages.BOOK_RETURN_UNSUCCESSFUL, loginId);
    }
}
