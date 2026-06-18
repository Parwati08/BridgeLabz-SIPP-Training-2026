// 1. Username Validator 
// A company wants to validate usernames entered by users.
// Write a program that:
// Accepts a username.
// Checks whether it contains any spaces.
// Counts the total number of characters.
// Converts the username to uppercase.
// Displays whether the username is a palindrome.

import java.util.*;
public class UsernameValidator {
    public static boolean anySpace(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                return true;
            }
        }
        return false;
    }
    public static boolean isPalindrome(String s){
        String rev ="";
        for(int i = s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username: ");
        String s = sc.nextLine();
        System.out.println("The Username contains Space: "+anySpace(s));
        System.out.println("The enter username have "+s.length()+" Characters.");
        s=s.toUpperCase();
        System.out.println("Upper Case: "+s);
        System.out.println("Is Palindorme: "+isPalindrome(s));
        sc.close();
    }  
}