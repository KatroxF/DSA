import java.util.*;
public class awwayswipe{
    public static void main(String[] args) {
        int[]arr1={10,11,12,13,14};
        int[]arr2={15,16,17,18,19};
        int[]temp=arr1;
        arr1=arr2;
        arr2=temp;
        System.out.println(Arrays.toString(arr2));
    }
}