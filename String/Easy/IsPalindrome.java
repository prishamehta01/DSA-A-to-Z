/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class IsPalindrome {


    //Better Approach using built in func - O(2N)
    /*
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String rev = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(rev);
    }
     */


    //Optimal Approach - O(N)
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left<right){
            while(left<right && !(Character.isLetterOrDigit(s.charAt(left)))){
                left++;
            }
            while(left<right && !(Character.isLetterOrDigit(s.charAt(right)))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
