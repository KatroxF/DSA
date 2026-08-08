public class lowerbound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int target = 9;
        int lowerboundd= lowerbound(arr, 9);
        System.out.println(lowerboundd);
    }

    static int lowerbound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target <= arr[mid]) {
                end = mid - 1;
            } else{
                start=mid+1;

            }
            
            
            
            
            
                
            }
            return start;
        }
        

        
    }
//"I'm looking for the first element that is greater than or equal to the target. Whenever arr[mid] >= target, mid could be the answer, but there might be an earlier one, so I continue searching on the left by doing end = mid - 1. Whenever arr[mid] < target, mid can never be the answer, so I discard it and everything to its left by doing start = mid + 1. When the loop finishes, start is the first position where an element is >= target, so I return start."