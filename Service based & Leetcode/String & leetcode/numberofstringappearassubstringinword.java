public class numberofstringappearassubstringinword{
    public static void main(String[] args) {
        String[] patterns={"a","abc","bc","d"};
        String word="abc";
        int count=0;
        
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        
        System.out.println(count);

    }
}