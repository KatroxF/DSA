import java.util.Arrays;
public class s3 {
    public static void main(String[] args) {
        String str="bac";
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String ans=new String(ch);
        System.out.println(ans);
    }
    
}
