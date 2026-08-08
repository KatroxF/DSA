import java.util.*;
public class leftrotatebykplace1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int k=3;
        int r=0;
        while(r<k){
            int temp1=arr[0];
            for(int i=0;i<arr.length-1;i++){
            
            arr[i]=arr[i+1];
            


            
            
            

        }
        
            
            
            
        arr[arr.length-1]=temp1;    
        r++;
        }
        System.out.println(Arrays.toString(arr));
       
    }
    
}
