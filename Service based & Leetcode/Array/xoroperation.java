import java.util.Arrays;

public class xoroperation{
    public static void main(String[] args){
        int n=4;
        int start=3;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=start+2*i;
        }
        int xor=arr[0];
        for(int i=1;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}