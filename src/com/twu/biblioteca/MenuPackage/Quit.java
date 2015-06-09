package com.twu.biblioteca.MenuPackage;

public class Quit implements MenuActionPerformable {

    @Override
    public void execute() {
        System.exit(0);
    }
}
