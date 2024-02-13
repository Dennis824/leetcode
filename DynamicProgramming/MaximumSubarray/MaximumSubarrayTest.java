package DynamicProgramming.MaximumSubarray;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {

    @Test
    public void testMaxSubArray() {
        MaximumSubarray solution = new MaximumSubarray();

        // Test case 1: Regular case
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, solution.maxSubArray(nums1));

        // Test case 2: All negative numbers
        int[] nums2 = {-1, -2, -3, -4};
        assertEquals(-1, solution.maxSubArray(nums2));

        // Test case 3: All positive numbers
        int[] nums3 = {1, 2, 3, 4};
        assertEquals(10, solution.maxSubArray(nums3));

        // Test case 4: Single-element array
        int[] nums4 = {5};
        assertEquals(5, solution.maxSubArray(nums4));

        // Test case 5: Empty input
        int[] nums5 = {};
        assertEquals(0, solution.maxSubArray(nums5));

        // Test case 6: Large negative numbers
        int[] nums6 = {-100000, -10000, -1000, -100, -10};
        assertEquals(-10, solution.maxSubArray(nums6));
    }
}
