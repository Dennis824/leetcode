package Math.RomanToInteger;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        char[] arr = s.toCharArray();
        int prev = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = romanConverter(arr[i]);
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }

        return result;
    }

    public int romanConverter(char c) {
        int result = 0;
        if (c == 'M') {
            result = 1000;
        } else if (c == 'D') {
            result = 500;
        } else if (c == 'C') {
            result = 100;
        } else if (c == 'L') {
            result = 50;
        } else if (c == 'X') {
            result = 10;
        } else if (c == 'V') {
            result = 5;
        } else if (c == 'I') {
            result = 1;
        }
        return result;
    }

}
/*
13
TC
SC
*/