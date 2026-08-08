import java.util.*;
public class romantointeger {
    public static void main(String[] args) {
        String s="MCMXCIV";
        int num=0;
        int curr=0;
        int next=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                curr = map.get(s.charAt(i));
                next = map.get(s.charAt(i + 1));

            }if(curr<next){
                num=num-curr;
            }else{
                num = num + curr;
            }

        }
        num += map.get(s.charAt(s.length() - 1));
        System.out.println(num);
    }
    
}
