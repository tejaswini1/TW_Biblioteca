package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaView bibliotecaView;
    private MenuController menuController;
    private Authentication authentication;


    public BibliotecaApp(BibliotecaView bibliotecaView, MenuController menuController, Authentication authentication)  {

        this.bibliotecaView = bibliotecaView;
        this.menuController = menuController;
        this.authentication = authentication;

    }

    public void start() {
        int option;
        String role;
        String loginID;
        bibliotecaView.display(Messages.WELCOME_MESSAGE);

        while(true){
            bibliotecaView.display(Messages.LOGIN_MESSAGE);
            loginID = bibliotecaView.read();
            String password = bibliotecaView.read();
            role = authentication.validUser(loginID, password);

            if(!role.equals("Please Input Valid Username and password"))
                break;
            }


        do {
            bibliotecaView.display(Messages.MENU_ITEMS);
            if(role.equals("Librarian")) {
                bibliotecaView.display("8] Checkout History");
                bibliotecaView.display("9] Quit");
            }
            option = bibliotecaView.readInteger();
            menuController.selectOption(option, loginID);


        } while (option != 10);


    }
}
