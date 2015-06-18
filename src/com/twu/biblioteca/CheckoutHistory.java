package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutHistory implements MenuActionPerformable{

    private HashMap<String, ArrayList<Book>> history ;
    private BibliotecaView bibliotecaView;

    public CheckoutHistory(HashMap<String, ArrayList<Book>> checkoutList, BibliotecaView bibliotecaView){
        this.history = checkoutList;
        this.bibliotecaView = bibliotecaView;
    }

    public void add(String loginId, Book book){
        ArrayList<Book> alreadyCheckedOutList = history.get(loginId);
        alreadyCheckedOutList.add(book);
    }


    public void remove(String loginId, Book item) {
        ArrayList<Book> alreadyCheckedOutList = history.get(loginId);
        alreadyCheckedOutList.remove(item);
    }


    public void execute(String loginId){
        String userName = "";
        String result = "";
        ArrayList<Book> books ;
        for(String user : history.keySet()){
            userName = user;
            books = history.get(user);
            if(books.size() != 0)
                result += displaySingleUsersHistory(userName, books) + "\n";
        }

        bibliotecaView.display(result);
    }

    private String displaySingleUsersHistory(String userName, ArrayList<Book> books) {
        String result = "";
        result = "User : " + userName + "\n";
        for(Book book : books){

            result += book.toString()+"\n";
        }
        return result;
    }


}
