import java.util.*;
public class countingfrequency{
    public static void main(String[] args) {
        int[]arr={4,5,2,2,1,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);

    }
}