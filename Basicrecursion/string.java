public class string {
    public static void main(String[] args) {
        String s="abc";
        int i=s.length()-1;
       reverse(s, i);

    }
    static void reverse(String s,int i){
        if(i<0){
            return;
        }
        System.out.println(s.charAt(i));
        reverse(s, i-1);
    }
    
}
