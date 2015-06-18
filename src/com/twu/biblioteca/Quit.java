package com.twu.biblioteca;

public class Quit implements MenuActionPerformable {


    @Override
    public void execute(String loginID) {
        System.exit(0);}
}
