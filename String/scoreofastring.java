public class scoreofastring {
    public static void main(String[] args) {
        String s="hello";
        char[] string=s.toCharArray();
        int sum=0;
        for(int i=0;i<string.length-1;i++){
            int add=0;
            add=Math.abs(string[i]-string[i+1]);
            sum=sum+add;

        }
        System.out.println(sum);
    }
    
}
