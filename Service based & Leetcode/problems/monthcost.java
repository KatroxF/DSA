import java.util.Scanner;

public class monthcost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int totalcost=0;
        if(month % 12==0){
            totalcost=(month/12)*15000;
            System.out.println("total cost"+" " +totalcost);
        }else if(month % 9 ==0){
            totalcost=(month/9)*12000;
            System.out.println("total cost"+" " +totalcost);
        } else if (month % 6 == 0) {
            System.out.println((month / 6) * 7000);
        }
        else if (month % 3 == 0) {
            System.out.println((month / 3) * 5000);
        }
        else {
            System.out.println("Error");
        }
    }
    
}
