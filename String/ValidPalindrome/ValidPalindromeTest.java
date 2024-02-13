package String.ValidPalindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        // Test case 1: Valid palindrome with alphanumeric characters
        String s1 = "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindrome(s1));

        // Test case 2: Valid palindrome with alphanumeric characters
        String s2 = "race a car";
        assertFalse(validPalindrome.isPalindrome(s2));

        // Test case 3: Empty string (considered a valid palindrome)
        String s3 = "";
        assertTrue(validPalindrome.isPalindrome(s3));

        // Test case 4: Single character (considered a valid palindrome)
        String s4 = "a";
        assertTrue(validPalindrome.isPalindrome(s4));

        // Test case 5: Valid palindrome with only non-alphanumeric characters
        String s5 = "!#@#@!#";
        assertTrue(validPalindrome.isPalindrome(s5));

        // Test case 6: Valid palindrome with uppercase and lowercase characters
        String s6 = "Able was I ere I saw Elba";
        assertTrue(validPalindrome.isPalindrome(s6));
    }
}
