import java.util.ArrayList;
import java.util.HashSet;

public class restorefinishingorder{
    public static void main(String[]args){
        int[]arr1={3,1,2,5,4};
        int[]arr2={1,3,4};
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int nums:arr2){
            set.add(nums);
        }
        for(int i=0;i<arr1.length;i++){
            if(set.contains(arr1[i])){
                list.add(arr1[i]);


            }
        }
        System.out.println(list);
    }
}