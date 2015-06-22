package com.twu.biblioteca;

import com.twu.biblioteca.Dispatchers.MenuController;
import com.twu.biblioteca.InputOutputHandler.BibliotecaView;
import com.twu.biblioteca.Validation.Users;

public class BibliotecaApp {

    private BibliotecaView bibliotecaView;
    private MenuController menuController;
    private Users users;


    public BibliotecaApp(BibliotecaView bibliotecaView, MenuController menuController, Users users) {

        this.bibliotecaView = bibliotecaView;
        this.menuController = menuController;

        this.users = users;
    }

    public void start() {
        String option = "";
        String loginID = "";
        String role = "";
        bibliotecaView.display(Messages.WELCOME_MESSAGE);

        while (!option.equals("Quit")) {
            bibliotecaView.display(Messages.INITIAL_MENU_ITEM);
            option = bibliotecaView.read();


            if (!option.equals("Login")) {
                menuController.selectOption(option, "");
            }

            else {
                while (true) {
                    bibliotecaView.display(Messages.LOGIN_MESSAGE);
                    loginID = bibliotecaView.read();

                    role = users.validUser(loginID, bibliotecaView.read());

                    if (!role.equals("Please Input Valid Username and password"))
                        break;
                }

                bibliotecaView.display(users.displayValidUser(loginID));

                do {
                    bibliotecaView.display(Messages.INITIAL_MENU_ITEM);
                    bibliotecaView.display(Messages.MENU_ITEMS);
                    if (role.equals("Librarian"))
                        bibliotecaView.display(Messages.LIBRARIAN_MENU_ITEMS);

                    option = bibliotecaView.read();
                    menuController.selectOption(option, loginID);

                } while (!option.equals("Quit"));
            }
        }

    }


}

