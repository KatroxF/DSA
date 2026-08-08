public class findpivot {
    public static void main(String[] args) {
        int[]arr={1,7,3,6,5,6};
        int[]arr1=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            arr1[i]=sum;

        }
        int totalsum=arr1[arr1.length-1];
        for(int i=0;i<arr1.length;i++){
            int leftsum=(i==0)?0:arr1[i-1];
            int rightsum=totalsum-arr1[i];
            if(leftsum==rightsum){
                System.out.println("Pivot index = " + i);
                return;
            }
        }
        
        
        System.out.println("No pivot index");
    }
    
}
