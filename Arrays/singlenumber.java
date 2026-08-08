public class singlenumber {
    public static void main(String[] args) {
        int[]arr={1, 2, 2, 4, 3, 1, 4};
        sort(arr);
        
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
                

            }
            

        }

        

    }
    static int[] sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                }
            }
        }
        return arr;
    }
    
}
