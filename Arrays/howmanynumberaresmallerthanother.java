import java.util.*;
public class howmanynumberaresmallerthanother{
    public static void main(String[] args){
        int[]arr={8,1,2,2,3};
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            list.add(count);
        
        }
        System.out.println(list);
        

    }
}