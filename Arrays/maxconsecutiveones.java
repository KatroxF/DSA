public class maxconsecutiveones {
    public static void main(String[] args) {
        int[]arr={1, 1, 0, 0, 1, 1, 1, 0};
        int max=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1 ){

                max=max+1;
            if(max>temp){
                temp=max;
            }
            
            }else if(arr[i]==0){
                
                max=0;
            }
        }
        System.out.println(temp);
    }
    
}
