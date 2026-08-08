public class largestoddnumber1 {
    public static void main(String[] args) {
        String s = "0214638";

        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';

            if (digit % 2 != 0) {
                String ans = s.substring(0, i + 1);

                // Remove leading zeros
                int j = 0;
                while (j < ans.length() && ans.charAt(j) == '0') {
                    j++;
                }

                // If all characters were zeros
                if (j == ans.length()) {
                    System.out.println("");
                } else {
                    System.out.println(ans.substring(j));
                }
                return;
            }
        }

        // No odd digit found
        System.out.println("");
    }
}