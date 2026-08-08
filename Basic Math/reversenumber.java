public class reversenumber {
    public static void main(String[] args) {
        int n=532;
        int reverse=0;
        while(n>0){
            reverse=reverse*10+n%10;
            n=n/10;
            


        }
        System.out.println(reverse);

    }
    
}
