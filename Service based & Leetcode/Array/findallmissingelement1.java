import java.util.HashSet;
import java.util.*;

public class findallmissingelement1 {
    public static void main(String[] args) {
        int[]arr={4, 2, 7, 5};
        HashSet<Integer> set=new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int nums:arr){
            set.add(nums);
            min=Math.min(min,nums);
            max=Math.max(max,nums);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
    
}
