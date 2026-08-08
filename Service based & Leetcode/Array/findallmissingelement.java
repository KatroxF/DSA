import java.util.*;
public class findallmissingelement{
    public static void main(String[] args){
        int[]arr={7,8,6,9};
        Arrays.sort(arr);
        int count=0;
        int temp=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){


            }else if(arr[i]!=arr[i+1]){
                count=arr[i+1]-arr[i]-1;
                temp=arr[i];
            }
            

        }
        while(count>0){
            
            temp++;
            list.add(temp);
            count--;
            

        }
        
        
        System.out.println(list);
    
    }
}