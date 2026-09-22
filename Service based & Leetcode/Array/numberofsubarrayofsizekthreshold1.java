import java.util.ArrayList;

public class numberofsubarrayofsizekthreshold1 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1};
        int k = 1;
        int threshold = 0;

        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        while (j < arr.length) {

            sum = sum + arr[j];

            if (j - i + 1 == k) {

                if (sum >= k * threshold) {

                    count++;

                    // Store current subarray
                    ArrayList<Integer> subarray = new ArrayList<>();

                    for (int x = i; x <= j; x++) {
                        subarray.add(arr[x]);
                    }

                    result.add(subarray);
                }

                sum = sum - arr[i];
                i++;
            }

            j++;
        }

        System.out.println("Count = " + count);
        System.out.println("Subarrays = " + result);
    }
}
