public class largestelement{
    public static void main(String[] args) {
        int[]arr={3,2,6,1,8};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                 max=arr[i];
            }
            
        }
        System.out.printf("the maximum number is %d", max);
        
    }
}