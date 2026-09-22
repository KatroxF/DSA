public class matrixdiagonalsum {
    public static void main(String[] args) {
        int[][]mat={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }else if(i+j==mat.length-1){
                    sum=sum+mat[i][j];

                }
            }
        }
        System.out.println(sum);
    }
    
}
