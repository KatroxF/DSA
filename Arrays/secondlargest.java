public class secondlargest {
    public static void main(String[] args) {
        int[]arr={3,2,1};
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }else if (arr[i]<max && arr[i] > secondmax) {
                secondmax=arr[i];
                
            }
        }
        System.out.printf("second largest is %d", secondmax);
    }

}
