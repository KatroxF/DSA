import java.util.Arrays;

public class rearrangeelementbysign {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, -1, -3, -4};

        int neg = 1;
        int pos = 0;
        int[]ans=new int[arr.length];
        for(int nums:arr){
            if(nums>0){
                ans[pos]=nums;
                pos+=2;
            }else{
                ans[neg]=nums;
                neg+=2;
            }

        }

       
        

        System.out.println(Arrays.toString(ans));
    }
}