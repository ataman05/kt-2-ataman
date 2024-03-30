import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {3,5,5,5,3};
        Arrays.sort(nums);
        int count = 1;
        int maxcount = 1;
        int element = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                    element = nums[i];
                }
            } else
                count = 1;

        }
        System.out.println(element);
    }
}