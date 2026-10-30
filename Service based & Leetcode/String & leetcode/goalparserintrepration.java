import java.util.Arrays;

public class goalparserintrepration {
    public static void main(String[] args) {
        String command="G()(al)";
        StringBuilder sb=new StringBuilder();
        String pattern1="G";
        String pattern2="()";
        String pattern3="(al)";
        for(int i=0;i<command.length();i++){
            if(command.startsWith(pattern1,i)){
                sb.append("G");

            }else if(command.startsWith(pattern2,i)){
                sb.append("o");
                i=i+1;
            }else if(command.startsWith(pattern3,i)){
                sb.append("al");
                i=i+3;
                
            }
        }
        System.out.println(sb);
       

        
    }
    
}
