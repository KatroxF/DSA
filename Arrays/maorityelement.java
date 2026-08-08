import java.util.*;
public class maorityelement {
    public static void main(String[] args) {
        int[]arr={7, 0, 0, 1, 7, 7, 2, 7, 7};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int key=0;
        int value=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>value){
                value=entry.getValue();
                key=entry.getKey();
            }

        }
        System.out.println(key);
    }
    
}
