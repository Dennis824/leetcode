package String.ReverseInteger;

class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int tail = x % 10;
            int result = rev * 10 + tail;

            if((result - tail) / 10 != rev) return 0;
            rev = result;
            x = x/10;
        }
        return rev;
    }
}
/*
7
TC: O(log x)
SC: O(1)
*/