public class theindexoffirstoccurence {
    public static void main(String[] args) {
        String haystack="mississippi";
        String needle="issipi";
        int j=0;
        int i=0;
        if (needle.length() == 0){
            System.out.println("not substring");
            return;
        }
    

if (needle.length() > haystack.length()){
    System.out.println("not substring");
    return;

}
    
        while(i<haystack.length()){
            int k=0;
            if(needle.charAt(k)==haystack.charAt(i)){
                j=i;
                while(k<needle.length() && j<haystack.length()){
                    if(needle.charAt(k)==haystack.charAt(j)){
                    k++;
                    j++;
                }else{
                    break;
                }

                


                }
                if(k==needle.length()){
                    System.out.println("substring");
                    return;
                }
                i++;
                
                

            }else if(needle.charAt(k)!=haystack.charAt(i)){
                i++;
                
            }

        }
        System.out.println("not substring");
        
        
    }
    
}
