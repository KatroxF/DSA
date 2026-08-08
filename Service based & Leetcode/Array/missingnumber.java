public class missingnumber {
    public static void main(String[] args) {
        int[]arr={3,0,1};
        int total=0;
        int n=arr.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
        }
        System.out.println("missing number is" + (sum-total));


    }
    
}
