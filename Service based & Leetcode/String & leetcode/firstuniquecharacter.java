import java.util.*;
public class firstuniquecharacter{
    public static void main(String[] args){
        String s="aabb";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch) && map.get(ch)==1){
                System.out.println(ch);
                return;
            }else{
                System.out.println("not found");
                return;
            }
        }
    }
}