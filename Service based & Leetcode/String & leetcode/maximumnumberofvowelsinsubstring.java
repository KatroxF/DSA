public class maximumnumberofvowelsinsubstring {
    public static void main(String[] args) {
        String s="abciiidef";
        int k=3;
        int count=0;
        int max=Integer.MIN_VALUE;
        int left=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if("aeiou".indexOf(c)!=-1){
                count++;
            }
            if(right-left+1==k){
                if(count>max){
                    max=count;

                }
                char remove=s.charAt(left);
                if("aeiou".indexOf(remove)!=-1){
                    count--;
                    
                }
                left++;
                
            }
            


        }
        System.out.println(max);
    }
    
}
