import java.util.Arrays;
import java.util.HashMap;

public class continuoussubarraysum{
    public static void main(String[] args){
        int[]nums={23,2,4,6,6};
        int k=7;
        int[]prefix=new int[nums.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        prefix[0] = nums[0] % k;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
            prefix[i]=prefix[i]%k;
        }
        int length=0;
        map.put(0,-1);
        for(int i=0;i<prefix.length;i++){
            if(map.containsKey(prefix[i])){
                length=i-map.get(prefix[i]);
                if(length>=2){
                    System.out.println("true");
                    return;
                }
            }else{
                map.put(prefix[i],i);
            }
            
        }
        System.out.println("not found");
        


    }
}