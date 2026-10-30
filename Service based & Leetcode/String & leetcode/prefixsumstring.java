public class prefixsumstring{
    public static void main(String[]args){
        String s="abaca";
        int n=s.length();
        int[]prefix=new int[n];
    //    if(s.charAt(0)=='a'){
    //     prefix[0]=1;
    //    }else{
    //     prefix[0]=0;
    //    }
    prefix[0]=(s.charAt(0)=='a')?1:0;
    for(int i=1;i<n;i++){
        prefix[i]=prefix[i-1];
        if(s.charAt(i)=='a'){
            prefix[i]++;
        }
    }
    for(int x:prefix){
        System.out.println(x+" ");
    }
        
    }
}