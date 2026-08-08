import java.util.*;
public class rightrotatebykplace{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int n=arr.length;
        int k=2;
        k=k%n;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];

        }
        System.out.println(Arrays.toString(arr));
    }
}