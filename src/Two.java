public class Two {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];


        int p = 1;
        res[0] = 1;
        for (int i = 1; i < n; i++)
        {
            res[i] = nums[i - 1] * p;
            p = res[i];
        }

        int k = 1;
        for(int i = n-1; i>=0;i--)
        {
            res[i] = k * res[i];
            k = k * nums[i];
        }

        return res;
    }

    public static void main(String[] args)
    {
        Two obj = new Two();

        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);

        for(int val : result)
        {
            System.out.print(val + " ");
        }
    }
}
