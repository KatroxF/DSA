public class findmissingnumber {
    public static void main(String[] args) {
        int[]arr={0, 2, 3, 1, 4};
        int n=arr.length;
        int sum=n*(n+1)/2;
        int total=0;
        int result=missingnumber(arr, sum, total);
        System.out.println(result);


    }
    static int missingnumber(int[]arr,int sum,int total){
        for(int i=0;i<arr.length;i++){
            total=arr[i]+total;
        }
        return sum-total;
    }
    
}
