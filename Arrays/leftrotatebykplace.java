import java.util.*;
public class leftrotatebykplace {
    public static void main(String[] args) {
        int[]arr={1, 2, 3, 4, 5, 6};
        int k=4;
        if(arr.length==0){
            return;
        }
        k=k%arr.length;
        int[]left=Arrays.copyOfRange(arr,0,k);
        int[]right=Arrays.copyOfRange(arr,k,arr.length);
        int[] merged = new int[left.length + right.length];
        System.arraycopy(right, 0, merged, 0, right.length);
        System.arraycopy(left, 0, merged, right.length, left.length);

        System.out.println(Arrays.toString(merged));


        
    }
    
}
