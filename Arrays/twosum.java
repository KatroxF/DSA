import java.util.*;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 10, 3};
        int target = 3;

        int[] targetarr = Twosum(arr, target);
        System.out.println(Arrays.toString(targetarr));
    }

    static int[] Twosum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{};
    }
}