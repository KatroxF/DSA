import java.util.HashMap;

public class elementcheck {
    public static void main(String[] args) {
        String s="()[]{}";
        String t="()[]{}1";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)){
                System.out.println("not contain");
                break;
            }else{
                System.out.println("contain");
            }
        }
    }
    
}
