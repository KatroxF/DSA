import java.util.Arrays;

public class productofarray1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        int n=arr.length;
        int[]suffix=new int[n];
        int[]prefix=new int[n];
        int[]answer=new int[n];
        prefix[0]=1;
        suffix[n - 1] = 1;

        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        for(int i=0;i<arr.length;i++){
            answer[i]=prefix[i]*suffix[i];

        }
        System.out.println(Arrays.toString(answer));
    }
    
}
