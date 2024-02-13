package DynamicProgramming.HouseRobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberTest {

    @Test
    public void testRob() {
        HouseRobber solution = new HouseRobber();

        // Test case 1: Regular case
        int[] nums1 = {2, 7, 9, 3, 1};
        assertEquals(12, solution.rob(nums1));

        // Test case 2: All houses have the same value
        int[] nums2 = {5, 5, 5, 5, 5};
        assertEquals(15, solution.rob(nums2));

        // Test case 3: Empty input
        int[] nums3 = {};
        assertEquals(0, solution.rob(nums3));

        // Test case 4: Single house
        int[] nums4 = {7};
        assertEquals(7, solution.rob(nums4));

        // Test case 5: Rob every other house
        int[] nums5 = {2, 1, 1, 2};
        assertEquals(4, solution.rob(nums5));
    }
}