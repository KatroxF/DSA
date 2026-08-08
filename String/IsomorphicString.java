public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        if (isIsomorphic(s, t)) {
            System.out.println("Isomorphic");
        } else {
            System.out.println("Not Isomorphic");
        }
    }

    static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    if (t.charAt(i) != t.charAt(j)) {
                        return false;
                    }
                } else {
                    if (t.charAt(i) == t.charAt(j)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}