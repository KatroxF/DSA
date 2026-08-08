public class largestoddnumber {
    public static void main(String[] args) {
        String s="4206";
        int largest=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            num=num*10+digit;
            if(num % 2 !=0 && num > largest){
                largest=num;

            }
        }
        if(largest ==0){
            System.out.println(" "); 
            return;
        }
        String large=String.valueOf(largest);
        System.out.println(large);
    }
    
}

