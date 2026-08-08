import java.util.*;

public class s8 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        String[]str=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            str[i]=String.valueOf(arr[i]);

        }
        System.out.println(Arrays.toString(str));
    }
    
}
