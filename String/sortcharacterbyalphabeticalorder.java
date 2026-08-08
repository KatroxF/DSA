import java.util.*;

public class sortcharacterbyalphabeticalorder {
    public static void main(String[] args) {
        String s="raaaajj";
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Character> ans=new ArrayList<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                ans.add(ch);
                map.remove(ch); 

        }
        
    }
    Collections.sort(ans);
    System.out.println(ans);
    
} 
}

