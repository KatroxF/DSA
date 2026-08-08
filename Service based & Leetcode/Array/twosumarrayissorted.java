public class twosumarrayissorted {
    public static void main(String[] args) {
        int[]arr={2,7,11,15};
        int left=0;
        int right=arr.length-1;
        int target=9;
        while(left<=right){
            if(target<arr[left]+arr[right]){
                right--;
            }else if(target>arr[left]+arr[right]){
                left++;
            }else{
                System.out.println("target found");
                return;
            }

        }
        System.out.println("wad");
    }
    
}
