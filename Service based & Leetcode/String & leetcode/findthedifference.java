import java.util.*;
public class findthedifference {
    public static void main(String[] args) {
        String s="";
        String t="a";
        char blank=' ';
        

        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

        }for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                
                
            }
            if(map.containsKey(ch)){
                if(map.get(ch)<0){
                    System.out.println(ch);
                    return;
                }
            }else if(!map.containsKey(ch)){
                System.out.println(ch);
                return;
            }


        }

    }
    
}
