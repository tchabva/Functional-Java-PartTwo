package org.example;

import java.util.function.Consumer;

public class Challenge4 {

    /* Write a Consumer which prints to the console just a username from a given email address.

Apply this to the following list of email addresses:

    "simon.morgan@northcoders.com",
    "chris.ward@northcoders.com",
    "info@stackoverflow.com",
    "hannah.montana@mileycyrus.com"
*/

    private static String username = "";

    public static Consumer<String> returnsUsernameFromEmail = email -> {
        username = email.replaceAll("@.+","");
        System.out.println(username);
    };

    public static String getUsername() {
        return username;
    }

}
