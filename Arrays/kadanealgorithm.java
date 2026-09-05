public class kadanealgorithm {
    public static void main(String[] args) {
        int[]arr={2, 3, 5, -2, 7, -20, 10};
        int currentsum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentsum=currentsum+arr[i];
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }
            

        

        }
        System.out.println(maxsum);
        
    }
    
}
