import java.util.*;
public class longestcharacterrepeating {
    public static void main(String[] args) {
        String s="AABABBA";
        int k=1;
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxfreq=0;
        int maxlen=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxfreq=Math.max(maxfreq,map.get(ch));


            while((right-left+1)-maxfreq>k){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left), 0)-1);
                left++;


            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;


        }
        System.out.println(maxlen);
    }
    
}
