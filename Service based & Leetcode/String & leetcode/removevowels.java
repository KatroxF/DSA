public class removevowels{
    public static void main(String[] args) {
        String s="faekg";
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                ans=ans+ch;

            }
        }
        System.out.println(ans);
    }
}