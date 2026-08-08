public class buyandsell{
    public static void main(String[] args) {
        int max=0;
        int j=1;
        int i=0;
        int[]arr={10, 7, 5, 4, 11};
        while(i<arr.length && j<arr.length){
            if(arr[i]>arr[j]){
                i=j;
                j++;
            }else if(arr[i]<arr[j]){
                int sum=arr[j]-arr[i];
                if(sum>max){    
                    max=sum;
                }
                j++;
            }else{
                j++;
            }




        }
        System.out.println("max sum is"+ max);
        
    }
}