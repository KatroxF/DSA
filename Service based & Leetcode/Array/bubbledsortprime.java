import java.util.*;
public class bubbledsortprime{
    static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[]args){
        int[]arr={8,4,2,3,5,6};
        boolean isPrime=false;
        int[]result=bubblesort(arr);
        System.out.println(Arrays.toString(result));
        

    }
    static int[] bubblesort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(isprime(arr[j])|| isprime(arr[j-1])){
                    continue;
                }
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                }

            }
        }
        return arr;
    }
}