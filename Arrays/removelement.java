import java.util.*;
public class removelement {
    public static void main(String[] args) {
        int[]arr={0,1,2,2,3,0,4,2};
        int val=2;
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                j=i;
                break;
            }
        }
        if(j==-1){
                System.out.println(arr.length);;
            }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=val){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            
            
        }
            
            
            
        
        System.out.println(j);
    }
    
}
