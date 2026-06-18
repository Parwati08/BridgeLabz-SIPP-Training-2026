// 3. Word Match System
// A recruitment portal receives two skill keywords from a candidate.
// Write a program that:
// Accepts two strings.
// Checks whether they are anagrams.
// Displays both strings in uppercase.
// Shows the total length of each string.
// Prints a suitable message based on the result.

import java.util.*;
public class WordMatch {
    public static void isAnagram(String s1, String s2){
        if(s1.length()==s2.length()){
            ArrayList<Character> arr = new ArrayList<>();
            for(int i=0;i<s1.length();i++){
                arr.add(s1.charAt(i));
            }
            for(int i=0;i<s1.length();i++){
                char temp = s2.charAt(i);
                if(arr.contains(temp)){
                    arr.remove(arr.indexOf(temp));
                }
            }
            if(arr.isEmpty()){
                System.out.println("Keywords are Anagram.");
            }
        }
        else{
            System.out.println("Keywords are not Anagram.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        isAnagram(s1,s2);
        System.out.println("Keywords in Upper case: ");
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        System.out.println("Length of First Keyword : "+s1.length());
        System.out.println("Length of Second Keyword : "+s2.length());
        sc.close();
    }
}
