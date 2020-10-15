package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
//input[@type='submit']
public class StringUtility {

        public static void verifyEquals(String expected, String actual){

            if(expected.equals(actual)) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
           }
            System.out.println("Expected: "+expected);
            System.out.println("Actual: "+actual);
        }
        }
