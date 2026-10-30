public class countnumberofvoewsinarange {
    public static void main(String[] args) {
        String[] words={"hey","aeo","mu","ooo","artro"};
        int left=1;
        int right=4;
        int i=0;
        int count=0;
        while(left<=right){
            StringBuilder sb=new StringBuilder(words[left]);
            char first=sb.charAt(0);
            char last=sb.charAt(sb.length()-1);
            if("aeiouAEIOU".indexOf(first)!=-1){
                if("aeiouAEIOU".indexOf(last)!=-1){
                    count++;
                }

            }
            left++;
        }
        System.out.println(count);
    }
    
}
