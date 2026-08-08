import java.util.ArrayList;
import java.util.Collections;

public class plus1{
    public static void main(String[] args) {
        int[]arr={1,9};
        int x=0;
        int digit=0;
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            x=x*10+arr[i];
            
            
        }
        x=x+1;
        
        
        
        while(x>0){
            digit=x%10;
            arr1.add(digit);
            x=x/10;
        }
        Collections.reverse(arr1); //return void so cant store in the variable
        System.out.println(arr1);
        
        
    }
}