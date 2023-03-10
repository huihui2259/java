package myjava;

public class SortColors {
    public void sortColors(int[] nums) {
        int i = 0, pos = 0, n = nums.length;
        for (i = 0; i < n; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[pos];
                nums[pos] = 0;
                pos++;
            }
        }
        for (i = pos; i < n; i++) {
            if (nums[i] == 1) {
                nums[i] = nums[pos];
                nums[pos] = 1;
                pos++;
            }
        }
        Util.PrintOne(nums);
    }

}
