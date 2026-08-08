import java.util.Arrays;

public class roatematrixby90 {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int counter=0;
       
        
        for(int i=0;i<arr.length;i++){
            
            
           
           for(int j=counter;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                

           }
           counter++;
            
      }
           int[][] result=reverse(arr);
           System.out.println(Arrays.deepToString(arr));
        }   
        static int[][] reverse(int[][] arr){
            int left=0;
            int right=arr.length-1;
            for(int i=0;i<arr.length;i++){
                int s=left;
                int e=right;
                
                while(s<e){
                    int temp=arr[i][s];
                    arr[i][s]=arr[i][e];
                    arr[i][e]=temp;
                    s++;
                    e--;
                    
                    
                }

            }
            return arr;
        }
        
    }
    

