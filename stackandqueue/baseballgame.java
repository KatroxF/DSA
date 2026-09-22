import java.util.ArrayList;
import java.util.Stack;

public class baseballgame {
    public static void main(String[] args) {
        String[]operations={"5","-2","4","C","D","9","+","+"};
        String s=String.join("",operations);
        ArrayList<Character>list=new ArrayList<>();
        System.out.println(s);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                int ch=c-'0';
                stack.push(ch);
            }else if(c=='C'){
                stack.pop();
            }else if(c=='D'){
                int a=stack.peek();
                stack.push(a*2);
            }else if(c=='+'){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);

            }
        }
        System.out.println(stack);
        
    }
    
}
