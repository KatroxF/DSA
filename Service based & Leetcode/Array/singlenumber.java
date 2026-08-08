import java.util.*;

public class singlenumber {
    public static void main(String[] args) {
        int[]arr={2,2,1,1,4};
        int target=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);

        }for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("The element which appear once is" + " "+ entry.getKey() );
                return;

            }

        }
        System.out.println("every element appear twice");
        
    }
    
}
