public class sumofnumbers {
    public static void main(String[] args) {
        String s="123";
        int ans=0;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            ans=ans+digit;

        }
        System.out.println(ans);

    }
    
}
