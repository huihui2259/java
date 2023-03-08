package myjava;

import java.util.Arrays;

// 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
// 输出：6
// 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] >= 0)
                dp[i] = dp[i - 1] + nums[i];
            else
                dp[i] = nums[i];
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
