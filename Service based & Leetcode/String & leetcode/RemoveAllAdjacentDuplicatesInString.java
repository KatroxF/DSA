import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s="abbaca";
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        stack.push(s.charAt(i));
        i++;
        while(i<sb.length()){
            if(!stack.isEmpty() && sb.charAt(i)==stack.peek() ){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                stack.pop();
                i--;


            }else{
                stack.push(sb.charAt(i));
                i++;
            }
        }
        System.out.println(sb);
            
    }
    
}
