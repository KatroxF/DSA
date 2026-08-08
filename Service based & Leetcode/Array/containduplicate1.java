
import java.util.HashMap;

public class containduplicate1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                System.out.println("duplicate");
                return;
            }
            map.put(num,1);
            
        }
        System.out.println("not duplciate");
        
    }
    
}
