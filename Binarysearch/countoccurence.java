public class countoccurence {
    public static void main(String[] args) {
        int[]arr={0, 0, 1, 1, 1, 2, 3};
        int target=1;
        int result=binarySearch(arr, target);
        System.out.println(result);
        
    }
    static int binarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;

            }else if (target>arr[mid]){
                start=mid+1;
            }else{
                int first=mid;
                int last=mid;
                int counter=1;
                while(first>0 && arr[first-1]==target){
                    first--;
                    counter+=1;

                }
                while(last<arr.length-1 && arr[last+1]==target){
                    last++;
                    counter+=1;
                }
                return counter;
            }
        }
        return -1;
    
}
}
