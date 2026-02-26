public class PalidromeCheckerApp{/**
 * ================================================================
 * MAIN CLASS – UseCase1PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 2: Hardcoded parlindrome validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 *using a hardcoded string value
 *
 * At this stage, the application:
 * - stores a predefined string
 * - compares characters from both ends
 * - determines whether the string is a palindrome
 *  - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advance data stuctures
 *
 *
 *
 * @author shweta
 * @version 2.0
 */


    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String text = "madam";

        boolean isPalindrome = true;

        int left = 0;
        int right = text.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}