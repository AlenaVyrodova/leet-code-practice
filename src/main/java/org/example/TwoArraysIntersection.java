package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArraysIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] nums1Distinct = Arrays.stream(nums1).distinct().toArray();
        int[] nums2Distinct = Arrays.stream(nums2).distinct().toArray();
        ArrayList<Integer> intersectionNums = new ArrayList<>();
        for (int k : nums1Distinct) {
            for (int i : nums2Distinct) {
                if (k == i) {
                    intersectionNums.add(k);
                }
            }
        }
        return intersectionNums.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

