import java.util.HashMap;

public class ransomnote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : magazine.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for(char c:ransomNote.toCharArray()){
            if(map2.containsKey(c)){
                if(map2.get(c)==0){
                    System.out.println("false");
                    return;
                }
                map2.put(c, map2.getOrDefault(c, 0) -1 );
            }else{
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}