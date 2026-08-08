import java.util.Arrays;

public class productofarray {
    public static void main(String[] args) {
        int[]arr={-1,1,0,-3,3};
        int[]answer=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int j=i-1;
            int k=i+1;
            int suffix=1;
            int prefix=1;
            if(i==0){
                while(k<arr.length){
                    
                    suffix=suffix*arr[k];
                    k++;
                    
                    

                }
                answer[i]=suffix;
            }
    
            else{
                while(j>=0 || k<arr.length){
                    if(j>=0){
                        prefix=prefix*arr[j];
                        j--;

                    }
                    if(k<arr.length){
                        suffix=suffix*arr[k];
                        k++;

                    }
                    
                
                
               
                
                
            }
            answer[i]=prefix*suffix;

            }
        }
        System.out.println(Arrays.toString(answer));
    }
    
}
