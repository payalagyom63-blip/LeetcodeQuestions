public class Five {

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (sum>= max) {
                max= sum;
            }
            if (sum < nums[i]) {
                sum = nums[i];
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Five obj = new Five();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(obj.maxSubArray(nums));
    }
}
