
import java.util.HashSet;

public class jewelandstone {
    public static void main(String[] args) {
        String jewels="aA";
        String stone="aAAbbbb";
        int count=0;
        HashSet<Character> map=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            char c=jewels.charAt(i);
            map.add(c);

        }
        for(int i=0;i<stone.length();i++){
            char ch=stone.charAt(i);
            if(map.contains(ch)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
