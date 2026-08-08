import java.util.*;
public class reverseastring {
    public static void main(String[] args){
        char[] ch={'h','e','l','l','o'};
        int left=0;
        int right=ch.length-1;
        while(left<=right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(ch));
        
    }
    
}
