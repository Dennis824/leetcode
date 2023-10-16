package DynamicProgramming.ClimbingStairs;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] cache = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i < 4) {
                cache[i] = i;
            } else {
                cache[i] = cache[i - 1] + cache[i - 2];
            }
        }
        return cache[n];
    }
}
/*
70
TC O(n)
SC O(n)
 */