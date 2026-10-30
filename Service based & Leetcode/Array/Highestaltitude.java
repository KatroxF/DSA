import java.util.Arrays;

public class Highestaltitude {
    public static void main(String[] args) {
        int[]arr={-4,-3,-2,-1,4,3,2};
        int max=0;
        int n=arr.length+1;
        int[]prefix=new int[n];
        prefix[0]=0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
            max=Math.max(max, prefix[i]);
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(max);
        
    }
    
}
