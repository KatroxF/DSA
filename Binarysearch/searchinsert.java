public class searchinsert {
    public static void main(String[] args) {
        int[]arr={1, 3, 5, 6};
        int target=5;
        int ans=searchinsert(arr, target);
        System.out.println(ans);

        
    }
    static int searchinsert(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    
}
