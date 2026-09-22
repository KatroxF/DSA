public class minimumoperation {
    public static void main(String[] args) {
        int[]arr={3,2};
        int k=6;
        int sum=0;
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        while(sum>=0){
            if(sum%k==0){
                System.out.println(count);
                break;
            }
            count++;
            sum--;
            

        }
        
        
    }
    
}
