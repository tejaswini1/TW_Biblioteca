package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckoutHistory {

    private HashMap<String, ArrayList<Book>> history ;
    public CheckoutHistory(HashMap<String, ArrayList<Book>> checkoutList){
        this.history = checkoutList;
    }

    public void add(String name, Book book){
        history.get(name).add(book);
    }

    public String display(){
        String userName = "";
        String result = "";
        ArrayList<Book> books ;
        for(String user : history.keySet()){
            userName = user;
            books = history.get(user);

            if(displaySingleUsersHistory(userName, books) != null)
                result += displaySingleUsersHistory(userName, books) + "\n";
        }

       return result;
    }

    private String displaySingleUsersHistory(String userName, ArrayList<Book> books) {
        String result = "";
        if(books.size() == 0)
            return null;
        for(Book book : books){
            result = userName + " ";
            result += book.toString();
        }
        return result;
    }

}
