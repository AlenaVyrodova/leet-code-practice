package org.example;

import java.util.HashSet;
import java.util.Set;

public class TwoArraysIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numToSet1 = new HashSet<>();
        for (int num : nums1) {
            numToSet1.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (numToSet1.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
}

