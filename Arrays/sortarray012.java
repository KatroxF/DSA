import java.util.HashMap;

public class sortarray012 {
    public static void main(String[] args) {
        int[]arr={1, 0, 2, 1, 0};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[]result=new int[arr.length];
        int idx=0;
        for(int i=0;i<map.getOrDefault(0, 0);i++){ //i can also use map.get but if there is no 0 1 or 2 anything it throws an error
            result[idx]=0;
            idx++;
        }
        for(int i=0;i<map.getOrDefault(1,0);i++){
            result[idx]=1;
            idx++;
        }
        for (int i = 0; i < map.getOrDefault(2, 0); i++) {
            result[idx++] = 2;
}
    }
    
}
