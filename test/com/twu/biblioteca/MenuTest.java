package com.twu.biblioteca;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class MenuTest {

     @Test
     public void shouldDisplayMenu(){
         Menu menu = new Menu();
         String actualMenu = menu.display();

         assertThat(actualMenu, is(equalTo("1] List Books")));
     }


//    @Test
//    public void shouldDisplayMenuItems() {
//
//        Menu menu = new Menu();
//
//        String actualItem = menu.select(1);
//
//        assertThat(actualItem, is(equalTo("Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n")));
//    }
//
//    @Test
//    public void shouldDisplayMessageWhenGivenInvalidOption() {
//
//        Menu menu = new Menu();
//
//        String actualItem = menu.select("Print Books");
//
//        assertThat(actualItem, is(equalTo("Select a valid Option!")));
//    }
}
