package com.twu.biblioteca;

import java.util.Scanner;

// should only do I/O functionality
public class BibliotecaView {
    private Scanner scanner;

    public BibliotecaView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display(String message) {
        System.out.println(message);
    }

    public String read() {
        return scanner.nextLine();
    }

    public int readInt(){
        return scanner.nextInt();
    }
}
