import java.util.Arrays;

public class recursioninsertionsort {
    public static void main(String[] args) {
        int[]arr={3,5,4,1};
        int start=1;
        int[]sorted=insertionsort(arr,start);
        System.out.println((Arrays.toString(sorted)));

    }
    static int[] insertionsort(int[]arr,int start){
        if(start>arr.length-1){
            return arr;
        }
        sort(arr,start);
        return insertionsort(arr,start+1);

    }
    static int[] sort(int[]arr,int start){
        for(int i=start;i>0;i--){
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }

        }
        return arr;

    }
    
    
}
