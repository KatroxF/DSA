import java.util.ArrayList;
import java.util.List;

public class ListofList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        list.add(a);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(4);
        list.add(b);
        System.out.println(list);
    }
    
}
