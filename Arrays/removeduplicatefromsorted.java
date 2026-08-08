
public class removeduplicatefromsorted {
    public static void main(String[] args) {
        int[]arr={10,10,20,30,40,50};
        int j=0;
        int result=index(arr, j);
        System.out.println(result);
        
        
    }
    static int index(int[]arr,int j){
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }

                
        return j+1;
        }
        
    }
    

