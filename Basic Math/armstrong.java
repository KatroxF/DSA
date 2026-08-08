public class armstrong {
    public static void main(String[] args) {
        int n=153;
        int result=0;
        int original=n;
        int digit=0;
        while(n>0){
            digit=n%10;
            result=result+digit*digit*digit;
            n=n/10;

        }
        if(result==original){
            System.out.println("the number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }

    }
    
}
