import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Twenty {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort in descending order of frequency
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        Twenty obj = new Twenty();

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = obj.topKFrequent(nums, k);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
