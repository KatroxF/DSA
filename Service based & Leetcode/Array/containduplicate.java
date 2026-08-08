import java.util.*;
public class containduplicate {
    public static void main(String[] args) {
        int[]arr={1,2,3,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println("duplicate element");
                break;
            }else{
                System.out.println("not duplciate");
            }

        }
    }
    
}
