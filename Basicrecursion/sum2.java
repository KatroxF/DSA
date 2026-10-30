public class sum2 {
    public static void main(String[] args) {
        int[]arr={1,2,1,4};
        int i=0;
        int currentsum=0;
        sum(arr, i, currentsum);

    }
    static void sum(int[]arr,int i,int currentsum){
        if(i==arr.length){
            System.out.println(currentsum);
            return;
        }
        currentsum+=arr[i];
        sum(arr, i+1, currentsum);

    }
    
}
