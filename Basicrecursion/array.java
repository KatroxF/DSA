public class array {
    public static void main(String[] args) {
        int[]arr={2,4,5,6};
        int i=0;
        printarr(arr, i);

    }
    static void printarr(int[]arr,int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        printarr(arr, i+1);

    }
    
}
