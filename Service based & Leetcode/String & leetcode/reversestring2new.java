public class reversestring2new {
   public static void main(String[] args) {
    String s="abcde";
    int k=2;
    StringBuilder sb=new StringBuilder(s);

    
    for(int left=0;left<sb.length();left+=2*k){
        int j=Math.min(left+k-1,s.length()-1);
        for(int i=left;i<j;i++){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
        }

    }
    System.out.println(sb);
   }
    
}
