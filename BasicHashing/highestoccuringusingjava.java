public class highestoccuringusingjava{
    public static void main(String[] args) {
        int[]arr={1, 2, 1, 3, 2, 1};
        int max=0;
        int count=0;
        int answer=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
            

        }
        max=max+1;
        int[]freq=new int[max];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>count){
                count=freq[i];
                answer=i;
            }
            


        }
        System.out.println(answer);


        
    }
}