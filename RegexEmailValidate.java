package com.bridgelabz.regex_email;

import java.util.regex.Pattern;

public class RegexEmailValidate {
    public static boolean isValid(String regex,String input){
        Pattern pattern =  Pattern.compile(regex);
        return pattern.matches(regex,input);
    }
    public static void main(String[] args){
        boolean regexCheck = isValid("^[a-z]{1,10}$","abc");
        System.out.println(regexCheck);
    }

}
