// A spy agency encodes messages. Reverse a secret message, check if
// it is a palindrome, count vowels/consonants, and verify if two
// intercepts are anagrams. Extend: find the first non-repeating
// character in a surveillance log.

import java.util.Scanner;
import java.util.ArrayList;
public class SecretMessage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a secret message:");
        String s = sc.nextLine();
        System.out.println(reverseString(s));
        System.out.println("Is message a palindrome: "+isPalindrome(s));
        countVowels_Consonants(s);
        System.out.println("Enter the Second message for Checking Anagram: ");
        String s2 = sc.nextLine();
        System.out.println("Is the Message Anagram: "+areAnagrams(s,s2));
        firstNonRepeatingCharacter(s);
        
        sc.close();
    }
    public static String reverseString(String s){
        String result = "";
        for(int i=s.length()-1;i>=0;i--){
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String s){
        String reversed = "";
        for(int i=s.length()-1;i>=0;i--){
            reversed += s.charAt(i);
        }
        return s.equals(reversed);
    }
    public static  void countVowels_Consonants(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        System.out.println("Vowels: " + count);
        System.out.println("Consonants: " + (s.length() - count));
    }
    public static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for(int i=0;i<s1.length();i++){
            count[Character.toLowerCase(s1.charAt(i)) - 'a']++;
            count[Character.toLowerCase(s2.charAt(i)) - 'a']--;
        }
        for(int c : count){
            if(c != 0) return false;
        }
        return true;
    }
    public static void firstNonRepeatingCharacter(String s){
        //find first non-repeating character
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        int flag=0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(list.indexOf(c) == list.lastIndexOf(c)){
                System.out.println("First non-repeating character: " + c);
                flag++;
                break;
            }
        }
        if(flag==0) System.out.println("No non-repeating character found.");
    }

}
