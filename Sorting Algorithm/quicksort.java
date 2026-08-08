import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        int low=0;
        int high=arr.length-1;
        int[] result=quicksort(arr, low, high);
        System.out.println((Arrays.toString(result)));
    }
    static int[] quicksort(int[]arr,int low,int high){
        if(low>=high){
            return arr;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        int pivotIndex=pivot(arr, s, e, pivot);
        quicksort(arr, low, pivotIndex - 1);
        quicksort(arr, pivotIndex, high);
        return arr;
        
        
        
    }
    static int pivot(int[]arr,int s,int e,int pivot){
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        return s;

    }
    
    
}
