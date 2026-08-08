public class sortedornot {
    public static void main(String[] args) {
        int[]arr={1, 2, 1, 4, 5};
        boolean issort=true;
        boolean result=sortchecking(arr,issort);
        
        System.out.println(result);
        
    }
    static boolean sortchecking(int[]arr,boolean issort){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                issort=true;
                
                
                
                
            }else if(arr[i]>arr[i+1]){
                issort=false;
                break;
            }
            
        }
       return issort;
    }
    
}
