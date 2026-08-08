public class gcd {
    public static void main(String[] args) {
    int n1=18;
    int n2=12;
    int remainder=0;
    while(n2>0){
        remainder=n1%n2;
        n1=n2;
        n2=remainder;
        

    }
    System.out.printf("gcd is %d",n1);
        
    }

    
}
