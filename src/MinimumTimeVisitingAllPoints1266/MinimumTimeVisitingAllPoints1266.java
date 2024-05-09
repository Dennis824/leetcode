package MinimumTimeVisitingAllPoints1266;

public class MinimumTimeVisitingAllPoints1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int currX = points[i][0];
            int currY = points[i][1];
            int targetX = points[i + 1][0];
            int targetY = points[i + 1][1];
            ans += Math.max(Math.abs(targetX - currX), Math.abs(targetY - currY));
        }

        return ans;
    }
}

/*
TC O(n)
SC O(1)
*/