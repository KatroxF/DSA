import java.util.Arrays;

public class recursionbubblesort {
    public static void main(String[] args) {
        int[]arr={3,5,4,1};
        int end=arr.length-1;
        int[]sorted=bubblesort(arr, end);
        System.out.println((Arrays.toString(sorted)));

    }
    static int[] bubblesort(int[]arr,int end){
        
        if(end==0){
            return arr;
        }
        
        
        sort(arr,end);
        return bubblesort(arr, end-1);
        



        

    }
    static int[]sort(int[]arr,int end){
        for(int i=0;i<end;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
        return arr;
    }
    
}
