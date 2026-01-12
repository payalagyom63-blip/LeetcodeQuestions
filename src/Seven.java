public class Seven {

    public int trap(int[] height) {

        int[] left = new int[height.length];
        int[] right = new int[height.length];

        left[0] = height[0];
        int lmax = left[0];

        for (int i = 1; i < height.length; i++) {
            if (height[i] < lmax) {
                left[i] = lmax;
            } else {
                left[i] = height[i];
                lmax = height[i];
            }
        }

        int rmax = height[height.length - 1];
        right[height.length - 1] = rmax;

        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] < rmax) {
                right[i] = rmax;
            } else {
                right[i] = height[i];
                rmax = height[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(left[i], right[i]) - height[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Seven obj = new Seven();

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(obj.trap(height));
    }
}
