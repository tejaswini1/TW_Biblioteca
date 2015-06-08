package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MenuView {
    private Menu menu;
    private Scanner scanner = new Scanner(System.in);

    public MenuView(Menu menu){
        this.menu = menu;
    }

    public void display(){
        System.out.println(menu.display());
    }

    public int readOption() throws IOException{
        System.out.println("Choose Option");
        return scanner.nextInt();
    }


}
