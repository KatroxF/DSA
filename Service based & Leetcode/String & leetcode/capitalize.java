public class capitalize {
    public static void main(String[] args) {
        String s="abc";
        StringBuilder sb=new StringBuilder(s);
        
       
            char c=sb.charAt(0);
            if(!Character.isUpperCase(c)){
                sb.setCharAt(0, Character.toUpperCase(c));


            }
        
        System.out.println(sb);
    }
    
}
