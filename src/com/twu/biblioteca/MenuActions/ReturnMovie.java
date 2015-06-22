package com.twu.biblioteca.MenuActions;

import com.twu.biblioteca.Dispatchers.ItemController;
import com.twu.biblioteca.LibrarySection;
import com.twu.biblioteca.Messages;

public class ReturnMovie implements MenuActionPerformable {


    private ItemController itemController;
    private LibrarySection librarySection;


    public ReturnMovie(ItemController itemController, LibrarySection librarySection){
        this.itemController = itemController;
        this.librarySection = librarySection;

    }

    public void execute(String loginId){
        itemController.returnItem(librarySection, Messages.MOVIE_RETURN_SUCCESSFUL, Messages.MOVIE_RETURN_UNSUCCESSFUL, loginId);
    }
}
