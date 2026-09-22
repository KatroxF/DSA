public class richestcustomerwealth{
    public static void main(String[]args){
        int[][]arr={{1,2,3},{3,2,1}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<arr[i].length;j++){
                temp=temp+arr[i][j];
            }
            if(temp>sum){
                sum=temp;
            }
        }
        System.out.println(sum);
    }
}