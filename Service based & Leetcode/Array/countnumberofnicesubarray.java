import java.util.HashMap;

public class countnumberofnicesubarray{
    public static void main(String[] args) {
        int[]arr={1,1,2,1,1};
        int k=3;
        int oddcount=0;
        int ans=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddcount++;
            }
            ans=ans+map.getOrDefault(oddcount-k, 0);
            map.put(oddcount,map.getOrDefault(oddcount, 0)+1);
        }
        System.out.println(ans);

        
        
        

    }
}