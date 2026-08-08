public class maximumnumberofwordsinsentence {
    public static void main(String[] args) {
        String s="alice and bob love leetcode, i think so too, this is great thanks very much";
        int count=1;
        int max=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isWhitespace(c)){
                count++;
                
                
            }else if(c==','){
                if(count>max){
                    max=count;
                }
                count=0;
            }
            
        }
        if(count>max){
            max=count;
        }
        System.out.println(max);
    }
    
}
