package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge9 {
    /* Create a BiFunction which takes in a Supplier of a list of email address Strings, along with a conditional check, and returns a new List of Strings.

The function will perform the check on each of the elements in the Supplier list of email addresses and return only the relevant items.

We need checks to return only email addresses which are from:

    a UK domain (".co.uk")
    a ".com" domain
    any invalid email addresses which don't end with either of those domains

Print these lists to the console separately.*?*/

   public static Predicate<String> emailEndsWithUKDomain = email ->{
     Pattern pattern = Pattern.compile(".+@\\w+(\\.co\\.uk$)",Pattern.CASE_INSENSITIVE);
     Matcher matcher = pattern.matcher(email);
     return matcher.find();
   };

    public static Predicate<String> emailEndsWithComDomain = email ->{
        Pattern pattern = Pattern.compile(".+@\\w+(\\.com$)",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    };

    public static Predicate<String> emailInvalidDomain = email ->{
        return !emailEndsWithUKDomain.test(email) && !emailEndsWithComDomain.test(email);
    };



   public static BiFunction<List<String>, Predicate<String>, List<String>> isValidEmail = (emailList, conditionalCheck) -> {
       ArrayList<String> filteredEmail = new ArrayList<>();

       emailList.forEach(e -> {
           if(conditionalCheck.test(e)){
               filteredEmail.add(e);
           }
       });

       return filteredEmail;
   };



}
