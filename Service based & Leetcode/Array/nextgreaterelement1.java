import java.util.ArrayList;

public class nextgreaterelement1 {
    public static void main(String[] args) {
        int[]arr1={2,4};
        int[]arr2={1,2,3,4};
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            int val=arr1[i];
            int j=0;
            while(j<arr2.length){
                if(arr2[j]==val){
                    int k=j+1;
                    while(k<arr2.length){
                        if(val<arr2[k]){
                            list.add(arr2[k]);
                            break;

                        }else{
                            list.add(-1);
                            
                        }
                        k++;

                    }

                }
                j++;
            }
            

        }
        list.add(-1);
        System.out.println(list);
    }
    
}
