package LargestOddNumberInString1903;

public class LargestOddNumberInString1903 {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
/*
TC O(n)
SC O(1)
*/