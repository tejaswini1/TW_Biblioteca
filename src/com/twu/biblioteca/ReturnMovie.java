package com.twu.biblioteca;

public class ReturnMovie implements MenuActionPerformable{


    private ItemController itemController;
    private LibrarySection librarySection;

    public ReturnMovie(ItemController itemController, LibrarySection librarySection){
        this.itemController = itemController;


        this.librarySection = librarySection;
    }


    @Override
    public void execute() {
        itemController.returnItem(librarySection, Messages.MOVIE_RETURN_SUCCESSFUL, Messages.MOVIE_RETURN_UNSUCCESSFUL);
    }
}
