public class removespaces {
    public static void main(String[] args) {
        String s="faekg  g";
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                ans=ans+ch;

            }
        }
        System.out.println(ans);
    }
    
}
