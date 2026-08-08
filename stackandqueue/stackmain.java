public class stackmain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new DynamicStack(6);
        stack.push(8);
        stack.push(2);
        stack.push(3);
        stack.push(10);
        System.out.println(stack.pop());

    }
    
}
