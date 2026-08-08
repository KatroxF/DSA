import java.util.Arrays;

public class mergesort{
    public static void main(String[] args) {
        int[]arr={8,3,4,12,5,6};
        int[] newarr=mergeSort(arr);
        System.out.println((Arrays.toString(newarr)));

        
        
    }
    static int[] mergeSort(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[]start=mergeSort( Arrays.copyOfRange(arr, 0, mid));
        int[]end=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(start,end);

    }
    static int[]merge(int[]start,int[]end){
        int[] mix=new int[start.length+end.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<start.length&&j<end.length){
            if(start[i]<end[j]){
                mix[k]=start[i];
                i++;

            }else{
                mix[k]=end[j];
                j++;
            }
            k++;
            
        }
        while(i<start.length){
            mix[k]=start[i];
            i++;
            k++;

        }while(j<end.length){
            mix[k]=end[j];
            j++;
            k++;
        }
        return mix;

    }
    
}   