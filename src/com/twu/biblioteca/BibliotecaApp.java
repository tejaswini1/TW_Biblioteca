package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaView bibliotecaView;
    private MenuController menuController;
    private Users users;


    public BibliotecaApp(BibliotecaView bibliotecaView, MenuController menuController, Users users)  {

        this.bibliotecaView = bibliotecaView;
        this.menuController = menuController;
        this.users = users;

    }

    public void start() {
        int option;
        String role;
        String loginID;
        bibliotecaView.display(Messages.WELCOME_MESSAGE);

        while(true){
            bibliotecaView.display(Messages.LOGIN_MESSAGE);
            loginID = bibliotecaView.read();

            role = users.validUser(loginID, bibliotecaView.read());

            if(!role.equals("Please Input Valid Username and password"))
                break;
            }
            bibliotecaView.display(users.displayValidUser(loginID));

        do {
            bibliotecaView.display(Messages.MENU_ITEMS);
            if(role.equals("Librarian"))
                bibliotecaView.display(Messages.LIBRARIAN_MENU_ITEMS);

            option = bibliotecaView.readInteger();
            menuController.selectOption(option, loginID);

            } while (option != 7);


    }
}
