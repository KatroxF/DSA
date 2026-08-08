public class longestsubarraywithsumk {
    public static void main(String[] args) {
        int[]arr={10, 5, 2, 7, 1, 9};
        int k=15;
        int left=0;
        int sum=0;
        int maxindex=0;
        for(int right=0;right<arr.length;right++){
            sum=sum+arr[right];
            while(sum>k && right>=left){
                sum=sum-arr[left];
                left++;
            }if(sum==k){
                int temp=right-left+1;
                if (temp>maxindex){
                    maxindex=temp;
                    
                }
                
                
                

            }
            
            

            

        }
        System.out.println(maxindex);
    }
    
}
