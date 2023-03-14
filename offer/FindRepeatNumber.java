package myjava.offer;

public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]])
                    return nums[i];
                int pos = nums[i];
                nums[i] = nums[nums[i]];
                nums[pos] = pos;
            }
        }
        return 0;
    }
}
