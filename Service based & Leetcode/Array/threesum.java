import java.util.*;
public class threesum{
    public static void main(String[]args){
        int[]arr={-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        
        
        int target=0;
        int sum=0;
        ArrayList<int[]> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
            sum=arr[i]+arr[left]+arr[right];
            if(sum<0){
                
                left++;

            }else if(sum>0){
                right--;
            }else if(sum==0){
                result.add(new int[]{arr[i],arr[left],arr[right]});
                
                left++;
                right--;
                while(left<right && arr[left]==arr[left-1]){
                    left++;
                }
                while(left<right && arr[right]==arr[right+1]){
                    right--;
                }
            }


        }

        }
       
        // System.out.println(result);
        for (int[] arr1 : result) {
    System.out.println(Arrays.toString(arr1));
}

    }
}