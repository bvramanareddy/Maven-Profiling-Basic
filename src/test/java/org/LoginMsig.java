package org;

import org.testng.annotations.Test;

public class LoginMsig {

    @Test
    public void profileTest() {
        System.out.println("The below value is reading from POM.XML profile at run time");
        System.out.println(System.getProperty("env.url"));
        System.out.println("Bye");
    }
}
