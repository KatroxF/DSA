import java.util.*;

public class arrayintersection2{
    public static void main(String[] args) {
        int[]arr1={1,2,2,1};
        int[]arr2={2};
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int nums:arr1){
            map1.put(nums,map1.getOrDefault(nums,0)+1);
        }
        for(int nums:arr2){
            map2.put(nums,map2.getOrDefault(nums,0)+1);
        }
        for(int nums:arr1){
            if(map2.containsKey(nums)){
                if(map2.get(nums)>0){
                    list.add(nums);
                map2.put(nums,map2.get(nums)-1);

                }
                

           }
        }
        System.out.println(list);
        

    }
    
}
