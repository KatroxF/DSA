public class lastwordd {
    public static void main(String[] args) {
        String s="Day";
        int count=0;
        int i=s.length()-1;
        int j=0;
        while(i>0 && Character.isWhitespace(s.charAt(i))){
            i--;
            
        }
        j=i;
        while(i>0 && Character.isLetter(s.charAt(i))){
            i--;
            

        }
        if(!Character.isWhitespace(s.charAt(i))){
                count=j+1;
                System.out.println(count);
                return;
                

            }
        if(i==j){
            count=1;
            System.out.println(count);
            return;
        }
        
        count=j-i;
        System.out.println(count);
    }
    
}
