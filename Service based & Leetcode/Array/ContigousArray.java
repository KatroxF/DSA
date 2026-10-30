import java.util.Arrays;
import java.util.HashMap;

public class ContigousArray {
    public static void main(String[] args) {
        int[]nums={0,1,1,1,1,1,0,0,0};
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int[]prefixbalance =new int[nums.length];
        if(nums[0]==0){
            prefixbalance[0]=-1;

        }else{
            prefixbalance[0]=1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0){
                prefixbalance[i]=prefixbalance[i-1]-1;
            }else if(nums[i]==1){
                prefixbalance[i]=prefixbalance[i-1]+1;
            }
        }
       int maxlength=0;
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(prefixbalance[i])){
            maxlength=Math.max(maxlength,i-map.get(prefixbalance[i]));
        }else{
            map.put(prefixbalance[i],i);
        }

       }
       System.out.println(maxlength);
       

        

    }
    
}
