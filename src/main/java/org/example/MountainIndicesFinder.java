package org.example;

import java.util.ArrayList;
import java.util.List;

public class MountainIndicesFinder {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> indexesOfMountains = new ArrayList<>();
        for (int j = 1; j < height.length; j++) {
            if (height[j - 1] > threshold) {
                indexesOfMountains.add(j);
            }
        }
        return indexesOfMountains;
    }
}
