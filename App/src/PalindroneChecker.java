
/**
 * MAIN CLASS - Use Case 2: Palindrome Checker App
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Viva Baranwal RA2411003010439
 * @version 2.0
 */

        public class PalindroneChecker{

            /**
             * Application entry point for UC2.
             * @param args Command-line arguments
             */
            public static void main(String[] args) {


                String word = "madam";


                word = word.toLowerCase();

                boolean isPalindrome = true;

                int left = 0;
                int right = word.length() - 1;


                while (left < right) {
                    if (word.charAt(left) != word.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }


                if (isPalindrome) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is NOT a palindrome.");
                }
            }
        }


