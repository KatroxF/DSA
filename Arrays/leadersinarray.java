import java.util.ArrayList;

public class leadersinarray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 3, 1, 2};

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            leaderarray(arr, i, i + 1, ans);
        }

        System.out.println(ans);
    }

    static void leaderarray(int[] arr, int left, int right, ArrayList<Integer> ans) {

        boolean isvalid = true;

        while (right < arr.length) {
            if (arr[left] < arr[right]) {
                isvalid = false;
                break;
            }
            right++;
        }

        if (isvalid) {
            ans.add(arr[left]);
        }
    }
}