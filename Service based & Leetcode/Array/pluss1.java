
import java.util.*;

public class pluss1 {

    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 3, 9};
        boolean istrue = false;
        boolean iscarry = false;
        boolean all9 = false;
        int j = 0;
        int[] arr1 = new int[arr.length + 1];
        if (arr.length == 1) {
            if (arr[0] != 9) {
                arr[0]++;
                System.out.println(Arrays.toString(arr));
            } else {
                System.out.println(Arrays.toString(new int[]{1, 0}));
            }
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[arr.length - 1] != 9) {
                istrue = true;

                break;
            } else if (arr[i] == 9) {
                while (i > 0 && arr[i] == 9) {

                    i--;

                }
                j = i;
                if (arr[j] != 9) {
                        for (int k = arr.length - 1; k > j; k--) {
                            arr[k] = 0;

                        }
                    iscarry = true;
                    break;

                }

            }
            if (arr[j] == 9) {

                for (int k = 1; k < arr1.length - 1; k++) {
                    arr1[0] = 1;
                    arr1[k] = 0;

                }
                all9 = true;

            }

        }
        if (istrue) {
            arr[arr.length - 1] = arr[arr.length - 1] + 1;
        }
        if (iscarry) {
            arr[j] = arr[j] + 1;

        }
        if (all9) {
            System.out.println(Arrays.toString(arr1));
        }

        System.out.println(Arrays.toString(arr));

    }

}
