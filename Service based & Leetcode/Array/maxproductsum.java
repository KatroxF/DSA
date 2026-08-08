public class maxproductsum{
    public static void main(String[]args){
        int[]arr={-1, -2, -3};
       int maxending=arr[0];
       int minending=arr[0];
       int answer=arr[0];
       for(int i=1;i<arr.length;i++){
        int option1=arr[i];
        int option2=arr[i]*maxending;
        int option3=arr[i]*minending;
        if(option1>=option2 && option1>=option3){
            maxending=option1;
        }else if(option2>=option1 && option2>=option3){
            maxending=option2;
        }else{
            maxending=option3;
        }
        if (option1 <= option2 && option1 <= option3) {
                minending = option1;
            } else if (option2 <= option1 && option2 <= option3) {
                minending = option2;
            } else {
                minending = option3;
            }
        if(maxending>answer){
            answer=maxending;
        }
       }

        System.out.println(maxending);
    }
}