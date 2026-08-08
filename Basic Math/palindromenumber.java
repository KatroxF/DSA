public class palindromenumber {
    public static void main(String[] args) {
        int n=121;
        int reverse=0;
        int original=n;
        while(n>0){
            reverse=reverse*10+n%10;
            n=n/10;
            
            
        }
        boolean result=check(original, reverse);
        if(result){
             System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
        
        
    }
    static boolean check(int n,int reverse){
        if(reverse==n){
            return true;
        }
        return false;
    }
    
    
}
