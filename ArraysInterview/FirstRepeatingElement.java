import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 3, 5, 6, 7 };
        System.out.println(firstRepeatingElement(arr));
    }

    public static int firstRepeatingElement(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return -1;
    }
}