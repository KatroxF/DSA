public class rotatestringoptimal {
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        if(s.length()!=goal.length()){
            System.out.println(false);
            return;
            

        }else{
            System.out.println((s+s).contains(goal));

        }
        
    }
    
}
