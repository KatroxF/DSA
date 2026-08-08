public class maximumnumberofwordsinsentence1 {
    public static void main(String[] args) {
        String[] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = 0;
        for(String s:sentences){
            int word=s.split(" ").length;
            if(word>max){
                max=word;
            }


        }
        System.out.println(max);
    }
    
}
