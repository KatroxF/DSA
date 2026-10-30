public class binaryfunc {
    public static void main(String[] args) {
        int[]arr={2,3,6,8};
        int target=3;
        System.out.println(binarysearch(arr, target, 0, arr.length-1));

    }
    static int binarysearch(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return binarysearch(arr, target, s, m-1);
        }
        return binarysearch(arr, target, m+1, e);
    }
    
}
