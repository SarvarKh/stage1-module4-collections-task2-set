package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer item : sourceList) {
            while (item % 2 == 0) {
                set.add(item);
                item /= 2;
            }
            set.add(item);
            set.add(2*item);
        }

        return set;
    }
}
