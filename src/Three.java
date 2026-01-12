import java.util.Arrays;

public class Three {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] res = new int[m + n];


        for (int i = 0; i < m; i++) {
            res[i] = nums1[i];
        }

        for (int j = 0; j < n; j++) {
            res[j + m] = nums2[j];
        }

        Arrays.sort(res);

        int l = m + n;
        double rr;


        if (l % 2 == 0) {
            rr = (double) (res[l / 2] + res[(l / 2) - 1]) / 2;
        }

        else {
            rr = res[l / 2];
        }

        return rr;
    }

    public static void main(String[] args) {
        Three obj = new Three();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(obj.findMedianSortedArrays(nums1, nums2));
    }
}
