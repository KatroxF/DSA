import java.util.Arrays;

public class reverseaword3{
    public static void main(String[]args){
        String s="Let's take LeetCode contest";
        StringBuilder sb=new StringBuilder(s);
        String reverse=sb.reverse().toString();
        String[] arr=reverse.split(" ");
        String[] arr1=new String[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            arr1[i]=arr[arr.length-1-i];

        }
        String result=String.join(" ",arr1);
        System.out.println(result);
        

    }
}