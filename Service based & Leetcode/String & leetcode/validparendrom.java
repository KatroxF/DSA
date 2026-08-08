public class validparendrom{
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!Character.isWhitespace(s.charAt(i)) && Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        
        for(int i=0;i<sb.length();i++){
            if(!Character.isLowerCase(sb.charAt(i))){
                sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));

            }
        }
       
        System.out.println(sb);
        
        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            if(sb.charAt(i)==sb.charAt(j)){
                i++;
                j--;
            }else{
                System.out.println("not valid palindrome");
                return;
            }
            
        }
        System.out.println("valid palindrome");


    }
}