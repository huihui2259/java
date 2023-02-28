package myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();
        for (String s : strs) {
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            String sTmp = new String(tmp);
            List<String> value = m.getOrDefault(sTmp, new ArrayList<String>());
            value.add(s);
            m.put(sTmp, value);
        }
        res = new ArrayList<List<String>>(m.values());
        return res;
    }
}
