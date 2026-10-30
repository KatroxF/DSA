import java.util.HashMap;

public class longestrepeatingcharacterreplacement{
    public static void main(String[] args) {
        String s="ABAB";
        int k=2;
        int left=0;
        int right=0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c, 0)+1);
            right++;

        }
    }
}