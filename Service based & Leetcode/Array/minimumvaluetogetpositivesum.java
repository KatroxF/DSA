import java.util.Arrays;

public class minimumvaluetogetpositivesum{
    public static void main(String[] args) {
        int[]arr={-3,2,-3,4,2};
        int[]sum=new int[arr.length];
        sum[0]=arr[0];
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=1;i<arr.length;i++){
            sum[i]=sum[i-1]+arr[i];
            min=Math.min(min, sum[i]);

        }
        ans=1-min;
        System.out.println(ans);

    }
}