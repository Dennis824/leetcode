package FrogJump403;

class FrogJump403{
    Map<Integer, Integer> stoneIndex = new HashMap<>();
    Boolean[][] dp;
    public boolean canCross(int[] stones) {
        int n = stones.length;
        for(int i = 0; i < n; i++)
            stoneIndex.put(stones[i], i);
        dp = new Boolean[n][n];
        return dfs(0, n, stones, 0);
    }

    boolean dfs(int pos, int n, int[] stones, int speed){
        if(pos == n-1)
            return true;
        if(dp[pos][speed] != null)
            return dp[pos][speed];

        boolean local = false;

        Integer slow = stoneIndex.get(stones[pos] + speed-1);
        Integer same = stoneIndex.get(stones[pos] + speed);
        Integer fast = stoneIndex.get(stones[pos] + speed+1);

        if(slow != null && speed-1 > 0)
            local = local || dfs(slow, n, stones, speed-1);
        if(same != null && speed > 0)
            local = local || dfs(same, n, stones, speed);
        if(fast != null)
            local = local || dfs(fast, n, stones, speed+1);

        dp[pos][speed] = local;
        return local;
    }
}