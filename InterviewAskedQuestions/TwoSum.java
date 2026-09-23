import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 7, 11, 15);
        System.out.println(two_sum(nums, 9));
        
    }

    public static List<Integer> two_sum(List<Integer> nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
    
        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
    
            if (map.containsKey(complement)) {
                return Arrays.asList(map.get(complement), i);
            }
    
            map.put(nums.get(i), i);
        }
    
        return new ArrayList<>();
    }
}
