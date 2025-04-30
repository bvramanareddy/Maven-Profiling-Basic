package org;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PrintingText {
    @Test
    public void testPrint() {
        System.out.println("Hello, World!");
        System.out.println("From Test Class-->2");
    }
    @Parameters("Name")
    @Test
    public void readingParametersFromTestNGXML(String name) {
        System.out.println("Values Read from TestNg XML is: " + name);
    }
}
