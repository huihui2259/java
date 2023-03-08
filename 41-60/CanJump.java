package myjava;

public class CanJump {
    public boolean canJump(int[] nums) {
        int jump = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (i <= jump) {
                jump = Math.max(jump, i + nums[i]);
                System.out.println(jump);
                System.out.println(nums.length - 1);
                if (jump >= nums.length - 1) {
                    return true;
                }

            }
        }
        return false;
    }
}
