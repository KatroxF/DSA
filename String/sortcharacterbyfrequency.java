import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class sortcharacterbyfrequency {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s="raaaajj";

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Store unique characters
        ArrayList<Character> list = new ArrayList<>(map.keySet());

        // Sort by frequency (highest first)
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Build answer
        StringBuilder ans = new StringBuilder();

        for (char ch : list) {
            int freq = map.get(ch);

            while (freq > 0) {
                ans.append(ch);
                freq--;
            }
        }

        System.out.println(ans.toString()); 
    }
    
}
