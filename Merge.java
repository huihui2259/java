package myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (t1, t2) -> {
            return t1[0] - t2[0];
        });
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] tmp = res.get(res.size() - 1);
            if (tmp[1] > intervals[i][0]) {
                res.remove(res.size() - 1);
                int[] newTmp = new int[] { 0, 0 };
                newTmp[0] = tmp[0];
                newTmp[1] = Math.max(tmp[1], intervals[i][1]);
                res.add(newTmp);
            } else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
