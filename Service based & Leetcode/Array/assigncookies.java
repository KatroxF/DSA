import java.util.*;
public class assigncookies {
    public static void main(String[] args) {
        int[]g={1,2,3};
        int[]s={1,1};
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        int j=0;
        
        int i=0;
        while(j<s.length && i<g.length){
            if(s[j]>=g[i]){
                count=count+1;
                i++;
                j++;
                
                
            }else{
                j++;
            }
            
                
            
            
            
            
            
           
           
        }
        System.out.println(count);
    }
    
}
