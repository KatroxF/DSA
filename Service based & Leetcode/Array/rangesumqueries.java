class rangesumqueries {
    int[]prefix;
    public rangesumqueries(int[] nums){
        prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
    }
    public int sumRange(int left,int right){
        if(left==0){
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }public static void main(String[] args) {
        int[]nums={2, 4, 6, 8};
         rangesumqueries obj = new rangesumqueries(nums);

        System.out.println(obj.sumRange(0, 2)); 

        System.out.println(obj.sumRange(1, 3));

        // System.out.println(obj.sumRange(0, 5)); 
    }
    
}
