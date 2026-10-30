public class Issubsequence{
    public static void main(String[] args){
        String s="";
        String t="ahbgd";
        int i=0;
        int j=0;
        if(s.length()==0){
            System.out.println("subsequence");
            return;
        }
        while(i<t.length()){
            if(t.charAt(i)!=s.charAt(j)){
                i++;
            }
            else{
                j++;
                i++;
            }
            if(j==s.length()){
                System.out.println("yes subsequence");
                return;
            }



        }
        System.out.println("not subsequence");
        


    }
}