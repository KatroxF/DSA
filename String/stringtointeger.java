public class stringtointeger{
    public static void main(String[] args){
        String s="  -12345";
        
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;

        }
        int sign=1;
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        int result=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && digit>7)){
                if(sign==1){
                System.out.println(Integer.MAX_VALUE);
            }else{
                 System.out.println(Integer.MIN_VALUE);
            }
            return;

            }
            
            
            result = result * 10 + digit;
            i++;


        }
        result *= sign;
        System.out.println(result);
        
        
        

    }
}