public class maximumaveragesubarray{
    public static void main(String[] args) {
        int[]arr={1,12,-5,-6,50,3};
        int k=4;
        double sum=0;
        double max=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
            
        }
        max=sum;
        
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum>max){
                max=sum;
            }

        }
        max=max/(k);
        System.out.println(max);
    }
}