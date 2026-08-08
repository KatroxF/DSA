import java.util.Arrays;

public class setmatrixzero{
    public static void main(String[] args) {
        int[][]arr={{1,1,1},{1,0,1},{1,1,1}};
        int m=arr.length;
        int n=arr[0].length;
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]||col[j]){
                    arr[i][j]=0;

                }
            }
        }
        System.out.println(Arrays.deepToString(arr));


    }
}