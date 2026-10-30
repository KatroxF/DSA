import java.util.ArrayList;
import java.util.HashMap;

public class findallanagramofstring1 {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        int k=p.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        boolean isValid=true;
        int left=0;
        int right=0;
        int remaining=k;

        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        while(right<s.length()){
            char c=s.charAt(right);
            int freq=map1.getOrDefault(c, 0);
            if(freq>0){
                remaining--;
            }
            map1.put(c,freq-1);

            
            if(right-left+1==k){
                if(remaining==0){
                    list.add(left);
                }
                char outgoing=s.charAt(left);
                int outgoingfreq=map1.get(outgoing)+1;
                if(outgoingfreq>0){
                    remaining++;
                }
                map1.put(outgoing, outgoingfreq);
                left++;
                
            }
            right++;
            
        }
    }
    
}
