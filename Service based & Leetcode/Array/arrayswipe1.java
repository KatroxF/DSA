import java.util.*;
public class arrayswipe1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int n1=sc.nextInt();
        int[]arr1=new int[n1];
        System.out.println("Element of array arr1 are :");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size of second array: ");
        int n2=sc.nextInt();
        int[]arr2=new int[n2];
        System.out.println("Element of array arr2 are: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int[]temp=arr1;
        arr1=arr2;
        arr2=temp;
        System.out.println("First Array after swap: " + Arrays.toString(arr1));
        System.out.println("Second Array after swap: " + Arrays.toString(arr2));

    }
    
}
