import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class Nine {
    static List<List<Integer>> res = new ArrayList<>();


    public static void permutation(int[] nums, int n,int ind){//
        if(ind == n){
            List<Integer> perm = new ArrayList<>();
            for(int i : nums){
                perm.add(i);
            }
            res.add(perm);
            return;
        }

        for (int i = ind; i<n ; i++){ //0 ,1,2
            swap(i,ind,nums);//1,0
            permutation(nums,n,ind +1);
            swap(i,ind,nums);//2,1
        }

    }

    private static void swap(int num, int num1, int[] nums) {
        int temp = nums[num];
        nums[num] = nums[num1];
        nums[num1] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n = nums.length;
        int ind = 0;
        permutation(nums,n,ind);//either make this static, or give it an obejct to call method.
        System.out.println(res);

    }
}
