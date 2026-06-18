// 2. . Secret Message Validator 
// A security application receives a secret code.
// Write a program that:
// Accepts a string.
// Counts vowels, consonants, digits, and special characters.
// Determines whether the code is "Strong" or "Weak" based on:
// At least 2 digits
// At least 1 special character
// Minimum length of 8
// Displays a detailed report.
import java.util.Scanner;
public class SecretMessage {
    public static void count(String s){
        String vowels = "aeiou";
        int v=0;
        int d=0;
        int spec=0;
        int cons=0;
        String digits="123456789";
        String special="!*#@&-";
        for(int i = 0 ;i<s.length();i++){
            String temp = s.charAt(i)+"";
            if(vowels.contains(temp)){
                v++;
            }
            else if(digits.contains(temp)){
                d++;
            }
            else if(special.contains(temp)){
                spec++;
            }
            else{
                cons++;
            }
        }
        System.out.println("The Entered Message have "+v+" vowels, "+cons+" consonants "+d+" digits and "+spec+" special Characters.");
        if(((d>=2)&&(spec>=1))&&(s.length()>=8)){
            System.out.println("The Code is Strong");

        }
        else{
            System.out.println("The Code is Weak");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Secret Code: ");
        String s = sc.nextLine();
        count(s);
        sc.close();
    }
}
