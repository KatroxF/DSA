public class sum {
    public static void main(String[] args) {
        int result=sum(5);
        System.out.println(result);
        
    }
    static int sum(int n){
        if(n==1){
            return n;
        }
        return n+sum(n-1);

    }
    
}
