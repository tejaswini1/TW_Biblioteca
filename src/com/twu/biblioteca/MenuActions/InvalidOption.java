package com.twu.biblioteca.MenuActions;

import com.twu.biblioteca.InputOutputHandler.BibliotecaView;
import com.twu.biblioteca.Messages;

public class InvalidOption implements MenuActionPerformable {

    private BibliotecaView bibliotecaView;
    public InvalidOption(BibliotecaView bibliotecaView){
        this.bibliotecaView = bibliotecaView ;
    }

    public void execute(String loginId){
         bibliotecaView.display(Messages.INVALID_MESSAGE);
    }
}
