import java.util.HashSet;

public class maxsubstringwithdistinctcharacter{
    public static void main(String[] args) {
        HashSet<Character> set=new HashSet<>();
        String s="abab";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            set.add(c);
        }
        System.out.println(set.size());
    }
}