import java.util.*;

public class firstandlastfrequency {
    public static void main(String[] args) {
        String s="banana apple orange banana apple";
        ArrayList<String> string=new ArrayList<>();
        int j=0;
        int i=0;
        while(j<s.length()){
            char c=s.charAt(j);
            if(!Character.isWhitespace(c)){
                j++;
                if(j==s.length()-1){
                    StringBuilder sb1=new StringBuilder();
                    sb1.append(s.charAt(i));
                    sb1.append(s.charAt(j));
                    string.add(sb1.toString());
                }
            }else{
                StringBuilder sb=new StringBuilder();
                
                sb.append(s.charAt(i));
                sb.append(s.charAt(j-1));
                
                string.add(sb.toString());
                j++;
                i=j;
                
            }

        }
        HashMap<String,Integer> map=new HashMap<>();
        int max=0;
        StringBuilder maxfreq = new StringBuilder();
        
        for(int k=0;k<string.size();k++){
            map.put(string.get(k),map.getOrDefault(string.get(k),0)+1);
        }
        // for(Map.Entry<String,Integer> freq:map.entrySet()){
            
        //         if(freq.getValue()>max){
        //             max=freq.getValue();
        //             maxfreq=new StringBuilder(freq.getKey());

        //         }
        //     }
        //     System.out.println(maxfreq);
        ArrayList<String> result = new ArrayList<>();
        for(String x:string){
            if(map.get(x)>max){
                max=map.get(x);
                result.clear();
                result.add(x);
                
                
            }else if(map.get(x)==max && !result.contains(x)){
                result.add(x);
                
            }

        }
        System.out.println(result);
            

        }
        
        

    }
    

