import java.util.Arrays;

public class kadanealgorithm2 {
    public static void main(String[]args){
        int[]arr={2, 3, 5, -2, 7, -4};
        int currentsum=0;
        int maxsum= Integer.MIN_VALUE;
        int start=0;
        int ansstart=0;
        int ansend=0;
        for(int i=0;i<arr.length;i++){
            currentsum=currentsum+arr[i];
            if(currentsum>maxsum){
                ansstart=start;

                maxsum=currentsum;
                ansend=i;
            }
            if(currentsum<0){
                currentsum=0;
                start=start+i;
            }


        }
        int[] result=Arrays.copyOfRange(arr, ansstart,ansend+1);
        System.out.println(Arrays.toString(result));
    }
    
}
