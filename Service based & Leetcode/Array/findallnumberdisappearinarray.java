import java.util.*;

public class findallnumberdisappearinarray{
    public static void main(String[]args){
        int[]arr={5,4,6,7,9,3,10,9,5,6};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list=new ArrayList<>();
        if(arr[0] != 1){
          int temp = 1;
          while(temp < arr[0]){
        list.add(temp);
        temp++;
    }
}
        for(int i=0;i<n-1;i++){
           if(arr[i]+1!=arr[i+1]){
            int temp=1;
            int count=(arr[i+1]-arr[i]);
            while(temp<count){
                list.add(arr[i]+temp);
                temp++;

            }
        }
        }
        if(arr[n-1]!=n){
           if(n-arr[n-1]==1){
            list.add(n);
           }
           else if(n-arr[n-1]>1){
            int temp=1;
            int count=(n-arr[n-1])+1;
            while(temp<count){
                list.add(arr[n-1]+temp);
                temp++;

            }
           }
        }
        System.out.println(list);
       
        
        
        
    }
}