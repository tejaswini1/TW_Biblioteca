package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaView bibliotecaView;
    private MenuController menuController;
    private Authentication authentication;

    public BibliotecaApp(BibliotecaView bibliotecaView, MenuController menuController, Authentication authentication) {

        this.bibliotecaView = bibliotecaView;
        this.menuController = menuController;
        this.authentication = authentication;
    }

    public void start() {
        int option;
        String role;
        bibliotecaView.display(Messages.WELCOME_MESSAGE);

        while(true){
            bibliotecaView.display(Messages.LOGIN_MESSAGE);
            String loginID = bibliotecaView.read();
            String password = bibliotecaView.read();
            role = authentication.validUser(loginID, password);

            if(role != "Please Input Valid Username and password")
                break;
            }


        do {
            bibliotecaView.display(Messages.MENU_ITEMS);
            option = bibliotecaView.readInteger();
            menuController.selectOption(option);
            if(role == "librarian")
                    bibliotecaView.display("8] Checkout History");

        } while (option != 7);


    }
}
