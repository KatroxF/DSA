import java.util.*;
public class leadersinarray2 {
    public static void main(String[] args) {
        int[]arr={1, 2, 5, 3, 1 ,2};
        int currentmax=arr[arr.length-1];
        ArrayList<Integer>leader=new ArrayList<>();
        leader.add(currentmax);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>currentmax){
                currentmax=arr[i];
                leader.add(currentmax);
                
                
            }
            }
            Collections.reverse(leader);
            System.out.println(leader);
        }
        

    }
    

