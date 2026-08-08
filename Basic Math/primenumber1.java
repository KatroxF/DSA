public class primenumber1 {
    public static void main(String[] args) {

        int n = 37;
        int counter = 2;

        while(counter * counter <= n){

            if(n % counter == 0){
                System.out.println("Number is not prime");
                return;
            }

            counter++;
        }

        System.out.println("Number is prime");
    }
}