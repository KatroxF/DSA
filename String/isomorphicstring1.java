import java.util.*;
public class isomorphicstring1 {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        boolean result=checking(s, t, map1, map2);
        

        
        
    }
    static boolean checking(String s,String t ,HashMap<Character,Character> map1, HashMap<Character,Character> map2){
            for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char k=t.charAt(i);
            if(map1.containsKey(c)){
                if(map1.get(c)!=k){
                    return false;   
                }
            }else{
                if(map2.containsKey(k)){
                    if(map2.get(k)!=c){
                        return false;
                    }

                    
                }
                map1.put(c,k);
                map2.put(k,c);
            }
           
            
        }
        return true;

        }
       
    
}
