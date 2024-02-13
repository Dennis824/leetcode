package Array.ContainsDuplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    @Test
    public void testContainsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        // Test case 1: Array with duplicates
        int[] nums1 = {1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicate(nums1), "Test case 1 failed");

        // Test case 2: Array without duplicates
        int[] nums2 = {1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicate(nums2), "Test case 2 failed");

        // Test case 3: Array with a single element
        int[] nums3 = {1};
        assertFalse(containsDuplicate.containsDuplicate(nums3), "Test case 3 failed");

        // Test case 4: Empty array
        int[] nums4 = {};
        assertFalse(containsDuplicate.containsDuplicate(nums4), "Test case 4 failed");

        // Test case 5: Array with multiple duplicates
        int[] nums5 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(containsDuplicate.containsDuplicate(nums5), "Test case 5 failed");
    }
}