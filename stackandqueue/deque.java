import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(18);
        deque.addLast(19);
        System.out.println(deque);
    }
    
}
