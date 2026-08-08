import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        // Traverse from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If the current digit is less than 9,
            // simply increment it and return.
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Current digit is 9.
            // It becomes 0 and we carry 1 to the previous digit.
            digits[i] = 0;
        }

        // If we reach here, every digit was 9.
        // Example: 999 -> 1000
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {

        int[] digits = {9, 9, 9};

        int[] result = plusOne(digits);

        System.out.println(Arrays.toString(result));
    }
}