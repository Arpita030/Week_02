class PalindromeChecker {
    String text;

    // Constructor to initialize the text
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Optimized method to check if the text is a palindrome
    boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }

    // Method to display the result
    void display() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        // Test cases
        PalindromeChecker p1 = new PalindromeChecker("madam");
        p1.display();

        PalindromeChecker p2 = new PalindromeChecker("hello");
        p2.display();

        PalindromeChecker p3 = new PalindromeChecker("racecar");
        p3.display();
    }
}
