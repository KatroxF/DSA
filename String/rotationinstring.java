
public class rotationinstring {

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        int r = 0;
        boolean isAnswer = false;

        StringBuilder answer = new StringBuilder(s);

        boolean result = rotation(s, goal, r, isAnswer, answer);

        System.out.println(result);

    }

    static boolean rotation(String s, String goal, int r, boolean isAnswer, StringBuilder answer) {
        if (s.equals(goal)) {
            return true;
}

        while (r < s.length()) {

            char temp = answer.charAt(0);
            

            for (int i = 0; i < s.length()-1; i++) {

                answer.setCharAt(i, answer.charAt(i + 1));

            }

            answer.setCharAt(s.length() - 1, temp);

            r++;

            if (answer.toString().equals(goal)) {

                isAnswer = true;

                break;

            }

        }

        return isAnswer;

    }

}