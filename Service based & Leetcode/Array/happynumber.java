import java.util.HashSet;

public class happynumber {
    public static void main(String[] args) {
        int n=19;
        
        boolean found=true;
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
            int sum=0;
            if(set.contains(n)){
                found=false;
                return;
            }
            set.add(n);
            while(n>0){
                int digit=n%10;
                sum=sum+digit*digit;
                n=n/10;
            }
            n=sum;




        }
        System.out.println(" happy number");
        
    }
    
}
