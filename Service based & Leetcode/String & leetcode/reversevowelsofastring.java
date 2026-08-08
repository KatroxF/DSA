import java.util.*;
public class reversevowelsofastring {
    public static void main(String[] args) {
        String s="0:u`bVbu`:0";
        char[] arr=new char[s.length()];
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           char c=s.charAt(i);
           if("aeiouAEIOU".indexOf(c)==-1){
            arr[i]=c;

           }else{
            arr[i]='\0';
           }
        }
        

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!=-1){
                list.add(ch);

            }
        }
        
        if(list.isEmpty()){
            String string=new String(arr);
            System.out.println(string);
            return;
        }
        Collections.reverse(list);
        
        int j=0;
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(c=='\0'){
                arr[i]=list.get(j);
                j++;

            }
            
        }
        String string=new String(arr);
        System.out.println(string);
        
    }
    
}
