package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.Messages;

public class InvalidOption implements MenuActionPerformable {

    private BibliotecaView bibliotecaView = new BibliotecaView();
    public InvalidOption(BibliotecaView bibliotecaView){
        this.bibliotecaView = bibliotecaView ;
    }

    public void execute(){
         bibliotecaView.display(Messages.INVALID_MESSAGE);
    }
}
