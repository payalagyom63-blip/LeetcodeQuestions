import java.util.HashMap;
import java.util.Map;

public class One {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];

            if (mp.containsKey(find)) {
                return new int[]{mp.get(find), i};
            }

            mp.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        One obj = new One();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}
