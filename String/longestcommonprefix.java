public class longestcommonprefix {
    public static void main(String[] args) {

        String[] str = {"flowers", "flow", "fly", "flight"};

        String s = "";

        // Find the length of the shortest string
        int minLength = str[0].length();
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() < minLength) {
                minLength = str[i].length();
            }
        }

        // Compare one character position across all strings
        for (int j = 0; j < minLength; j++) {

            char ch = str[0].charAt(j);
    

            for (int i = 1; i < str.length; i++) {

                if (str[i].charAt(j) != ch) {
                    System.out.println(s);
                    return;
                }
            }

            s += ch;
        }

        System.out.println(s);
        
    }
}