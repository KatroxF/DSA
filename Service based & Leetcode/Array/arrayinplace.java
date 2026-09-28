import java.util.Arrays;

public class arrayinplace {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int i=1;
        int temp=arr[i];
        arr[i]=arr[i-1];
        arr[i-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
