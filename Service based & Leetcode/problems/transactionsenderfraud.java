import java.util.*;
class Transaction{
    String sender;
    String receiver;
    double amount;
    int timestamp;
    Transaction(String sender,String receiver,double amount,int timestamp){
        this.sender=sender;
        this.receiver=receiver;
        this.amount=amount;
        this.timestamp=timestamp;
    }
}
public class transactionsenderfraud{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Transaction[] arr=new Transaction[n];
        for(int i=0;i<n;i++){
            String sender=sc.next();
            String receiver=sc.next();
            double amount=sc.nextDouble();
            int timestamp = sc.nextInt();
            arr[i]=new Transaction(sender,receiver,amount,timestamp);
        }
        System.out.println("Fraud Transactions:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].sender.equals(arr[j].sender)&&arr[i].receiver.equals(arr[j].receiver)&&arr[i].amount==arr[j].amount && Math.abs(arr[i].timestamp-arr[j].timestamp)<=60){
                    System.out.println(arr[j].sender + " "+ " "+arr[j].receiver+" "+ arr[j].amount+ " "
                            + arr[j].timestamp);
                }
            }
        }


    }
}