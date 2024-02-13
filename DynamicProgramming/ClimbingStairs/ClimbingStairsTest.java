package DynamicProgramming.ClimbingStairs;

import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        // Test case: n = 1
        assertEquals(1, climbingStairs.climbStairs(1));

        // Test case: n = 2
        assertEquals(2, climbingStairs.climbStairs(2));

        // Test case: n = 3
        assertEquals(3, climbingStairs.climbStairs(3));

        // Test case: n = 4
        assertEquals(5, climbingStairs.climbStairs(4));

        // Test case: n = 5
        assertEquals(8, climbingStairs.climbStairs(5));

        // Test case: n = 10
        assertEquals(89, climbingStairs.climbStairs(10));

        // Test case: n = 20
        assertEquals(10946, climbingStairs.climbStairs(20));
    }
}
