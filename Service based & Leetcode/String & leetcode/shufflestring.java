import java.util.*;
public class shufflestring{
    public static void main(String[] args){
        String s="codeleet";
        int[]indices={4,5,6,7,0,2,1,3};
       char[] arr=new char[s.length()];
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        int j=indices[i];
        arr[j]=c;

       }
       String string=new String(arr);
       System.out.println(string);

    }
}