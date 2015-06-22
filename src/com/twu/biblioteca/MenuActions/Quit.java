package com.twu.biblioteca.MenuActions;

import com.twu.biblioteca.MenuActions.MenuActionPerformable;

public class Quit implements MenuActionPerformable {


    @Override
    public void execute(String loginID) {
        System.exit(0);}
}
