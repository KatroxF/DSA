import java.util.*;
public class builtarrayfrompermutation {
    public static void main(String[] args) {
        int[]arr={0,2,1,5,3,4};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[arr[i]]);
        }
        System.out.println(list);
    }
    
}
