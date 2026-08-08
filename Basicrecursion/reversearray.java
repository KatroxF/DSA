import java.util.Arrays;

public class reversearray {
        public static void main(String[] args) {
            int[]arr={4,5,1,6,7,5};
            int start=0;
            int end=arr.length-1;
            Reversearray(arr, start, end);
            System.out.println(Arrays.toString(arr));

            

        }
        static void Reversearray(int[]arr,int start,int end){
            if(start>=end){
                return;
            }
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            
            
            Reversearray(arr, start, end);
            
            
            
        }
        
    }
