public class capitalize1 {
    public static void main(String[] args) {
    String s="heLLo";
     StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i,Character.toLowerCase(c));

            }
        }
        System.out.println(sb);
    }
    
    
}
