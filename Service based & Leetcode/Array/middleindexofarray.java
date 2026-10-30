import java.util.Arrays;

public class middleindexofarray {
    public static void main(String[] args) {
        int[]arr={2,3,-1,8,4};
        int n=arr.length;
        int[] leftsum=new int[n];
        leftsum[0]=0;
        int[] rightsum=new int[n];
        rightsum[0]=0;
        for(int i=1;i<n;i++){
            leftsum[i]=leftsum[i-1]+arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rightsum[i]=rightsum[i+1]+arr[i+1];
        }
        int k=0;
        int z=0;
        while(k<n){
            if(leftsum[k]==rightsum[z]){
                System.out.println(k);
                return;
            }else{
                k++;
                z++;
            }
        }
        System.out.println("not found");
        


    }
    
}
