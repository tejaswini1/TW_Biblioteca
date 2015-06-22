package com.twu.biblioteca.MenuActions;

import com.twu.biblioteca.InputOutputHandler.BibliotecaView;
import com.twu.biblioteca.Models.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutHistory implements MenuActionPerformable {

    private HashMap<String, ArrayList<Item>> history ;
    private BibliotecaView bibliotecaView;

    public CheckoutHistory(HashMap<String, ArrayList<Item>> checkoutList, BibliotecaView bibliotecaView){
        this.history = checkoutList;
        this.bibliotecaView = bibliotecaView;
    }

    public void add(String loginId, Item item){
        ArrayList<Item> alreadyCheckedOutList = history.get(loginId);
        alreadyCheckedOutList.add(item);
    }


    public void remove(String loginId, Item item) {
        ArrayList<Item> alreadyCheckedOutList = history.get(loginId);
        alreadyCheckedOutList.remove(item);
    }


    public void execute(String loginId){
        String userName = "";
        String result = "";
        ArrayList<Item> items ;
        for(String user : history.keySet()){
            userName = user;
            items = history.get(user);
            if(items.size() != 0)
                result += displaySingleUsersHistory(userName, items) + "\n";
        }

        bibliotecaView.display(result);
    }

    private String displaySingleUsersHistory(String userName, ArrayList<Item> items) {
        String result = "";
        result = "User : " + userName + "\n";
        for(Item item : items){
            result += item.toString()+"\n";
        }
        return result;
    }



}
