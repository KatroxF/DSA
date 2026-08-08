public class largestword {
    public static void main(String[] args) {
        String s="Google Docdadw";
        int max=0;
        int temp=0;
        
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch!=' '){
                
                temp=temp+1;
                if(temp>max){
                    max=temp;
                }

            }else{
                temp=0;
            }
            
        }
        System.out.println(max);
    }
    
}
