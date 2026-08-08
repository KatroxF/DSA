import java.util.*;
public class removingduplicate {
    public static void main(String[] args) {
        String s="tree";
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Character> ans=new ArrayList<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for(char ch:s.toCharArray()){
            if(map.get(ch)>1){
                map.put(ch,map.get(ch)-1);

            }
            else if(map.containsKey(ch)){
                ans.add(ch);

            }
        }
        System.out.println((ans));
    }
    
}
