import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] n1 = { 1, 2, 3, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(twoSum(n1, 15)));

    }

    public static int[] twoSum(int[] n, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n.length; i++) {
            int result = target - n[i];
            if (map.containsKey(result)) {
                return new int[] { map.get(result), i };
            }
            map.put(n[i], i);

        }
        return new int[] {};
    }
}
