package myjava;

import myjava.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Hello {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        Subsets s = new Subsets();
        s.subsets(a);
        System.out.println(s.res);
    }
}
