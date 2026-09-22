import java.util.Arrays;

public class runningsumof1darray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        int index1=arr[1];
        int[]prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
    
}
