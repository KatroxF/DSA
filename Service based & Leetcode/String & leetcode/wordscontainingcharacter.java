import java.util.ArrayList;

public class wordscontainingcharacter {
    public static void main(String[] args) {
        String[] words={"leet","code"};
        char x='e';
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(s.indexOf(x)!=-1){
                result.add(i);

            }

        }
        System.out.println(result);
    }
    
}
