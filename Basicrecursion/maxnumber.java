public class maxnumber{
    public static void main(String[]args){
         int[] arr = {3, 7, 2, 9};
         int answer=max(arr, 0);
         System.out.println(answer);

    }
    static int max(int[]arr,int i){
        if(i==arr.length-1){
            return arr[i];

        }
        return Math.max(arr[i],max(arr,i+1));
    }
}