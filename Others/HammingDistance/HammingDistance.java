package Others.HammingDistance;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
/*
461
TC O(1)
SC O(1)
 */