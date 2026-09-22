import java.util.ArrayList;
import java.util.Stack;

public class baseballgame1 {
    public static void main(String[] args) {
        String[]operations={"5","2","C","D","+"};
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                int a=stack.peek();
                stack.push(a*2);
            }else if(s.equals("+")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);

            }else {
                int a=Integer.parseInt(s);
                stack.push(a);
            }
        }
        int[]arr=new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            arr[i]=stack.get(i);
            sum=sum+arr[i];
        }
        System.out.println(sum);
       
}
}