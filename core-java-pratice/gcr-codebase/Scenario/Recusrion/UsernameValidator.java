// 2. Username Validator
// A platform requires usernames to contain only lowercase letters.
// Task: Recursively verify whether a username is valid.
// Example:
// Input: "abcdxyz"
// Output: true
// Input: "abcD123"
// Output: false

public class UsernameValidator {
    static boolean isValid(String username, int index) {
        if (index == username.length()) {
            return true;
        }

        char ch = username.charAt(index);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValid(username, index + 1);
    }

    public static void main(String[] args) {

        String username = "abcdxyz";

        System.out.println(isValid(username, 0));
    }
}