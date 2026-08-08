import java.util.*;
public class floorandceiling {
    public static void main(String[] args) {
        int[]arr={3, 4, 4, 7, 8, 10};
        int x=8;
        int[]ans=floorceiling(arr,x);
        System.out.println(Arrays.toString(ans));
    }
    static int[] floorceiling(int[] arr,int x){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(x<arr[mid]){
                end=mid-1;

            }else if(x==arr[mid]){
                return new int[]{arr[mid],arr[mid]};

            }else{
                start=mid+1;
            }
             if (end < 0) {
            return new int[]{-1, arr[start]};
        }

        
        if (start >= arr.length) {
            return new int[]{arr[end], -1};
        }
        }
        return new int[]{arr[end],arr[start]};
    }
    
}
