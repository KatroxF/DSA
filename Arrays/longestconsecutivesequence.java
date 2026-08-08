import java.util.*;
public class longestconsecutivesequence{
    public static void main(String[] args) {
        int[]arr={100, 4, 200, 1, 3, 2};
        System.out.println(Longestconsecutivesequence(arr));

    }
    static int Longestconsecutivesequence(int[]arr){
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int longest=1;
        int current=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]==arr[i-1]+1){
                current++;
            }else{
                current=1;
            }
            if(current>longest){
                longest=current;
            }
        }
        return longest;
    }

}