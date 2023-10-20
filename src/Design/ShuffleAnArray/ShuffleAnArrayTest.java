package Design.ShuffleAnArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShuffleAnArrayTest {

    @Test
    public void testShuffleAndReset() {
        int[] nums = {1, 2, 3};
        ShuffleAnArray solution = new ShuffleAnArray(nums);

        // Test shuffle
        int[] shuffled = solution.shuffle();
        // Ensure that the shuffled array contains the same elements
        assertArrayEquals(nums, shuffled);

        // Test reset
        int[] resetArray = solution.reset();
        // Ensure that the reset array is the same as the original input
        assertArrayEquals(nums, resetArray);
    }
}
