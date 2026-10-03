public class countswordsinpreffix2 {
    public static void main(String[] args) {
        String[] words={"leetcode","win","loops","success"};
        String pref="code";
        int count=0;
        
        for(int i=0;i<words.length;i++){
            if(words[i].length()<pref.length()){
                continue;

            }
            boolean match=true;
            for(int j=0;j<pref.length();j++){
                if(words[i].charAt(j)!=pref.charAt(j)){
                    match=false;
                    break;
                }
            }
            if(match){
                count++;
            }

        }
        System.out.println(count);
    }
    
}
