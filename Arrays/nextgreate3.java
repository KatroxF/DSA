import java.util.Arrays;

public class nextgreate3 {
    public static void main(String[] args) {
        int n=12453;
        char[]arr=String.valueOf(n).toCharArray();
        int i=arr.length-2;
        
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
            

        }if(i>=0){
            int j=arr.length-1;
            while(arr[j]<=arr[i]){
                
                    j--;
                
            }
            swap(arr,i,j);

        }else if(i==-1){
            System.out.println("-1");
            return;
        }
        reverse(arr,i+1,arr.length-1);
        String s=new String(arr);
        int n1=Integer.parseInt(s);
        System.out.println(n1);
        
    }
    static void swap(char[]arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(char[]arr,int left,int right){
        while(left<right){
            swap(arr, left, right);
            left++;
            right--;
            
        }
    }

    
}
