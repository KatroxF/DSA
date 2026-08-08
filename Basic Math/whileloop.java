public class whileloop {
     public static void main(String[] args) {
        int d = 1; // Example input
        int n = 49;
        int i = 0;
        int j = 1;
        int sum = 0;

        while (i < n) {
            sum = sum + (j * 10) + d;
            j++;
            i++;
        }
        sum=sum+d;
        System.out.println("Sum = " + sum);

        
    }
    
}
