package myjava;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return res;
    }

    public void dfs(int[] nums, int index) {
        if (tmp.size() <= nums.length) {
            // List<Integer> my = new ArrayList<>(tmp);
            // res.add(my);
            res.add(new ArrayList<>(tmp));
            if (tmp.size() == nums.length) {
                return;
            }
        }
        for (int i = index; i < nums.length; i++) {
            tmp.add(nums[i]);
            dfs(nums, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
