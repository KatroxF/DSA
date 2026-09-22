public class minimumsizesubarray{
    public static void main(String[]args){
        int[]arr={1,1,1,1,1,1,1,1};
        int target=11;
        int i=0;
        int j=0;
        int sum=0;
        int mincount=Integer.MAX_VALUE;
       while(j<arr.length){
        sum=sum+arr[j];
        while(sum>=target){
            int temp=j-i+1;
            if(temp<mincount){
                mincount=temp;
            }
            sum=sum-arr[i];
            i++;

        }
        j++;
       }
       if(mincount==Integer.MAX_VALUE){
        mincount=0;
       }
        System.out.println(mincount);
    }
}