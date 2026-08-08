
public class Checkiftwostringareequivalent{
    public static void main(String[] args) {
        String[]word1={"ab", "c"};
        String[]word2={"a", "bc"};
        String word=String.join("",word1);
        String wordd=String.join("",word2);
        if(word.equals(wordd)){
            System.out.println("same word");
        }else{
            System.out.println("not same word");
        }
    }
}
    

