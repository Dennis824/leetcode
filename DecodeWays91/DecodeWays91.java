package DecodeWays91;

class DecodeWays91{
    public int numDecodings(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string is null");
        }
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int pre = 1; // dp[i-2]
        int cur = 1; // dp[i-1]

        for (int i = 1; i < s.length(); i++) {
            int sum = 0; // dp[i]
            if (s.charAt(i) != '0') {
                sum = cur;
            }
            int num = Integer.parseInt(s.substring(i - 1, i + 1));
            if (num >= 10 && num <= 26) {
                sum += pre;
            }

            pre = cur;
            cur = sum;
        }

        return cur;
    }
}