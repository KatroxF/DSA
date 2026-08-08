public class primenumber {
    public static void main(String[] args) {
        int n=7;
        int counter=2;
        boolean isPrime=true;
        while(counter<n){
            if(n%counter==0){
                isPrime=false;
                break;
                
            
                
                
            }
            
            counter++;
        }
        if(isPrime){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }

    }
    
}
