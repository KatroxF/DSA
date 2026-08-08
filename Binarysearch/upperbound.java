public class upperbound {
    public static void main(String[] args) {
        int[]arr={1,2,2,3};
        int target=2;
        int upperbound= upperbound(arr, 2);
        System.out.println(upperbound);
        
    }
    static int upperbound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target >= arr[mid]) {
                start=mid+1;
            } else{
                end=mid-1;

            }
            
            
            
            
            
                
            }
            return start;
        }
    
}
////"I'm looking for the first element that is strictly greater than the target. If arr[mid] <= target, then mid cannot be the answer, so I move start to mid + 1. Otherwise, mid might be the answer, but there could be an earlier greater element, so I move end to mid - 1. After the loop, start points to the first element greater than the target."