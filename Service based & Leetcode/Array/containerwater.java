public class containerwater {
    public static void main(String[] args) {
        int[]height={1,8,6,2,5,4,8,3,7};
        int left=0;
        int right=height.length-1;
        int area=0;
        while(left<right){
            int temp=0;
            temp=Math.min(height[left],height[right])*(right-left);
            if(temp>area){
                area=temp;
            }if(height[left]<height[right]){
                left++;
            }else if(height[left]>height[right]){
                right--;
            }else{
                right--;
            }
            
        }
        System.out.println(area);
    }
    
}
