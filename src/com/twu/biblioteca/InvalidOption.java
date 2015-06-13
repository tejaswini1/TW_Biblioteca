package com.twu.biblioteca;

public class InvalidOption implements MenuActionPerformable {

    private BibliotecaView bibliotecaView;
    public InvalidOption(BibliotecaView bibliotecaView){
        this.bibliotecaView = bibliotecaView ;
    }

    public void execute(){
         bibliotecaView.display(Messages.INVALID_MESSAGE);
    }
}
