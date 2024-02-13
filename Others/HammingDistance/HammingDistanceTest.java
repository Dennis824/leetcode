package Others.HammingDistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HammingDistanceTest {
    @Test
    public void testHammingDistance() {
        HammingDistance hammingDistance = new HammingDistance();

        // Test case 1: Hamming distance between 1 and 4 is 2.
        assertEquals(2, hammingDistance.hammingDistance(1, 4));

        // Test case 2: Hamming distance between 0 and 15 is 4.
        assertEquals(4, hammingDistance.hammingDistance(0, 15));

        // Test case 3: Hamming distance between 7 and 7 is 0.
        assertEquals(0, hammingDistance.hammingDistance(7, 7));

        // Test case 4: Hamming distance between 31 and 0 is 5.
        assertEquals(5, hammingDistance.hammingDistance(31, 0));
    }
}