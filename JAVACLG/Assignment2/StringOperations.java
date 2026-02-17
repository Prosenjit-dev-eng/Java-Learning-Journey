/*Take a String input that contains multiple words. Do the following: i) number of times ‘a’ appears ii) number of times “and” appears iii) whether it starts with “The” or not iv) put the String into an array of characters v) display the tokens in the String (tokens are the substrings separated by space or @ or .) vi)Find the largest palindrome in a given input sentence after removing any nonalphanumeric character.  */
import java.util.*;

public class StringOperations {

    // Function to check palindrome
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // i) Count number of times 'a' appears
        int countA = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                countA++;
            }
        }
        System.out.println("i) Number of times 'a' appears: " + countA);

        // ii) Count number of times "and" appears
        int countAnd = 0;
        String lowerInput = input.toLowerCase();
        for (int i = 0; i <= lowerInput.length() - 3; i++) {
            if (lowerInput.substring(i, i + 3).equals("and")) {
                countAnd++;
            }
        }
        System.out.println("ii) Number of times \"and\" appears: " + countAnd);

        // iii) Whether it starts with "The"
        if (input.startsWith("The")) {
            System.out.println("iii) The string starts with \"The\"");
        } else {
            System.out.println("iii) The string does NOT start with \"The\"");
        }

        // iv) Put the String into an array of characters
        char[] charArray = input.toCharArray();
        System.out.println("iv) Character Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // v) Display tokens (separated by space OR @ OR .)
        String[] tokens = input.split("[ @.]");
        System.out.println("v) Tokens:");
        for (String token : tokens) {
            if (!token.isEmpty())
                System.out.println(token);
        }

        // vi) Find the largest palindrome in the sentence
        // Remove non-alphanumeric characters
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String largestPalindrome = "";
        int n = cleaned.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = cleaned.substring(i, j);
                if (isPalindrome(sub) && sub.length() > largestPalindrome.length()) {
                    largestPalindrome = sub;
                }
            }
        }

        if (largestPalindrome.length() > 0)
            System.out.println("vi) Largest Palindrome: " + largestPalindrome);
        else
            System.out.println("vi) No palindrome found.");

        sc.close();
    }
}
