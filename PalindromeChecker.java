import java.util.*;

public class PalindromeChecker {

    
    public static boolean isPalindrome(String str) {
        // Remove spaces, punctuation, and convert to lowercase
        str = str.replaceAll("[\\W_]+", "").toLowerCase();  

        int left = 0;
        int right = str.length() - 1;

        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        
        System.out.print("Enter a word : ");
        String input = Sc.nextLine();

        
        if (isPalindrome(input)) {
            System.out.println("The word  is a palindrome.");
        } else {
            System.out.println("The  word  is not a palindrome.");
        }

        
    }
}

