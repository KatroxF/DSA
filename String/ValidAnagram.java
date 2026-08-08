import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            System.out.println("Not Valid Anagram");
            return;
        }

        
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

       
        for (char ch : t.toCharArray()) {

            if (!map.containsKey(ch)) {
                System.out.println("Not Valid Anagram");
                return;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) < 0) {
                System.out.println("Not Valid Anagram");
                return;
            }
        }

        System.out.println("Valid Anagram");
    }
}