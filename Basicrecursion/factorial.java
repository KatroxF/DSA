public class factorial {
    public static void main(String[] args) {
        int result=factorial(6);
        System.out.println(result);

    }
    static int factorial(int n){
        if(n==1){
            return n;
        }
        return n*factorial(n-1);


    }
    
}
