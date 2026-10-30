public class maxarray {
    public static void main(String[] args) {
        int[]arr={2,4,6,8};
        int i=0;

    }
    static int max(int[]arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int max=max(arr, i+1);
        return Math.max(arr[i],max);
    }
    
}
