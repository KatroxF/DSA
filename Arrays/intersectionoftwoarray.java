import java.util.*;
public class intersectionoftwoarray {
    public static void main(String[] args) {
        int[]arr1={1,2,2,1};
        int[]arr2={2,2};
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int nums:arr1){
            set1.add(nums);
        }
        for(int nums:arr2){
            set2.add(nums);
        }
        for(int nums:set1){
            if(set2.contains(nums)){
                list.add(nums);
            }
        }
        System.out.println(list);
    }
    
}
