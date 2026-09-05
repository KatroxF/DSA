import java.util.ArrayList;

public class concatenationofarray {
    public static void main(String[] args) {
        int[]arr={1,2,1};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println(list);
    }
    
}
