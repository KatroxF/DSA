

public class validparenthesis {
    public static void main(String[] args) {
        String s="()[}";
        char[]ch=s.toCharArray();
        boolean isvalid=true;
        int i=0;
        int j=1;
       if(ch.length % 2 !=0){
        isvalid=false;
       }else{
        while(i<s.length()-1 && j<s.length()){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1=='(' && c2==')'){
                
                i=i+2;
                j=j+2;

            }else if(c1=='{' && c2=='}'){
                
                i=i+2;
                j=j+2;
            }else if(c1=='[' && c2==']'){
                
                i=i+2;
                j=j+2;
            }else{
                isvalid=false;
                break;
            }
            

        }
        
       }
       System.out.println(isvalid);

    }
    
}
