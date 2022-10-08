package com.itheima.test;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] num = new Integer[]{1, 2, 3, 4};
        Arrays.sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        Arrays.sort(num, (o1, o2) -> o2 - o1);

        for (int x : num) {
            System.out.print(x + " ");
        }
    }
}
