public class sum1 {
    public static void main(String[] args) {
        int result=summation(4);
        System.out.println(result);
        
    }
    static int summation(int n){
        if(n==0){
            return 0;
        }
        int x=summation(n-1);
        System.out.println("i receive"+ x);
        return n+x;

    }
    
}
