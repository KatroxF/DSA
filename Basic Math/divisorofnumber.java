import java.util.ArrayList;
public class divisorofnumber {
    public static void main(String[] args) {
        int n=6;
        ArrayList<Integer> divisor = new ArrayList<>();
        int counter=1;
        while(counter<=n){
            if(n%counter==0){
                divisor.add(counter);
            }
            counter++;


        }
        System.out.println(divisor);
    }
    
}
