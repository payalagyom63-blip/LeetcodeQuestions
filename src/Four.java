public class Four {

    public int search(int[] nums, int target) {
        int r = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                r = i;
            }
        }

        return r;
    }

    public static void main(String[] args) {
        Four obj = new Four();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = obj.search(nums, target);
        System.out.println(result);
    }
}
