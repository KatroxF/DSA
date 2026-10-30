public class firstpalindromestring {
    public static void main(String[] args) {
        String[] words={"abc","car","ada","racecar","cool"};
        int i=0;
        String ans=firstpalindrome(words,i);
        System.out.println(ans);
        
    }
    static String firstpalindrome(String[]words ,int i){
        if(i==words.length){
            return "";
        }
        StringBuilder sb=new StringBuilder(words[i]);
        int left=0;
        int right=sb.length()-1;
        while(left<right){
            char c=sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, c);
            left++;
            right--;
            
        }
        if(words[i].equals(sb.toString())){
            return sb.toString();
        }
        return firstpalindrome(words, i+1);
        

    }
    
}
