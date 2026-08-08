public class reversestring {
    public static void main(String[] args) {
        int i=0;
        String word="hello";
        String reversed="";
        String result=reverse(i, word, reversed);
        System.out.println(result);
    }
    static String reverse(int i,String word,String reversed){
        if(i==word.length()){
            return reversed;
        }
        reversed=word.charAt(i)+reversed;
        return reverse(i+1, word, reversed);


        
    }
    

    
}
