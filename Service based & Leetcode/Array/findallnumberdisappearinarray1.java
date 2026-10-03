import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findallnumberdisappearinarray1 {
    public static void main(String[] args) {
        int[]arr={1,1,2,2};
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int nums:arr){
            set.add(nums);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                list.add(i);


            }
        }
        System.out.println(list);
    }
    
}
