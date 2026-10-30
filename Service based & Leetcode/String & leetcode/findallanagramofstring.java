import java.util.ArrayList;
import java.util.HashMap;

public class findallanagramofstring {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        int k=p.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        boolean isValid=true;
        int left=0;
        int right=0;
        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        while(right<s.length()){
           char c=s.charAt(right);
           map2.put(c,map2.getOrDefault(c,0)+1);
            
            if(right-left+1==k){
                if(map1.equals(map2)){
                    list.add(left);
                }
                char outgoing=s.charAt(left);
                int freq=map2.get(outgoing);
                 if (freq == 1) {
                    map2.remove(outgoing);
                } else {
                    map2.put(outgoing, freq - 1);
                }
                left++;

                
            }
            right++;
            
        }

    }
    
}
