import java.util.ArrayList;

public class numberofsubarrayofsizekthreshold {
    public static void main(String[] args) {
        int[]arr={1,1,1,1,1};
        int k =1;
        int threshold=0;
        int i=0;
        int j=0;
        int sum=0;
        int count=0;
        while(j<arr.length){
            sum=sum+arr[j];
            if(j-i+1==k){
                if(sum>=k*threshold){
                    count++;
                    sum=sum-arr[i];
                    i++;


                }
                else{
                    sum=sum-arr[i];
                    i++;
                }
            }
            j++;

        }
        System.out.println(count);
    }
    
}
