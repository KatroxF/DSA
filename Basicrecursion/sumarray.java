public class sumarray {
    public static void main(String[] args) {
        int[]arr={2,4,6,8};
        int i=0;
        int result=summ(arr, i);
        System.out.println(result);
        

    }
    static int summ(int[]arr,int i){
        if(i==arr.length){
            return 0;
        }
        int sum=arr[i];
        sum+=summ(arr, i+1);
        return sum;
    }
    
}
