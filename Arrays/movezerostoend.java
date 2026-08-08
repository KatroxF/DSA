import java.util.*;
public class movezerostoend {
    public static void main(String[] args) {
        int[]arr={1, 0, 4, 0, 5, 2};
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
