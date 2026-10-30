import java.util.Arrays;

public class sumofalloddlengthinteger{
    public static void main(String[]args){
        int[]arr={1,4,2,5,3};
        int n=arr.length;
        int sum=0;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int length=j-i+1;
            
            if(length%2!=0){
                int subarraysum=prefix[j];
                if(i>0){
                subarraysum-=prefix[i-1];
            }
            sum=sum+subarraysum;
            }
            
        }
        
       }
       System.out.println(sum);

    }
}