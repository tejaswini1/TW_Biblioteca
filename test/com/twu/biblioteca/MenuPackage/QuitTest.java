package com.twu.biblioteca.MenuPackage;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;


public class QuitTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void exitsWithStatusCode() {
        exit.expectSystemExitWithStatus(0);
        new Quit().execute();
    }

}