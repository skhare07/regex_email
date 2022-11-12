package com.bridgelabz.regex_email;

//Ability to check valid regex, returns true or false
//compiles given regex using pattern.compile method matches input and regex gives a boolean output


import java.util.regex.Pattern;

public class RegexEmailValidate {
    public static boolean isValid(String regex,String input){
        Pattern pattern =  Pattern.compile(regex);
        return pattern.matches(regex,input);
    }
    public static void main(String[] args){
        boolean regexCheck = isValid("^[a-z]{1,10}[._+-]?[a-z]{1,10}?[\\@][a-z]{1,10}[\\.][a-z]{1,4}[\\.][a-z]{2}$","abc.xyz@bridgelabz.co.in");
        System.out.println(regexCheck);
    }

}
