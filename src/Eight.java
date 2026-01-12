import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eight {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > 0) {
                break;
            }

            int x = i;
            int target = -nums[x];
            int y = i + 1;
            int z = nums.length - 1;

            while (y < z) {
                int s = nums[y] + nums[z];

                if (s == target) {
                    result.add(Arrays.asList(nums[x], nums[y], nums[z]));
                    y++;
                    z--;

                    while (y < z && nums[y] == nums[y - 1]) {
                        y++;
                    }
                    while (y < z && nums[z] == nums[z + 1]) {
                        z--;
                    }
                } else if (s < target) {
                    y++;
                } else {
                    z--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Eight obj = new Eight();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(obj.threeSum(nums));
    }
}
