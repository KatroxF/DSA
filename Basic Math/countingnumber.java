public class countingnumber {
    public static void main(String[] args) {
        int n=6578;
        int counter=0;
        while(n>0){
            n=n/10;
            counter=counter+1;

        }
        System.out.println(counter);

    }

    
}
