public class reversestring2 {
    public static void main(String[] args) {
    String s="abcdefghijklmn";
    int k=3;
    int left=0;
    int right=s.length();
    StringBuilder sb=new StringBuilder(s);
    int j=k-1;
    if(sb.length()<k){
        sb.reverse();
        System.out.println(sb);
        return;
    }
    while(left<right){
         j = Math.min(left + k - 1, sb.length() - 1);
        for(int i=left;i<j;i++){
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            j--;


        }
        left=left+k*2;
       
        


    }
    System.out.println(sb.toString());
    }
    

    
}
