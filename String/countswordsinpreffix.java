public class countswordsinpreffix{
    public static void main(String[] args) {
        String[] words={"leetcode","win","loops","success"};
        String pref="code";
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(s.startsWith(pref)){
                count++;
            }
        }
        System.out.println(count);
    }
}