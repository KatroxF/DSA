import java.util.HashSet;

public class longestsubstringwithrepeatingcharacter {
    public static void main(String[] args) {
        String s="abcabcbb";
        HashSet<Character> set=new HashSet<>();
        int count=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                int temp=right-left+1;
                if(temp>count){
                    count=temp;
                }
                right++;

            }else{
                set.remove(s.charAt(left));
                left++;
                
                
                

            }
            
            
            

        }
        System.out.println(count);
    }
    
}
