import java.util.*;
public class salesgrowth {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int input=sc.nextInt();
        // int[]arr=new int[input];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        int[]arr={10, 0, 0};
       int i=0;
       int j=0;
       int count=0;
       while(i<arr.length-1){
        if(arr[i]==0){
            i++;
        }else{
            j=i+1;
            while( j<arr.length && arr[j]==0){
                j++;
            }
            
            if(j < arr.length && arr[j] != 0){
                if(arr[j]-arr[i]>=5){
                    count=count+1;
                }
                
            }
            i++;
            j=i;
        }

       }
       System.out.println(count);



    }
    
}
