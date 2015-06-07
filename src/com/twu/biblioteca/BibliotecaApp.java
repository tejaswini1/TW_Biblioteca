package com.twu.biblioteca;

// handles work related to user and biblioteca system
public class BibliotecaApp {

        public String welcomeMessage(){
            return "Welcome";
        }

        public String menu(String option){

            if(option == "List Books")
                return new Books().toString();

            return "Select a valid Option!";
        }

}
