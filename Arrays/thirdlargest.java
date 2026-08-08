public class thirdlargest {
    public static void main(String[] args) {
        int[]arr={1, 2, 2, 3, 0};
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int thirdmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                thirdmax=secmax;
                secmax=max;
                max=arr[i];
            }else if(max>arr[i] && secmax<arr[i]){
                thirdmax=secmax;
                secmax=arr[i];
            }else if(arr[i]>thirdmax && arr[i]<secmax){
                thirdmax=arr[i];
            }
        }
       
        System.out.println(thirdmax);

    }
    
}
